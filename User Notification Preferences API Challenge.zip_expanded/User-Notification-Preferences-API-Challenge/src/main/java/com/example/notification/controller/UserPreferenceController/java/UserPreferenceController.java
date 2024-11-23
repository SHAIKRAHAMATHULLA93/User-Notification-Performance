package com.example.notification.controller.UserPreferenceController.java;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.notification.model.UserPreference.java.UserPreference;
import com.example.notification.service.UserPreferenceService.java.UserPreferenceService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/preferences")

public class UserPreferenceController {
	 @Autowired
	    private UserPreferenceService userPreferenceService;

	    @PostMapping
	    public UserPreference createPreference(@RequestBody @Valid UserPreference userPreference) {
	        return userPreferenceService.createUserPreference(userPreference);
	    }

	    @GetMapping("/{userId}")
	    public UserPreference getPreference(@PathVariable String userId) {
	        return userPreferenceService.getUserPreference(userId);
	    }

	    @PatchMapping("/{userId}")
	    public UserPreference updatePreference(@PathVariable String userId, @RequestBody @Valid UserPreference userPreference) {
	        return userPreferenceService.updateUserPreference(userId, userPreference);
	    }

	    @DeleteMapping("/{userId}")
	    public void deletePreference(@PathVariable String userId) {
	        userPreferenceService.deleteUserPreference(userId);
	    }
	}


