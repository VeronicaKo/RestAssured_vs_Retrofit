package com.example.retrofit.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateUserResponse {

    @JsonProperty("createdAt")
    private String createdAt;

    @JsonProperty("id")
    private String id;

    @JsonProperty("job")
    private String job;

    @JsonProperty("name")
    private String name;

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getId() {
        return id;
    }

    public String getJob() {
        return job;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CreateUserResponse{" +
                "createdAt='" + createdAt + '\'' +
                ", id='" + id + '\'' +
                ", job='" + job + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
