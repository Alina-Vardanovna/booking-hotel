package com.example.bookinghotelcore.security;

import com.example.bookinghotelcore.entity.User;
import org.springframework.security.core.authority.AuthorityUtils;

public class CurrentUser extends org.springframework.security.core.userdetails.User {

    private final User user;

    public CurrentUser(User user) {
        super(user.getEmail(), user.getPassword(),
                AuthorityUtils.createAuthorityList(user.getRole().name()));
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public long getId() {
        return user.getId();
    }
}
