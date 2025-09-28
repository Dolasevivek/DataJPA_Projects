package com.vk.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vk.entity.MerrageSeeker;
import com.vk.service.iservice;
@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private iservice msservice;
	@Override
	public void run(String... args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Merrage Seeker Name :-");
		String name=sc.next();
			
		System.out.println("Enter Merrage Seeker Address :-");
		String address=sc.nextLine();
		sc.next();
		
		System.out.println("Enter Merrage seeker complete Photo Path :-");
		String photo=sc.next();
		
		System.out.println("Enter Merage Seeker Biodata Path :-");
		String biodata=sc.next();
		
		System.out.println("Enter Merrage seeker is Indian :-");
		Boolean is_indian=sc.nextBoolean();
		
		// Convert The Photfile into Byte Array
		
		FileInputStream fis=new FileInputStream(photo);
		byte[] photodata =new byte[fis.available()];
		photodata=fis.readAllBytes();
		
		// Convert the Biodata into char Array
		File file=new File(biodata);
		FileReader fr=new FileReader(biodata);
		int length=(int)file.length();
		char[] biodataData=new char[length];
	    fr.read(biodataData);
	    
	    
	    // creating Entity class object
            MerrageSeeker ms= new MerrageSeeker(name,address,photodata,biodataData,is_indian);
          try {
        	  
        	  // invoking buisness method
        	String msg =msservice.registerMerrageSeeker(ms);
        	System.out.println(msg);
          }catch(Exception e)
          {
        	  e.printStackTrace();
          }
	}

	
}
