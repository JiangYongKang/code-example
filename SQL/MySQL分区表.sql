-- 创建数据库
CREATE DATABASE IF EXISTS `PARTITION_TEST`;
USE `PARTITION_TEST`;

-- 创建表
-- 用于分区的字段必须是主键或联合主键
DROP TABLE IF EXISTS `trades`;
CREATE TABLE `trades` (
    `id` INT AUTO_INCREMENT NOT NULL COMMENT '主键',
    `status` INT NOT NULL DEFAULT 0 COMMENT '状态',
    `created_at` DATETIME NOT NULL COMMENT '创建时间',
    PRIMARY KEY (`id`, `status`, `created_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 插入测试数据
INSERT INTO `trades` (`status`, `created_at`) VALUES (0, '20180101');
INSERT INTO `trades` (`status`, `created_at`) VALUES (0, '20180102');
INSERT INTO `trades` (`status`, `created_at`) VALUES (0, '20180103');
INSERT INTO `trades` (`status`, `created_at`) VALUES (0, '20180201');
INSERT INTO `trades` (`status`, `created_at`) VALUES (0, '20180202');
INSERT INTO `trades` (`status`, `created_at`) VALUES (0, '20180301');
INSERT INTO `trades` (`status`, `created_at`) VALUES (1, '20180302');
INSERT INTO `trades` (`status`, `created_at`) VALUES (1, '20180401');
INSERT INTO `trades` (`status`, `created_at`) VALUES (1, '20180402');
INSERT INTO `trades` (`status`, `created_at`) VALUES (1, '20180501');

-- RANGE 分区
-- 为每个分区都指定一个分区范围
-- 这些范围必须保证是连续的，并且不能发生重叠
-- 分区表达式必须返回整数或者 NULL 类型
ALTER TABLE `trades` PARTITION BY RANGE (TO_DAYS(created_at)) (
    PARTITION P1 VALUES LESS THAN (TO_DAYS('20180101')),
    PARTITION P2 VALUES LESS THAN (TO_DAYS('20180201')),
    PARTITION P3 VALUES LESS THAN (TO_DAYS('20180301')),
    PARTITION P4 VALUES LESS THAN (TO_DAYS('20180401')),
    PARTITION P5 VALUES LESS THAN (TO_DAYS('20180501')),
    PARTITION P0 VALUES LESS THAN MAXVALUE
);

-- LIST 分区
-- LIST 分区列是 NOT NULL 列，否则插入 NULL 值如果枚举列表里面不存在 NULL 值会插入失败
-- LIST 分区只支持整形，非整形字段需要通过函数转换成整形
ALTER TABLE `trades` PARTITION BY LIST(`status`) (
    PARTITION ENABLED_PARTITION VALUES IN (0),
    PARTITION DISABLED_PARTITION VALUES IN (1)
);

-- HASH 分区
-- 我们在实际工作中经常遇到像会员表的这种表。并没有明显可以分区的特征字段。但表数据有非常庞大。为了把这类的数据进行分区打散 MySQL 提供了 HASH 分区。
-- HASH 分区只能针对整数进行 HASH，对于非整形的字段只能通过表达式将其转换成整数
-- HASH 分区可以不用指定 PARTITIONS 子句，如下面的 PARTITIONS 4，则默认分区数为一个分区。
-- 不允许只写 PARTITIONS，而不指定分区数。
-- 同 RANGE 分区和 LIST 分区一样，PARTITION BY HASH (expr) 子句中的 expr 返回的必须是整数值。
ALTER TABLE `trades` PARTITION BY HASH(`id`) PARTITIONS 4;

-- 查看全部分区与查询指定分区信息
SELECT * FROM INFORMATION_SCHEMA.PARTITIONS;
SELECT * FROM INFORMATION_SCHEMA.PARTITIONS WHERE TABLE_SCHEMA = 'PARTITION_TEST' AND TABLE_NAME = 'trades';

-- 分析查询语句有没有利用分区
EXPLAIN PARTITIONS SELECT * FROM `trades` WHERE `id` = 1 AND `created_at` = '20180101';

-- 删除分区，注意删除分区会删除分区中的数据
ALTER TABLE `trades` DROP PARTITION P1;
