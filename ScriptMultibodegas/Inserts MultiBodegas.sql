insert into Productos
(ID_Producto,Nombre_Producto,Precio_Producto)
values
(1,"Jabon","100"),
(2,"Shampoo", "200");

insert into Clientes
(ID_Cliente,Nombre_Cliente,DPI,Estatus)
values
(1,"Josue","111", "A"),
(2,"Daniel", "222", "I");

insert into Inventarios
(ID_Inventario,Telefono,Stock)
values
(1,"1234","11"),
(2,"12345","22");

insert into Cuentas_Corrientes
(ID_Cuenta,Tipo,Saldo)
values
(1,"Cuenta1","111"),
(2,"Cuenta1","222");

insert into Modulo_Informes
(ID_Informe,Impuesto,Estatus,Id_Cuenta)
values
(1,"111","A",1),
(2,"222","I",2);