package com.vk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.vk.entity.JobSeeker;

public interface iJobSeekerRepository extends JpaRepository<JobSeeker, Integer> {
    public List<JobSeeker>findByAddressEquals(String address);
    public List<JobSeeker>readByAddressIs(String address);
    public List<JobSeeker>getByaddress(String address);
    public List<JobSeeker> findBySalaryBetween(double min, double max);
    public List<JobSeeker>findBySalaryGreaterThanAndSalaryLessThan(double start,double end);
    public List<JobSeeker>findByAddressIn(List <String>cities);
    public List<JobSeeker>findBynameStartingWith(String intChars);
    public List<JobSeeker>findBynameEndingWith(String lastChars);
    public List<JobSeeker>findBynameContaining(String Chars);
    

}
