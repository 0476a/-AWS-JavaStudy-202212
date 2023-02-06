CREATE SCHEMA `delivery_db` DEFAULT CHARACTER SET utf8mb4 ;

CREATE TABLE `delivery_db`.`delivery_mst` (
  `delivery_id` INT NOT NULL AUTO_INCREMENT,
  `delivery_company` VARCHAR(20) NOT NULL,
  `delivery_man` VARCHAR(15) NOT NULL,
  `delivery_address` VARCHAR(100) NOT NULL,
  `consignee_name` VARCHAR(15) NOT NULL,
  `consignee_phone` VARCHAR(14) NOT NULL,
  `consignee_message` TEXT(45) NULL,
  PRIMARY KEY (`delivery_id`));

