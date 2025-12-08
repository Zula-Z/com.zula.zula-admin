package com.zula.admin.messages;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdminRequestMessage {
    private String requestId;
    private String action; // VALIDATE_USER, CHECK_STATUS, GET_INFO
    private String userId;
    private Map<String, Object> data;

    public AdminRequestMessage() {}

    public AdminRequestMessage(String requestId, String action, String userId, Map<String, Object> data) {
        this.requestId = requestId;
        this.action = action;
        this.userId = userId;
        this.data = data;
    }

    // Getters and Setters
    public String getRequestId() { return requestId; }
    public void setRequestId(String requestId) { this.requestId = requestId; }

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public Map<String, Object> getData() { return data; }
    public void setData(Map<String, Object> data) { this.data = data; }

    @Override
    public String toString() {
        return String.format("AdminRequest[%s: %s for user %s]",
                requestId, action, userId);
    }
}