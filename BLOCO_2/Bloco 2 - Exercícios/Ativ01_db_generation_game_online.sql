-- Criando a base de dados: 

CREATE DATABASE db_generation_game_online;

-- Iniciando o db e criando as tabelas Classes e Personagens:

USE db_generation_game_online;

CREATE TABLE tb_classes(
	id bigint auto_increment,
    nome_classe varchar(30) not null,
    habilidades varchar(50) not null,
    primary key(id)
);

INSERT INTO tb_classes(nome_classe,habilidades)
VALUES ("Ladino","Arrombamento");

INSERT INTO tb_classes(nome_classe,habilidades)
VALUES ("Mago","Magia");

INSERT INTO tb_classes(nome_classe,habilidades)
VALUES ("Curandeiro","Cura");

INSERT INTO tb_classes(nome_classe,habilidades)
VALUES ("Barbáro","Provocação");

CREATE TABLE tb_personagens(
	id bigint auto_increment,
	nome_personagem varchar(50) not null,
	lvl int not null,
	HP int not null,
	MP int not null,
	forca int not null,
	inteligencia int not null,
    defesa int not null,
	id_classe bigint auto_increment,
	primary key(id),
	foreign key(id_classe) REFERENCES tb_classe(id)
	);
    
INSERT INTO tb_personagens(nome_personagem, lvl, HP, MP,forca,inteligencia,defesa,id_classe)
VALUES ("Pandora", 1, 200, 50, 2, 8, 10, 2);

INSERT INTO tb_personagens(nome_personagem, lvl, HP, MP,forca,inteligencia,defesa,id_classe)
VALUES ("Romeu", 1, 250, 20, 8, 2, 10, 1);

INSERT INTO tb_personagens(nome_personagem, lvl, HP, MP,forca,inteligencia,defesa,id_classe)
VALUES ("Metiolate", 2, 350, 30, 2, 10, 10, 3);

INSERT INTO tb_personagens(nome_personagem, lvl, HP, MP,forca,inteligencia,defesa,id_classe)
VALUES ("Valentina", 2, 400, 8, 8, 5, 13, 4);

INSERT INTO tb_personagens(nome_personagem, lvl, HP, MP,forca,inteligencia,defesa,id_classe)
VALUES ("Thetis", 10, 1500, 50, 75, 30, 40, 1);

INSERT INTO tb_personagens(nome_personagem, lvl, HP, MP,forca,inteligencia,defesa,id_classe)
VALUES ("Vivi", 10, 1350, 100, 30, 150, 50, 2);

INSERT INTO tb_personagens(nome_personagem, lvl, HP, MP,forca,inteligencia,defesa,id_classe)
VALUES ("Shion", 3, 540, 15, 30, 8, 20, 4);

INSERT INTO tb_personagens(nome_personagem, lvl, HP, MP,forca,inteligencia,defesa,id_classe)
VALUES ("Lola", 2, 350, 30, 2, 10, 10, 3);

-- Consultando as tabelas: 

SELECT * FROM tb_personagens WHERE forca > 2000;
SELECT * FROM tb_personagens WHERE forca BETWEEN 1000 AND 2000 ORDER BY id_classe ASC;
SELECT * FROM tb_personagens WHERE nome_personagem LIKE "%t%";
SELECT * FROM tb_personagens INNER JOIN tb_classes
	ON tb_personagens.id_classe = tb_classes.id;

SELECT * FROM tb_personagens INNER JOIN tb_classes
	ON tb_personagens.id_classe = tb_classes.id
    WHERE tb_personagens.id_classe = 1;
    







    