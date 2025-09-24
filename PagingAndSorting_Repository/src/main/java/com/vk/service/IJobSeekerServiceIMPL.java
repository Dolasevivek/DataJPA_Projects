package com.vk.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.vk.PagingandSortingRepository;
import com.vk.entity.JobSeeker;
import com.vk.repository.iJobSeekerRepository;

@Service // Spring Bean cum Service Class

public class IJobSeekerServiceIMPL implements iJobSeekerService {

	@Autowired //field injection
	private iJobSeekerRepository jsRepo;
	
// ................................   Sorting Records  .........................................
	@Override
	public Iterable<JobSeeker> showJobSeekersAsSorted(boolean ascOrder, String... props) {
		// preparing the sort object	
		Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC,props);//Decending Order
		//Sort sort=Sort.by(ascOrder?Sort.Direction.DESC:Sort.Direction.ASC,props);//Assending Order
		
		//Executing the logic
		
		return jsRepo.findAll(sort);
	}
//...............................  Paging Records  .................................................

@Override
public Page<JobSeeker> showDetailsByPagination(int pageNo, int pageSize) {
	
	
	// creating pageable Object 
	 PageRequest pageable = PageRequest.of(pageNo, pageSize);
	 
	 // getting the requested page records
	 Page<JobSeeker> page = jsRepo.findAll(pageable); 
           
	return page;
}
//.............................  paging sorted records  ............................................

@Override
public Page<JobSeeker> showDetailsByPaginationAndSorted(int pageNo, int pageSize, boolean ascOrder, String... props) {
    //creating sort object
	Sort sortobj = Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC,props);
	
	//create pageable object having pagination and sorting info
	
	 PageRequest pageable = PageRequest.of(pageNo, pageSize, sortobj);
	 
	 // invoke the logics
	 Page<JobSeeker> page = jsRepo.findAll(pageable);
	return page;
	
//...........................  showing all page data  ............................................	
}

@Override
public void showAllPageData(int pageSize) {
	// getteing total records here
	  long count = jsRepo.count();
	  
	  // get total pages count
	long PagesCount=count/pageSize;	
	if(count%pageSize!=0)
	 PagesCount++;
	  
	// display the records of all the pages
	for(int i=0;i<PagesCount;++i)
	{
      // create pageable object  for each page 
		  PageRequest pageable = PageRequest.of(i, pageSize);
		  
	  // geting the page <T> object having each page records
		  
		  Page<JobSeeker> page = jsRepo.findAll(pageable);
		  System.out.println("Records of"+(i+1)+"/"+page.getTotalPages()+"page");
		  page.getContent().forEach(System.out::println);
		  
		  System.out.println(".......................................................................");
	}
}
 
	
	
}
	



