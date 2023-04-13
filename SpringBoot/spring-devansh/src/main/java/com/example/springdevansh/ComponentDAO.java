package com.example.springdevansh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
    @Autowired
    ComponentJdbcConnection jdbcConnect;

    public void setJdbcConnect(ComponentJdbcConnection jdbcConnect) {
        this.jdbcConnect = jdbcConnect;
    }

    public ComponentJdbcConnection getJdbcConnect() {
        return jdbcConnect;
    }
}
