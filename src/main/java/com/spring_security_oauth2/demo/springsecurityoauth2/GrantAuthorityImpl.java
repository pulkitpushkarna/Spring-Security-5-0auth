package com.spring_security_oauth2.demo.springsecurityoauth2;

import org.springframework.security.core.GrantedAuthority;

public class GrantAuthorityImpl implements GrantedAuthority {

    String authority;

    @Override
    public String getAuthority() {
        return authority;
    }
}
