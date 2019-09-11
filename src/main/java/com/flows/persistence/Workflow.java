package com.flows.persistence;

import lombok.Data;
import javax.persistence.*;
import java.time.OffsetDateTime;

@Data
@Entity(name="workflow")
public class Workflow extends  AbstractEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workflow_id")
    @SequenceGenerator(name="workflow_id", sequenceName = "workflow_id", allocationSize = 1)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "created_date")
    private OffsetDateTime created_date;

    @Column(name = "created_by")
    private String created_by;
}
