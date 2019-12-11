package com.baobao.domain;

/**
 * @author baobao
 * @create 2019-12-01 10:17
 * @description
 */
public class Department {
    private Integer id;
    private String name;
    private Integer managerId;
    private Integer locationId;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", managerId=" + managerId +
                ", locationId=" + locationId +
                '}';
    }

    public Department() {
    }

    public Department(String name, Integer managerId, Integer locationId) {
        this.name = name;
        this.managerId = managerId;
        this.locationId = locationId;
    }

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

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }
}
