
USE `springbootdb`;
-- MySQL dump 10.13  Distrib 5.7.12, for osx10.9 (x86_64)
--
-- Host: 127.0.0.1    Database: springbootdb
-- ------------------------------------------------------
-- Server version	5.7.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `product2`
--

DROP TABLE IF EXISTS `product2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product2` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `serial_no` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
  `service_provider` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
  `date_purchased` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
  `warranty` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
  `status` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
  `value` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
  `attachment` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
  `funded_by` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
  `purchased_details` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
  `property_details` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
  `area` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
  `facilities` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
 
 
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-11-06 20:27:53
