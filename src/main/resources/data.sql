/* Televisions */
INSERT INTO television_types (company, country, credit, name, online)
VALUES ('Samsung', 'South Korea', true, 'Television', true);

INSERT INTO televisions (color, height, length, name, price, serial_number, stock, width, category, technology, type)
VALUES ('BLACK', 1800, 100, 'Neo QLED 8K Smart TV 2021', 999990, 'QN900A', false, 1200, '8K', 'QLED', 1);

INSERT INTO televisions (color, height, length, name, price, serial_number, stock, width, category, technology, type)
VALUES ('GREY', 1300, 160, 'Neo QLED 8K Smart TV 2021', 379990, 'QN700A', true, 700, '8K', 'QLED', 1);


INSERT INTO television_types (company, country, credit, name, online)
VALUES ('LG', 'South Korea', true, 'Television', false);

INSERT INTO televisions (color, height, length, name, price, serial_number, stock, width, category, technology, type)
VALUES ('BLACK', 1800, 100, 'LG OLED 4K', 229990, 'OLED65B2RLA', false, 1200, '4K', 'OLED', 2);

INSERT INTO televisions (color, height, length, name, price, serial_number, stock, width, category, technology, type)
VALUES ('GREY', 1300, 160, 'LG IPS 2K', 109990, '70UP81006LA', true, 700, '2K', 'IPS', 2);


INSERT INTO television_types (company, country, credit, name, online)
VALUES ('Xiaomi', 'China', false, 'Television', true);

INSERT INTO televisions (color, height, length, name, price, serial_number, stock, width, category, technology, type)
VALUES ('BLACK', 1800, 100, 'Mi TV', 49990, 'P143', true, 1200, 'FULL HD', 'IPS', 3);

INSERT INTO televisions (color, height, length, name, price, serial_number, stock, width, category, technology, type)
VALUES ('GREY', 1300, 160, 'Mi TV', 72990, 'P155', false, 700, 'QUADHD', 'IPS', 3);


/* Vacuum Cleaners */
INSERT INTO vacuum_cleaners_types (company, country, credit, name, online)
VALUES ('LG', 'South Korea', true, 'Vacuum Cleaner', true);

INSERT INTO vacuum_cleaners (color, height, length, name, price, serial_number, stock, width, mods, volume, type)
VALUES ('BLUE', 750, 550, 'LG CordZero A9 Cordless Stick', 40000, 'A913BM', true, 250, 9, 13, 1);

INSERT INTO vacuum_cleaners (color, height, length, name, price, serial_number, stock, width, mods, volume, type)
VALUES ('GREY', 250, 550, 'LG CordZero ThinQ Robotic Vacuum', 120000, 'R975GM1', true, 250, 3, 1, 1);

INSERT INTO vacuum_cleaners (color, height, length, name, price, serial_number, stock, width, mods, volume, type)
VALUES ('WHITE', 750, 550, 'LG CordZero All in One Auto', 90000, 'A939KBGS', true, 250, 9, 13, 1);


INSERT INTO vacuum_cleaners_types (company, country, credit, name, online)
VALUES ('Samsung', 'South Korea', true, 'Vacuum Cleaner', true);

INSERT INTO vacuum_cleaners (color, height, length, name, price, serial_number, stock, width, mods, volume, type)
VALUES ('BLUE', 750, 550, 'Bagged Vacuum Cleaner, 3L', 12000, 'BVC32', true, 250, 2, 3, 2);

INSERT INTO vacuum_cleaners (color, height, length, name, price, serial_number, stock, width, mods, volume, type)
VALUES ('GREY', 250, 550, 'Bagless Vacuum Cleaner, 1L', 3000, 'BVC12', true, 250, 3, 1, 2);

INSERT INTO vacuum_cleaners (color, height, length, name, price, serial_number, stock, width, mods, volume, type)
VALUES ('WHITE', 750, 550, 'Bagged Vacuum Cleaner, 3L', 7000, 'BVC33', true, 250, 3, 3, 2);


INSERT INTO vacuum_cleaners_types (company, country, credit, name, online)
VALUES ('Xiaomi', 'China', true, 'Vacuum Cleaner', true);

INSERT INTO vacuum_cleaners (color, height, length, name, price, serial_number, stock, width, mods, volume, type)
VALUES ('BLUE', 750, 550, 'Vacuum Сleaning Robot', 32000, 'VCR', true, 250, 9, 13, 3);

INSERT INTO vacuum_cleaners (color, height, length, name, price, serial_number, stock, width, mods, volume, type)
VALUES ('GREY', 250, 550, 'Mi Robot Vacuum-Mop 2 Lite', 21000, 'MRVM2', true, 250, 3, 1, 3);

INSERT INTO vacuum_cleaners (color, height, length, name, price, serial_number, stock, width, mods, volume, type)
VALUES ('WHITE', 750, 550, 'Mi Vacuum Cleaner G9', 24000, 'MVCG9', true, 250, 9, 13, 3);


/* Refrigerators */
INSERT INTO refrigerator_types (company, country, credit, name, online)
VALUES ('Samsung', 'South Korea', true, 'Refrigerators', true);

INSERT INTO refrigerators (color, height, length, name, price, serial_number, stock, width, compressor, doors, type)
VALUES ('GREY', 2200, 750, 'Top-Mount Freezer Refrigerator, 453L Net Capacity', 45000, 'TMFR453l', true, 550, 'LINEAR', 2, 1);

INSERT INTO refrigerators (color, height, length, name, price, serial_number, stock, width, compressor, doors, type)
VALUES ('DARK_GREY', 2200, 750, 'Side-by-Side Refrigerator, 806L Net Capacity', 170000, 'SBSR806L', true, 550, 'INVERTED', 4, 1);

INSERT INTO refrigerators (color, height, length, name, price, serial_number, stock, width, compressor, doors, type)
VALUES ('WHITE', 2200, 750, 'Side-by-Side Refrigerator, 501L Net Capacity', 120000, 'SBSR501L', true, 550, 'LINEAR', 4, 1);


INSERT INTO refrigerator_types (company, country, credit, name, online)
VALUES ('LG', 'South Korea', true, 'Refrigerators', true);

INSERT INTO refrigerators (color, height, length, name, price, serial_number, stock, width, compressor, doors, type)
VALUES ('DARK_GREY', 2200, 750, 'LG STUDIO 26 cu. ft. Smart Side-by-Side Built-In Refrigerator', 999000, 'LGS26', true, 550, 'LINEAR', 6, 2);

INSERT INTO refrigerators (color, height, length, name, price, serial_number, stock, width, compressor, doors, type)
VALUES ('DARK_GREY', 2200, 750, '29 cu ft. French Door Refrigerator with Slim Design Water Dispenser', 540000, '29FDR', true, 550, 'INVERTED', 4, 2);

INSERT INTO refrigerators (color, height, length, name, price, serial_number, stock, width, compressor, doors, type)
VALUES ('WHITE', 2200, 750, '24 cu.ft. Top Freezer Refrigerator', 70000, '24TFR', true, 550, 'INVERTED', 4, 2);


INSERT INTO refrigerator_types (company, country, credit, name, online)
VALUES ('Philips', 'Nederland', true, 'Refrigerators', true);

INSERT INTO refrigerators (color, height, length, name, price, serial_number, stock, width, compressor, doors, type)
VALUES ('SILVER', 2200, 750, 'Philips 370 L Frost Free Triple Door Refrigerator', 55000, 'EME3700MG', true, 550, 'LINEAR', 3, 3);

INSERT INTO refrigerators (color, height, length, name, price, serial_number, stock, width, compressor, doors, type)
VALUES ('DARK_GREY', 2200, 750, 'Philips 570 L Frost Free Six Door Refrigerator', 180000, 'EME5700MG', true, 550, 'INVERTED', 6, 3);

INSERT INTO refrigerators (color, height, length, name, price, serial_number, stock, width, compressor, doors, type)
VALUES ('WHITE', 2200, 750, 'Philips 170 L Frost Free One Door Refrigerator' , 32000, 'EME1700MG', true, 550, 'INVERTED', 1, 3);


/* Smart Phones */
INSERT INTO smart_phone_types (company, country, credit, name, online)
VALUES ('Apple', 'USA', true, 'Smart Phone', true);

INSERT INTO smart_phones (color, height, length, name, price, serial_number, stock, width, cameras, storage, type)
VALUES ('GREEN', 120, 170, 'Iphone 13 PRO MAX', 180000, 'IP13PM64', true, 25, 3, 64, 1);

INSERT INTO smart_phones (color, height, length, name, price, serial_number, stock, width, cameras, storage, type)
VALUES ('WHITE', 120, 170, 'Iphone 11 PRO MAX', 98000, 'IP11PM512', true, 25, 2, 512, 1);

INSERT INTO smart_phones (color, height, length, name, price, serial_number, stock, width, cameras, storage, type)
VALUES ('BLUE', 120, 170, 'Iphone 12 PRO MAX', 140000, 'IP12PM1024', true, 25, 3, 1024, 1);


INSERT INTO smart_phone_types (company, country, credit, name, online)
VALUES ('Xiaomi', 'China', true, 'Smart Phone', true);

INSERT INTO smart_phones (color, height, length, name, price, serial_number, stock, width, cameras, storage, type)
VALUES ('GREEN', 120, 170, 'Xiaomi Note 10 Pro', 55000, 'XMN10P', true, 25, 6, 128, 2);

INSERT INTO smart_phones (color, height, length, name, price, serial_number, stock, width, cameras, storage, type)
VALUES ('WHITE', 120, 170, 'Xiaomi Note 7', 98000, 'XN764', true, 25, 1, 64, 2);

INSERT INTO smart_phones (color, height, length, name, price, serial_number, stock, width, cameras, storage, type)
VALUES ('BLUE', 120, 170, 'Xiaomi Mi 11T Pro', 75000, 'XM11TP', true, 25, 10, 1024, 2);


INSERT INTO smart_phone_types (company, country, credit, name, online)
VALUES ('Huawei', 'China', true, 'Smart Phone', true);

INSERT INTO smart_phones (color, height, length, name, price, serial_number, stock, width, cameras, storage, type)
VALUES ('GREEN', 120, 170, 'Huawei 10P', 24000, 'H10P', true, 25, 3, 64, 3);

INSERT INTO smart_phones (color, height, length, name, price, serial_number, stock, width, cameras, storage, type)
VALUES ('WHITE', 120, 170, 'Huawei P90 PRO', 98000, 'HP90P', true, 25, 9, 512, 3);

INSERT INTO smart_phones (color, height, length, name, price, serial_number, stock, width, cameras, storage, type)
VALUES ('BLUE', 120, 170, 'Huawei Cheap Phone PRO', 5000, 'HCPP', true, 25, 1, 16, 3);


/* Personal Computers */
INSERT INTO personal_computers_types (company, country, credit, name, online)
VALUES ('DEXP', 'Russia', true, 'Computer', true);

INSERT INTO personal_computers (color, height, length, name, price, serial_number, stock, width, category, processor, type)
VALUES ('SPACE_GREY', 550, 550, 'DEXP PRO GAMING PC 3000', 17000, 'DPGPC3000', true, 150, 'GAMING', 'AMD', 1);

INSERT INTO personal_computers (color, height, length, name, price, serial_number, stock, width, category, processor, type)
VALUES ('BLACK', 550, 550, 'DEXP OFFICE PC 1000', 3000, 'DPGPC1000', true, 150, 'OFFICE', 'INTEL', 1);

INSERT INTO personal_computers (color, height, length, name, price, serial_number, stock, width, category, processor, type)
VALUES ('GREY', 550, 550, 'DEXP PRO OFFICE PC 2000', 7000, 'DPGPC2000', true, 150, 'OFFICE', 'INTEL', 1);


INSERT INTO personal_computers_types (company, country, credit, name, online)
VALUES ('AlienWare', 'USA', true, 'Computer', true);

INSERT INTO personal_computers (color, height, length, name, price, serial_number, stock, width, category, processor, type)
VALUES ('BLACK', 1050, 350, 'AW PRO UFO PC', 350000, 'AWPUFPC', true, 150, 'GAMING', 'AMD', 2);

INSERT INTO personal_computers (color, height, length, name, price, serial_number, stock, width, category, processor, type)
VALUES ('WHITE', 750, 650, 'AW RTX3090Ti', 1900000, 'AW3090', true, 150, 'GAMING', 'INTEL', 2);

INSERT INTO personal_computers (color, height, length, name, price, serial_number, stock, width, category, processor, type)
VALUES ('WHITE', 550, 550, 'AW STARTER PACK', 120000, 'AWSTP', true, 150, 'GAMING', 'INTEL', 2);


INSERT INTO personal_computers_types (company, country, credit, name, online)
VALUES ('HP', 'USA', true, 'Computer', true);

INSERT INTO personal_computers (color, height, length, name, price, serial_number, stock, width, category, processor, type)
VALUES ('BLACK', 550, 550, 'OFFICE PRO HP PC', 75000, 'DPGPC3000', true, 150, 'OFFICE', 'AMD', 3);

INSERT INTO personal_computers (color, height, length, name, price, serial_number, stock, width, category, processor, type)
VALUES ('GREY', 550, 550, 'Gaming Notebook Pro 16GB', 45000, 'GNTP16GB', true, 150, 'GAMING', 'INTEL', 3);

INSERT INTO personal_computers (color, height, length, name, price, serial_number, stock, width, category, processor, type)
VALUES ('SILVER', 550, 550, 'Server 1000TB 512 GB RAM', 90000, 'HPS1000TB512GB', true, 150, 'SERVER', 'AMD', 3);