USE mechanic;
CREATE TABLE news (id INT AUTO_INCREMENT NOT NULL, date DATE NOT NULL, name VARCHAR(50) NOT NULL, description VARCHAR(5000), photo VARCHAR(100), PRIMARY KEY(id));
CREATE TABLE offer_cat (id INT AUTO_INCREMENT NOT NULL, name VARCHAR(50) NOT NULL , PRIMARY KEY(id));
CREATE TABLE offer (id INT AUTO_INCREMENT NOT NULL, cat_id INT NOT NULL, name VARCHAR(50) NOT NULL , price FLOAT NOT NULL , update_date DATE NOT NULL, PRIMARY KEY (id));
ALTER TABLE offer ADD CONSTRAINT FK_offercatid FOREIGN KEY (cat_id) REFERENCES offer_cat(id);
CREATE TABLE engine (id INT AUTO_INCREMENT NOT NULL, name VARCHAR(50) NOT NULL, capacity VARCHAR(50) NOT NULL, power INT NOT NULL, fuel VARCHAR(50) NOT NULL, PRIMARY KEY (id));
CREATE TABLE gearbox (id INT AUTO_INCREMENT NOT NULL, name VARCHAR(50) NOT NULL , PRIMARY KEY (id));
CREATE TABLE brand (id INT AUTO_INCREMENT NOT NULL, name VARCHAR(50) NOT NULL , PRIMARY KEY (id));
CREATE TABLE body (id INT AUTO_INCREMENT NOT NULL, name VARCHAR(50) NOT NULL, PRIMARY KEY (id));
CREATE TABLE model (id INT AUTO_INCREMENT NOT NULL, name VARCHAR(50) NOT NULL , body_id INT NOT NULL, brand_id INT NOT NULL, PRIMARY KEY (id));
ALTER TABLE model ADD CONSTRAINT FK_bodyid FOREIGN KEY (body_id) REFERENCES body(id);
ALTER TABLE model ADD CONSTRAINT FK_brandid FOREIGN KEY (brand_id) REFERENCES brand(id);
CREATE TABLE car (id INT AUTO_INCREMENT NOT NULL, name VARCHAR(200) NOT NULL, price FLOAT NOT NULL , millage INT NOT NULL, yearbook VARCHAR(4) NOT NULL, color VARCHAR(50) NOT NULL, VIN VARCHAR(17) NOT NULL, gearbox_id INT NOT NULL, engine_id INT NOT NULL, model_id INT NOT NULL, photo VARCHAR(200), description VARCHAR(5000), PRIMARY KEY (id));
ALTER TABLE car ADD CONSTRAINT FK_gearboxid FOREIGN KEY (gearbox_id) REFERENCES gearbox(id);
ALTER TABLE car ADD CONSTRAINT FK_engineid FOREIGN KEY (engine_id) REFERENCES engine(id);
ALTER TABLE car ADD CONSTRAINT FK_modelid FOREIGN KEY (model_id) REFERENCES model(id);

INSERT INTO brand (id, name) VALUES (1, 'Audi');
INSERT INTO brand (id, name) VALUES (2, 'Opel');
INSERT INTO brand (id, name) VALUES (3, 'Mercedes');

INSERT INTO body (id, name) VALUES (1, 'Hatchback');
INSERT INTO body (id, name) VALUES (2, 'Sedan');
INSERT INTO body (id, name) VALUES (3, 'SUV');

INSERT INTO gearbox (id, name) VALUES (1, 'Manualna');
INSERT INTO gearbox (id, name) VALUES (2, 'Automatyczna');

INSERT INTO model(id, name, body_id, brand_id) VALUES (1, 'GLE', 3, 3);
INSERT INTO model(id, name, body_id, brand_id) VALUES (2, 'A3', 2, 1);
INSERT INTO model(id, name, body_id, brand_id) VALUES (3, 'Q5', 3, 1);
INSERT INTO model(id, name, body_id, brand_id) VALUES (4, 'Corsa', 1, 2);
INSERT INTO model(id, name, body_id, brand_id) VALUES (5, 'Astra', 2, 2);

INSERT INTO engine (id, name, capacity, power, fuel) VALUES (1, 'AMG', '2996 cm3', 367, 'Benzyna');
INSERT INTO engine (id, name, capacity, power, fuel) VALUES (2, 'TDI', '1896 cm3', 105, 'Diesel');
INSERT INTO engine (id, name, capacity, power, fuel) VALUES (3, 'TDI', '1200 cm3', 85, 'Benzyna');

INSERT INTO car (id, name, price, millage, yearbook, color, VIN, engine_id, model_id, gearbox_id, photo, description) VALUES (1, 'Mercedes-Benz GLE 450 AMG 4Matic 9G-TRONIC AMG Line', 195000, 74000, '2016', 'biały', 'WDDSJ4GBXJN610261', 1, 1, 2, 'mercedes.jpg', 'Samochód nowy posiada ');
INSERT INTO car (id, name, price, millage, yearbook, color, VIN, engine_id, model_id, gearbox_id, photo, description) VALUES (2, 'Audi A3 8P Polift', 45000, 210000, '2009', 'meteorytowy szary', 'WAUZZZ8KXCA083603', 3, 2, 1, 'audi1.jpg', 'Sprowadzone auto z Niemiec, wymienione zostały ');
INSERT INTO car (id, name, price, millage, yearbook, color, VIN, engine_id, model_id, gearbox_id, photo, description) VALUES (3, 'Audi Q5 Napęd quatro', 100500, 134000, '2015', 'czarny metalik', 'WAUZZZ9YXCA043789', 2, 3, 2, 'audi2.jpg', 'Nowczosne auto z napędem 4x4 ');
INSERT INTO car (id, name, price, millage, yearbook, color, VIN, engine_id, model_id, gearbox_id, photo, description) VALUES (4, 'Opel Corsa - Po generalnym remoncie', 10000, 400000, '2006', 'srebrny', 'W0LPE9EC7H1048588', 3, 4, 1, 'opel1.jpg', 'Auto przeszło generalny remont w tym ');
INSERT INTO car (id, name, price, millage, yearbook, color, VIN, engine_id, model_id, gearbox_id, photo, description) VALUES (5, 'Opel Astra - Bogata Wersja', 30000, 190000, '2012', 'czarna perła', 'W0L0SDL08E6123893', 2, 5, 1, 'opel2.jpg', 'Najbogatsza wersja dostępna na rynku, posiada ');
