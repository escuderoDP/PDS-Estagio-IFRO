drop database if exists SistemaDeEstagio;
create database if not exists SistemaDeEstagio;
use SistemaDeEstagio;

create table Empresa(
id int not null primary key auto_increment,
nome varchar(100) not null,
cnpj varchar(30) not null,
telefone varchar(15) not null,
horarioFunc time not null
);

create table Funcionario(
id int not null primary key auto_increment,
nome varchar(100) not null,
cpf varchar(15) not null,
rg varchar(15) not null,
formacao varchar(50) not null,
datanasc varchar(15) not null,
sexo varchar(20) not null,
empresa_fk int not null,
foreign key (empresa_fk)
references Empresa(id)
on update cascade
on delete restrict
);

create table Aluno(
id int not null primary key auto_increment,
nome varchar(100) not null,
cpf varchar(15) not null,
rg varchar(15) not null,
telefone varchar(15) not null,
datanasc varchar(15) not null,
sexo varchar(20) not null
);

create table Estagio(
id int not null primary key auto_increment,
vaga varchar(50) not null,
cargaHoraria varchar(20) not null,
funcionario_fk int not null,
foreign key(funcionario_fk)
references Funcionario(id)
on update cascade
on delete restrict,
aluno_fk int not null,
foreign key(aluno_fk)
references Aluno(id)
on update cascade
on delete restrict
);

select * from empresa;