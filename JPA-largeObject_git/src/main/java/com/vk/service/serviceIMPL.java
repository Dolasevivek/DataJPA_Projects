package com.vk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.entity.MerrageSeeker;
import com.vk.repository.iRepository;

@Service
public class serviceIMPL implements iservice {
	@Autowired
    private iRepository msRepo;
	@Override
	public String registerMerrageSeeker(MerrageSeeker seeker) {
		
		return"Merrage Seeker is saved with id value" + msRepo.save(seeker).getId();
	}

}
