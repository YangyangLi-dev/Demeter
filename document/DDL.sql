-- fwrp.`user` definition

CREATE TABLE `user` (
                        `id` bigint NOT NULL AUTO_INCREMENT,
                        `name` varchar(64) NOT NULL,
                        `email` varchar(128) NOT NULL,
                        `type` smallint unsigned NOT NULL COMMENT '1-consumer, 5-retailer, 10-charitableOrg',
                        `address` varchar(256) DEFAULT NULL,
                        `contract_number` varchar(64) DEFAULT NULL,
                        `password` varchar(64) DEFAULT NULL,
                        PRIMARY KEY (`id`),
                        UNIQUE KEY `user_email_unique` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- fwrp.food_item definition

CREATE TABLE `food_item` (
                             `id` bigint NOT NULL AUTO_INCREMENT,
                             `retailer_id` bigint DEFAULT NULL COMMENT 'Foreign Key to retailer''s user_id',
                             `name` varchar(64) NOT NULL,
                             `description` text NOT NULL,
                             `quantity` int unsigned NOT NULL,
                             `price` decimal(10,0) NOT NULL,
                             `discounted_price` decimal(10,0) NOT NULL,
                             `expiration_date` datetime DEFAULT NULL,
                             `is_surplus` tinyint(1) NOT NULL DEFAULT '0',
                             `is_for_donation` tinyint(1) NOT NULL DEFAULT '0',
                             PRIMARY KEY (`id`),
                             KEY `food_item_user_FK` (`retailer_id`),
                             CONSTRAINT `food_item_user_FK` FOREIGN KEY (`retailer_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- fwrp.`order` definition

CREATE TABLE `order` (
                         `id` bigint NOT NULL AUTO_INCREMENT,
                         `item_id` bigint NOT NULL,
                         `buyer_id` bigint NOT NULL,
                         `quantity` int unsigned NOT NULL,
                         `checkout_time` datetime NOT NULL,
                         `transaction_type` smallint unsigned NOT NULL DEFAULT '1' COMMENT '1-purchase, 2-donation',
                         `status` smallint unsigned NOT NULL DEFAULT '0' COMMENT '0-initial, 5-checkout',
                         PRIMARY KEY (`id`),
                         KEY `order_food_item_FK` (`item_id`),
                         KEY `order_user_FK` (`buyer_id`),
                         CONSTRAINT `order_food_item_FK` FOREIGN KEY (`item_id`) REFERENCES `food_item` (`id`),
                         CONSTRAINT `order_user_FK` FOREIGN KEY (`buyer_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- fwrp.subscription definition

CREATE TABLE `subscription` (
                                `id` bigint NOT NULL,
                                `user_id` bigint NOT NULL,
                                `communication_method` smallint unsigned DEFAULT NULL COMMENT '1-email, 2-phone',
                                `food_preference` text,
                                `is_active` tinyint(1) NOT NULL DEFAULT '1',
                                `latitude` decimal(10,8) DEFAULT NULL,
                                `longitude` decimal(11,8) DEFAULT NULL,
                                PRIMARY KEY (`id`),
                                KEY `subscription_user_FK` (`user_id`),
                                CONSTRAINT `subscription_user_FK` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- fwrp.alert definition

CREATE TABLE `alert` (
                         `id` bigint NOT NULL,
                         `user_id` bigint NOT NULL,
                         `item_id` bigint DEFAULT NULL,
                         `type` smallint unsigned NOT NULL DEFAULT '1' COMMENT '1-email, 2-phone',
                         `alert_time` datetime NOT NULL,
                         PRIMARY KEY (`id`),
                         KEY `alert_user_FK` (`user_id`),
                         KEY `alert_food_item_FK` (`item_id`),
                         CONSTRAINT `alert_food_item_FK` FOREIGN KEY (`item_id`) REFERENCES `food_item` (`id`),
                         CONSTRAINT `alert_user_FK` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;