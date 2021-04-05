package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotEmpty
    @Size(max=1000, message = "Description too long")
    public String description;

    public Skill(String description){
        super();
        this.description = description;
    }

    public Skill(){}

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}