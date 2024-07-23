 create database if not exists SGBDCarros;
 
 use SGBDCarros;
 
 create table Carros(
	carroId int not null auto_increment,
    marca varchar(50),
    modelo varchar(50),
    precio double(10,2),
    primary key PK_carroId(carroId)
 );
 
 select * from Carros;