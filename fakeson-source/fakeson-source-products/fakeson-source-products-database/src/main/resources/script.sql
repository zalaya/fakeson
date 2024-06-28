DROP DATABASE IF EXISTS fakeson_source_products;
CREATE DATABASE fakeson_source_products;
USE fakeson_source_products;

CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    description TEXT,
    price DECIMAL(10, 2)
);
