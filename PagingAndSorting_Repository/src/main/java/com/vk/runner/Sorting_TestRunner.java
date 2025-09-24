package com.vk.runner;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.vk.entity.JobSeeker;
import com.vk.repository.iJobSeekerRepository;
import com.vk.service.iJobSeekerService;

@Component
public class Sorting_TestRunner implements CommandLineRunner {

   
	
	@Autowired  
    private iJobSeekerService jsService;
	
	@Override
	public void run(String... args) throws Exception {
		
		// invoke the buisness method
		
//......................................   Sorting Records   ...........................................................		
		/*try {
			  Iterable<JobSeeker> sortedjslist = jsService.showJobSeekersAsSorted(true, "name","Address");
			  sortedjslist.forEach(System.out::println);
		}catch(Exception e)
		{
			e.printStackTrace();
		}*/
	
		
//......................................   Paging Records   ...........................................................		
		/*try {
				  Page<JobSeeker> page = jsService.showDetailsByPagination(0, 3);
				  System.out.println("records of :"+(page.getNumber()+1)+"/"+page.getTotalPages());
				  page.getContent().forEach(System.out::println);
				  System.out.println("is the current page is first page :" +page.isFirst());
				  System.out.println("is the current page is last page :" +page.isLast());
				  System.out.println("Current page no of records :"+page.getNumberOfElements());
				  System.out.println("Current page have previous page :"+page.hasPrevious());
				  System.out.println("is Current page having next page :"+page.hasNext());
				  
			}catch(Exception e)
			{
				e.printStackTrace();
			}*/
				
//..............................................  paging and sorted records   ..............................................
		/*try {
			  Page<JobSeeker> page = jsService.showDetailsByPaginationAndSorted(1, 4, true, "name");
			  page.getContent().forEach(System.out::println);
		}catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
//..............................................  Getting all pages record   ..............................................	
		
		try {
			    jsService.showAllPageData(3);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
   }
	
}
