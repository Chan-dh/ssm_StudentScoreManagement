/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 8.0.18 : Database - finalexam
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`finalexam` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `finalexam`;

/*Table structure for table `stuinfo` */

DROP TABLE IF EXISTS `stuinfo`;

CREATE TABLE `stuinfo` (
  `sno` char(6) NOT NULL,
  `ssex` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `sname` varchar(8) NOT NULL,
  `pwd` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `score` int(11) NOT NULL,
  PRIMARY KEY (`sno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `stuinfo` */

insert  into `stuinfo`(`sno`,`ssex`,`sname`,`pwd`,`score`) values 
('183301','男','小王','1111',98),
('183305','女','小红','1111',100),
('183306','女','小陈','1111',70),
('183311','男','测试3','1111',91);

/*Table structure for table `teainfo` */

DROP TABLE IF EXISTS `teainfo`;

CREATE TABLE `teainfo` (
  `tno` char(6) NOT NULL,
  `tsex` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `tname` varchar(8) NOT NULL,
  `pwd` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`tno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `teainfo` */

insert  into `teainfo`(`tno`,`tsex`,`tname`,`pwd`) values 
('125601','男','王建军','1111'),
('125602','男','马建国','1'),
('125603','女','陈红','1111');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
