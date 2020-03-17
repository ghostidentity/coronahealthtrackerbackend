create table roles (
    rolesId      bigint          GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    scopes       varchar(255)    NOT NULL
);

create unique index roles_index on roles (rolesId);
