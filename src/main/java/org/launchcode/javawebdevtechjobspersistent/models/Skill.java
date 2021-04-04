package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Skill extends AbstractEntity {

    @NotEmpty
    @Size(max=1000, message = "Description too long")
    public String description;

    public Skill(String description){
        this.description = description;
    }

    public Skill(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}