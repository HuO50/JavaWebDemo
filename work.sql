/*
Navicat MySQL Data Transfer

Source Server         : MySql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : work

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-05-04 12:17:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `time` timestamp NULL DEFAULT NULL,
  `content` longtext,
  PRIMARY KEY (`id`,`title`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('1', '高考时间到，“作弊入刑”发威', 'admin', '2016-06-22 16:39:56', '<p style=\"padding: 0px; margin-top: 0px; margin-bottom: 10px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); line-height: 24px; font-family: 楷体_GB2312; white-space: normal; text-indent: 24pt; background-color: rgb(255, 255, 255);\">\r\n    <span style=\"padding: 0px; margin: 0px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); font-family: 宋体; font-size: 12pt;\">7日上午9点，随着考试铃声响起，940万考生在全国参加高考，为大学梦而努力。相比往年，今年高考的最大特点就是“作弊入刑”。“最高可判7年”、“史上最严”为这场高考增加了特别的热议话题。</span>\r\n</p>\r\n<p style=\"padding: 0px; margin-top: 0px; margin-bottom: 10px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); line-height: 24px; font-family: 楷体_GB2312; white-space: normal; text-indent: 24pt; background-color: rgb(255, 255, 255);\">\r\n    <span style=\"padding: 0px; margin: 0px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); font-size: 12pt;\">@风三十：这无疑大大提高了高考作弊犯罪的成本，有力地威慑了考试作弊违法犯罪行为，给“作弊入刑”点了赞。</span>\r\n</p>\r\n<p style=\"padding: 0px; margin-top: 0px; margin-bottom: 10px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); line-height: 24px; font-family: 楷体_GB2312; white-space: normal; text-indent: 24pt; background-color: rgb(255, 255, 255);\">\r\n    <span style=\"padding: 0px; margin: 0px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); font-size: 12pt;\">网民“张军瑜”：今年首次明确高考作弊入刑，祭起法律大旗，是一种法律震慑，也是国家面临每年屡禁不止的高考舞弊案的一种雷霆手段。</span>\r\n</p>\r\n<p style=\"padding: 0px; margin-top: 0px; margin-bottom: 10px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); line-height: 24px; font-family: 楷体_GB2312; white-space: normal; text-indent: 24pt; background-color: rgb(255, 255, 255);\">\r\n    <span style=\"padding: 0px; margin: 0px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); font-size: 12pt;\">@新华网：“作弊入刑”是手段，不是目的。构建诚信的考试文化，从法律和道德两方面入手，夯实高考公平的基础，让学子自觉抵制考试违纪行为，更能起到釜底抽薪之效。</span>\r\n</p>\r\n<p style=\"padding: 0px; margin-top: 0px; margin-bottom: 10px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); line-height: 24px; font-family: 楷体_GB2312; white-space: normal; text-indent: 24pt; background-color: rgb(255, 255, 255);\">\r\n    <span style=\"padding: 0px; margin: 0px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); font-size: 12pt;\">网民“鼎鑫一派”：光靠刑罚解决不了问题，得从制度着手，全国统一命题，统一评阅，以国家强制力作为保障，不能分解给地方。</span>\r\n</p>\r\n<p>\r\n    <br/>\r\n</p>');
INSERT INTO `news` VALUES ('2', '派出所给银行“差评”：一点都不冤', 'admin', '2016-06-22 16:40:36', '<p style=\"padding: 0px; margin-top: 0px; margin-bottom: 10px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); line-height: 24px; color: rgb(57, 57, 57); font-family: 宋体; white-space: normal; text-indent: 24pt; background-color: rgb(255, 255, 255);\">\r\n    <span style=\"padding: 0px; margin: 0px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); font-size: 12pt;\">在湖北房县，某银行工作人员失误，把一位老人身份证号输错。老人取款时，因号码不一致，被要求证明“我就是我”。近日，当地派出所开了证明并质问：你们自己造成的错误，为什么有问题都往派出所推？并打上差评。</span>\r\n</p>\r\n<p style=\"padding: 0px; margin-top: 0px; margin-bottom: 10px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); line-height: 24px; color: rgb(57, 57, 57); font-family: 宋体; white-space: normal; text-indent: 24pt; background-color: rgb(255, 255, 255);\">\r\n    <span style=\"padding: 0px; margin: 0px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); font-size: 12pt;\"></span>&nbsp;\r\n</p>\r\n<p style=\"padding: 0px; margin-top: 0px; margin-bottom: 10px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); line-height: 24px; color: rgb(57, 57, 57); font-family: 宋体; white-space: normal; text-indent: 24pt; background-color: rgb(255, 255, 255);\">\r\n    <span style=\"padding: 0px; margin: 0px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); font-family: 楷体_GB2312; font-size: 12pt;\">@纵横点评：本来，人非圣贤，谁能没个过错？关键是出错后如何面对、如何处理。可是银行工作人员面对失误，首先想到的不是从自身查找问题，而是把群众往外推，这就像是银行自己生了病，却让群众来吃药。</span>\r\n</p>\r\n<p style=\"padding: 0px; margin-top: 0px; margin-bottom: 10px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); line-height: 24px; color: rgb(57, 57, 57); font-family: 宋体; white-space: normal; text-indent: 24pt; background-color: rgb(255, 255, 255);\">\r\n    <span style=\"padding: 0px; margin: 0px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); font-family: 楷体_GB2312; font-size: 12pt;\">网民“扈宏毅”：一个“差评”成“网红”，说明平日里百姓与银行打交道的过程中，即便遭遇了不公平待遇或不可理喻的“霸王条款”，也通常是有苦无处诉。</span>\r\n</p>\r\n<p style=\"padding: 0px; margin-top: 0px; margin-bottom: 10px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); line-height: 24px; color: rgb(57, 57, 57); font-family: 宋体; white-space: normal; text-indent: 24pt; background-color: rgb(255, 255, 255);\">\r\n    <span style=\"padding: 0px; margin: 0px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); font-family: 楷体_GB2312; font-size: 12pt;\">@lxyza：差评也没用呀，该当事人来回跑的现实依旧无法改变。事情出了，没人敢承担责任，互相推诿，风气所致。</span>\r\n</p>\r\n<p style=\"padding: 0px; margin-top: 0px; margin-bottom: 10px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); line-height: 24px; color: rgb(57, 57, 57); font-family: 宋体; white-space: normal; text-indent: 24pt; background-color: rgb(255, 255, 255);\">\r\n    <span style=\"padding: 0px; margin: 0px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); font-family: 楷体_GB2312; font-size: 12pt;\">@刘海左偏：我更关心老人因银行的错误跑来跑去的折腾和被质疑的心酸。对弱势群体的优待太有限！</span>\r\n</p>\r\n<p style=\"padding: 0px; margin-top: 0px; margin-bottom: 10px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); line-height: 24px; color: rgb(57, 57, 57); font-family: 宋体; white-space: normal; text-indent: 24pt; background-color: rgb(255, 255, 255);\">\r\n    <span style=\"padding: 0px; margin: 0px; border: 0px; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); font-family: 楷体_GB2312; font-size: 12pt;\">@人民日报：这家银行获差评，一点都不冤！有错在先却不纠错，真是霸气；无故刁难八旬老人，缺少关怀；让派出所陪着折腾，毫无道义。事情虽已收场，但问责不能省略，办事人员不该受到处罚？也要问问，如此耍威风的还有多少？该刹住这样的傲慢与无理了。</span>\r\n</p>\r\n<p>\r\n    <br/>\r\n</p>');
INSERT INTO `news` VALUES ('3', '测试新闻', 'admin', '2016-06-23 00:00:00', '<p><br/>测试新闻</p>');
INSERT INTO `news` VALUES ('4', '测试新闻2', 'admin1', '2016-06-23 00:00:00', '<p>测试新闻2测试新闻2</p>');
INSERT INTO `news` VALUES ('5', '测试新闻3', 'admin2', '2016-06-23 00:00:00', '<p><br/>测试新闻</p>');
INSERT INTO `news` VALUES ('6', '测试新闻4', 'admin', '2016-06-23 00:00:00', '<p>测试新闻4</p>');
INSERT INTO `news` VALUES ('7', '测试新闻5', 'admin', '2016-06-23 00:00:00', '<p>测试新闻5</p>');
INSERT INTO `news` VALUES ('8', '测试新闻6', 'admin', '2016-06-23 00:00:00', '<p>					</p><p><br/></p><p>&nbsp;&nbsp;&nbsp;&nbsp;</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: rgb(0, 176, 240);\">试新闻6测试新闻6</span></p><p><br/></p><p>\r\n				</p>');
INSERT INTO `news` VALUES ('9', '测试新闻', 'admin', '2016-06-23 22:06:27', 'asdfasdfasdfasdf');
INSERT INTO `news` VALUES ('11', '测试新闻', 'adsf', '2016-06-28 00:00:00', '<p>asdfasdfasdfasdfasdf</p>');
INSERT INTO `news` VALUES ('12', '测试新闻', 'admin1', '2016-06-28 00:00:00', '<p>测试新闻测试新闻测试新闻测试新闻测试新闻</p>');
INSERT INTO `news` VALUES ('14', 'asdfasdfasdfsadf', 'admin', '2017-02-24 00:00:00', '<p style=\"text-align: center;\"><img src=\"upload/image/IMG_2684.jpg\" title=\"IMG_2684.jpg\" alt=\"IMG_2684.jpg\" width=\"364\" height=\"251\" style=\"width: 364px; height: 251px;\"/></p><p>aSDFASDFASDFASDFASDF</p>');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phonenum` varchar(11) DEFAULT NULL,
  `jurisdiction` varchar(255) DEFAULT NULL,
  `logintime` date DEFAULT NULL,
  PRIMARY KEY (`id`,`username`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '123123', '123123132@c123.com', '13511223344', 'yes', '2016-06-22');
INSERT INTO `user` VALUES ('2', 'admin1', '123123', '123456@123.com', '13544556633', 'yes', '2016-06-23');
INSERT INTO `user` VALUES ('3', 'admin2', '123123', '12345461@132.com', '13544556699', 'no', '2016-06-23');
INSERT INTO `user` VALUES ('4', 'admin3', '123123', '1234546@132.com', '13544556677', 'no', '2016-06-23');
INSERT INTO `user` VALUES ('5', 'admin4', '123123', '1234656@123.com', '13544556633', 'no', '2016-06-23');
INSERT INTO `user` VALUES ('6', 'admin5', '123123', '123456@123.com', '13544556633', 'no', '2016-06-23');
INSERT INTO `user` VALUES ('7', 'admin6', '123123', '123456@123.com', '13544556633', 'no', '2016-06-23');
INSERT INTO `user` VALUES ('8', 'asdfg', '123123', 'asdf@163.com', '18812341234', 'yes', '2017-02-22');
