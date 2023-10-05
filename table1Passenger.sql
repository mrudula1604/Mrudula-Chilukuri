use Deccan_airlines;
create table passenger_details
(
Passenger_ID int Primary Key, 
Passenger_Name varchar (50),
Address varchar (100),
Mobile_Number varchar (20),
Email varchar (50),
Passport_number int,
Gender varchar (20), passenger_details
unique (Passport_number)
);