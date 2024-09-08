package com.example.squadgainzapi.ServiceFiles;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.squadgainzapi.EntityPojos.UserPersonalInfo;
import com.example.squadgainzapi.repository.PersonalInfoRepository;

@Service
public class GetUserPersonalInfoService {

	 	@Autowired
	    private PersonalInfoRepository personalInfoRepository;

	    public List<UserPersonalInfo> getPersonalInfoById(Long userId) {
	        return personalInfoRepository.findByUserid(userId);
	    }
}