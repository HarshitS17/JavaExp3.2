CREATE DATABASE bank;
USE bank;

CREATE TABLE account (
  id INT PRIMARY KEY AUTO_INCREMENT,
  account_number VARCHAR(50),
  holder_name VARCHAR(100),
  balance DECIMAL(15,2)
);
