/*
 Navicat Premium Data Transfer

 Source Server         : CodeTeam
 Source Server Type    : MySQL
 Source Server Version : 50734
 Source Host           : 101.34.72.152:3306
 Source Schema         : ct_site

 Target Server Type    : MySQL
 Target Server Version : 50734
 File Encoding         : 65001

 Date: 22/07/2021 15:33:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for site_about
-- ----------------------------
DROP TABLE IF EXISTS `site_about`;
CREATE TABLE `site_about`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `media_heading` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标题',
  `media_body` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容',
  `media_sort` int(4) NULL DEFAULT NULL COMMENT '排序',
  `media_icon` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图标',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '关于我们' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of site_about
-- ----------------------------
INSERT INTO `site_about` VALUES (1, 'FULLY RESPONSIVE', 'Awesome responsive template is provided by website. This is Bootstrap v3.3.2 layout built on HTML5 CSS3. You can use this for any purpose. Please tell your friends about it.', 1, 'fa fa-mobile');
INSERT INTO `site_about` VALUES (2, 'FREE SUPPORT', 'Credits go to for homepage image and for portfolio images. Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget diam et laoreet phasellus ut nisi id leo molestie.', 2, 'fa fa-comment-o');
INSERT INTO `site_about` VALUES (3, 'HTML5 &AMP; CSS3', 'Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget diam et laoreet phasellus ut nisi id leo molestie. Adipiscing vitae vel quam proin eget mauris eget. Lorem ipsum dolor sit amet.', 3, 'fa fa-html5');

-- ----------------------------
-- Table structure for site_portfolio
-- ----------------------------
DROP TABLE IF EXISTS `site_portfolio`;
CREATE TABLE `site_portfolio`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `portfolio_heading` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品标题',
  `portfolio_body` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容简介',
  `portfolio_img` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '背景图片',
  `portfolio_detail` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '详情链接',
  `portfolio_sort` int(4) NULL DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '产品案例' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of site_portfolio
-- ----------------------------
INSERT INTO `site_portfolio` VALUES (1, 'Project One', 'Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget dia.', '/images/portfolio-img1.jpg', 'www.baidu.com', 1);
INSERT INTO `site_portfolio` VALUES (2, 'Project Two', 'Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget dia.', '/images/portfolio-img2.jpg', 'www.baidu.com', 2);
INSERT INTO `site_portfolio` VALUES (3, 'Project Three', 'Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget dia.', '/images/portfolio-img3.jpg', 'www.baidu.com', 3);
INSERT INTO `site_portfolio` VALUES (4, 'Project Four', 'Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget dia.', '/images/portfolio-img4.jpg', 'www.baidu.com', 4);
INSERT INTO `site_portfolio` VALUES (5, 'Project Five', 'Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget dia.', '/images/portfolio-img3.jpg', 'www.baidu.com', 5);
INSERT INTO `site_portfolio` VALUES (6, 'Project Six', 'Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget dia.', '/images/portfolio-img4.jpg', 'www.baidu.com', 6);
INSERT INTO `site_portfolio` VALUES (7, 'Project Seven', 'Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget dia.', '/images/portfolio-img1.jpg', 'www.baidu.com', 7);
INSERT INTO `site_portfolio` VALUES (8, 'Project Eight', 'Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget dia.', '/images/portfolio-img2.jpg', 'www.baidu.com', 8);

-- ----------------------------
-- Table structure for site_support
-- ----------------------------
DROP TABLE IF EXISTS `site_support`;
CREATE TABLE `site_support`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `support_heading` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标题',
  `support_body` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容',
  `support_sort` int(4) NULL DEFAULT NULL COMMENT '排序',
  `support_icon` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图标',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '技术支持' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of site_support
-- ----------------------------
INSERT INTO `site_support` VALUES (1, 'Web Design', 'Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget diam et laoreet phasellus ut nisi id leo molestie. Adipiscing vitae vel quam proin eget mauris eget. Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget diam et laoreet phasellus ut nisi id leo molestie.', 1, 'fa fa-laptop');
INSERT INTO `site_support` VALUES (2, 'Cloud Computing', 'Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget diam et laoreet phasellus ut nisi id leo molestie. Adipiscing vitae vel quam proin eget mauris eget. Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget diam et laoreet phasellus ut nisi id leo molestie.', 2, 'fa fa-cloud');
INSERT INTO `site_support` VALUES (3, 'UX Design', 'Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget diam et laoreet phasellus ut nisi id leo molestie. Adipiscing vitae vel quam proin eget mauris eget. Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget diam et laoreet phasellus ut nisi id leo molestie.', 3, 'fa fa-cog');

-- ----------------------------
-- Table structure for site_team
-- ----------------------------
DROP TABLE IF EXISTS `site_team`;
CREATE TABLE `site_team`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `team_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `team_position` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '职务',
  `team_img` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '头像',
  `team_description` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '简介',
  `team_sort` int(4) NULL DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '团队精英' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of site_team
-- ----------------------------
INSERT INTO `site_team` VALUES (1, 'Shi', 'Designer', '/images/team-img1.jpg', 'Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget diam et laoreet phasellus ut nisi id leo molest.', 1);
INSERT INTO `site_team` VALUES (2, 'Fang', 'Developer', '/images/team-img2.jpg', 'Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget diam et laoreet phasellus ut nisi id leo molest.', 2);
INSERT INTO `site_team` VALUES (3, 'Chen', 'Director', '/images/team-img3.jpg', 'Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget diam et laoreet phasellus ut nisi id leo molest.', 3);
INSERT INTO `site_team` VALUES (4, 'Lin', 'Manager', '/images/team-img4.jpg', 'Lorem ipsum dolor sit amet, consectetur adipiscing elitquisque tempus ac eget diam et laoreet phasellus ut nisi id leo molest.', 4);

-- ----------------------------
-- Table structure for sys_visit_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_visit_log`;
CREATE TABLE `sys_visit_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `visit_ip` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '操作ip地址',
  `visit_time` datetime(0) NULL DEFAULT NULL COMMENT '操作时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 112 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '访问日志' ROW_FORMAT = Dynamic;


SET FOREIGN_KEY_CHECKS = 1;
