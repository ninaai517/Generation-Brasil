CREATE database db_farmacia_bem_estar;

USE db_farmacia_bem_estar;

CREATE TABLE tb_categorias(
	id BIGINT AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	ativa BOOLEAN,
	PRIMARY KEY(id)
);

INSERT INTO tb_categorias(nome,ativa) VALUES ("Medicamento", true);
INSERT INTO tb_categorias(nome,ativa) VALUES ("Perfumaria", true);
INSERT INTO tb_categorias(nome,ativa) VALUES ("Infantil", true);
INSERT INTO tb_categorias(nome,ativa) VALUES ("Higiene", true);
INSERT INTO tb_categorias(nome,ativa) VALUES ("Alimentos", true);
    

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

INSERT INTO tb_produtos(nome, descricao, quantidade, preco, categorias_id) 
VALUES("Tinta Castanho Claro","Tintura capilar marca Koleston", 100, 20.00, 2);

INSERT INTO tb_produtos(nome, descricao, quantidade, preco, categorias_id) 
VALUES("Fralda Huggies XXG", "com 32 unidades", 50, 32.99, 3);

INSERT INTO tb_produtos(nome, descricao, quantidade, preco, categorias_id) 
VALUES("Água Mineral","Bonafonte 250mL", 10, 2.50, 4);

INSERT INTO tb_produtos(nome, descricao, quantidade, preco, categorias_id) 
VALUES("Dipirona gotas 20mL", "Antitérmico, alívio das dores", 50, 2.50, 1);

INSERT INTO tb_produtos(nome, descricao, quantidade, preco, categorias_id) 
VALUES("Prednisona", "10 mg.Caixa com 10 comprimidos", 60, 15.00, 1);

INSERT INTO tb_produtos(nome, descricao, quantidade, preco, categorias_id) 
VALUES("Absorvente Intimus Gel Noturno", "pacote com 8 unid.", 100, 8.00, 4);

INSERT INTO tb_produtos(nome, descricao, quantidade, preco, categorias_id) 
VALUES("Barra de cereal 20g","sabor banana com chocolate", 200, 2.50, 4);

INSERT INTO tb_produtos(nome, descricao, quantidade, preco, categorias_id) 
VALUES("Mamadeira 250mL antivazamento","BPA Free", 20, 30.00, 3);

INSERT INTO tb_produtos(nome, descricao, quantidade, preco, categorias_id) 
VALUES("Soro fisiológico 1L","Para higiene nasal e inalação", 15, 8.00, 4);

SELECT * FROM tb_produtos;
SELECT * FROM tb_produtos WHERE preco > 50.00;
SELECT * FROM tb_produtos WHERE preco < 50.00;
SELECT * FROM tb_produtos WHERE preco BETWEEN 5.00 AND 60.00 ORDER BY preco ASC;
SELECT * FROM tb_produtos WHERE nome LIKE "%C%";
SELECT * FROM tb_produtos INNER JOIN tb_categorias ON tb_produtos.categorias_id = tb_categorias.id;
/*SELECT * FROM tb_produtos INNER JOIN tb_categorias ON tb_produtos.categorias_id = tb_categorias.id
	WHERE tb_produtos.categorias_id(id); #Criar um select inner join que traga somente uma categoria especifica entre as tabelas;*/
