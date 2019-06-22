CREATE DATABASE  IF NOT EXISTS `racxml` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `racxml`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: racxml
-- ------------------------------------------------------
-- Server version	5.7.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `afericaoequipamento`
--

DROP TABLE IF EXISTS `afericaoequipamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `afericaoequipamento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` date DEFAULT NULL,
  `tipo_servico` varchar(100) DEFAULT NULL,
  `municipio` varchar(100) DEFAULT NULL,
  `servico` int(11) DEFAULT NULL,
  `descricao` varchar(200) DEFAULT NULL,
  `cd_funcionario` int(11) DEFAULT NULL,
  `funcionario` varchar(100) DEFAULT NULL,
  `cd_funcionario_aux` int(11) DEFAULT NULL,
  `funcionario_aux` varchar(100) DEFAULT NULL,
  `regional` varchar(50) DEFAULT NULL,
  `divisao` varchar(50) DEFAULT NULL,
  `tp_balanca` varchar(45) DEFAULT NULL,
  `data_rel_diario` date DEFAULT NULL,
  `qtde_efetiva` int(11) DEFAULT NULL,
  `valor_efetivo` double DEFAULT NULL,
  `qtde_aprovada` int(11) DEFAULT NULL,
  `qtde_reprovada` int(11) DEFAULT NULL,
  `valor_total` double DEFAULT NULL,
  `dataRelatorioDiario` varchar(255) DEFAULT NULL,
  `quantEfetiva` int(11) DEFAULT NULL,
  `quantidadeAprovada` int(11) DEFAULT NULL,
  `quantidadeReprovada` int(11) DEFAULT NULL,
  `tipoBalanca` varchar(255) DEFAULT NULL,
  `tipoServico` varchar(255) DEFAULT NULL,
  `valorEfetvo` double DEFAULT NULL,
  `valorTotal` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `afericaoequipamento`
--

LOCK TABLES `afericaoequipamento` WRITE;
/*!40000 ALTER TABLE `afericaoequipamento` DISABLE KEYS */;
INSERT INTO `afericaoequipamento` VALUES (12,'2019-11-27','Periódica','AMERICANA',127,'IPNA-Class.III e IIII c/disp. &gt;5 kg até 50 kg',2745,'SANDRO SOUZA',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(33,'2019-10-29',NULL,'SAO JOAO DA BOA VISTA',NULL,'teste - teste@teste',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(34,'2019-10-01',NULL,'SAO JOAO DA BOA VISTA',NULL,' 01/10/2019',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(35,'2019-10-25',NULL,'SAO JOAO DA BOA VISTA',NULL,' teste dia 25/10/2019',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `afericaoequipamento` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-21 22:16:19
