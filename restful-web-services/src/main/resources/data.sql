
INSERT INTO cdac_branch(branch_name,course_start,course_end) VALUES('DAC','2019-08-12','2020-02-01'),('DBDA','2019-07-09','2020-02-01'),('DITISS','2019-07-21','2020-02-01');

INSERT INTO student(first_name,last_name,student_email,student_dob,student_gender,student_password,cdac_branch_id,user_role) VALUES('Pranjan','Bhure','pranjan@gmail.com','1996-07-28','Male','1234',1,'Student');
INSERT INTO student(first_name,last_name,student_email,student_dob,student_gender,student_password,cdac_branch_id,user_role) VALUES('Ashish','Chopkar','ashish@gmail.com','1996-03-25','Male','1234',1,'Student');
INSERT INTO student(first_name,last_name,student_email,student_dob,student_gender,student_password,cdac_branch_id,user_role) VALUES('Pranav','Dhanvij','pranav@gmail.com','1996-09-21','Male','1234',1,'Student');
INSERT INTO student(first_name,last_name,student_email,student_dob,student_gender,student_password,cdac_branch_id,user_role) VALUES('Vaishnavi','Kulkarni','vaishnavi@gmail.com','1995-10-03','Female','1234',1,'Student');
INSERT INTO student(first_name,last_name,student_email,student_dob,student_gender,student_password,user_role) VALUES('Bhagwan','Niwdekar','bgnivdekar@gmail.com','1975-09-03','Male','1234','Admin');


INSERT INTO bill(bill_amount,due_amount,bill_date,payment_status,student_id) VALUES(200,0,'2019-08-12',1,1),(300,0,'2019-08-21',1,1);

INSERT INTO menu(chapati, sabji, rice, dal, salad, sweet_dish, chatani, pickle) VALUES(4, 'tomato', 'boiled', 'normal', 'onion salad', 'shira', 'groundnut', 'mango');

INSERT INTO orderlist(order_student_id, order_menu_id,order_date) VALUES(1, 1, '2019-12-12'),(1, 1, '2019-11-12'),(2, 1,'2019-12-11');