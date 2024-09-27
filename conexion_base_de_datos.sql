create database the_temper_trap;
USE the_temper_trap;

CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    telefono VARCHAR(15),
    direccion VARCHAR(50),
    password VARCHAR(50) NOT NULL
);

CREATE TABLE empleados (
    id_empleado INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(50) NOT NULL,
    rol ENUM('Cocinero', 'Repartidor', 'Gerente') NOT NULL
);

CREATE TABLE menu (
    id_plato INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10, 2) NOT NULL,
    disponible BOOLEAN DEFAULT TRUE
);

CREATE TABLE pedidos (
    id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    fecha_pedido DATETIME DEFAULT CURRENT_TIMESTAMP,
    total DECIMAL(10, 2),
    estado ENUM('Aceptado', 'En proceso de elaboración', 'Entregado al repartidor', 'Entregado al cliente') NOT NULL DEFAULT 'Aceptado',
    comentario TEXT,
    forma_pago ENUM('Efectivo', 'Tarjeta') NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
);

CREATE TABLE detalle_pedido (
    id_detalle INT AUTO_INCREMENT PRIMARY KEY,
    id_pedido INT,
    id_plato INT,
    cantidad INT NOT NULL,
    subtotal DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (id_pedido) REFERENCES pedidos(id_pedido),
    FOREIGN KEY (id_plato) REFERENCES menu(id_plato)
);

CREATE TABLE historial_pedidos (
    id_historial INT AUTO_INCREMENT PRIMARY KEY,
    id_pedido INT,
    id_empleado INT,
    fecha_actualizacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    comentario TEXT,
    estado ENUM('Aceptado', 'En proceso de elaboración', 'Entregado al repartidor', 'Entregado al cliente'),
    FOREIGN KEY (id_pedido) REFERENCES pedidos(id_pedido),
    FOREIGN KEY (id_empleado) REFERENCES empleados(id_empleado)
);

INSERT INTO clientes (nombre, email, telefono, direccion, password) VALUES
('Juan Pérez', 'juan.perez@mail.com', '555-1234', 'Calle Falsa 123', 'pass123'),
('María García', 'maria.garcia@mail.com', '555-5678', 'Avenida Siempre Viva 456', 'pass456'),
('Pedro López', 'pedro.lopez@mail.com', '555-2345', 'Calle Solitaria 789', 'pass789'),
('Ana Torres', 'ana.torres@mail.com', '555-6789', 'Bulevar Central 101', 'pass101'),
('Carlos Díaz', 'carlos.diaz@mail.com', '555-3456', 'Calle Alegría 202', 'pass202'),
('Luis Martínez', 'luis.martinez@mail.com', '555-7890', 'Avenida Horizonte 303', 'pass303'),
('Lucía Fernández', 'lucia.fernandez@mail.com', '555-4567', 'Calle Esperanza 404', 'pass404'),
('Sofía Ramírez', 'sofia.ramirez@mail.com', '555-8901', 'Bulevar Norte 505', 'pass505'),
('Miguel Ortiz', 'miguel.ortiz@mail.com', '555-5679', 'Calle Luna 606', 'pass606'),
('Elena Vargas', 'elena.vargas@mail.com', '555-1235', 'Avenida Sol 707', 'pass707');


INSERT INTO empleados (nombre, email, password, rol) VALUES
('Roberto Mendoza', 'roberto.mendoza@mail.com', 'emp123', 'Cocinero'),
('Fernando Castro', 'fernando.castro@mail.com', 'emp456', 'Cocinero'),
('Andrea Silva', 'andrea.silva@mail.com', 'emp789', 'Repartidor'),
('Manuel Jiménez', 'manuel.jimenez@mail.com', 'emp101', 'Repartidor'),
('Gloria Torres', 'gloria.torres@mail.com', 'emp202', 'Gerente'),
('Daniela Ruiz', 'daniela.ruiz@mail.com', 'emp303', 'Cocinero'),
('Jorge Hernández', 'jorge.hernandez@mail.com', 'emp404', 'Repartidor'),
('Valeria Rodríguez', 'valeria.rodriguez@mail.com', 'emp505', 'Gerente'),
('Antonio Flores', 'antonio.flores@mail.com', 'emp606', 'Cocinero'),
('Sergio Morales', 'sergio.morales@mail.com', 'emp707', 'Repartidor');


INSERT INTO menu (nombre, descripcion, precio, disponible) VALUES
('Hamburguesa Clásica', 'Carne de res con lechuga, tomate y mayonesa', 5.99, TRUE),
('Papas Fritas', 'Papas fritas crujientes con salsa de tomate', 2.49, TRUE),
('Pizza Margarita', 'Pizza con queso mozzarella, tomate y albahaca', 8.99, TRUE),
('Ensalada César', 'Lechuga con pollo, crutones y aderezo César', 4.99, TRUE),
('Tacos al Pastor', 'Tacos con carne de cerdo y piña', 6.99, TRUE),
('Sándwich de Pollo', 'Pollo a la parrilla con mayonesa y lechuga', 4.49, TRUE),
('Hot Dog Clásico', 'Salchicha, cebolla y mostaza', 3.49, TRUE),
('Bebida Refrescante', 'Bebida gaseosa de 500 ml', 1.99, TRUE),
('Helado de Vainilla', 'Helado de vainilla con chispas de chocolate', 2.99, TRUE),
('Café Americano', 'Café negro clásico', 1.49, TRUE);


INSERT INTO pedidos (id_cliente, fecha_pedido, total, estado, comentario, forma_pago) VALUES
(1, '2024-09-23 10:15:00', 15.47, 'Aceptado', 'Sin alergias', 'Tarjeta'),
(2, '2024-09-23 11:30:00', 9.48, 'En proceso de elaboración', 'Favor no agregar picante', 'Efectivo'),
(3, '2024-09-23 12:45:00', 19.97, 'Entregado al repartidor', '', 'Tarjeta'),
(4, '2024-09-23 13:00:00', 5.99, 'Entregado al cliente', 'Muy rápido, gracias', 'Tarjeta'),
(5, '2024-09-23 14:10:00', 12.48, 'Aceptado', 'Agregar más salsa', 'Efectivo'),
(6, '2024-09-23 15:20:00', 7.48, 'En proceso de elaboración', '', 'Tarjeta'),
(7, '2024-09-23 16:30:00', 10.99, 'Entregado al repartidor', 'Entregar sin contacto', 'Efectivo'),
(8, '2024-09-23 17:40:00', 8.48, 'Entregado al cliente', '', 'Tarjeta'),
(9, '2024-09-23 18:50:00', 9.98, 'Aceptado', 'Favor no incluir cebolla', 'Efectivo'),
(10, '2024-09-23 19:00:00', 13.98, 'Entregado al repartidor', '', 'Tarjeta');

INSERT INTO detalle_pedido (id_pedido, id_plato, cantidad, subtotal) VALUES
(1, 1, 1, 5.99),
(1, 2, 1, 2.49),
(1, 8, 1, 1.99),
(2, 5, 2, 13.98),
(3, 3, 1, 8.99),
(3, 7, 1, 3.49),
(4, 1, 1, 5.99),
(5, 6, 2, 8.98),
(6, 4, 1, 4.99),
(7, 5, 2, 13.98),
(8, 9, 1, 2.99),
(9, 2, 1, 2.49),
(10, 10, 2, 2.98);


INSERT INTO historial_pedidos (id_pedido, id_empleado, estado, comentario) VALUES
(1, 1, 'Aceptado', 'Sin alergias, todo correcto'),
(2, 2, 'En proceso de elaboración', 'Pedido sin picante'),
(3, 3, 'Entregado al repartidor', 'Repartidor asignado'),
(4, 4, 'Entregado al cliente', 'Pedido entregado con éxito'),
(5, 1, 'Aceptado', 'Agregar más salsa'),
(6, 2, 'En proceso de elaboración', 'En preparación'),
(7, 3, 'Entregado al repartidor', 'Entrega sin contacto solicitada'),
(8, 4, 'Entregado al cliente', 'Pedido entregado sin problemas'),
(9, 1, 'Aceptado', 'Favor no incluir cebolla'),
(10, 3, 'Entregado al repartidor', 'Repartidor en camino');
