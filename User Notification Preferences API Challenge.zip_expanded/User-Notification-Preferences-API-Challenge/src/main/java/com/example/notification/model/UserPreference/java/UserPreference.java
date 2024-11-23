package com.example.notification.model.UserPreference.java;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.Email;

import java.time.LocalDateTime;

@Document(collection = "user_preferences")

public class UserPreference {
	@Id
    private String userId;

    @Email
    private String email;

    private Preferences preferences;

    @Nonnull
    private String timezone;

    private LocalDateTime createdAt;

    private LocalDateTime lastUpdated;

    // Getters and Setters

    public static class Preferences {
        private boolean marketing;
        private boolean newsletter;
        private boolean updates;
        private String frequency; // daily, weekly, monthly, never
        private Channels channels;

        // Getters and Setters
    }

    public static class Channels {
        private boolean email;
        private boolean sms;
        private boolean push;

        // Getters and Setters
    }

	public void setCreatedAt(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}

	public void setLastUpdated(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}

	
	
}


