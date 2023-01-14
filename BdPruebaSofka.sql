-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: naves
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `carga`
--

DROP TABLE IF EXISTS `carga`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carga` (
  `idnCarga` int NOT NULL AUTO_INCREMENT,
  `nombreCarga` varchar(45) NOT NULL,
  `fechainiCarga` varchar(45) NOT NULL,
  `fechafinCarga` varchar(45) NOT NULL,
  `combustibleCarga` varchar(45) NOT NULL,
  `estadoCarga` varchar(45) NOT NULL,
  `tipoCarga` varchar(45) NOT NULL,
  `paisCarga` varchar(45) NOT NULL,
  PRIMARY KEY (`idnCarga`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carga`
--

LOCK TABLES `carga` WRITE;
/*!40000 ALTER TABLE `carga` DISABLE KEYS */;
INSERT INTO `carga` VALUES (2,'Sputnik','1957','1958','Solido','0','Naves no tripulada','Rusia'),(3,'Soho','1995','Act','Solido','1','Naves no tripulada','USA'),(4,'Helios l, ll','2009','Act','Solido','1','Naves no tripulada','USA'),(5,'ATV****','2008','Act','Solido','1','Naves no tripulada','Europa'),(6,'Apolo','1966','1975','Solido','0','Nave tripulada','USA'),(7,'Modulo lunas','1968','1972','Solido','1','Nave tripulada','USA'),(8,'EEI','1998','Act','Liquido','1','Nave tripulada','Internacional'),(9,'Shenzou','1999','Act','Solido','1','Nave tripulada','China');
/*!40000 ALTER TABLE `carga` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lanzaderas`
--

DROP TABLE IF EXISTS `lanzaderas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lanzaderas` (
  `idLan` int NOT NULL AUTO_INCREMENT,
  `nombreLan` varchar(45) NOT NULL,
  `fechainiLan` varchar(45) NOT NULL,
  `fechafinLan` varchar(45) NOT NULL,
  `combustibleLan` varchar(45) NOT NULL,
  `idCarga` varchar(45) NOT NULL,
  `paisLan` varchar(45) NOT NULL,
  PRIMARY KEY (`idLan`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lanzaderas`
--

LOCK TABLES `lanzaderas` WRITE;
/*!40000 ALTER TABLE `lanzaderas` DISABLE KEYS */;
INSERT INTO `lanzaderas` VALUES (1,'Saturno V','1967','1973','Solido','4','USA'),(2,'Ariane V','1996','Act','Solido','8','Argentina'),(3,'H-llA','2001','Act','Solido','3','Japon'),(4,'EEEE','1789','2002','Solido','9','Colombia'),(5,'G','1789','1900','Solido','5','Colombia'),(6,'Ggg','1789','1900','Solido','7','Colombia');
/*!40000 ALTER TABLE `lanzaderas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-14 10:19:09
