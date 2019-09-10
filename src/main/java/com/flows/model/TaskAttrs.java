package com.flows.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskAttrs implements Serializable {
    private String name;
    //private OffsetDateTime dueDate;
    private String assignee;


}
