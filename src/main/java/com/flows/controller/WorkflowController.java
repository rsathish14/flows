package com.flows.controller;

import com.flows.persistence.Workflow;
import com.flows.service.workflow.WorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkflowController {
    @Autowired
    private WorkflowService workflowService;

    @GetMapping("/workflow/list")
    public List<Workflow> getWorkflows() {
        return workflowService.list();
    }
}
