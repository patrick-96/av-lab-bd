create database av1
go
use av1
drop table Quesito

create procedure sp_inserenota(@nome_q varchar(100), @nota decimal(3,1),@nota_total_q decimal(3,1))


as begin
insert into Quesito (nota)values
(@nota)

end


create table Quesito(id_q int identity(1,1) primary key,
nome_q varchar(100),
id_e int foreign key references Escola,
nota decimal(3,1),
nota_total_q decimal(3,1)
)

create table Jurado(id_j int identity primary key,
nome_j varchar(100),
id_q int foreign key references Quesito
)

create table Escola(id_e  identity(1,1) int primary key,
nome_e varchar(150),
total_pontos decimal(3,1))


insert into Quesito(id_q,nome_q) values 
(1,'Comiss�o de Frente'),
(2,'Evolu��o'),
(3,'Fantasia'),
(4,'Bateria'),
(5,'Alegoria'),
(6,'Harmonia'),
(7,'Samba-Enredo'),
(8,'Mestre-Sala e Porta-Bandeira'),
(9,'Enredo');

insert into Escola(id_e,nome_e)
values
(1,'Acad�micos do Tatuap�'),
(2,'Rosas de Ouro'),
(3,'Mancha Verde'),
(4,'Vai-Vai'),
(5,'X-9 Paulistana'),
(6,'Drag�es da Real'),
(7,'�guia de Ouro'),
(8,'Nen� de Vila Matilde'),
(9,'Gavi�es da Fiel'),
(10,'Mocidade Alegre'),
(11,'Tom Maio'),
(12,'Unidos de Vila Maria'),
(13,'Acad�micos do Tucuruvi'),
(14,'Imp�rio de Casa Verde');

insert into Jurado(id_j,nome_j)
values
(1,'1� Jurado'),
(2,'2� Jurado'),
(3,'3� Jurado'),
(4,'4� Jurado'),
(5,'5� Jurado'),


