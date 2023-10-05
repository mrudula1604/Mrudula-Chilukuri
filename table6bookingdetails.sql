use deccan_airlines; 
create table booking_details
(
booking_id int Primary Key,
booking_date datetime,
total_amount int,
passenger_ID int,
flight_ID int,
discount_code int,
cancellation_ID int,
foreign key (passenger_ID) references passenger_details(passenger_ID),
foreign key(flight_ID) references flight_details (flight_ID),
foreign key(discount_code) references discount_details(discount_code),
foreign key(cancellation_ID) references cancellation_details(cancellation_ID)
);