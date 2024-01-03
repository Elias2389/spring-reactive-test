CREATE TABLE users
(
    id               SERIAL       NOT NULL primary key ,
    name             VARCHAR(255) NOT NULL,
    lastName         VARCHAR(255) NOT NULL,
    email            VARCHAR(255) NOT NULL,
    birthday         TIMESTAMP(6)
);