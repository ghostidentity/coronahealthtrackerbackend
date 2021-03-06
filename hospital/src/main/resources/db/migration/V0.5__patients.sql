create table patients (
    patientId       bigint           GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    firstName       varchar(255)     DEFAULT '' NOT NULL,
    lastName        varchar(255)     DEFAULT '' NOT NULL,
    age             int              DEFAULT 0 NOT NULL,
    address         varchar(255)     DEFAULT '' NOT NULL,
    contact_no      varchar(255)     DEFAULT '' NOT NULL,
    nationality     varchar(50)      DEFAULT '' NOT NULL,
    withReference   boolean          DEFAULT FALSE NOT NULL,
    userId          bigint           DEFAULT 0 NOT NULL,
    dateAdmitted    date             DEFAULT CURRENT_DATE NOT NULL
);

create unique index patient_index on patients (patientId);
