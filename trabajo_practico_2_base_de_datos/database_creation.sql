-- Creación de la base de datos
CREATE DATABASE gestion_expensas;

-- Uso de la base de datos
USE gestion_expensas;

-- Tabla Edificio
CREATE TABLE Edificio (
    edificio_id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(255) NOT NULL,
    administrador_id INT,
    FOREIGN KEY (administrador_id) REFERENCES Administrador(administrador_id)
);

-- Insertar datos en la tabla Edificio
INSERT INTO Edificio (nombre, direccion, administrador_id) VALUES ('Edificio 1', 'Calle 1 Nro 123', 1);
INSERT INTO Edificio (nombre, direccion, administrador_id) VALUES ('Edificio 2', 'Calle 2 Nro 456', 2);
INSERT INTO Edificio (nombre, direccion, administrador_id) VALUES ('Edificio 3', 'Calle 3 Nro 789', 1);

-- Borrado de datos de la tabla Edificio
DELETE FROM Edificio WHERE edificio_id = 3;

-- Consulta de datos de la tabla Edificio
SELECT * FROM Edificio;

-- Tabla Departamento
CREATE TABLE Departamento (
    departamento_id INT AUTO_INCREMENT PRIMARY KEY,
    numero VARCHAR(10) NOT NULL,
    piso INT NOT NULL,
    edificio_id INT,
    porcentaje_participacion DECIMAL(5, 2) NOT NULL,
    FOREIGN KEY (edificio_id) REFERENCES Edificio(edificio_id)
);

-- Insertar datos en la tabla Departamento
INSERT INTO Departamento (numero, piso, edificio_id, porcentaje_participacion) VALUES ('A', 1, 1, 10.00);
INSERT INTO Departamento (numero, piso, edificio_id, porcentaje_participacion) VALUES ('B', 1, 1, 20.00);
INSERT INTO Departamento (numero, piso, edificio_id, porcentaje_participacion) VALUES ('A', 2, 1, 10.00);
INSERT INTO Departamento (numero, piso, edificio_id, porcentaje_participacion) VALUES ('B', 2, 1, 20.00);
INSERT INTO Departamento (numero, piso, edificio_id, porcentaje_participacion) VALUES ('A', 3, 1, 10.00);
INSERT INTO Departamento (numero, piso, edificio_id, porcentaje_participacion) VALUES ('B', 3, 1, 20.00);
INSERT INTO Departamento (numero, piso, edificio_id, porcentaje_participacion) VALUES ('A', 4, 1, 10.00);
-- Ingreso incorrecto del departamento 4A
INSERT INTO Departamento (numero, piso, edificio_id, porcentaje_participacion) VALUES ('4A', 4, 1, 10.00);

-- Borrado de datos de la tabla Departamento
DELETE FROM Departamento WHERE departamento_id = 8;

-- Consulta de datos de la tabla Departamento
SELECT * FROM Departamento;

-- Tabla Expensa
CREATE TABLE Expensa (
    expensa_id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    monto DECIMAL(10, 2) NOT NULL,
    concepto TEXT,
    edificio_id INT,
    FOREIGN KEY (edificio_id) REFERENCES Edificio(edificio_id)
);

-- Insertar datos en la tabla Expensa
INSERT INTO Expensa (fecha, monto, concepto, edificio_id) VALUES ('2024-01-01', 1000.00, 'Limpieza', 1);
INSERT INTO Expensa (fecha, monto, concepto, edificio_id) VALUES ('2024-01-01', 2000.00, 'Luces', 1);
INSERT INTO Expensa (fecha, monto, concepto, edificio_id) VALUES ('2024-03-01', 3000.00, 'Limpieza', 1);
INSERT INTO Expensa (fecha, monto, concepto, edificio_id) VALUES ('2024-04-01', 4000.00, 'Reparaciones', 1);
INSERT INTO Expensa (fecha, monto, concepto, edificio_id) VALUES ('2024-05-01', 5000.00, 'Mantenimiento ascensor', 1);
INSERT INTO Expensa (fecha, monto, concepto, edificio_id) VALUES ('2024-05-01', 6000.00, 'Limpieza', 1);
INSERT INTO Expensa (fecha, monto, concepto, edificio_id) VALUES ('2024-05-01', 7000.00, 'Luces', 1);
INSERT INTO Expensa (fecha, monto, concepto, edificio_id) VALUES ('2024-05-01', 8000.00, 'Matafuegos', 1);

-- Borrado de datos de la tabla Expensa
DELETE FROM Expensa WHERE expensa_id = 8;

-- Consulta de datos de la tabla Expensa
SELECT * FROM Expensa;

-- Tabla administrador
CREATE TABLE Administrador (
    administrador_id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefono VARCHAR(20) NOT NULL
);

-- Insertar datos en la tabla Administrador
INSERT INTO Administrador (nombre, apellido, email, telefono) VALUES ('Juan', 'Perez', 'jperez@mail.com', '123456789');
INSERT INTO Administrador (nombre, apellido, email, telefono) VALUES ('Maria', 'Gomez', 'mgomez@mail.com', '987654321');
INSERT INTO Administrador (nombre, apellido, email, telefono) VALUES ('Carlos', 'Rodriguez', 'crodriguez@mail.com', '555555555');

-- Borrado de datos de la tabla Administrador
DELETE FROM Administrador WHERE administrador_id = 3;

-- Consulta de datos de la tabla Administrador
SELECT * FROM Administrador;


-- Creación de la vista para ver el resultado mensual
CREATE VIEW ResultadoMensual AS
SELECT YEAR(e.fecha) AS año, MONTH(e.fecha) AS mes, d.numero, d.piso, SUM(e.monto * d.porcentaje_participacion / 100) AS monto
FROM Expensa e 
JOIN Edificio ed ON e.edificio_id = ed.edificio_id
JOIN Departamento d ON ed.edificio_id = d.edificio_id
GROUP BY año, mes, d.numero, d.piso
ORDER BY año, mes, d.numero, d.piso;

-- Consulta de la vista ResultadoMensual para mayo 2024
SELECT * FROM ResultadoMensual WHERE año = 2024 AND mes = 5;

