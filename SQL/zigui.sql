/*
 Navicat MySQL Data Transfer

 Source Server         : 本地连接
 Source Server Version : 50717
 Source Host           : localhost
 Source Database       : zigui

 Target Server Version : 50717
 File Encoding         : utf-8

 Date: 04/25/2017 21:25:55 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `email`
-- ----------------------------
DROP TABLE IF EXISTS `email`;
CREATE TABLE `email` (
  `id` varchar(64) NOT NULL COMMENT '主键',
  `email` varchar(255) NOT NULL COMMENT '邮件地址',
  `username` varchar(255) NOT NULL COMMENT '用户名称',
  `type` tinyint(4) NOT NULL COMMENT '邮件类型',
  `status` tinyint(4) NOT NULL COMMENT '状态',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `email_send`
-- ----------------------------
DROP TABLE IF EXISTS `email_send`;
CREATE TABLE `email_send` (
  `id` varchar(64) NOT NULL COMMENT '主键',
  `sender_id` varchar(64) NOT NULL COMMENT '发件人ID',
  `addressee_id` varchar(64) NOT NULL COMMENT '收件人ID',
  `template_id` varchar(64) NOT NULL COMMENT '内容ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `email_template`
-- ----------------------------
DROP TABLE IF EXISTS `email_template`;
CREATE TABLE `email_template` (
  `id` varchar(64) NOT NULL COMMENT '主键',
  `title` varchar(2048) NOT NULL COMMENT '标题',
  `content` varchar(2048) NOT NULL COMMENT '内容',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `system_history`
-- ----------------------------
DROP TABLE IF EXISTS `system_history`;
CREATE TABLE `system_history` (
  `id` varchar(64) NOT NULL COMMENT '主键',
  `object` varchar(64) NOT NULL COMMENT '操作对象',
  `content` varchar(255) NOT NULL COMMENT '内容',
  `type` tinyint(4) unsigned NOT NULL COMMENT '操作类型',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
