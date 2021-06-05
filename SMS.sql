/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 8.0.21 : Database - projectmanage
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`projectmanage` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `projectmanage`;

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `course_no` int NOT NULL AUTO_INCREMENT,
  `time` int DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`course_no`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `course` */

insert  into `course`(`course_no`,`time`,`name`) values 
(1,2,'软件工程导论'),
(2,2,'操作系统'),
(3,2,'计算机组成原理'),
(4,2,'编译原理'),
(5,2,'数据结构'),
(6,2,'计算机网络');

/*Table structure for table `grade` */

DROP TABLE IF EXISTS `grade`;

CREATE TABLE `grade` (
  `grade_id` int NOT NULL,
  `s_id` int NOT NULL,
  `course_name` varchar(100) DEFAULT NULL,
  `final_grade` double DEFAULT NULL,
  `course_code` int NOT NULL,
  PRIMARY KEY (`grade_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `grade` */

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `s_id` int NOT NULL AUTO_INCREMENT COMMENT '学号',
  `name` varchar(20) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `password` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `student` */

insert  into `student`(`s_id`,`name`,`age`,`sex`,`password`) values 
(1,'仗义',18,'男','password0'),
(2,'张二',18,'男','password1'),
(3,'张三',18,'男','password2'),
(4,'张四',18,'男','password3'),
(5,'张武',18,'男','password4'),
(6,'张柳',18,'男','password5'),
(7,'账期',18,'男','password6'),
(8,'丈八',18,'男','password7'),
(9,'张久',18,'男','password8'),
(10,'张氏',18,'男','password9');

/*Table structure for table `teach_course` */

DROP TABLE IF EXISTS `teach_course`;

CREATE TABLE `teach_course` (
  `tc_id` int NOT NULL,
  `t_id` int NOT NULL,
  `course_no` int NOT NULL,
  `course_name` varchar(100) DEFAULT NULL,
  `course_code` varchar(100) NOT NULL,
  PRIMARY KEY (`tc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `teach_course` */

insert  into `teach_course`(`tc_id`,`t_id`,`course_no`,`course_name`,`course_code`) values 
(1,1,1,'软件工程导论','11'),
(2,1,2,'操作系统','12'),
(3,2,2,'操作系统','22'),
(4,2,3,'计算机组成原理','23');

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `t_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `title` varchar(20) DEFAULT NULL,
  `password` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `teacher` */

insert  into `teacher`(`t_id`,`name`,`sex`,`title`,`password`) values 
(1,'昭仪','女','教授','pwd0'),
(2,'赵二','女','教授','pwd1'),
(3,'赵珊','女','教授','pwd2'),
(4,'赵四','女','教授','pwd3'),
(5,'赵武','女','教授','pwd4'),
(6,'赵六','女','教授','pwd5');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
