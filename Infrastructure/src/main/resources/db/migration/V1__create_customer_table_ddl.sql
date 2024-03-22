CREATE TABLE Customer (
                          customer_id  INT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(200) NOT NULL,
                          email VARCHAR(200) NOT NULL,
                          phone VARCHAR(200),
                          postal_code VARCHAR(10) NOT NULL,
                          country VARCHAR(200) NOT NULL
);