USE mechanic;
CREATE TABLE news (id INT AUTO_INCREMENT NOT NULL, date DATE NOT NULL, name VARCHAR(50) NOT NULL, description VARCHAR(5000), photo VARCHAR(100), photo_alt VARCHAR(200), PRIMARY KEY(id));
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
CREATE TABLE car (id INT AUTO_INCREMENT NOT NULL, name VARCHAR(200) NOT NULL, price FLOAT NOT NULL , millage INT NOT NULL, yearbook VARCHAR(4) NOT NULL, color VARCHAR(50) NOT NULL, VIN VARCHAR(17) NOT NULL, gearbox_id INT NOT NULL, engine_id INT NOT NULL, model_id INT NOT NULL, photo VARCHAR(200), photo_alt VARCHAR(200), description VARCHAR(5000), PRIMARY KEY (id));
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

INSERT INTO car (id, name, price, millage, yearbook, color, VIN, engine_id, model_id, gearbox_id, photo, photo_alt, description) VALUES (1, 'Mercedes-Benz GLE 450 AMG 4Matic 9G-TRONIC AMG Line', 195000, 74000, '2016', 'biały', 'WDDSJ4GBXJN610261', 1, 1, 2, 'mercedes.jpg', 'Zdjecie baiłego, dużego samochdou stojącego na kostce brukowej, na tle drzew', 'Samochód nowy posiada ');
INSERT INTO car (id, name, price, millage, yearbook, color, VIN, engine_id, model_id, gearbox_id, photo, photo_alt, description) VALUES (2, 'Audi A3 8P Polift', 45000, 210000, '2009', 'meteorytowy szary', 'WAUZZZ8KXCA083603', 3, 2, 1, 'audi1.jpg', 'Zdjecie szarego samochodu stojącego na śniegu, w tle domy', 'Sprowadzone auto z Niemiec,  wymienione zostały ');
INSERT INTO car (id, name, price, millage, yearbook, color, VIN, engine_id, model_id, gearbox_id, photo, photo_alt, description) VALUES (3, 'Audi Q5 Napęd quatro', 100500, 134000, '2015', 'czarny metalik', 'WAUZZZ9YXCA043789', 2, 3, 2, 'audi2.jpg', 'Zdjęcie czarnego dużego samochodu na kostce brukowej','Nowczosne auto z napędem 4x4 ');
INSERT INTO car (id, name, price, millage, yearbook, color, VIN, engine_id, model_id, gearbox_id, photo, photo_alt, description) VALUES (4, 'Opel Corsa - Po generalnym remoncie', 10000, 400000, '2006', 'srebrny', 'W0LPE9EC7H1048588', 3, 4, 1, 'opel1.jpg', 'Zdjęcie małego srebrnego samochodu na kostce brukowej', 'Auto przeszło generalny remont w tym ');
INSERT INTO car (id, name, price, millage, yearbook, color, VIN, engine_id, model_id, gearbox_id, photo, photo_alt, description) VALUES (5, 'Opel Astra - Bogata Wersja', 30000, 190000, '2012', 'czarna perła', 'W0L0SDL08E6123893', 2, 5, 1, 'opel2.jpg', 'Zdjęcie ciemnego samochodu na tle drzew i domu', 'Najbogatsza wersja dostępna na rynku, posiada ');

INSERT INTO news (id, date, name, description, photo, photo_alt) VALUES (1, '2024-03-09', 'Wiosna nadchodzi!', 'Zmien opony na letnie i skorzystaj z naszej oferty magazynowania opon!','oponyLetnie.jpg', 'Zdjecie opon na asfacie');
INSERT INTO news (id, date, name, description, photo, photo_alt) VALUES (2, '2023-10-19', 'Nie daj zimie się zaskoczyć!', 'Zima tuż tuż! Zmień opony na zimowe już teraz i zgarnij rabatę na czyszczenie auta!','oponyZimowe.jpg', 'Zdjęcie opon w śniegu');
INSERT INTO news (id, date, name, description, photo, photo_alt) VALUES (3, '2023-12-06', 'Mikołajkowy przegląd auta!', 'Ho ho ho! Podaruj sobie i bliskim bezpieczną jazdę! Teraz pełny przegląd auta i rabaty na ewnetualne naprawy!','mechnik.jpg', 'Zdjęcie mechanika oglądającego samochód pod maską');

INSERT INTO offer_cat(id, name) VALUES (1, 'Mechanika');
INSERT INTO offer_cat(id, name) VALUES (2, 'Elektryka');
INSERT INTO offer_cat(id, name) VALUES (3, 'Wulkanizacja');
INSERT INTO offer_cat(id, name) VALUES (4, 'Dodatkowe');

INSERT INTO offer (id, cat_id, name, price, update_date) VALUES (1, 1, 'Wymiana klocków hamulcowych - przód', 200, '2023-03-09');
INSERT INTO offer (id, cat_id, name, price, update_date) VALUES (2, 1, 'Wymiana klocków hamulcowych - tył', 200, '2023-03-09');
INSERT INTO offer (id, cat_id, name, price, update_date) VALUES (3, 1, 'Wymiana tarcz hamulcowych - przód', 400, '2023-09-09');
INSERT INTO offer (id, cat_id, name, price, update_date) VALUES (4, 1, 'Wymiana tarcz hamulcowych - przód', 500, '2023-10-09');
INSERT INTO offer (id, cat_id, name, price, update_date) VALUES (5, 1, 'Wymiana filtrów - przód', 300, '2024-02-09');
INSERT INTO offer (id, cat_id, name, price, update_date) VALUES (6, 1, 'Wymiana rozrządu - przód', 600, '2024-03-09');
INSERT INTO offer (id, cat_id, name, price, update_date) VALUES (7, 2, 'Sprawdzenie komputerem', 100, '2024-03-09');
INSERT INTO offer (id, cat_id, name, price, update_date) VALUES (8, 2, 'Wyczyszczenie błedów komputera pokładowego', 100, '2024-01-09');
INSERT INTO offer (id, cat_id, name, price, update_date) VALUES (9, 2, 'Wymiana oświeltenia LED', 100, '2024-03-09');
INSERT INTO offer (id, cat_id, name, price, update_date) VALUES (10, 2, 'Wymiana i kalibracja czujników parkowania', 500, '2024-03-09');
INSERT INTO offer (id, cat_id, name, price, update_date) VALUES (11, 3, 'Wymiana opon do 19 cali z wyważeniem', 150, '2024-03-09');
INSERT INTO offer (id, cat_id, name, price, update_date) VALUES (12, 3, 'Wymiana opon powyżej 19 cali z wyważeniem', 200, '2024-03-17');
INSERT INTO offer (id, cat_id, name, price, update_date) VALUES (13, 3, 'Naprawa opony', 40, '2024-03-09');
INSERT INTO offer (id, cat_id, name, price, update_date) VALUES (14, 4, 'Magazyn opon - 2 sezony', 150, '2024-03-09');
INSERT INTO offer (id, cat_id, name, price, update_date) VALUES (15, 4, 'Oklejenie auta', 1500, '2023-07-07');
INSERT INTO offer (id, cat_id, name, price, update_date) VALUES (16, 4, 'Polerowanie auta', 700, '2023-07-07');
