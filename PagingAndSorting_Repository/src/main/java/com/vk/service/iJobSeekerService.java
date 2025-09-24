package com.vk.service;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.vk.entity.JobSeeker;

public interface iJobSeekerService {
	
	
	public Iterable<JobSeeker>showJobSeekersAsSorted(boolean ascOrder,String...props);
	public Page<JobSeeker>showDetailsByPagination(int pageNo,int pageSize);
	public Page<JobSeeker>showDetailsByPaginationAndSorted(int pageNo,int pageSize,boolean ascOrder,String...props);
	public void showAllPageData(int pageSize);
}
