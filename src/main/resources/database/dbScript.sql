--
-- Table structure for table `driver_login`
--

DROP TABLE IF EXISTS `driver_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driver_login` (
                                `driver_id` varchar(255) NOT NULL,
                                `driver_user_name` varchar(255) DEFAULT NULL,
                                `password` varchar(255) DEFAULT NULL,
                                PRIMARY KEY (`driver_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driver_login`
--

LOCK TABLES `driver_login` WRITE;
/*!40000 ALTER TABLE `driver_login` DISABLE KEYS */;
INSERT INTO `driver_login` VALUES ('973420529v','Kamal','1234'),('977420539v','Namal','1234');
/*!40000 ALTER TABLE `driver_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news_paper`
--

DROP TABLE IF EXISTS `news_paper`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `news_paper` (
                              `news_paper_id` int(11) NOT NULL AUTO_INCREMENT,
                              `description` varchar(255) DEFAULT NULL,
                              `sub_type_id` int(11) DEFAULT NULL,
                              PRIMARY KEY (`news_paper_id`),
                              KEY `FKe7yg648abceowl2099x8jawf9` (`sub_type_id`),
                              CONSTRAINT `FKe7yg648abceowl2099x8jawf9` FOREIGN KEY (`sub_type_id`) REFERENCES `subscription_type` (`sub_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news_paper`
--

LOCK TABLES `news_paper` WRITE;
/*!40000 ALTER TABLE `news_paper` DISABLE KEYS */;
INSERT INTO `news_paper` VALUES (1,'Dinamina',2),(2,'Rivira',2);
/*!40000 ALTER TABLE `news_paper` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subscriber_detail`
--

DROP TABLE IF EXISTS `subscriber_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subscriber_detail` (
                                     `subscriber_id` int(11) NOT NULL AUTO_INCREMENT,
                                     `subscriber_address` varchar(255) DEFAULT NULL,
                                     `subscriber_name` varchar(255) DEFAULT NULL,
                                     `subscriber_tel` varchar(255) DEFAULT NULL,
                                     PRIMARY KEY (`subscriber_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subscriber_detail`
--

LOCK TABLES `subscriber_detail` WRITE;
/*!40000 ALTER TABLE `subscriber_detail` DISABLE KEYS */;
INSERT INTO `subscriber_detail` VALUES (1,'435, Galle road,Rawathawaththa,Moratuwa','Sunil De Silva','0758342788'),(2,'No.448,Galle Road,Patabandimulla,Ambalangoda','Kavindi De Silva','0772544798');
/*!40000 ALTER TABLE `subscriber_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subscription_detail`
--

DROP TABLE IF EXISTS `subscription_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subscription_detail` (
                                       `subscription_id` int(11) NOT NULL AUTO_INCREMENT,
                                       `end_date` varchar(255) DEFAULT NULL,
                                       `start_date` varchar(255) DEFAULT NULL,
                                       `news_paper_id` int(11) DEFAULT NULL,
                                       PRIMARY KEY (`subscription_id`),
                                       KEY `FK6r5q7yw6jayygagjxcjhbdlni` (`news_paper_id`),
                                       CONSTRAINT `FK6r5q7yw6jayygagjxcjhbdlni` FOREIGN KEY (`news_paper_id`) REFERENCES `news_paper` (`news_paper_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subscription_detail`
--

LOCK TABLES `subscription_detail` WRITE;
/*!40000 ALTER TABLE `subscription_detail` DISABLE KEYS */;
INSERT INTO `subscription_detail` VALUES (1,'2023-9-9','2023-6-9',1),(2,'2023-10-9','2023-6-9',1);
/*!40000 ALTER TABLE `subscription_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subscription_type`
--

DROP TABLE IF EXISTS `subscription_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subscription_type` (
                                     `sub_type_id` int(11) NOT NULL AUTO_INCREMENT,
                                     `description` varchar(255) DEFAULT NULL,
                                     PRIMARY KEY (`sub_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subscription_type`
--

LOCK TABLES `subscription_type` WRITE;
/*!40000 ALTER TABLE `subscription_type` DISABLE KEYS */;
INSERT INTO `subscription_type` VALUES (1,'daily'),(2,'weekly');
/*!40000 ALTER TABLE `subscription_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trip_detail`
--

DROP TABLE IF EXISTS `trip_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trip_detail` (
                               `trip_id` int(11) NOT NULL AUTO_INCREMENT,
                               `date` varchar(255) DEFAULT NULL,
                               `status` varchar(255) DEFAULT NULL,
                               `subscriber_id` int(11) DEFAULT NULL,
                               `subscription_id` int(11) DEFAULT NULL,
                               `driver_id` varchar(255) DEFAULT NULL,
                               PRIMARY KEY (`trip_id`),
                               KEY `FKtpdywew9ukj99oiaf08y6j8cc` (`subscriber_id`),
                               KEY `FKf668cu7athbkvrv1h9sh81v4g` (`subscription_id`),
                               KEY `FK6rpma7835kw8xp6o6vscfuai2` (`driver_id`),
                               CONSTRAINT `FK6rpma7835kw8xp6o6vscfuai2` FOREIGN KEY (`driver_id`) REFERENCES `driver_login` (`driver_id`),
                               CONSTRAINT `FKf668cu7athbkvrv1h9sh81v4g` FOREIGN KEY (`subscription_id`) REFERENCES `subscription_detail` (`subscription_id`),
                               CONSTRAINT `FKtpdywew9ukj99oiaf08y6j8cc` FOREIGN KEY (`subscriber_id`) REFERENCES `subscriber_detail` (`subscriber_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trip_detail`
--

LOCK TABLES `trip_detail` WRITE;
/*!40000 ALTER TABLE `trip_detail` DISABLE KEYS */;
INSERT INTO `trip_detail` VALUES (1,'2023-6-9',NULL,1,1,'973420529v'),(2,'2023-6-9',NULL,2,2,'977420539v'),(3,'2023-6-9',NULL,1,1,'977420539v'),(4,'2023-8-9',NULL,1,1,'977420539v');
/*!40000 ALTER TABLE `trip_detail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;