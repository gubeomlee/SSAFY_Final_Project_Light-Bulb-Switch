-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema ssafydb
-- -----------------------------------------------------
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`User`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`User` ;

CREATE TABLE IF NOT EXISTS `mydb`.`User` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `userId` VARCHAR(45) NOT NULL,
  `userPw` VARCHAR(45) NOT NULL,
  `userName` VARCHAR(45) NOT NULL,
  `userLocation` VARCHAR(45) NULL,
  `userAge` INT NULL,
  `userGender` VARCHAR(1) NULL,
  `img` VARCHAR(200) NULL,
  `orgImg` VARCHAR(200) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`LikeWorkouts`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`LikeWorkouts` ;

CREATE TABLE IF NOT EXISTS `mydb`.`LikeWorkouts` (
  `id` INT NOT NULL,
  `workout` VARCHAR(45) NOT NULL,
  `UserId` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_LikeWorkout_User1`
    FOREIGN KEY (`UserId`)
    REFERENCES `mydb`.`User` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Groups`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Groups` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Groups` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `groupName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`UserGroups`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`UserGroups` ;

CREATE TABLE IF NOT EXISTS `mydb`.`UserGroups` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `UserId` INT NOT NULL,
  `GroupsId` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_UserGroupList_User1`
    FOREIGN KEY (`UserId`)
    REFERENCES `mydb`.`User` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_UserGroupList_GroupList1`
    FOREIGN KEY (`GroupsId`)
    REFERENCES `mydb`.`Groups` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`MainBoard`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`MainBoard` ;

CREATE TABLE IF NOT EXISTS `mydb`.`MainBoard` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL,
  `content` LONGTEXT NULL,
  `location` VARCHAR(45) NOT NULL,
  `workout` VARCHAR(45) NOT NULL,
  `userId` INT NOT NULL,
  `maxMember` INT NULL,
  `GroupsId` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_group_main_board_user1`
    FOREIGN KEY (`userId`)
    REFERENCES `mydb`.`User` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_MainBoard_Groups1`
    FOREIGN KEY (`GroupsId`)
    REFERENCES `mydb`.`Groups` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Photos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Photos` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Photos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `img` VARCHAR(200) NULL,
  `orgImg` VARCHAR(200) NULL,
  `MainBoardId` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_Photos_MainBoard1`
    FOREIGN KEY (`MainBoardId`)
    REFERENCES `mydb`.`MainBoard` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
