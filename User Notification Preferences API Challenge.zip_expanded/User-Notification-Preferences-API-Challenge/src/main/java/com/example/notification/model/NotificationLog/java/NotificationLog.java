package com.example.notification.model.NotificationLog.java;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Map;

@Document(collection = "notification_logs")

public class NotificationLog {
	 @Id
	    private String id;
	    private String type; // marketing, newsletter, updates
	    private String channel; // email, sms, push
	    private String status; // pending, sent, failed
	    private LocalDateTime sentAt;
	    private String failureReason;
	    private Map<String, Object> metadata;


	    private String userId;
	    public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getChannel() {
			return channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public LocalDateTime getSentAt() {
			return sentAt;
		}
		public void setSentAt(LocalDateTime sentAt) {
			this.sentAt = sentAt;
		}
		public String getFailureReason() {
			return failureReason;
		}
		public void setFailureReason(String failureReason) {
			this.failureReason = failureReason;
		}
		public Map<String, Object> getMetadata() {
			return metadata;
		}
		public void setMetadata(Map<String, Object> metadata) {
			this.metadata = metadata;
		}
		
	   
	}


