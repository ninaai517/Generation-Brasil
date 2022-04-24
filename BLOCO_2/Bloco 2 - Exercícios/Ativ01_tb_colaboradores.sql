#ATIVIDADE 01

#1 - Criando a db e a tb:

create database db_RH;

use db_rh;
create table tb_colaboradores(
	id bigint auto_increment,
    nome varchar(30) not null,
    idade int not null,
    cargo varchar(30) not null,
    salario decimal(10,2) not null,
    
    primary key(id)
    );
# 2 - Povoando a tabela:

INSERT INTO tb_colaboradores(nome,idade,cargo,salario)
	VALUES("Cristina Naomi", 25, "Contadora", 5530.00);
INSERT INTO tb_colaboradores(nome,idade,cargo,salario)
	VALUES("Fernanda Cobre",30, "Fiscal", 6000.00);
INSERT INTO tb_colaboradores(nome,idade,cargo,salario)
	VALUES("Ronaldo Fernandes", 40, "CEO", 25500.00);
INSERT INTO tb_colaboradores(nome,idade,cargo,salario)
	VALUES("Matheus Teixeira", 26, "Analista de banco de dados", 1500.00);
INSERT INTO tb_colaboradores(nome,idade,cargo,salario)
	VALUES("Danielle Lima",24,"Gerente Geral", 6500.00);
    
#3 - Modificando um registro:   
UPDATE tb_colaboradores SET salario = 5000.00
	WHERE id = 4;

#4 - Consultando a tabela:
#Select * from tb_colaboradores where salario < 2000
Select * from tb_colaboradores where salario > 2000;    
    
    