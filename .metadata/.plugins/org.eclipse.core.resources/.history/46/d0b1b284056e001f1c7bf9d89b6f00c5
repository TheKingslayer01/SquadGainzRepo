package com.example.squadgainzapi.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.squadgainzapi.EntityPojos.UserPersonalInfo;
import com.example.squadgainzapi.ServiceFiles.GetUserPersonalInfoService;

@RestController
@RequestMapping("/api/personaldetails")
public class PersonalInfoController {
	
	@Autowired
    private GetUserPersonalInfoService getUserPersonalInfoService;

    @GetMapping("/{user_id}")
    public ResponseEntity<List<UserPersonalInfo>> getPersonById(@PathVariable Long user_id) {
    	List<UserPersonalInfo> userPersonalInfo = getUserPersonalInfoService.getPersonalInfoById(user_id);
    	if (userPersonalInfo.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userPersonalInfo);
    }
}
