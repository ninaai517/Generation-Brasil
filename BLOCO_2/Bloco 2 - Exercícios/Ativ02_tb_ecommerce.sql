#Create database db_ecommerce;

/*use db_ecommerce;
	create table tb_produtos(
		id bigint auto_increment,
        nome varchar(50) not null,
        categoria varchar(50) not null,
        quant_estoque int not null,
        preco decimal(10,2),
        ativo boolean,
        primary key(id)
    );*/
    
#3 - Inserindo dados:

insert into tb_produtos(nome,categoria,quant_estoque,preco,ativo)
	values("Notebook Samsung", "Informática",50,3500.00,true);
insert into tb_produtos(nome,categoria,quant_estoque,preco,ativo)
	values("Mouse sem fio bluetooth", "Informática",100,60.00,true);
insert into tb_produtos(nome,categoria,quant_estoque,preco,ativo)
	values("Relógio", "Acessórios",30,20.00,true);
insert into tb_produtos(nome,categoria,quant_estoque,preco,ativo)
	values("Celular Xiaomi 9A", "Smartphones,tablets",1000,730.00,true);
insert into tb_produtos(nome,categoria,quant_estoque,preco,ativo)
	values("Capinha celular Xiaomi 9A", "Smartphones",1500,20.00,true);
insert into tb_produtos(nome,categoria,quant_estoque,preco,ativo)
	values("Caneta bic 0.7mm preta em gel", "Papelaria",200,2.50,true);
insert into tb_produtos(nome,categoria,quant_estoque,preco,ativo)
	values("Caneta bic 0.7mm vermelha em gel", "Papelaria",200,2.50,true);
insert into tb_produtos(nome,categoria,quant_estoque,preco,ativo)
	values("Lapiseira Faber Castell 0.9mm","Papelaria",200,7.00,true);

#3 - Modificando um registro:
Update tb_produtos set ativo = false
	where id = 4;

#4 - Consultando a tabela: 
Select * from tb_produtos where preco>500.00;
Select * from tb_produtos where preco<500.00