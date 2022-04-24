#1 - DB da escola:
	create database db_escola;

#2 - TB alunos:
	use db_escola;
	create table tb_alunos(
		id bigint auto_increment,
        nome varchar(100) not null,
        idade int not null,
        ano_let int not null,
        materia varchar(50) not null,
        nota_med float(5,2) not null,
        primary key(id)
    );
    
    #3 - Inserindo dados: 

	insert into tb_alunos(nome,idade,ano_let,materia,nota_med) 
		values("Francisco",10,2022,"Português",8.5);
 	insert into tb_alunos(nome,idade,ano_let,materia,nota_med) 
		values("Carla",10,2022,"Português",10.0);
	insert into tb_alunos(nome,idade,ano_let,materia,nota_med)
		values("Felipe",10,2022,"Matemática",9.0);
	insert into tb_alunos(nome,idade,ano_let,materia,nota_med)
		values("Giulio",10,2022,"História",5.0);
 	insert into tb_alunos(nome,idade,ano_let,materia,nota_med)
		values("Juliana",10,2022,"História",4.0);
	insert into tb_alunos(nome,idade,ano_let,materia,nota_med)
		values("Fabricio",10,2022,"Português",10.0);
 	insert into tb_alunos(nome,idade,ano_let,materia,nota_med)
		values("Ana Paula",10,2022,"Matemática",10.0);
	insert into tb_alunos(nome,idade,ano_let,materia,nota_med)
		values("Beatriz",10,2022,"Geografia",4.5);
        
#4 - modificando valores: 
	update tb_alunos set nota_med = 9.0
		where id = 5;
        
#5 - Consultando a tabela: 

	Select * from tb_alunos where nota_med>7.0;
    Select * from tb_alunos where nota_med<7.0
    
