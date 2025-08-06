package com.cams.sms.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.util.Objects;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Stock {
    @Id
    @Positive(message = "the stock Id should be positive")
    private int id;
    @NotBlank(message = "the stock cannot be empty")
    private String name;
    @Positive(message = "the stock unit should be positive")
    private int unit;
    private long total;
}
