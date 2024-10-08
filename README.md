# Java-Database

# Membuat Java Project :

mvn archetype:generate

maven-archetype-quickstart

# MYSQL KONEKSI PAKE INI :


 <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
 </dependency>


#  DataSource

https://github.com/brettwooldridge/HikariCP

<dependency>
   <groupId>com.zaxxer</groupId>
   <artifactId>HikariCP</artifactId>
   <version>5.1.0</version>
</dependency>

# #############################################

# DataBase nya

CREATE TABLE customers
(
id VARCHAR(100) NOT NULL,
name VARCHAR(255) NOT NULL,
email VARCHAR(255) NOT NULL,
CONSTRAINT email_UNIQUE UNIQUE (email),
PRIMARY KEY (id)
) ENGINE = InnoDB;

###########################################

CREATE TABLE admin
(
username VARCHAR(100) NOT NULL,
password VARCHAR(100) NOT NULL,
PRIMARY KEY (username)
) ENGINE = InnoDB;

#######################################

INSERT INTO admin(username, password) VALUES ('admin','admin');

#################################

INSERT INTO admin(username, password) VALUES ('admin','admin');

###################################

CREATE TABLE comments(
id INT NOT NULL AUTO_INCREMENT,
email VARCHAR(100),
comment TEXT,
PRIMARY KEY (id)
) ENGINE = InnoDB;

###########################################

DESCRIBE comments;
SELECT * FROM comments;


#########################################

TRUNCATE TABLE comments;

INSERT INTO comments (email, comment) VALUES
('eko@test.com', 'hi'),
('eko@test.com', 'hi'),
('eko@test.com', 'hi'),
('eko@test.com', 'hi'),
('eko@test.com', 'hi'),
('eko@test.com', 'hi'),
('eko@test.com', 'hi'),
('eko@test.com', 'hi'),
('eko@test.com', 'hi'),
('eko@test.com', 'hi'),
('eko@test.com', 'hi'),
('eko@test.com', 'Hello, this is a comment.');


#####################################

# Database:

Definisikan struktur database, termasuk tabel-tabel yang dibutuhkan.
Tentukan relasi antar tabel jika ada.

# Entity:

Buat kelas-kelas entitas yang mewakili tabel-tabel di database.
Pastikan kelas entitas mencerminkan struktur tabel dan memiliki atribut yang sesuai.

# Repository Interface:

Buat antarmuka CommentRepository yang mendefinisikan operasi CRUD untuk entitas Comment.
Antarmuka ini akan menjadi kontrak yang harus diimplementasikan oleh kelas repositori konkret.

# Repository Class:

Buat implementasi konkret dari CommentRepository di kelas CommentRepositoryImpl.
Dalam kelas ini, implementasikan logika akses data sesuai dengan antarmuka yang telah didefinisikan.
Gunakan struktur data yang sesuai (misalnya, HashMap) untuk menyimpan data sementara.

# Testing Repository:

Buat unit test untuk memastikan implementasi CommentRepositoryImpl berfungsi dengan benar.
Uji setiap metode CRUD untuk memastikan data disimpan, diambil, diperbarui, dan dihapus dengan benar.
Gunakan framework pengujian unit, seperti JUnit atau TestNG.


=================================================================