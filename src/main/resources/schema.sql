CREATE TABLE Empresa (
    Id   INTEGER      NOT NULL,
    nombreEmpresa VARCHAR(128) ,
    telefonoEmpresa VARCHAR(128) ,
    direccionEmpresa VARCHAR(128) NOT NULL,
    done BOOLEAN DEFAULT false,
    PRIMARY KEY (nitEmpresa)
);