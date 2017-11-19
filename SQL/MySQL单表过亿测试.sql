DROP TABLE IF EXISTS `user_alerted`;
CREATE TABLE `user_alerted` (
    `id` VARCHAR(20) NOT NULL PRIMARY KEY,
    `client_id` VARCHAR(20) NOT NULL,
    `symbol` VARCHAR(20) NOT NULL,
    `symbol_type` TINYINT(4) NOT NULL,
    `source` VARCHAR(1) NOT NULL,
    `value` DECIMAL(10, 2),
    `type` TINYINT(1) NOT NULL,
    `create_time` DATETIME NOT NULL,
    `update_time` DATETIME DEFAULT NULL,
    `status` TINYINT(1) NOT NULL DEFAULT 0,
    `update_id` VARCHAR(20) NOT NULL
);
