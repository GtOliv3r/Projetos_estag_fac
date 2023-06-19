-- Criar Entidade Departamentos

CREATE TABLE departamentos (
	idDepartamento int primary key,
	siglaDepartamento varchar(3) NOT NULL,
	nomeDepartamento varchar(30) NOT NULL
);

SELECT * FROM departamentos;

-- RENOMEIA AS COLUNAS 
ALTER TABLE departamentos RENAME COLUMN idDepartamento TO id_Departamento;
ALTER TABLE departamentos RENAME COLUMN siglaDepartamento TO sigla_Departamento;
ALTER TABLE departamentos RENAME COLUMN nomeDepartamento TO nome_Departamento;


CREATE TABLE cursos (
	id_Curso int primary key,
	id_Departamento int REFERENCES departamentos, --#id_Departamento (chave estrangeira da tabela departamento)
	sigla_curso varchar(3) NOT NULL,
	nome_curso varchar(30) NOT NULL
	
);

-- VIZUALIZA a entidade cursos
SELECT * FROM cursos;

CREATE TABLE disciplinas (
	id_disciplina int primary key,
	id_curso int REFERENCES cursos, --#id_curso (chave estrangeira da tabela cursos)
	sigla_disciplina varchar(4) NOT NULL,
	nome_disciplina varchar(50),
	optativa BOOLEAN DEFAULT FALSE
	
);

-- VIZUALIZA a entidade disciplinas
SELECT * FROM disciplinas;

-- ALTERA O TAMANHO DO VARCHAR DA COLUNA nome_curso
ALTER TABLE cursos ALTER COLUMN nome_curso TYPE varchar(50);


CREATE TABLE alunos (
	ra int primary key,
	cpf varchar (14) NOT NULL UNIQUE,
	nome_aluno VARCHAR(50) NOT NULL,
	data_nascimento DATE check (AGE(CURRENT_DATE, data_nascimento)>='14 years'),
	status boolean default true
);

-- VIZUALIZA a entidade alunos
SELECT * FROM alunos;

CREATE TABLE alunos (
	ra int primary key,
	cpf varchar (14) NOT NULL UNIQUE,
	nome_aluno VARCHAR(50) NOT NULL,
	data_nascimento DATE check (AGE(CURRENT_DATE, data_nascimento)>='14 years'),
	status boolean default true
);

-- Criar entidade disciplinas_alunos ( ENTIDADE ASSOCIATIVA Q VIROU ENTIDADE COMUM por causa da adição da coluna "data")
CREATE TABLE disciplinas_alunos(
id_disciplina_aluno int PRIMARY KEY,
id_disciplina INT REFERENCES disciplinas,
ra INT REFERENCES alunos,
data_matricula DATE
);

SELECT * FROM disciplinas_alunos;


-- 24/04

-- AUMENTANDO O TAMANHO DO VARCHAR DA COLUNA nome_Departamento 
ALTER TABLE departamentos ALTER COLUMN nome_Departamento TYPE varchar (50);

-- Povoando a entidade departamentos
INSERT INTO departamentos VALUES(1,'CST','Curso Superior em Tecnologia');
INSERT INTO departamentos VALUES(2,'CT','Curso Técnico');
INSERT INTO departamentos VALUES
(3,'CAI','Curso de Aprendizagem Industrial'),
(4,'FIC','Formação Inicial Continuada');

-- Mostrando toda tabela "departamentos"
SELECT * FROM departamentos;

-- Visualizar a tabela departamentos ordenadamente em ordem númerica descrescente
-- (por que a coluna id_Departamento é do tipo INTEGER)
SELECT * FROM departamentos ORDER BY id_Departamento DESC;

-- Visualizar a tabela departamentos ordenadamente em ordem alfabética
-- (por que a coluna sigla_Departamento é do tipo VARCHAR)
SELECT * FROM departamentos ORDER BY sigla_Departamento;

-- Fazer a contagem de todas as linhas
SELECT COUNT (*) FROM departamentos;

-- Fazer a contagem de todas as linhas que não possuem "null" em nenhum dos seus atributos
SELECT COUNT ('any') FROM departamentos;

-- Mostrando toda tabela "cursos"
SELECT * FROM cursos;

-- Povoando a entidade cursos
INSERT INTO cursos VALUES
(1,1,'ADS', 'Tecnólogo em Análise e Desenvolvimento de Sistemas'),
(2,1,'MEC', 'Tecnólogo em Mecatrônica'),
(3,2,'DEV', 'Técnico em Desenvolvimento de Sistemas'),
(4,2,'MEC', 'Técnico em Mecatrônica'),
(5,3,'EME', 'Eletricista de Manutenção Eletroeletrônico'),
(6,3,'MUS', 'Mecânico de Usinagem'),
(7,3,'ADM', 'Administração'),
(8,4,'CLP', 'Controladores Lógicos Programáveis'),
(9,4,'EXC', 'Excel'),
(10,4,'PBI', 'Power BI'),
(11,4,'ROB', 'Robótica Industrial'),
(12,4,'EIN', 'Eletricista Instalador'),
(13,4,'HDR', 'HIdráulica'),
(14,4,'PNE', 'Pneumática'),
(15,4,'FER', 'Ferramenteiro');

-- Visualizando a tabela Cursos
SELECT * FROM cursos ;

-- Visualizando as colunas sigla_curso e nome_cursos da tabela Cursos
SELECT sigla_curso, nome_curso FROM cursos ;

-- Visualizando o numero de linhas da tabela Cursos , 
-- tendo valores null ou não
SELECT COUNT (*) FROM cursos;

-- Mostrar tabela de departamento e seus respectivos cursos, selecionando a tabela.coluna
SELECT departamentos.sigla_departamento, cursos.nome_curso
FROM cursos INNER JOIN departamentos
ON departamentos.id_Departamento = cursos.id_departamento;

-- Variação do comando anterior
SELECT sigla_departamento, nome_curso
FROM cursos INNER JOIN departamentos
USING (id_Departamento);

-- Outra Variação do comando anterior
SELECT sigla_departamento, nome_curso
FROM cursos NATURAL INNER JOIN departamentos;

-- Quantos cursos cada departamento possui
SELECT id_departamento, COUNT (id_curso) FROM cursos GROUP BY id_departamento ORDER BY id_departamento;

-- Exiba as siglas dos departamentos e a contagem de cursos para cada sigla_departamento
-- A exibição será feita a partir da tabela derivada pela junção de cursos com departamentos
-- Agrupada pelas siglas de departamento.
SELECT sigla_departamento, COUNT (nome_curso)
FROM cursos NATURAL INNER JOIN departamentos GROUP BY sigla_departamento;

-- Mesma coisa que o comando anterior faz, só que apelidamos
-- essa tabela derivada de "sub", ou seja, demos um nome a ela,
-- isso ajudará na hora de colocar um INNER JOIN dentro de outro.
SELECT sigla_departamento, COUNT (nome_curso)
FROM (cursos NATURAL INNER JOIN departamentos) AS sub
GROUP BY sub.sigla_departamento;