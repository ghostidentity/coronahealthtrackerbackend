create table admission_request (
    requestId        bigint          GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    userId           bigint          NOT NULL,
    status           varchar(255)    NOT NULL,
    requestedOn      date            DEFAULT CURRENT_DATE NOT NULL
);

create unique index request_index on admission_request (userId);
