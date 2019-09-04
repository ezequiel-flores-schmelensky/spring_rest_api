INSERT INTO Regiones (id, nombre) VALUES (1, 'Sdamérica');
INSERT INTO Regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO Regiones (id, nombre) VALUES (3, 'Norteamérica');
INSERT INTO Regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO Regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO Regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO Regiones (id, nombre) VALUES (7, 'Oceanía');
INSERT INTO Regiones (id, nombre) VALUES (8, 'Antártida');

INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1,'Andrés','Guzmán','profesor@bolsadeideas.com','2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2,'Luis','Guzmán','profesor1@bolsadeideas.com','2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3,'Jorge','Guzmán','profesor2@bolsadeideas.com','2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4,'Antonio','Guzmán','profesor3@bolsadeideas.com','2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (5,'Raul','Guzmán','profesor4@bolsadeideas.com','2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (6,'Miguel','Guzmán','profesor5@bolsadeideas.com','2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (7,'Joel','Guzmán','profesor6@bolsadeideas.com','2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (8,'Eze','Guzmán','profesor7@bolsadeideas.com','2018-01-01');

INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('andres','$2a$10$LnZ05jCNN0rdu.E7J.4o4e62Nfq1F9B.pebWm.g5uRJEOWayhACSK',1,'andres','profesor','andres@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$98BU7Fk0WPEj/i5oncWWgufkXphTPub8UeAajGla6pmlYTzepfZ2i',1,'admin','admin','admin@gmail.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);

INSERT INTO productos (nombre, precio, create_at) VALUES('LCD Panasonic', 259990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('LCD Sony', 259340, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('LCD Apple', 11990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('LCD Windows', 2349990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('LCD HP', 500990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('LCD Lenovo', 7799990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('LCD Samsung', 1119990, NOW());

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES ('Factura equipos de oficina', null, 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1,1,1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (2,1,4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1,1,5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1,1,7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES ('Factura Bicicleta', 'Alguna nota importante!', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (3,2,6);