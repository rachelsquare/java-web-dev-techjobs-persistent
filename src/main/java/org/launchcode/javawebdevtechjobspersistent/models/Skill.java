package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotEmpty
    @Size(max=1000, message = "Description too long")
    public String description;

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs;

    public Skill(String description){
        super();
        this.description = description;
    }

    public Skill(){}


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
