package com.flows.persistence;

import lombok.Data;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Data
@Entity(name="workflow")
public class Workflow {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "created_date")
    private OffsetDateTime created_date;

    @Column(name = "created_by")
    private String created_by;
}
