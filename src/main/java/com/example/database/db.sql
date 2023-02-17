drop database if exists ssm_db;
create database ssm_db;
use ssm_db;

drop table if exists tbl_book;
create table tbl_book(
    id int not null primary key auto_increment,
    type varchar(255) not null,
    name varchar(255) not null,
    description varchar(255) not null
);

insert into
    tbl_book(type, name, description)
values
    ("计算机理论", "Spring实战第5版", "Spring入门经典教程，深入理解Spring原理技术内幕"),
    ("计算机理论", "Spring 5核心原理与30个类手写实战", "Spring入门经典教程，深入理解Spring原理技术内幕"),
    ("计算机理论", "Spring 5设计模式", "深入Spring源码剖析Spring源码中蕴含的10大设计模式"),
    ("计算机理论", "Spring MVC + MyBatis开发从入门到项目实战", "Spring入门经典教程，深入理解Spring原理技术内幕"),
    ("计算机理论", "轻量级Java Web企业应用实战", "源码级剖析Spring框架，适合已掌握Java基础的读者"),
    ("计算机理论", "Java核心技术卷|基础知识(原书第11版)", "Core Java第11版，Jolt大奖获奖作品，针对Java SE9、10、11全面更新"),
    ("计算机理论", "深入理解Java虚拟机", "5个维度全面剖析JVM,厂面试知识点全覆盖"),
    ("计算机理论", "Java编程思想(第4版)", "Java学习必读经典殿堂级著作!赢得了全球程序员的广泛赞誉"),
    ("计算机理论", "零基础学Java (全彩版)", "零基础自学编程的入]图书，由浅入深，详解Java语言的编程思想和核心技术"),
    ("市场营销", "直播就该这么做:主播高效沟通实战指南", "李子柒、李佳琦、薇娅成长为网红的秘密都在书中"),
    ("市场营销", "直播销讲实战一本通", "和秋叶一起学系列网络营销书籍"),
    ("市场营销", "直播带货:淘宝、天猫直播从新手到高手", "一本教你如何玩转直播的书， 10堂课轻松实现带货月入3W+");











