-- ------------------------------------------------------------------------------
-- - Reconstruction de la base de données                                     ---
-- ------------------------------------------------------------------------------
DROP DATABASE IF EXISTS HaALite;
CREATE DATABASE HaALite;
USE HaALite;


-- -----------------------------------------------------------------------------
-- - Construction de la table des utilisateurs                               ---
-- -----------------------------------------------------------------------------
CREATE TABLE T_Investigateur (
	idInvestigateur				int(4)		PRIMARY KEY AUTO_INCREMENT,
	nom							varchar(20)	NOT NULL,
	volonte						int(4)		NOT NULL,
	intelligence 				int(4)		NOT NULL,
	force 						int(4)		NOT NULL,
	agilite 					int(4)		NOT NULL
) ENGINE = InnoDB;

INSERT INTO T_Investigateur (idInvestigateur, nom, volonte, intelligence, force, agilite) VALUES ( 1, 'Roland Banks', 3, 3, 4, 2 );
INSERT INTO T_Investigateur (idInvestigateur, nom, volonte, intelligence, force, agilite) VALUES ( 1, 'Daisy Walker', 3, 5, 2, 2 );

SELECT * FROM T_Investigateur;