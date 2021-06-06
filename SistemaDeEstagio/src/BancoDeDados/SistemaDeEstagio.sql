drop database if exists SistemaDeEstagio;
create database if not exists SistemaDeEstagio;
use SistemaDeEstagio;

create table Empresa(
id int not null primary key auto_increment,
nome varchar(100) not null,
cnpj varchar(30) not null,
telefone varchar(15) not null,
horarioFunc varchar(50) not null
);

create table FuncionarioEmpresa(
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

create table Funcionario(
id int not null primary key auto_increment,
nome varchar(100) not null,
cpf varchar(15) not null,
rg varchar(15) not null,
formacao varchar(50) not null,
datanasc varchar(15) not null,
sexo varchar(20) not null,
senha varchar(300) not null
);

create table ProfessorOrientador(
id int not null primary key auto_increment,
nome varchar(100) not null,
cpf varchar(15) not null,
rg varchar(15) not null,
formacao varchar(50) not null,
datanasc varchar(15) not null,
sexo varchar(20) not null,
senha varchar(300) not null
);

create table Supervisor(
id int not null primary key auto_increment,
areaAtuacao varchar(200) not null,
funcEmp_fk int not null,
foreign key (funcEmp_fk)
references FuncionarioEmpresa(id)
on update cascade
on delete restrict
);

create table Representante(
id int not null primary key auto_increment,
funcEmp_fk int not null,
foreign key (funcEmp_fk)
references FuncionarioEmpresa(id)
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
sexo varchar(20) not null,
turma varchar(50) not null
);

create table Estagio(
id int not null primary key auto_increment,
situacao varchar(100) not null,
supervisor_fk int not null,
foreign key(supervisor_fk)
references Supervisor(id)
on update cascade
on delete restrict,
proforient_fk int not null,
foreign key(proforient_fk)
references ProfessorOrientador(id)
on update cascade
on delete restrict,
aluno_fk int not null,
foreign key(aluno_fk)
references Aluno(id)
on update cascade
on delete restrict
);

select * from Aluno;