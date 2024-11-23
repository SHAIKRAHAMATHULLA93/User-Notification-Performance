package com.example.notification.controller.NotificationController.java;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.notification.model.NotificationLog.java.NotificationLog;

import java.util.List;
import java.util.Map;

import javax.management.Notification;

@RestController
@RequestMapping("/api/notifications")

public class NotificationController {
	@Autowired
    private Notification notificationService;

    @PostMapping("/send")
    public NotificationLog sendNotification(@RequestBody Map<String, Object> request) {
        String userId = (String) request.get("userId");
        String type = (String) request.get("type");
        String channel = (String) request.get("channel");
        Map<String, Object> content = (Map<String, Object>) request.get("content");

        return notificationService(userId, type, channel, content);
    }

    private NotificationLog notificationService(String userId, String type, String channel,
			Map<String, Object> content) {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/{userId}/logs")
    public List<NotificationLog> getNotificationLogs(@PathVariable String userId) {
        return (List<NotificationLog>) notificationService(userId, userId, userId, null);
    }

    @GetMapping("/stats")
    public Notification getNotificationStats() {
        return notificationService;
    }
}

