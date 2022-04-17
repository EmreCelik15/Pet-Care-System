CREATE TABLE `animal_owners` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `last_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `mobile_phone` int DEFAULT NULL,
  `e_mail` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `animals` (
  `id` int NOT NULL AUTO_INCREMENT,
  `species` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `age` int DEFAULT NULL,
  `description` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `animal_owner_id` int DEFAULT NULL,
  UNIQUE KEY `animals_id_uindex` (`id`),
  KEY `animals_fk` (`animal_owner_id`),
  CONSTRAINT `animals_fk` FOREIGN KEY (`animal_owner_id`) REFERENCES `animal_owners` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
SELECT * FROM demo.animal_owners;