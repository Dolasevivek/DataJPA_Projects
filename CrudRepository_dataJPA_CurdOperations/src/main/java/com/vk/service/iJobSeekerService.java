package com.vk.service;

import java.util.Optional;

import com.vk.entity.JobSeeker;

public interface iJobSeekerService {
	
	public String registerJobSeeker(JobSeeker js);
	public String registerJobSeekerGroup(Iterable<JobSeeker>list);
// ..........    CrudRepository Finder Methods    .........	
	public Iterable<JobSeeker>showAllJobSeekers();
	public Iterable<JobSeeker>showAlljobSeekerByIds(Iterable<Integer> ids);
	public Optional<JobSeeker>showById(int id);
	public String hikeSalary(int id,float  hikepercent);
	public String registerOrUpdateJs(JobSeeker js);
	public String removeJsById(int id);
	public String removeAllByIds(Iterable<Integer>Ids);
	
	
}
