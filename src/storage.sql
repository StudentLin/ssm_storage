/* TEST */
drop database if exists test;

create database test character set utf8;

use test;

create table dept(
	dept_id int primary key auto_increment,
	dept_name varchar(50),
	dept_address varchar(50)	
);

insert into dept(dept_name, dept_address) values('�з�1����','����');
insert into dept(dept_name, dept_address) values('�з�2����','�㶫');

select * from dept;



drop database if exists SSM_STORAGE;

create database SSM_STORAGE default character set utf8;

use SSM_STORAGE;

drop table if exists supplier;


/*============================*/
/* Table: ����Ա��ṹ 		  */
/*============================*/
create table account
(
   /* ����Ա���,�Զ����� */
   acc_id                  int not null auto_increment,
   /* ����Ա��¼��  */
   acc_login               varchar(20),
   /* ����Ա����  */
   acc_name                varchar(20),
   /* ����Ա���� */
   acc_pass                varchar(20),
   /* ���ñ��Ϊ���� */
   primary key (acc_id)
);

/*==============================================================*/
/* Table: ��Ӧ�̱�	                                        */
/*==============================================================*/

create table supplier
(
   sup_id               int not null auto_increment,
   sup_name             varchar(20),
   sup_linkman          varchar(20),
   sup_phone            varchar(11),
   sup_address          varchar(100),
   sup_remark           varchar(200),
   primary key (sup_id)
);

/* ��ӹ���Ա����, */
insert into account (acc_login,acc_pass) values ('admin','admin');
insert into account (acc_login,acc_pass) values ('admin2','admin2');
/* ��ӹ�Ӧ������, */
insert into supplier (sup_name,sup_linkman,sup_phone,sup_address,sup_remark) values ('ƻ����Ӧ��','С��','12388888887','���ݻ���','��ͨ��Ӧ��');
insert into supplier (sup_name,sup_linkman,sup_phone,sup_address,sup_remark) values ('���ǹ�Ӧ��','С��','12388888888','��������','��ͨ��Ӧ��');
insert into supplier (sup_name,sup_linkman,sup_phone,sup_address,sup_remark) values ('��Ϊ��Ӧ��','С��','12388888889','�㶫����','һ����Ӧ��');


select * from account;
select * from supplier;
select * from aaa;
select * from bVb;