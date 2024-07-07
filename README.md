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
