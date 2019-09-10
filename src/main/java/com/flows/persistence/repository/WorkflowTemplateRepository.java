package com.flows.persistence.repository;

import com.flows.persistence.Workflow;
import com.flows.persistence.WorkflowTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkflowTemplateRepository extends JpaRepository<WorkflowTemplate, Long> {
}
