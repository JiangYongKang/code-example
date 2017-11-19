drop database if exists vincent;
create database vincent;

drop table if exists system_account;
create table system_account (
  id varchar(64) not null primary
);
