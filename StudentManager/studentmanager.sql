/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80026
Source Host           : localhost:3306
Source Database       : studentmanager

Target Server Type    : MYSQL
Target Server Version : 80026
File Encoding         : 65001

Date: 2021-11-21 22:39:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for s_admin
-- ----------------------------
DROP TABLE IF EXISTS `s_admin`;
CREATE TABLE `s_admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`,`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of s_admin
-- ----------------------------
INSERT INTO `s_admin` VALUES ('1', 'admin', '123456', '1');

-- ----------------------------
-- Table structure for s_attendance
-- ----------------------------
DROP TABLE IF EXISTS `s_attendance`;
CREATE TABLE `s_attendance` (
  `id` int NOT NULL AUTO_INCREMENT,
  `course_id` int NOT NULL,
  `student_id` int NOT NULL,
  `type` varchar(11) NOT NULL,
  `date` varchar(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `attendance_course_foreign_key` (`course_id`),
  KEY `attendace_student_foreign_key` (`student_id`),
  CONSTRAINT `attendace_student_foreign_key` FOREIGN KEY (`student_id`) REFERENCES `s_student` (`id`),
  CONSTRAINT `attendance_course_foreign_key` FOREIGN KEY (`course_id`) REFERENCES `s_course` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of s_attendance
-- ----------------------------
INSERT INTO `s_attendance` VALUES ('13', '1', '2', '上午', '2018-09-04');
INSERT INTO `s_attendance` VALUES ('14', '1', '4', '上午', '2018-09-04');
INSERT INTO `s_attendance` VALUES ('15', '2', '2', '上午', '2019-07-02');

-- ----------------------------
-- Table structure for s_clazz
-- ----------------------------
DROP TABLE IF EXISTS `s_clazz`;
CREATE TABLE `s_clazz` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL,
  `info` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of s_clazz
-- ----------------------------
INSERT INTO `s_clazz` VALUES ('1', '软件一班', '软件工程专业。');
INSERT INTO `s_clazz` VALUES ('4', '数学一班', '大学数学专业');
INSERT INTO `s_clazz` VALUES ('5', '计算机科学与技术一班', '计算机专业');

-- ----------------------------
-- Table structure for s_course
-- ----------------------------
DROP TABLE IF EXISTS `s_course`;
CREATE TABLE `s_course` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL,
  `teacher_id` int NOT NULL,
  `course_date` varchar(32) DEFAULT NULL,
  `selected_num` int NOT NULL DEFAULT '0',
  `max_num` int NOT NULL DEFAULT '50',
  `info` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `course_teacher_foreign` (`teacher_id`),
  CONSTRAINT `course_teacher_foreign` FOREIGN KEY (`teacher_id`) REFERENCES `s_teacher` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of s_course
-- ----------------------------
INSERT INTO `s_course` VALUES ('1', '大学英语', '9', '周三上午8点', '49', '50', '英语。');
INSERT INTO `s_course` VALUES ('2', '大学数学', '10', '周三上午10点', '4', '50', '数学。');
INSERT INTO `s_course` VALUES ('3', '计算机基础', '11', '周三上午', '3', '50', '计算机课程。');

-- ----------------------------
-- Table structure for s_leave
-- ----------------------------
DROP TABLE IF EXISTS `s_leave`;
CREATE TABLE `s_leave` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `info` varchar(512) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '0',
  `remark` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `leave_student_foreign_key` (`student_id`),
  CONSTRAINT `leave_student_foreign_key` FOREIGN KEY (`student_id`) REFERENCES `s_student` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of s_leave
-- ----------------------------
INSERT INTO `s_leave` VALUES ('13', '2', '世界这么大，想去看看', '1', '同意，你很6');

-- ----------------------------
-- Table structure for s_score
-- ----------------------------
DROP TABLE IF EXISTS `s_score`;
CREATE TABLE `s_score` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `course_id` int NOT NULL,
  `score` double(5,2) NOT NULL,
  `remark` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `selected_course_student_fk` (`student_id`),
  KEY `selected_course_course_fk` (`course_id`),
  CONSTRAINT `s_score_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `s_course` (`id`),
  CONSTRAINT `s_score_ibfk_2` FOREIGN KEY (`student_id`) REFERENCES `s_student` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of s_score
-- ----------------------------
INSERT INTO `s_score` VALUES ('67', '4', '2', '78.00', '中等');
INSERT INTO `s_score` VALUES ('68', '9', '1', '50.00', '不及格');

-- ----------------------------
-- Table structure for s_selected_course
-- ----------------------------
DROP TABLE IF EXISTS `s_selected_course`;
CREATE TABLE `s_selected_course` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `course_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `selected_course_student_fk` (`student_id`),
  KEY `selected_course_course_fk` (`course_id`),
  CONSTRAINT `selected_course_course_fk` FOREIGN KEY (`course_id`) REFERENCES `s_course` (`id`),
  CONSTRAINT `selected_course_student_fk` FOREIGN KEY (`student_id`) REFERENCES `s_student` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of s_selected_course
-- ----------------------------
INSERT INTO `s_selected_course` VALUES ('18', '2', '1');
INSERT INTO `s_selected_course` VALUES ('19', '2', '2');
INSERT INTO `s_selected_course` VALUES ('20', '2', '3');
INSERT INTO `s_selected_course` VALUES ('21', '4', '3');
INSERT INTO `s_selected_course` VALUES ('22', '4', '2');
INSERT INTO `s_selected_course` VALUES ('24', '9', '1');

-- ----------------------------
-- Table structure for s_student
-- ----------------------------
DROP TABLE IF EXISTS `s_student`;
CREATE TABLE `s_student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sn` varchar(32) NOT NULL,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `clazz_id` int NOT NULL,
  `sex` varchar(5) NOT NULL DEFAULT '男',
  `mobile` varchar(12) DEFAULT NULL,
  `qq` varchar(18) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`,`sn`),
  KEY `student_clazz_id_foreign` (`clazz_id`),
  CONSTRAINT `student_clazz_id_foreign` FOREIGN KEY (`clazz_id`) REFERENCES `s_clazz` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of s_student
-- ----------------------------
INSERT INTO `s_student` VALUES ('2', 'S51528202992845', '张三纷', '123456', '1', '女', '13545454548', '1332365656', null);
INSERT INTO `s_student` VALUES ('4', 'S51528379586807', '王麻子', '111111', '5', '男', '13356565656', '123456', null);
INSERT INTO `s_student` VALUES ('9', 'S41528633634989', '马冬梅', '1', '5', '男', '13333332133', '131313132323', 'bb12326f-ef6c-4d3d-a2ae-f9eb30a15ad4.jpg');

-- ----------------------------
-- Table structure for s_teacher
-- ----------------------------
DROP TABLE IF EXISTS `s_teacher`;
CREATE TABLE `s_teacher` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sn` varchar(32) NOT NULL,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `clazz_id` int NOT NULL,
  `sex` varchar(5) NOT NULL DEFAULT '男',
  `mobile` varchar(12) DEFAULT NULL,
  `qq` varchar(18) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`,`sn`),
  KEY `student_clazz_id_foreign` (`clazz_id`),
  CONSTRAINT `s_teacher_ibfk_1` FOREIGN KEY (`clazz_id`) REFERENCES `s_clazz` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of s_teacher
-- ----------------------------
INSERT INTO `s_teacher` VALUES ('9', 'T11528608730648', '张三', '111', '4', '男', '13918655656', '1193284480', null);
INSERT INTO `s_teacher` VALUES ('10', 'T11528609224588', '李四老师', '111', '4', '男', '13656565656', '123456', null);
INSERT INTO `s_teacher` VALUES ('11', 'T51528617262403', '李老师', '123456', '5', '男', '18989898989', '1456655565', null);
INSERT INTO `s_teacher` VALUES ('18', 'T11561727746515', '夏青松', '123456', '1', '女', '15174857845', '1745854125', '5d447b8b-ec54-4a8e-919a-453aa7b6d33b.jpg');
