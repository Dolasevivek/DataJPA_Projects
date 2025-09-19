package com.vk.runner;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vk.entity.JobSeeker;
import com.vk.repository.iJobSeekerRepository;
import com.vk.service.iJobSeekerService;

@Component
public class JobSeeker_TestRunner implements CommandLineRunner {

   
	
	@Autowired  
    private iJobSeekerService jsService;
	
	@Override
	public void run(String... args) throws Exception {
		
//....................... Saving Single Record ...........................................	     
	/*	try {
	    	   // Creating entity class Object to pass value
	    	  JobSeeker job=new JobSeeker("Ankush", "Karnataka", "Btech", 911122334455L, 700000.00);
	    	  
	    	  // incoking service interface method
	    	  String msg= jsService.registerJobSeeker(job);
	    	  System.out.println(msg);
	    	  
	     }catch(Exception e)
	     {
	    	 e.printStackTrace();
	     */
//....................... Saving Single Multiple Record ...........................................	
	/*	try {
			
			// creating Entity class object      
			JobSeeker job1=new JobSeeker("Ram", "Bihar", "Btech", 91662238655L, 700000.00);
			JobSeeker job2=new JobSeeker("John", "Hyd", "BSC", 91189837655L, 400000.00);
			JobSeeker job3=new JobSeeker("raja", "rajasthan", "BSC", 91987237655L, 500000.00);
			
	      // invoking buisness method		
			List<JobSeeker> list= List.of(job1,job2,job3);
			String msg=jsService.registerJobSeekerGroup(list);
		  // printing method
			System.out.println(msg);
		}catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
// ........................   fetching all Records  ...............................
		/*try {
			    /*Iterable<JobSeeker> list = jsService.showAllJobSeekers();
			    list.forEach(js->{
			    	System.out.println(js);
			    });
			jsService.showAllJobSeekers().forEach(System.out::println);
		}catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
// ........................   fetching all Records by ids  ...............................
			/*	try {
					  Iterable <JobSeeker>list= jsService.showAlljobSeekerByIds(List.of(1,3,5,9));
					  System.out.println(StreamSupport.stream(list.spliterator(), false).count()+"No of records reterived");
					  list.forEach(System.out::println);
				}catch(Exception e)
				{
					e.printStackTrace();
				}	*/
		
//........................   Fetching record By id    ....................................
		
	  /*	try {
			Optional<JobSeeker> opt = jsService.showById(2);
			if(opt.isPresent())
			{
				JobSeeker jse=opt.get();
				System.out.println("Js object data"+jse);
			}
			else
			{
				System.out.println("Job Seeker not found");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
//........................   Updating record By id    ....................................		

		
//........................   Updating record By id    ....................................		
		/*try {
			  JobSeeker js=new JobSeeker(1,"Manish", "Benglore", "Pharmacy", 919988776655L, 400000.00);
			  String msg=jsService.registerOrUpdateJs(js);
			  System.out.println(msg);
		}catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
//.......................  Ddeleting record by Id .................................		
	/*try {
		String msg = jsService.removeJsById(6);
		System.out.println(msg);
	}catch(Exception e)
	{
		e.printStackTrace();
	}*/
		
//.......................  Ddeleting All records by Id .................................		
	try {
		String msg= jsService.removeAllByIds(List.of(1,2,4));
		System.out.println(msg);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}
	

}
