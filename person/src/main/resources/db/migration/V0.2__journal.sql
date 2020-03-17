create table journal (
    journalId        bigint          GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    userId           bigint          NOT NULL,
    entry            varchar(500)    NOT NULL,
    createdOn        date            DEFAULT CURRENT_DATE NOT NULL,
    updatedOn        date            DEFAULT CURRENT_DATE NOT NULL
);

create unique index journal_index on journal (userId);
