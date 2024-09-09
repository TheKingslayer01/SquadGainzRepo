package com.example.squadgainzapi.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.squadgainzapi.EntityPojos.UserPersonalInfo;
import com.example.squadgainzapi.ServiceFiles.GetUserPersonalInfoService;

@RestController
@RequestMapping("/api/personaldetails")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonalInfoController {
	
	@Autowired
    private GetUserPersonalInfoService getUserPersonalInfoService;

    @GetMapping("/{userId}")
    public ResponseEntity<List<UserPersonalInfo>> getPersonById(@PathVariable Long userId) {
    	List<UserPersonalInfo> userPersonalInfo = getUserPersonalInfoService.getPersonalInfoById(userId);
    	if (userPersonalInfo.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userPersonalInfo);
    }
}
