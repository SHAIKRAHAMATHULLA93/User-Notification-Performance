package com.example.notification.repository.UserPreferenceRepository.java;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.notification.model.UserPreference.java.UserPreference;

public interface UserPreferenceRepository extends MongoRepository<UserPreference, String> {
    UserPreference findByUserId(String userId);
}


