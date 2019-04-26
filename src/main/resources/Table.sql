#############################单表单库测试##################

DROP DATABASE IF EXISTS test;
CREATE DATABASE test;
USE test;
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

CREATE TABLE customer_order (
    id INT NOT NULL AUTO_INCREMENT,
    amount INT NOT NULL default 0,
    adddate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
    updatedate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;