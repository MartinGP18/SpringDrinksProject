CREATE TABLE `drink` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `is_alcoholic` bit(1) NOT NULL,
  `name` varchar(255) NOT NULL,
  `price` float DEFAULT NULL,
  PRIMARY KEY (`id`)
);