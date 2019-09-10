package com.flows.controller;

import com.flows.model.WorkflowExecPlan;
import com.flows.persistence.Workflow;
import com.flows.service.workflow.WorkflowService;
import com.flows.service.workflow.WorkflowTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/template", produces = MediaType.APPLICATION_JSON_VALUE)
public class WorkflowTemplateController {
    @Autowired
    private WorkflowTemplateService workflowTemplateService;

    @PostMapping("/create")
    public void createWorkflow(@RequestBody WorkflowExecPlan wep) {
        workflowTemplateService.create(wep);
    }

}
