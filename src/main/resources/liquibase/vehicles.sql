CREATE TABLE if not exists Vehicle (
    Id int not null primary key auto_increment,
    Model            varchar(255),
    Color            varchar(255),
    Series           varchar(255),
    YearOfProduction date,
    Price double,
    Status enum('Available','Unavailable'),
    Customers_Id int,
    Location_Id int

);


