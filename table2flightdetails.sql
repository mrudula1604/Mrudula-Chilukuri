use deccan_airlines;
create table flight_details 
(
flight_ID int Primary Key, 
origin varchar(50),
destination varchar(100),
dept_time datetime,
arr_time datetime,
aircraft_ID int,
dept_date datetime,
num_of_layovers int
);