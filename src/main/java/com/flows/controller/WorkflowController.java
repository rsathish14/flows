package com.flows.controller;

import com.flows.persistence.Workflow;
import com.flows.service.workflow.WorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/workflow", produces = MediaType.APPLICATION_JSON_VALUE)
public class WorkflowController {
    @Autowired
    private WorkflowService workflowService;

    @GetMapping("/list")
    public List<Workflow> listWorkflows() {
        return workflowService.list();
    }

    @GetMapping("/{id}")
    public Workflow getWorkflow(@PathVariable Long id) {
        return workflowService.get(id);
    }

    @PostMapping("/create")
    public void createWorkflow(@RequestBody Workflow workflow) {
        workflowService.create(workflow);
    }

    @PostMapping("/update")
    public void updateWorkflow(@RequestBody Workflow workflow) {
        workflowService.update(workflow);
    }
}
