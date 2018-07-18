CREATE TABLE mentors(
    Id serial PRIMARY KEY,
    first_name varchar,
    last_name varchar,
    nick_name varchar,
    phone_number varchar,
    email varchar,
    city varchar,
    favourite_number varchar
);

CREATE TABLE applicants(
    Id serial PRIMARY KEY,
    first_name varchar,
    last_name varchar,
    phone_number varchar,
    email varchar,
    application_code varchar
);
