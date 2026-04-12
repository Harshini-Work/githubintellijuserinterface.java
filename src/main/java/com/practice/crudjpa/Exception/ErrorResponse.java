package com.practice.crudjpa.Exception;

public class ErrorResponse {
       private String status;
       private String message;

    public ErrorResponse(String status,String message) {
        this.status=status;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
