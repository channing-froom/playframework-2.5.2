# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table location_types (
  id                            integer auto_increment not null,
  label                         varchar(255) not null,
  slug                          varchar(255) not null,
  description                   varchar(255),
  constraint uq_location_types_label unique (label),
  constraint uq_location_types_slug unique (slug),
  constraint pk_location_types primary key (id)
);

create table locations (
  id                            integer auto_increment not null,
  name                          varchar(255),
  constraint pk_locations primary key (id)
);

create table oauth (
  id                            integer auto_increment not null,
  user_id                       integer not null,
  application_type_id           integer not null,
  token                         varchar(255) not null,
  active                        integer,
  constraint pk_oauth primary key (id)
);

create table users (
  id                            integer auto_increment not null,
  user_type_id                  integer not null,
  first_name                    varchar(255) not null,
  last_name                     varchar(255) not null,
  email                         varchar(255),
  constraint uq_users_email unique (email),
  constraint pk_users primary key (id)
);


# --- !Downs

drop table if exists location_types;

drop table if exists locations;

drop table if exists oauth;

drop table if exists users;

