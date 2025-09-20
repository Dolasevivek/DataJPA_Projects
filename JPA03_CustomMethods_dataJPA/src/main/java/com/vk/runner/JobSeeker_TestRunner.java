package com.vk.runner;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vk.entity.JobSeeker;
import com.vk.repository.iJobSeekerRepository;


@Component
public class JobSeeker_TestRunner implements CommandLineRunner {

   
	
	@Autowired  
    private iJobSeekerRepository jsRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
//....................... Fetching  Single Record by Address ...........................................	     
	
	   /*  try {
	    	
	    	// jsRepo.findByAddressEquals("hyd").forEach(System.out::println);
	    	 
	    	// List<JobSeeker> list = jsRepo.readByAddressIs("hyd");
	    	 //list.forEach(System.out::println);
	    	 
	    	 jsRepo.getByaddress("hyd").forEach(System.out::println);
	    	 
	     }catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }*/
		
//....................... Fetching   Record by salary ...........................................	
		/*try {
			  //jsRepo.findBySalaryBetween(300000, 900000).forEach(System.out::println);;
			  jsRepo.findBySalaryGreaterThanAndSalaryLessThan(300000, 900000).forEach(System.out::println);
		}catch(Exception e)
		{
			e.printStackTrace();
		}*/
	
//...................... fetching record by address in cities ..........................	
    /* try {
    	  jsRepo.findByAddressIn(List.of("hyd","latur","Maharashtra")).forEach(System.out::println);
     }catch(Exception e)
     {
    	 e.printStackTrace();
     }*/
//...................... fetching record by name starting with  ..........................		
     /* try {
    	      jsRepo.findBynameStartingWith("s").forEach(System.out::println);
      }catch(Exception e)
      {
    	  e.printStackTrace();
      }*/
//...................... fetching record by name starting with  ..........................		
	     /* try {
	    	      jsRepo.findBynameEndingWith("k").forEach(System.out::println);
	      }catch(Exception e)
	      {
	    	  e.printStackTrace();
	      }	*/
	      
//...................... fetching record by name containing   ..........................		
	      try {
	    	      jsRepo.findBynameContaining("jo").forEach(System.out::println);
	      }catch(Exception e)
	      {
	    	  e.printStackTrace();
	      }			      
		
		
	}
}