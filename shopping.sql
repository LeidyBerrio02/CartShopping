create database shopping;
use shopping;

create table typePerson(
id_type_person int not null primary key auto_increment,
type_person varchar(45)
);

create table person(
id_person int not null primary key auto_increment,
first_name varchar(45),
last_name varchar(45),
type_person int,
constraint fk_typePerson foreign key (type_person) references typePerson(id_type_person)
);

create table product(
id_product int not null primary key auto_increment,
code varchar(45),
name_product varchar(45),
quantity int,
price double,
supplier int,
constraint fk_person foreign key (supplier) references person(id_person)
);

create table sale(
id_sale int not null primary key auto_increment,
date_sale date,
client int ,
constraint fk_client foreign key (client) references person(id_person)
);

show tables;

desc product;
select * from typeperson;
select * from person;
select * from product;
select * from sale;
select * from product_has_sale;

select  id_person ,c.first_name , t.type_person 
from person c
inner join typeperson t on t.id_type_person = c.type_person
where t.type_person = 'client';

select s.id_sale, s.date_sale , p.id_person , p.first_name , t.type_person , ps.product_id_product , pr.code , pr.name_product
from sale s 
inner join person p on s.client = p.id_person 	
inner join typeperson t on t.id_type_person = p.type_person
inner join product_has_sale ps on s.id_sale = ps.sale_id_sale
inner join product pr on pr.id_product = ps.product_id_product;

select *
from person c
inner join typeperson t on t.id_type_person = c.type_person
where t.type_person = 'client';

select *
from sale s 
inner join product_has_sale ps on s.id_sale = ps.sale_id_sale
inner join product pr on pr.id_product = ps.product_id_product;

select * from product p 
inner join product_has_sale ps on ps.product_id_product = p.id_product;

select * from product;
alter table product drop column supplier;


