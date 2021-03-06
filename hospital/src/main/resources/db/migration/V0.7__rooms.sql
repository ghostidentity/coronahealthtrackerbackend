create table rooms (
    roomId         bigint          GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    roomName       varchar(255)    NOT NULL,
    description    varchar(255)    DEFAULT  '' NOT NULL,
    isOccupied     boolean         NOT NULL,
    isOperational  boolean         NOT NULL,
    hospitalId     bigint          NOT NULL
);

create unique index request_index on rooms (hospitalId);