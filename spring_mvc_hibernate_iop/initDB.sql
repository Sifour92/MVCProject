DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
                           id SERIAL PRIMARY KEY NOT NULL ,
                           name varchar(15),
                           surname varchar(25),
                           department varchar(20),
                           salary int
);