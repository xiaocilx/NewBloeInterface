-- 创建数据库
CREATE DATABASE IF NOT EXISTS  blog CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- 标签表
CREATE TABLE IF NOT EXISTS Label
(
    id          INT AUTO_INCREMENT PRIMARY KEY comment '标签ID',
    name        varchar(60) NOT NULL default '' COMMENT '标签名称',
    description text                 DEFAULT NULL comment '备注'
);


-- 设置表
CREATE TABLE IF NOT EXISTS options
(
    id           INT AUTO_INCREMENT PRIMARY KEY comment '配置ID',
    name  VARCHAR(255) NOT NULL comment '配置名称',
    value VARCHAR(255) NOT NULL comment '配置值',
    description  text DEFAULT NULL comment '备注'
);