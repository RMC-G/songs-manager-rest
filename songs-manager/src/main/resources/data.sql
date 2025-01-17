CREATE DATABASE  IF NOT EXISTS songs_manager;
USE songs_manager;

DROP TABLE IF EXISTS song;
CREATE TABLE song (
  id int NOT NULL AUTO_INCREMENT,
  album varchar(255) DEFAULT NULL,
  artist varchar(255) NOT NULL,
  name varchar(255) NOT NULL,
  release_date date DEFAULT NULL,
  PRIMARY KEY (id)
);

INSERT INTO song (album, artist, name, release_date)
VALUES ('Aftermath','The Rolling Stones','Paint It, Black','1966-04-15'),
	('LIVING THINGS','Linkin Park','BURN IT DOWN','2012-06-19'),
	('Meteora','Linkin Park','Numb','2003-09-16'),
	('The Sacrament of Sin','Powerwolf','Incense & Iron','2018-07-20'),
	('The Sacrament of Sin','Powerwolf','Venom of Venus','2018-07-20'),
	('Call of the Wild','Powerwolf','Blood for Blood (Faoladh)','2021-07-16'),
	('Blessed & Possessed','Powerwolf','Armata Strigoi','2015-07-17'),
	('Back in Black','AC/DC','Shoot to Thrill','1980-07-25'),
	('Back in Black','AC/DC','Back in Black','1980-07-25'),
	('The Razors Edge','AC/DC','Thunderstruck','1990-09-24'),
	('City of Evil','Avenged Sevenfold','Blinded in Chains','2005-06-06'),
	('City of Evil','Avenged Sevenfold','M.I.A','2005-06-06'),
	('Nightmare','Avenged Sevenfold','Buried Alive','2010-07-23'),
	('Dr.Feelgood','Mötley Crüe','Kickstart My Heart','1989-09-01'),
	('Bury the Light','Casey Edwards, Victor Borba','Bury the Light','2020-09-21'),
	('Immortalized','Disturbed','The Vengeful One','2015-08-14'),
	('Evolution','Disturbed','A Reason to Fight','2018-10-18'),
	('Greatest Hits','Foo Fighters','Wheels','2009-11-03'),
	('Ori and the Blind Forest (Original Soundtrack)','Gareth coker','Light of Nibel','2015-03-10'),
	('A Night At The Opera','Queen','Bohemian Rhapsody','1975-11-21'),
	('Stadium Arcadium','Red Hot Chili Peppers','Tell Me Baby','2006-05-09'),
	('The Last Stand','Sabaton','Blood of Bannockburn','2016-08-19'),
	('Heroes','Sabaton','Night Witches','2014-05-12'),
	('Let You Down','Dawid Podsiadło','Let You Down','2022-09-12');
