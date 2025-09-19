package com.vk.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vk.Jpa01CrudRepositoryApplication;
import com.vk.entity.JobSeeker;
import com.vk.repository.iJobSeekerRepository;

@Service // Spring Bean cum Service Class

public class IJobSeekerServiceIMPL implements iJobSeekerService {

    private final Jpa01CrudRepositoryApplication jpa01CrudRepositoryApplication;
	
	@Autowired //field injection
	private iJobSeekerRepository jsRepo;

    IJobSeekerServiceIMPL(Jpa01CrudRepositoryApplication jpa01CrudRepositoryApplication) {
        this.jpa01CrudRepositoryApplication = jpa01CrudRepositoryApplication;
    }// Has a relation 
	
// .......................     Saving record     .........................
	
	@Override
	public String registerJobSeeker(JobSeeker js) {
		
		// saving object
		JobSeeker savedRecord = jsRepo.save(js); // object passing as parameter to save method
		
		// Getting Generated id Value
		int idval=savedRecord.getId();
		return "JobSeeker Object is saved with id value"+idval;
	}

// .......................  Saving Multiple record .........................
	
	@Override
	public String registerJobSeekerGroup(Iterable<JobSeeker> list) {
		   Iterable<JobSeeker> savedJobSeekerGroup = jsRepo.saveAll(list);
		   
		   List<Integer>ids=new ArrayList();
		   savedJobSeekerGroup.forEach(js->{
			   ids.add(js.getId());
		   });
		return ids.size()+" no of Job seekers saved With id value"+ids;
	}

// .......................  Fetching Multiple record .........................
	
	@Override
	public Iterable<JobSeeker> showAllJobSeekers() {
	  
		return jsRepo.findAll();
	}
// .......................  Fetching All records by ids  .........................
@Override
public Iterable<JobSeeker> showAlljobSeekerByIds(Iterable<Integer> ids) {
	
	Iterable<JobSeeker> list = jsRepo.findAllById(ids);
	return list;
}
//.......................  Fetching record by id  ...............................
@Override
public Optional<JobSeeker> showById(int id) {
	Optional<JobSeeker> opt = jsRepo.findById(id);
	return opt;
			}
//.......................  updating record by id  ............................... 
@Override
public String hikeSalary(int id, float hikepercent) {
	// loding the object
	
	return null;
}
//.......................  Updating Record ..........................
@Override
public String registerOrUpdateJs(JobSeeker js) {
	if(jsRepo.existsById(js.getId()))
	{
		jsRepo.save(js);
		return "JobSeeker Object is updated";
	}else
	{
		jsRepo.save(js);
		return "JobSeeker Object is saved";
	}
	
}
// ................... Deleting record by Id .........................
@Override
public String removeJsById(int id) {
	// load the object
	
	boolean flag=jsRepo.existsById(id);
	//delete the object
	
	if(flag) {
		jsRepo.deleteById(id);
		return id+" Job seeker is deleted";
	}
	else {
		return id+" Job seeker is not found";
	}
	
}
//................... Deleting All records by Ids .........................
@Override
public String removeAllByIds(Iterable<Integer> Ids) {
   // Loding the object
	 Iterable<JobSeeker> list = jsRepo.findAllById(Ids);
	// delete All
	 Long count=StreamSupport.stream(list.spliterator(), false).count();
	   if(count==0)
	   return "No Records Found for delition";
	   else
		   jsRepo.deleteAllById(Ids);
		   return count+" Records are deleted";
}
	
}


