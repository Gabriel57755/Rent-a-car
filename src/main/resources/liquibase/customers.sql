CREATE TABLE if not exists Customers (
  Id int not null primary key auto_increment ,
  LastName varchar(255),
  FirstName varchar(255),
  Address varchar(255),
  City varchar(255),
  Email varchar(255)
);

