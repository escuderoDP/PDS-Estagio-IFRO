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
cargo varchar(100) not null,
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

insert into Funcionario values(null, "ADMIN", "000.000.000-00", "00000", "admin", "00/00/0000", "admin", MD5("systemestagioifro123456"));
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
funcionarioEmp_fk int not null,
foreign key(funcionarioEmp_fk)
references FuncionarioEmpresa(id)
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
select * from Funcionario;
select Aluno.id, Aluno.nome, Aluno.cpf,  Aluno.turma, Estagio.situacao from Aluno INNER JOIN Estagio ON Aluno.id = Estagio.aluno_fk where situacao = 'Pendente' or situacao = 'Aprovado' or situacao = 'Reprovado' ;

select Estagio.id as Estagioid, Estagio.situacao as Estagiosituacao,  Aluno.nome as Alunonome, FuncionarioEmpresa.nome as FuncionarioEmpresanome, ProfessorOrientador.nome as ProfessorOrientadornome, Empresa.nome as Empresanome from Estagio inner join Aluno on Aluno.id = Estagio.aluno_fk inner join FuncionarioEmpresa on Estagio.funcionarioEmp_fk = FuncionarioEmpresa.id inner join ProfessorOrientador on ProfessorOrientador.id = Estagio.proforient_fk inner join Empresa on Empresa.id = FuncionarioEmpresa.empresa_fk;


select Estagio.id as Estagioid, Aluno.nome as Alunonome, ProfessorOrientador.nome as ProfessorOrientadornome, null as Empresanome, null as FuncionarioEmpresanome, Estagio.situacao as Estagiosituacao from Estagio inner join Aluno on Aluno.id = Estagio.aluno_fk inner join FuncionarioEmpresa on Estagio.funcionarioEmp_fk = FuncionarioEmpresa.id inner join ProfessorOrientador on ProfessorOrientador.id = Estagio.proforient_fk inner join Empresa on Empresa.id = FuncionarioEmpresa.empresa_fk    
