package com.example.databases.databases;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
public class MyAuthenticationProvider {
    protected static Authentication configure(Authentication authentication) throws AuthenticationException
    {
        String userName= authentication.getName();
        String password = authentication.getCredentials().toString();

        if("devansh".equals(userName) && "123".equals(password))
        {
            return new UsernamePasswordAuthenticationToken(userName, password, Arrays.asList());
        }
        else{
            throw new BadCredentialsException("Invalid username or password");
        }
    }

    //@Override
    public boolean supports(Class<?> authentication)
    {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

}
