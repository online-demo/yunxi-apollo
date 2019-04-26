#############################Mycat测试demo##################

#######################不分库不分表###############################
DROP DATABASE IF EXISTS mycat01;
CREATE DATABASE mycat01;
USE mycat01;
 CREATE TABLE customer (
  id INT NOT NULL AUTO_INCREMENT COMMENT '客户id',
  name VARCHAR(20) DEFAULT '' COMMENT '客户姓名',
  phone VARCHAR(11) DEFAULT '' COMMENT '客户手机号',
  adddate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  updatedate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE item (
    id INT NOT NULL AUTO_INCREMENT,
    value INT NOT NULL default 0,
    adddate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
    updatedate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

#######################分库不分表###############################
DROP DATABASE IF EXISTS mycat02;
CREATE DATABASE mycat02;
USE mycat02;
 CREATE TABLE item (
    id INT NOT NULL AUTO_INCREMENT,
    value INT NOT NULL default 0,
    adddate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
    updatedate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


#######################分库分表###############################
DROP DATABASE IF EXISTS mycat03;
CREATE DATABASE mycat03;
USE mycat03;
CREATE TABLE item (
    id INT NOT NULL AUTO_INCREMENT,
    value INT NOT NULL default 0,
    adddate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
    updatedate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE customer_order1 (
    id INT NOT NULL AUTO_INCREMENT,
    amount INT NOT NULL default 0,
    adddate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
    updatedate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE customer_order2 (
    id INT NOT NULL AUTO_INCREMENT,
    amount INT NOT NULL default 0,
    adddate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
    updatedate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE customer_order3 (
    id INT NOT NULL AUTO_INCREMENT,
    amount INT NOT NULL default 0,
    adddate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
    updatedate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;













######################MYSQL插入demo##########################
USE TESTDB;

insert into customer(name,phone) values('yunxi','11111111111');

insert into customer(name,phone) values('wushuang','22222222222');

select * from customer;

insert into item(id,value) values(1,100);

insert into item(id,value) values(2,200);

insert into item(id,value) values(3,300);

select * from item;

insert into customer_order(id,amount) values(1,100);

insert into customer_order(id,amount) values(2,200);

insert into customer_order(id,amount) values(3,300);

select * from customer_order;



