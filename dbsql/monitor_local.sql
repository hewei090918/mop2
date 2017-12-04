/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50533
Source Host           : localhost:3306
Source Database       : monitor

Target Server Type    : MYSQL
Target Server Version : 50533
File Encoding         : 65001

Date: 2017-12-01 11:05:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for source
-- ----------------------------
DROP TABLE IF EXISTS `source`;
CREATE TABLE `source` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `img_url` varchar(200) DEFAULT NULL COMMENT '图片路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of source
-- ----------------------------
INSERT INTO `source` VALUES ('1', 'D:/meitu/tuku/001.jpg');
INSERT INTO `source` VALUES ('2', 'D:/meitu/tuku/002.jpg');
INSERT INTO `source` VALUES ('3', 'D:/meitu/tuku/003.jpg');
INSERT INTO `source` VALUES ('4', 'D:/meitu/tuku/004.jpg');
INSERT INTO `source` VALUES ('5', 'D:/meitu/tuku/005.jpg');
INSERT INTO `source` VALUES ('6', 'D:/meitu/tuku/006.jpg');
INSERT INTO `source` VALUES ('7', 'D:/meitu/tuku/007.jpg');
INSERT INTO `source` VALUES ('8', 'D:/meitu/tuku/008.jpg');
INSERT INTO `source` VALUES ('9', 'D:/meitu/tuku/009.jpg');
INSERT INTO `source` VALUES ('10', 'D:/meitu/tuku/010.jpg');
INSERT INTO `source` VALUES ('11', 'D:/meitu/tuku/011.jpg');
INSERT INTO `source` VALUES ('12', 'D:/meitu/tuku/012.jpg');
INSERT INTO `source` VALUES ('13', 'D:/meitu/tuku/013.jpg');
INSERT INTO `source` VALUES ('14', 'D:/meitu/tuku/014.jpg');
INSERT INTO `source` VALUES ('15', 'D:/meitu/tuku/015.jpg');
INSERT INTO `source` VALUES ('16', 'D:/meitu/tuku/016.jpg');
INSERT INTO `source` VALUES ('17', 'D:/meitu/tuku/017.jpg');
INSERT INTO `source` VALUES ('18', 'D:/meitu/tuku/018.jpg');
INSERT INTO `source` VALUES ('19', 'D:/meitu/tuku/019.jpg');
INSERT INTO `source` VALUES ('20', 'D:/meitu/tuku/020.jpg');
INSERT INTO `source` VALUES ('21', 'D:/meitu/tuku/021.jpg');
INSERT INTO `source` VALUES ('22', 'D:/meitu/tuku/022.jpg');
INSERT INTO `source` VALUES ('23', 'D:/meitu/tuku/023.jpg');
INSERT INTO `source` VALUES ('24', 'D:/meitu/tuku/024.jpg');
INSERT INTO `source` VALUES ('25', 'D:/meitu/tuku/025.jpg');
INSERT INTO `source` VALUES ('26', 'D:/meitu/tuku/026.jpg');
INSERT INTO `source` VALUES ('27', 'D:/meitu/tuku/027.jpg');
INSERT INTO `source` VALUES ('28', 'D:/meitu/tuku/028.jpg');
INSERT INTO `source` VALUES ('29', 'D:/meitu/tuku/029.jpg');
INSERT INTO `source` VALUES ('30', 'D:/meitu/tuku/030.jpg');
INSERT INTO `source` VALUES ('31', 'D:/meitu/tuku/031.jpg');
INSERT INTO `source` VALUES ('32', 'D:/meitu/tuku/032.jpg');
INSERT INTO `source` VALUES ('33', 'D:/meitu/tuku/033.jpg');
INSERT INTO `source` VALUES ('34', 'D:/meitu/tuku/034.jpg');
INSERT INTO `source` VALUES ('35', 'D:/meitu/tuku/035.jpg');
INSERT INTO `source` VALUES ('36', 'D:/meitu/tuku/036.jpg');
INSERT INTO `source` VALUES ('37', 'D:/meitu/tuku/037.jpg');
INSERT INTO `source` VALUES ('38', 'D:/meitu/tuku/038.jpg');
INSERT INTO `source` VALUES ('39', 'D:/meitu/tuku/039.jpg');
INSERT INTO `source` VALUES ('40', 'D:/meitu/tuku/040.jpg');
INSERT INTO `source` VALUES ('41', 'D:/meitu/tuku/041.jpg');
INSERT INTO `source` VALUES ('42', 'D:/meitu/tuku/042.jpg');
INSERT INTO `source` VALUES ('43', 'D:/meitu/tuku/043.jpg');
INSERT INTO `source` VALUES ('44', 'D:/meitu/tuku/044.jpg');
INSERT INTO `source` VALUES ('45', 'D:/meitu/tuku/045.jpg');
INSERT INTO `source` VALUES ('46', 'D:/meitu/tuku/046.jpg');
INSERT INTO `source` VALUES ('47', 'D:/meitu/tuku/047.jpg');
INSERT INTO `source` VALUES ('48', 'D:/meitu/tuku/048.jpg');
INSERT INTO `source` VALUES ('49', 'D:/meitu/tuku/049.jpg');
INSERT INTO `source` VALUES ('50', 'D:/meitu/tuku/050.jpg');
INSERT INTO `source` VALUES ('51', 'D:/meitu/tuku/051.jpg');
INSERT INTO `source` VALUES ('52', 'D:/meitu/tuku/052.jpg');
INSERT INTO `source` VALUES ('53', 'D:/meitu/tuku/053.jpg');
INSERT INTO `source` VALUES ('54', 'D:/meitu/tuku/054.jpg');
INSERT INTO `source` VALUES ('55', 'D:/meitu/tuku/055.jpg');
INSERT INTO `source` VALUES ('56', 'D:/meitu/tuku/056.jpg');
INSERT INTO `source` VALUES ('57', 'D:/meitu/tuku/057.jpg');
INSERT INTO `source` VALUES ('58', 'D:/meitu/tuku/058.jpg');
INSERT INTO `source` VALUES ('59', 'D:/meitu/tuku/059.jpg');
INSERT INTO `source` VALUES ('60', 'D:/meitu/tuku/060.jpg');
INSERT INTO `source` VALUES ('61', 'D:/meitu/tuku/061.jpg');
INSERT INTO `source` VALUES ('62', 'D:/meitu/tuku/062.jpg');
INSERT INTO `source` VALUES ('63', 'D:/meitu/tuku/063.jpg');
INSERT INTO `source` VALUES ('64', 'D:/meitu/tuku/064.jpg');
INSERT INTO `source` VALUES ('65', 'D:/meitu/tuku/065.jpg');
INSERT INTO `source` VALUES ('66', 'D:/meitu/tuku/066.jpg');
INSERT INTO `source` VALUES ('67', 'D:/meitu/tuku/067.jpg');
INSERT INTO `source` VALUES ('68', 'D:/meitu/tuku/068.jpg');
INSERT INTO `source` VALUES ('69', 'D:/meitu/tuku/069.jpg');
INSERT INTO `source` VALUES ('70', 'D:/meitu/tuku/070.jpg');
INSERT INTO `source` VALUES ('71', 'D:/meitu/tuku/071.jpg');
INSERT INTO `source` VALUES ('72', 'D:/meitu/tuku/072.jpg');
INSERT INTO `source` VALUES ('73', 'D:/meitu/tuku/073.jpg');
INSERT INTO `source` VALUES ('74', 'D:/meitu/tuku/074.jpg');
INSERT INTO `source` VALUES ('75', 'D:/meitu/tuku/075.jpg');
INSERT INTO `source` VALUES ('76', 'D:/meitu/tuku/076.jpg');
INSERT INTO `source` VALUES ('77', 'D:/meitu/tuku/077.jpg');
INSERT INTO `source` VALUES ('78', 'D:/meitu/tuku/078.jpg');
INSERT INTO `source` VALUES ('79', 'D:/meitu/tuku/079.jpg');
INSERT INTO `source` VALUES ('80', 'D:/meitu/tuku/080.jpg');
INSERT INTO `source` VALUES ('81', 'D:/meitu/tuku/081.jpg');
INSERT INTO `source` VALUES ('82', 'D:/meitu/tuku/082.jpg');
INSERT INTO `source` VALUES ('83', 'D:/meitu/tuku/083.jpg');
INSERT INTO `source` VALUES ('84', 'D:/meitu/tuku/084.jpg');
INSERT INTO `source` VALUES ('85', 'D:/meitu/tuku/085.jpg');
INSERT INTO `source` VALUES ('86', 'D:/meitu/tuku/086.jpg');
INSERT INTO `source` VALUES ('87', 'D:/meitu/tuku/087.jpg');
INSERT INTO `source` VALUES ('88', 'D:/meitu/tuku/088.jpg');
INSERT INTO `source` VALUES ('89', 'D:/meitu/tuku/089.jpg');
INSERT INTO `source` VALUES ('90', 'D:/meitu/tuku/090.jpg');
INSERT INTO `source` VALUES ('91', 'D:/meitu/tuku/091.jpg');
INSERT INTO `source` VALUES ('92', 'D:/meitu/tuku/092.jpg');
INSERT INTO `source` VALUES ('93', 'D:/meitu/tuku/093.jpg');
INSERT INTO `source` VALUES ('94', 'D:/meitu/tuku/094.jpg');
INSERT INTO `source` VALUES ('95', 'D:/meitu/tuku/095.jpg');
INSERT INTO `source` VALUES ('96', 'D:/meitu/tuku/096.jpg');
INSERT INTO `source` VALUES ('97', 'D:/meitu/tuku/097.jpg');
INSERT INTO `source` VALUES ('98', 'D:/meitu/tuku/098.jpg');
INSERT INTO `source` VALUES ('99', 'D:/meitu/tuku/099.jpg');
INSERT INTO `source` VALUES ('100', 'D:/meitu/tuku/100.jpg');
INSERT INTO `source` VALUES ('101', 'D:/meitu/tuku/101.jpg');
INSERT INTO `source` VALUES ('102', 'D:/meitu/tuku/102.jpg');
INSERT INTO `source` VALUES ('103', 'D:/meitu/tuku/103.jpg');
INSERT INTO `source` VALUES ('104', 'D:/meitu/tuku/104.jpg');
INSERT INTO `source` VALUES ('105', 'D:/meitu/tuku/105.jpg');
INSERT INTO `source` VALUES ('106', 'D:/meitu/tuku/106.jpg');
INSERT INTO `source` VALUES ('107', 'D:/meitu/tuku/107.jpg');
INSERT INTO `source` VALUES ('108', 'D:/meitu/tuku/108.jpg');
