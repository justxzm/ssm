/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50523
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50523
File Encoding         : 65001

Date: 2017-07-11 10:53:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `operation` varchar(100) DEFAULT NULL,
  `current_time` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of log
-- ----------------------------
INSERT INTO `log` VALUES ('1', '增加一个用户', '2017-04-08 19:32:53');
INSERT INTO `log` VALUES ('2', '增加一个用户', '2017-04-08 19:34:05');
INSERT INTO `log` VALUES ('3', '增加一个用户', '2017-07-11 10:52:37');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1', 'admin', '123456');
INSERT INTO `userinfo` VALUES ('2', 'backid', '123456');
INSERT INTO `userinfo` VALUES ('3', 'root', 'root');
INSERT INTO `userinfo` VALUES ('7', 'rpcName', 'rpcPassword');
INSERT INTO `userinfo` VALUES ('8', 'rpcName', 'rpcPassword');
