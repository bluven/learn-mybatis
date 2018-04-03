package com.github.bluven.model;

import org.apache.ibatis.type.Alias;

/**
 * Created by bluven on 18/4/2.
 */

@Alias("User")
public class User {
    
    private Integer id;
    private String name;
    private String displayName;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDisplayName() {
        return displayName;
    }
    
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
