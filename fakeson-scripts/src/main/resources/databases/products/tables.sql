USE fakeson_source_products;

CREATE TABLE IF NOT EXISTS products (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    description VARCHAR(255),
    price DECIMAL(10, 2)
);