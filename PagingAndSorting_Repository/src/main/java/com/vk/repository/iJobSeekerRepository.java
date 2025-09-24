package com.vk.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.vk.entity.JobSeeker;

public interface iJobSeekerRepository extends CrudRepository<JobSeeker, Integer>,PagingAndSortingRepository<JobSeeker,Integer> {
   
}
