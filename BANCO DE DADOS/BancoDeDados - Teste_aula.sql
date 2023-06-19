-- Comando para criar uma tabela

CREATE TABLE TESTE (
	idTeste int primary key,
	nome  varchar(50)
);

-- Comando para alterar tabela,nesse caso,
-- adicionamos coluna idade e cpf.

ALTER TABLE TESTE
	ADD idade int, 
	ADD cpf varchar(14);
	
-- Comando para alterar tabela, nesse caso, 
-- alteramos o tamanho do campo nome de 50 para 60.
-- no caso TYPE significa 
ALTER TABLE TESTE ALTER COLUMN nome TYPE varchar(60);

-- Comando para deletar/apaga tabela, nesse caso, 
-- deletamos a tabela teste.
DROP TABLE TESTE;

--COMANDOS DML - Data Manipulation Language--

-- Inserir dados na tabela,quando for passar os valores para inserir dentro do (),
-- voce deve a ordem de colunas da tabela, para inserir o dado na coluna correta
INSERT INTO teste 
VALUES('Maria',3,25,'888.888.888-88')

-- Inserir dados na tabela,nesse caso, eu coloco antes a ordem que quero que os valores 
-- devem ser inseridos, ou seja, posso por de forma aleatoria
INSERT INTO teste (nome, idteste, idade, cpf) 
VALUES('Maria',3,25,'888.888.888-88');

-- insere dados na tabela (com colunas faltantes)
INSERT INTO teste (nome, idteste) 
VALUES('José',6);

-- Inserindo dados na tabela, porém vários de uma vez
INSERT INTO teste (nome, idteste, idade, cpf) VALUES
('Yasmin',4,20,'777.777.777-77'),
('Karina',5,30,'666.666.666-66'),
('Mirela',7,28,'555.555.555-55')



-- Update com WHERE!!!
-- com o Where idteste = 2, eu selecionei umas das 
-- colunas que puxam o restante dos dados
UPDATE teste SET nome='Pedro', idade=21, cpf='444.444.444-44'
WHERE idteste = 2;

-- =================================
-- ============= CUIDADO!!!!!!!! ===========
-- Update com WHERE!!!
-- Nesse caso, simulamos o esquecimento do Where, 
-- que identifica onde quero atualizar valores,
-- OU SEJA, ELE ALTEROU TODOS OS VALORES DE TODAS AS LINHAS
-- PODE CAUSAR DEMISSÕES KKKKKKKKKKKKKK

UPDATE teste SET nome='Pedro', idade=21, cpf='444.444.444-44';
--WHERE idteste = 2;

-- Nesse caso, alteramos dados com id maiores que 5, ou seja,
-- todas as linhas depois de 5, foram alteradas.
UPDATE teste SET nome='Pedro', idade=21, cpf='444.444.444-44'
WHERE idteste > 5;

-- Atualiza dados com operações matematicas, nesse caso
-- serão adicionados +5 em todos os campos de idade, 
-- menos as que estiverem nulas
UPDATE teste SET idade= idade+5;

-- Comandos DQL - Data Query Language -- 

--Vizualiza toda a tabela
SELECT * FROM TESTE;

