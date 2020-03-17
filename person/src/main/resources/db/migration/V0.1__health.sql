create table health (
    hospitalId     bigint          GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    userId         bigint          NOT NULL,
    symptom        varchar(255)    NOT NULL,
    addedOn        date            DEFAULT CURRENT_DATE NOT NULL,
    updatedOn      date            DEFAULT CURRENT_DATE NOT NULL
);

create unique index health_index on health (userId);
