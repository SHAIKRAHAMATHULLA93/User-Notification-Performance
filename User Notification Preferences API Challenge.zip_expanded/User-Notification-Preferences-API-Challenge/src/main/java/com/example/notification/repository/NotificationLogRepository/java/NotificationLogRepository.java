package com.example.notification.repository.NotificationLogRepository.java;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.notification.model.NotificationLog.java.NotificationLog;

public interface NotificationLogRepository  extends MongoRepository<NotificationLog, String> {
    List<NotificationLog> findByUserId(String userId);

	Object countByStatus(String string);
}


