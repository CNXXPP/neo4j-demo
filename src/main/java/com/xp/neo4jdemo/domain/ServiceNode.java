package com.xp.neo4jdemo.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label = "service")
public class ServiceNode {

    @Id @GeneratedValue
    private Long id;

    private String name;//服务名称

    private String serviceId;// 服务id

    private String calledNum; //服务总调用次数

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getCalledNum() {
        return calledNum;
    }

    public void setCalledNum(String calledNum) {
        this.calledNum = calledNum;
    }

    @Override
    public String toString() {
        return "ServiceNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", calledNum='" + calledNum + '\'' +
                '}';
    }
}
