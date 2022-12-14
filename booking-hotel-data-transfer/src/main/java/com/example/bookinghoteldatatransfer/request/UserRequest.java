package com.example.bookinghoteldatatransfer.request;

import com.example.bookinghoteldatatransfer.model.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRequest {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private UserRole role;

}
