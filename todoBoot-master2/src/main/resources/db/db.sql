create schema tododb2;

create table task
(
  id          int auto_increment
    primary key,
  content     varchar(255) null,
  create_date datetime     null,
  description varchar(255) null,
  status      varchar(255) null,
  user_id     int          null
);
create table user
(
  id       int auto_increment
    primary key,
  email    varchar(255) null,
  password varchar(255) null,
  role     int          null,
  username varchar(255) null
);

