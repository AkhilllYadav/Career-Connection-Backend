package com.indeed.server.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "posts")
@Data
public class PostModal {

    @NotNull
    @NotEmpty
    private String profile;

    @NotNull
    private String type;

    @NotNull
    private String description;

    @NotNull
    private String experience;

    @NotNull
    private String technology[];

    @NotNull
    private String salary;
    
    // @NotNull
    // private String jobUrl;

    @CreatedDate
    private Date createdAt;

    // Getter and setter methods for jobUrl
    // public String getJobUrl() {
    //     return jobUrl;
    // }

    // public void setJobUrl(String jobUrl) {
    //     this.jobUrl = jobUrl;
    // }
}