CREATE TABLE `user`
(
    `id`          bigint unsigned NOT NULL,
    `name`        varchar(64) COLLATE utf8mb4_general_ci                        DEFAULT NULL,
    `nick_name`   varchar(64) COLLATE utf8mb4_general_ci                        DEFAULT NULL,
    `salt`        varchar(64) COLLATE utf8mb4_general_ci                        DEFAULT NULL,
    `password`    varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
    `gender`      int                                                           DEFAULT NULL,
    `age`         int                                                           DEFAULT NULL,
    `birth_date`  date                                                          DEFAULT NULL,
    `create_time` datetime                                                      DEFAULT NULL,
    `update_time` datetime                                                      DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;