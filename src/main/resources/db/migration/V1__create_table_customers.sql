CREATE TABLE netology.customers
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    surname VARCHAR(20) NOT NULL,
    age INT,
    phone_number CHAR(9)
);