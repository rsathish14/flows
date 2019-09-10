package com.flows.service.workflow;

import com.flows.model.WorkflowExecPlan;
import com.flows.persistence.WorkflowTemplate;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
@Data
@AllArgsConstructor
public class WorkflowTemplateMapper {
    private WorkflowService workflowService;

    private WorkflowTemplate workflowTemplate;




    public WorkflowTemplate map(WorkflowExecPlan wep) {
        workflowTemplate.setName(wep.getName());
        //TODO get workflow from wep
        Long i = Long.parseLong("1");
        workflowTemplate.setWorkflow(workflowService.get(i));
        workflowTemplate.setTemplate(wep);
        //TODO spring security get user
        workflowTemplate.setCreated_by("sathish");
        workflowTemplate.setCreated_date(OffsetDateTime.now());
        return workflowTemplate;
    }
}
