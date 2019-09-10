package com.flows.service.workflow;

import com.flows.model.WorkflowExecPlan;
import com.flows.persistence.repository.WorkflowTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkflowTemplateService {
    @Autowired
    WorkflowTemplateRepository workflowTemplateRepository;

    @Autowired
    WorkflowTemplateMapper mapper;

    public void create(WorkflowExecPlan wep) {
        workflowTemplateRepository.save(mapper.map(wep));
    }


}
