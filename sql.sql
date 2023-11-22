CREATE TABLE ecoleta(

id SERIAL PRIMARY KEY,
nome VARCHAR(100) NOT NULL UNIQUE,
email VARCHAR(100) NOT NULL,
cidade VARCHAR(100) NOT NULL ,
tipoResiduo VARCHAR(20) NOT NULL,
latitude float(50)NOT     NULL,
longitude float(50)  NOT NULL

)






select * from  ecoleta
drop table ecoleta