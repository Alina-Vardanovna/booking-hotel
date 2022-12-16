package com.example.bookinghoteldatatransfer.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HomeRequest {

    private String title;
    private BigDecimal price;
    private String description;

}
