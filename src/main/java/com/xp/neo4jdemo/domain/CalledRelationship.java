package com.xp.neo4jdemo.domain;

import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "CALLED")
public class CalledRelationship {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private UserNode userNode;

    @EndNode
    private ServiceNode serviceNode;

    private Integer calledNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCalledNum() {
        return calledNum;
    }

    public void setCalledNum(Integer calledNum) {
        this.calledNum = calledNum;
    }

    public UserNode getUserNode() {
        return userNode;
    }

    public void setUserNode(UserNode userNode) {
        this.userNode = userNode;
    }

    public ServiceNode getServiceNode() {
        return serviceNode;
    }

    public void setServiceNode(ServiceNode serviceNode) {
        this.serviceNode = serviceNode;
    }

    @Override
    public String toString() {
        return "CalledRelationship{" +
                "id=" + id +
                ", userNode=" + userNode +
                ", serviceNode=" + serviceNode +
                ", calledNum=" + calledNum +
                '}';
    }
}
