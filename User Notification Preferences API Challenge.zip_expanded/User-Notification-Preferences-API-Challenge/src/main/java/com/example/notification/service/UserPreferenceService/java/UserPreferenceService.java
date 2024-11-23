package com.example.notification.service.UserPreferenceService.java;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notification.model.NotificationLog.java.NotificationLog;
import com.example.notification.model.UserPreference.java.UserPreference;
import com.example.notification.repository.NotificationLogRepository.java.NotificationLogRepository;
import com.example.notification.repository.UserPreferenceRepository.java.UserPreferenceRepository;

@Service

public class UserPreferenceService {
	@Autowired
    private UserPreferenceRepository userPreferenceRepository;

    public UserPreference createUserPreference(UserPreference userPreference) {
        userPreference.setCreatedAt(LocalDateTime.now());
        userPreference.setLastUpdated(LocalDateTime.now());
        return userPreferenceRepository.save(userPreference);
    }

    public UserPreference getUserPreference(String userId) {
        return userPreferenceRepository.findByUserId(userId);
    }

    public UserPreference updateUserPreference(String userId, UserPreference userPreference) {
        userPreference.setLastUpdated(LocalDateTime.now());
        return userPreferenceRepository.save(userPreference);
    }

    public void deleteUserPreference(String userId) {
        userPreferenceRepository.deleteById(userId);
    }
}	
   
	



