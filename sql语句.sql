create database edoc_system;
use edoc_system;
create table edoc_category
(
    id   int(10) primary key auto_increment,
    name varchar(30) not null
) ENGINE = INNODB
  DEFAULT CHARSET = utf8;

create table edoc_entry
(
    id         int(10) primary key auto_increment,
    categoryId int(10)      not null,
    title      varchar(255) not null,
    summary    varchar(255),
    uploadUser varchar(255),
    createDate DATETIME     not null
) ENGINE = INNODB
  DEFAULT CHARSET = utf8;