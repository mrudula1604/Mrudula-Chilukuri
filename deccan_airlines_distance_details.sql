-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: deccan_airlines
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `distance_details`
--

LOCK TABLES `distance_details` WRITE;
/*!40000 ALTER TABLE `distance_details` DISABLE KEYS */;
INSERT INTO `distance_details` VALUES ('0-100 miles','80$','Business'),('0-100 miles','50$','Economy'),('0-100 miles','75$','First Class'),('100-200 miles','130$','Business'),('100-200 miles','80$','Economy'),('100-200 miles','100$','First Class'),('100-200 miles','150$','Premium Business'),('1000-2000 miles','750$','Business'),('1000-2000 miles','700%','Economy'),('200-300 miles','150$','Economy'),('200-300 miles','220$','Premium Business'),('2000-3500 miles','800$','Economy'),('300-500 miles','250$','Economy'),('500-800 miles','500$','Business'),('800-1000 miles','650$','Business'),('800-1000 miles','550$','Eonomy'),('800-1000 miles','600$','First Class'),('800-1000 miles','750$','Premium Business');
/*!40000 ALTER TABLE `distance_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-29  2:17:43
