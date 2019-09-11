package com.flows.persistence;

import com.flows.model.WorkflowExecPlan;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;


@Data
@Entity (name = "workflow_template")
public class WorkflowTemplate extends  AbstractEntity {
    @Id
    @Column (name="id")
    @GeneratedValue (strategy=GenerationType.SEQUENCE, generator="workflow_template_id")
    @SequenceGenerator(name="workflow_template_id", sequenceName = "workflow_template_id", allocationSize = 1)
    private Long id;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="workflow_id", nullable=false, updatable=false)
    private Workflow workflow;

    @Type(type = "jsonb")
    @Column(name = "template", columnDefinition = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    private WorkflowExecPlan template;



}
