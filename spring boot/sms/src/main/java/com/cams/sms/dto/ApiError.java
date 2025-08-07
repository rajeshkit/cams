package com.cams.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiError {
    private String message;
    private String path;
    private LocalDateTime when;
}
