DROP DATABASE IF EXISTS fakeson_source;
CREATE DATABASE fakeson_source;
USE fakeson_source;

CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    description TEXT,
    price DECIMAL(10, 2)
);
