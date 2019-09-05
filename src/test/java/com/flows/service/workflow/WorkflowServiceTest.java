package com.flows.service.workflow;

import com.flows.persistence.Workflow;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkflowServiceTest {
    @Autowired
    private WorkflowService workflowService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<Workflow> workflows = workflowService.list();

        Assert.assertEquals(workflows.size(), 3);
    }
}
