create table if not exists user(
    id int(11) auto_increment,
    name varchar(100) not null ,
    age int(3) not null ,
    primary key (id)
    );
insert into user(name, age)
values ('张三',15),
       ('王五',18),
       ('李四',19);
insert into user(name, age)
values ('张三',15),
       ('王五',18),
       ('李四',19);
insert into user(name, age)
values ('张三',15),
       ('王五',18),
       ('李四',19);
insert into user(name, age)
values ('张三',15),
       ('王五',18),
       ('李四',19);
commit ;