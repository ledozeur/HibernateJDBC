-- liquibase formatted sql

SELECT product_name
FROM netology.ORDERS
JOIN netology.CUSTOMERS ON ORDERS.customer_id = CUSTOMERS.id
WHERE customers.name = :name;