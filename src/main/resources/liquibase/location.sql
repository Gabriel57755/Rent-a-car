CREATE TABLE if not exists Location (
Id int not null primary key auto_increment,
Address varchar(255),
City varchar(255),
Manager_Id int,
Employers_Id int

);
