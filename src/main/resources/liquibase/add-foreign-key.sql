ALTER TABLE order add FOREIGN KEY (Customers_Id) REFERENCES Customers(Id);
ALTER TABLE order add FOREIGN KEY (Location_Id) REFERENCES Location(Id);
ALTER TABLE order add FOREIGN KEY (Manager_Id) REFERENCES Location(Id);
ALTER TABLE order add FOREIGN KEY (Employers_Id) REFERENCES Location(Id);
