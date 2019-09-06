package com.flows.service.workflow;

import com.flows.persistence.Workflow;
import com.flows.persistence.repository.WorkflowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WorkflowService {
    @Autowired
    private WorkflowRepository workflowRepository;

    public List<Workflow> list() {
        return workflowRepository.findAll();
    }

    public void update(Workflow workflow) {
        if(workflow.getId() != null) {
            workflowRepository.save(workflow);
        }
    }

    public void create(Workflow workflow) {
        if (workflow.getId() == null)
            workflowRepository.save(workflow);
    }

    public Workflow get(Long id) {
        return workflowRepository.getOne(id);

    }

}

