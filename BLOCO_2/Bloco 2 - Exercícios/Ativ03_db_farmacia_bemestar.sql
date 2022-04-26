CREATE database db_farmacia_bem_estar;

USE db_farmacia_bem_estar;

CREATE TABLE tb_categorias(
	id BIGINT AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	ativa BOOLEAN,
	PRIMARY KEY(id)
);

INSERT INTO tb_categorias(nome,ativa) 
	VALUES ("Medicamento", true);
    
INSERT INTO tb_categorias(nome,ativa) 
	VALUES ("Perfumaria", true);
    
INSERT INTO tb_categorias(nome,ativa) 
	VALUES ("Infantil", true);

INSERT INTO tb_categorias(nome,ativa) 
	VALUES ("Higiene", true);

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	descricao VARCHAR(30) NOT NULL,
	quantidade INT NOT NULL,
	preco decimal(8,2) NOT NULL,
	categorias_id BIGINT,
	PRIMARY KEY(id),
	FOREIGN KEY(categorias_id) REFERENCES tb_categorias(id)
);




