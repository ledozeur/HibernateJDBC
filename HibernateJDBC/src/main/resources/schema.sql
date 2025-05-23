
create schema netology;

CREATE table netology.CUSTOMERS (
id bigserial,
name varchar(200),
surname varchar(200),
age int ,
phone_number varchar(200),
PRIMARY KEY (id)
);

CREATE TABLE netology.ORDERS (
id int,
    date date,
    customer_id int,
    product_name varchar(200),
    amount int,
    PRIMARY KEY (id),
    FOREIGN KEY(customer_id) REFERENCES netology.CUSTOMERS(id)
);

insert into netology.CUSTOMERS(id, name, surname, age, phone_number)
values (1, 'Ivan', 'Ivanov', 20, '123456789'),
       (2, 'Petr', 'Petrov', 84, null),
       (3, 'Semen', 'Semenov', 23, '123456789'),
       (4, 'Alexey', 'Alexeev', 50, '987654321');

insert into netology.ORDERS(id, customer_id, product_name, amount)
values (1, 1, 'Coca-cola', 200),
       (2, 2, 'Pepsi', 250),
       (3, 3, 'Red bull', 300),
       (4, 4, 'Dr.Pepper',350),
       (5, 2, 'mountain dew', 150);
