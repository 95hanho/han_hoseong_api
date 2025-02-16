-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: han_hoseong
-- ------------------------------------------------------
-- Server version	8.0.37

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
-- Table structure for table `hhs_background`
--

DROP TABLE IF EXISTS `hhs_background`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hhs_background` (
  `background_id` int NOT NULL,
  `color` varchar(45) DEFAULT NULL,
  `size` varchar(45) DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL,
  `repeat` varchar(45) DEFAULT NULL,
  `image` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`background_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hhs_background`
--

LOCK TABLES `hhs_background` WRITE;
/*!40000 ALTER TABLE `hhs_background` DISABLE KEYS */;
INSERT INTO `hhs_background` VALUES (1,'#aaa','cover','center','no-repeat','/src/assets/img/bg/window_xp.jpg');
/*!40000 ALTER TABLE `hhs_background` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hhs_icon`
--

DROP TABLE IF EXISTS `hhs_icon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hhs_icon` (
  `icon_id` int NOT NULL AUTO_INCREMENT,
  `row` int DEFAULT NULL,
  `col` int DEFAULT NULL,
  `folder` tinyint(1) DEFAULT NULL,
  `folder_name` varchar(100) DEFAULT NULL,
  `folder_icon_id` int DEFAULT NULL,
  `folder_child_order` int DEFAULT NULL,
  `menu_id` int DEFAULT NULL,
  PRIMARY KEY (`icon_id`),
  KEY `icon_menu_idx` (`menu_id`),
  KEY `icon_menu_foreign_idx` (`menu_id`),
  KEY `icon_children_icon_idx` (`folder_icon_id`),
  CONSTRAINT `icon_menu_foreign` FOREIGN KEY (`menu_id`) REFERENCES `hhs_menu` (`menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hhs_icon`
--

LOCK TABLES `hhs_icon` WRITE;
/*!40000 ALTER TABLE `hhs_icon` DISABLE KEYS */;
INSERT INTO `hhs_icon` VALUES (35,1,1,NULL,NULL,0,0,26),(36,1,2,NULL,NULL,0,0,27),(37,1,3,NULL,NULL,0,0,28),(38,1,4,NULL,NULL,0,0,29);
/*!40000 ALTER TABLE `hhs_icon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hhs_menu`
--

DROP TABLE IF EXISTS `hhs_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hhs_menu` (
  `menu_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `url` varchar(200) DEFAULT NULL,
  `icon` varchar(45) DEFAULT NULL,
  `color` varchar(45) DEFAULT NULL,
  `custom_color` varchar(45) DEFAULT NULL,
  `parent_menu_id` int DEFAULT NULL,
  `quick_id` int DEFAULT NULL,
  `quick_menu_order` int DEFAULT NULL,
  PRIMARY KEY (`menu_id`),
  KEY `parent_menu_menu_idx` (`parent_menu_id`),
  CONSTRAINT `parent_menu_menu` FOREIGN KEY (`parent_menu_id`) REFERENCES `hhs_parent_menu` (`parent_menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hhs_menu`
--

LOCK TABLES `hhs_menu` WRITE;
/*!40000 ALTER TABLE `hhs_menu` DISABLE KEYS */;
INSERT INTO `hhs_menu` VALUES (1,'요약정리 웹','https://95hanho.github.io/#','bi-person-bounding-box','undefined',NULL,1,1,1),(2,'git-KH교육 버킷리스트','https://github.com/95hanho/FINAL_PROJECT_BUCKETSTORY','bi-github','undefined',NULL,4,NULL,NULL),(3,'git-개인/단체톡','https://github.com/95hanho/BootChatting','bi-github',NULL,NULL,4,NULL,NULL),(4,'git-세종 ELK로그분석 조회','https://github.com/95hanho/LogSearch','bi-github',NULL,NULL,4,NULL,NULL),(5,'git-세종 가상번호 조회','https://github.com/95hanho/VirtualNum','bi-github',NULL,NULL,4,NULL,NULL),(6,'git-세종 통화기록 조회','https://github.com/95hanho/Phone-Log','bi-github',NULL,NULL,4,NULL,NULL),(7,'git-자기소개 웹','https://github.com/95hanho/95hanho.github.io','bi-github',NULL,NULL,4,NULL,NULL),(8,'git-nextjs 코딩애플 강의자료','https://github.com/95hanho/nextjs_pratice','bi-github',NULL,NULL,4,NULL,NULL),(9,'git-nextjs 기본세팅','https://github.com/95hanho/nextjs_default','bi-github',NULL,NULL,4,NULL,NULL),(10,'git-FE교육 마켓컬리','https://github.com/95hanho/kurly_php','bi-github',NULL,NULL,4,NULL,NULL),(11,'git-리액트 기본세팅','https://github.com/95hanho/react_default','bi-github',NULL,NULL,4,NULL,NULL),(12,'git-엑스퍼트 홈 모바일','https://github.com/95hanho/exc_mobile','bi-github',NULL,NULL,4,NULL,NULL),(13,'git-vite svelte 기본 세팅','https://github.com/95hanho/svelte-vite-default','bi-github',NULL,NULL,4,NULL,NULL),(14,'git-spring 기본 api','https://github.com/95hanho/api_spring_default','bi-github',NULL,NULL,4,NULL,NULL),(15,'git-엑스퍼트 컨퍼런스 api','https://github.com/95hanho/exc_conference_api','bi-github',NULL,NULL,4,3,1),(16,'git-엑스퍼트 컨퍼런스','https://github.com/95hanho/exc_conference','bi-github',NULL,NULL,4,3,2),(17,'git-엑스퍼트 HR설문조사 api','https://github.com/95hanho/exc_hrSurvey_api','bi-github',NULL,NULL,4,3,3),(18,'git-엑스퍼트 HR설문조사','https://github.com/95hanho/exc_hrSurvey','bi-github',NULL,NULL,4,3,4),(19,'git-엑스퍼트 HR교육용 api','https://github.com/95hanho/exc_travelnote_api','bi-github',NULL,NULL,4,3,5),(20,'git-엑스퍼트 HR교육용','https://github.com/95hanho/exc_travelnote','bi-github',NULL,NULL,4,3,6),(21,'git-엑스퍼트 수강신청 api','https://github.com/95hanho/exc_ds_api','bi-github',NULL,NULL,4,3,7),(22,'git-엑스퍼트 수강신청','https://github.com/95hanho/exc_ds','bi-github',NULL,NULL,4,3,8),(23,'git-포트폴리오 종합웹','https://github.com/95hanho/han_hoseong','bi-github',NULL,NULL,4,3,9),(26,'엑스퍼트 컨퍼런스','https://95hanho.pe.kr/conference/','bi-window',NULL,NULL,2,1,5),(27,'엑스퍼트 수강신청','https://95hanho.pe.kr/ds/','bi-window',NULL,NULL,2,1,2),(28,'엑스퍼트 HR설문조사','https://95hanho.pe.kr/hr_survey/','bi-window',NULL,NULL,2,1,3),(29,'엑스퍼트 HR교육용','https://95hanho.pe.kr/travelnote/','bi-window',NULL,NULL,2,1,4),(30,'노션-버킷리스트','https://buttery-smartphone-b3f.notion.site/17a8d146b95281d581f2cf28e923d7fa','bi-file-text','undefined',NULL,3,NULL,NULL),(31,'노션-개인/단체톡','https://buttery-smartphone-b3f.notion.site/17a8d146b952810a97efea563f70f9f2','bi-file-text',NULL,NULL,3,NULL,NULL),(32,'노션-Vue/nodejs sprintboot example','https://buttery-smartphone-b3f.notion.site/Vue-nodejs-sprintboot-example-17a8d146b952812d95d6ffdf05b0d7ef','bi-file-text',NULL,NULL,3,NULL,NULL),(33,'노션-ELK로그분석 조회웹','https://buttery-smartphone-b3f.notion.site/ELK-17a8d146b95281abbef9f69e93ad5164','bi-file-text',NULL,NULL,3,NULL,NULL),(34,'노션-가상번호 조회 웹','https://buttery-smartphone-b3f.notion.site/17a8d146b95280c3b3a1f5d185cca34c','bi-file-text',NULL,NULL,3,NULL,NULL),(35,'노션-통화기록 조회 웹','https://buttery-smartphone-b3f.notion.site/17a8d146b95280b48c86fa73fe6feef0','bi-file-text',NULL,NULL,3,NULL,NULL),(36,'노션-리액트 실습','https://buttery-smartphone-b3f.notion.site/17a8d146b952806180bbe088cca1a9d9','bi-file-text',NULL,NULL,3,NULL,NULL),(37,'노션-FE교육 마켓컬리 - 메가스터디IT아카데미','https://buttery-smartphone-b3f.notion.site/FE-IT-17a8d146b952805a9ed8ded82bdc61f3','bi-file-text',NULL,NULL,3,NULL,NULL),(38,'노션-포트폴리오 github.io','https://buttery-smartphone-b3f.notion.site/github-io-17a8d146b95280ada9eeee74752b38c2','bi-file-text',NULL,NULL,3,NULL,NULL),(39,'노션-엑스퍼트 모바일','https://buttery-smartphone-b3f.notion.site/17a8d146b952801e9385d31ded5ccacb','bi-file-text',NULL,NULL,3,2,1),(40,'노션-트레블 노트(HR 교육활용)','https://buttery-smartphone-b3f.notion.site/HR-17a8d146b95280d78cadede8c660a4e6','bi-file-text',NULL,NULL,3,2,2),(41,'노션-HR 수강신청','https://buttery-smartphone-b3f.notion.site/HR-17a8d146b95280fab945c69273eed267','bi-file-text',NULL,NULL,3,2,3),(42,'노션-HR 설문조사','https://buttery-smartphone-b3f.notion.site/HR-17a8d146b95280a88868c7b359d6da09','bi-file-text',NULL,NULL,3,2,4),(43,'노션-HR 컨퍼런스 신청','https://buttery-smartphone-b3f.notion.site/HR-17a8d146b952807092c7ea75927a8d82','bi-file-text',NULL,NULL,3,2,5),(44,'노션-윈도우 포트폴리오','https://buttery-smartphone-b3f.notion.site/17a8d146b9528049ae01ccd1d908ec60','bi-file-text',NULL,NULL,3,2,6);
/*!40000 ALTER TABLE `hhs_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hhs_parent_menu`
--

DROP TABLE IF EXISTS `hhs_parent_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hhs_parent_menu` (
  `parent_menu_id` int NOT NULL AUTO_INCREMENT,
  `parent_name` varchar(45) DEFAULT NULL,
  `frame_on` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`parent_menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hhs_parent_menu`
--

LOCK TABLES `hhs_parent_menu` WRITE;
/*!40000 ALTER TABLE `hhs_parent_menu` DISABLE KEYS */;
INSERT INTO `hhs_parent_menu` VALUES (1,'자기소개서',1),(2,'호스팅 사이트',1),(3,'포트폴리오(노션)',0),(4,'GITHUB',0),(5,'기타',0);
/*!40000 ALTER TABLE `hhs_parent_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hhs_quick`
--

DROP TABLE IF EXISTS `hhs_quick`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hhs_quick` (
  `quick_id` int NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`quick_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hhs_quick`
--

LOCK TABLES `hhs_quick` WRITE;
/*!40000 ALTER TABLE `hhs_quick` DISABLE KEYS */;
INSERT INTO `hhs_quick` VALUES (1,'매인 포트폴리오 사이트'),(2,'엑스퍼트 - 노션'),(3,'엑스퍼트 - 깃');
/*!40000 ALTER TABLE `hhs_quick` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-16 22:43:03
