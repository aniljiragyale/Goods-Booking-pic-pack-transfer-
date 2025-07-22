CREATE DATABASE IF NOT EXISTS goods_booking;
USE goods_booking;

CREATE TABLE bookings (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    phone VARCHAR(15),
    pickup VARCHAR(100),
    drop_location VARCHAR(100),
    goods_type VARCHAR(100),
    weight DOUBLE,
    packaging_required BOOLEAN,
    vehicle_type VARCHAR(50),
    date DATE
);

