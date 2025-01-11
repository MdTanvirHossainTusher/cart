package com.example.cart.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApiResponse {
    private String message;
    private Object data;

//    public ApiResponse(String message, Object data) {
//        this.message = message;
//        this.data = data;
//    }
}