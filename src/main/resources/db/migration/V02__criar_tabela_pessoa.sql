CREATE TABLE pessoa
(
  codigo      SERIAL                NOT NULL,
  nome        CHARACTER VARYING(50) NOT NULL,
  logradouro  CHARACTER VARYING(50),
  numero      CHARACTER VARYING(10),
  complemento CHARACTER VARYING(30),
  bairro      CHARACTER VARYING(30),
  cep         CHARACTER VARYING(15),
  cidade      CHARACTER VARYING(50),
  estado      CHARACTER VARYING(2),
  ativo       BOOLEAN               NOT NULL,

  CONSTRAINT pk_pessoa PRIMARY KEY (codigo)
);

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES ('Caio Mateus Oliveira Martins de Sousa', 'Rua Osvaldo Minella', '2029', 'Bloco J, Ap 403', 'Cedro', '88341780', 'Cambori�', 'SC', TRUE);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES ('Ana Carolina da Silva Patricio', 'Rua Osvaldo Minella', '2029', 'Bloco J, Ap 403', 'Cedro', '88341780', 'Cambori�', 'SC', TRUE);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES ('Marcelo Fernandes', 'Rua Amsterd�', '105', NULL, 'Santa Regina', '88345605', 'Cambori�', 'SC', TRUE);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES ('Paulo Ricardo Coutinho Gomes', 'Rua Amsterd�', '105', NULL, 'Santa Regina', '88345605', 'Cambori�', 'SC', TRUE);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES ('Gidario Dias', 'Rua do Abacaxi', '10', NULL, 'Brasil', '38.400-12', 'Uberl�ndia', 'MG', TRUE);