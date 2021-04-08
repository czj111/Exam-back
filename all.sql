-- 注意：sql版本5.5使用的是varchar定义变长字符串
/*==============================================================*/
/* Table: 用户表 (存储用户信息)
/*==============================================================*/
create table tab_user(
USERNAME VARCHAR(100) not null,
PASSWORD VARCHAR(32) not null,
BIRTHDAY DATE,
SEX CHAR(2),
EMAIL VARCHAR(100),
STATUS CHAR(1),
CODE VARCHAR(50)
);
