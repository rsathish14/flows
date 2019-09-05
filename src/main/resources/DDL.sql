create TABLE workflow (
    id        integer,
    name       varchar(200),
    created_date   timestamp,
    created_by        varchar(200),
    PRIMARY KEY (id)
);

create TABLE workflow_template (
    id        integer,
    name       varchar(200),
	workflow_id integer REFERENCES workflow(id),
    template    jsonb,
    created_date   timestamp,
    created_by        varchar(200),
    PRIMARY KEY (id)
);



create TABLE workflow_instance (
    id        integer,
    workflow_id integer REFERENCES workflow(id),
	created_date   timestamp,
    created_by        varchar(200),
    PRIMARY KEY (id)
);


create TABLE workflow_definition (
    id        integer,
    name       varchar(200),
	workflow_instance_id integer REFERENCES workflow_instance(id),
    definition    jsonb,
    created_date   timestamp,
    created_by        varchar(200),
    PRIMARY KEY (id)
);

create TABLE task_definition (
    id        integer,
    name       varchar(200),
	workflow_instance_id integer REFERENCES workflow_instance(id),
    definition    jsonb,
    created_date   timestamp,
    created_by        varchar(200),
    PRIMARY KEY (id)
);

create TABLE task_instance (
    id        integer,
    name       varchar(200),
	workflow_instance_id integer REFERENCES workflow_instance(id),
	task_definition_id integer REFERENCES task_instance(id),
    due_date    date,
	assignee 	varchar(200),
    created_date   timestamp,
    created_by        varchar(200),
    PRIMARY KEY(id)
);