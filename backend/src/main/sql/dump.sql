CREATE DATABASE  IF NOT EXISTS `testdb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `testdb`;

CREATE TABLE user (
  id         INT NOT NULL AUTO_INCREMENT,
  email      VARCHAR(255),
  first_name VARCHAR(255),
  last_name  VARCHAR(255),
  PRIMARY KEY (id)
)
  ENGINE = InnoDB;