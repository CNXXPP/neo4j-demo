package com.xp.neo4jdemo.domain;

import org.neo4j.ogm.annotation.*;

import java.io.Serializable;

@NodeEntity(label = "user")
public class UserNode implements Serializable {

    @Id @GeneratedValue
    private Long id;

    private  String name;

    private String userId;

    private String companyId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        return "UserNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", companyId='" + companyId + '\'' +
                '}';
    }
}
