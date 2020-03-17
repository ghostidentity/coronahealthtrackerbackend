create table vaccine_status (
    vaccineId             bigint                GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    vaccineName           varchar(255)          NOT NULL,
    vaccineDescription    varchar(255)          NOT NULL,
    vaccineStage          varchar(255)          NOT NULL,
    isAvailable           boolean               DEFAULT FALSE NOT NULL,
    createdBy             bigint                NOT NULL,
    createdOn             date                  DEFAULT CURRENT_DATE NOT NULL
);

create unique index vaccine_index on vaccine_status (vaccineName);