CREATE TABLE netology.customers
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    surname VARCHAR(20) NOT NULL,
    age INT,
    phone_number CHAR(9)
);
CREATE TABLE netology.orders
(
    id SERIAL PRIMARY KEY,
    date TIMESTAMP,
    customer_id INT NOT NULL,
    product_name VARCHAR(20) NOT NULL,
    amount INT,
    FOREIGN KEY (customer_id) REFERENCES netology.customers (id)
);