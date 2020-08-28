 Drop database Multibodegas;
create database Multibodegas;
use multibodegas;
create table Usuarios
(   ID_Usuario int primary key auto_increment,
	Nombre_Usuario varchar(50),
    Contraseña varchar(10),
    Correo varchar(100)
)engine = InnoDB default charset=latin1;

create table Productos
(
	ID_Producto varchar (10) primary key,
    Nombre_Producto varchar(35),
    Precio_Producto int 
 
)engine = InnoDB default charset=latin1;


create table Clientes
(
	ID_Cliente varchar (10) primary key,
    Nombre_Cliente varchar(35),
    DPI varchar(70),
    Estatus Varchar(2)
 
)engine = InnoDB default charset=latin1;

create table Inventarios
(
	ID_Inventario varchar (10) primary key,
    Telefono varchar(35),
    Stock Varchar(2)
 
)engine = InnoDB default charset=latin1;


create table Cuentas_Corrientes
(
	ID_Cuenta varchar (10) primary key,
    Tipo varchar (20),
    Saldo Float
 
)engine = InnoDB default charset=latin1;

create table Modulo_Informes
(
	ID_Informe varchar (10) primary key,
    Impuesto Float,
    Estatus Varchar(1),
	Id_Cuenta varchar (10),
    foreign key (Id_Cuenta) references Cuentas_Corrientes(ID_Cuenta)
 
)engine = InnoDB default charset=latin1;


create table Venta_Encabezado
(
	ID_Venta Varchar (10) primary key,
    Fecha_Venta Varchar (20),
    Estatus_Venta varchar(1),
	Total_Venta Float ,
    
    Id_Informe varchar (10),
    Id_Cliente varchar (10),
    foreign key (Id_Informe) references Modulo_Informes(ID_Informe),
     foreign key (Id_Cliente) references Clientes(ID_Cliente)
    
 
)engine = InnoDB default charset=latin1;

create table Venta_Detalle
(
	Orden_Venta varchar (10) primary key,

	Precio_Venta int ,
    Cantidad int ,
    Costo_Venta int,
    Id_Inventario varchar (10),
    Id_Productos varchar (10),
    Id_Venta_Encabezado varchar(10),
    foreign key (Id_Inventario) references Inventarios(ID_Inventario),
     foreign key (Id_Productos) references Productos(ID_Producto),
       foreign key (Id_Venta_Encabezado) references Venta_Encabezado(ID_Venta)
    
 
)engine = InnoDB default charset=latin1;

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