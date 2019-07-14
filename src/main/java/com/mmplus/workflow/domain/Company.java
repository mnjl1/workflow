package com.mmplus.workflow.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Company {
    @Id
    private Long Id;
    private String companyName;
    private int zkpo;
}
