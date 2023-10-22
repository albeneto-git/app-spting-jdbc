create table person (
	id integer not null,
	name varchar(255) not null,
	location varchar(255) ,
	birth_date timestamp,
	primary key(id)
);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (1, 'Neto', 'São Paulo', now());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (2, 'Guilherme', 'Rio de Janeiro', now());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (3, 'Beatriz', 'Salvador', now());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (4, 'Francineide', 'Natal', now());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (5, 'Dona Terezinha', 'Fortaleza', now());
