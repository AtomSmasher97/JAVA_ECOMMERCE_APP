package com.educative.ecommerce.common;

import java.time.LocalDateTime;

public class ApiResponse {

    public ApiResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    private final boolean success;
    private final String message;

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public String getTimeStamp(){
        return LocalDateTime.now().toString();
    }
}
