
INSERT INTO cdac_branch(branch_name,course_start,course_end) VALUES('DAC','2019-08-12','2020-02-01'),('DBDA','2019-07-09','2020-02-01'),('DITISS','2019-07-21','2020-02-01');

INSERT INTO student(student_name,student_email,student_age,student_gender,student_password,cdac_branch_id) VALUES('Pranjan','pranjan@gmail.com',23,'Male','1234',1);
INSERT INTO student(student_name,student_email,student_age,student_gender,student_password,cdac_branch_id) VALUES('Ashish','ashish@gmail.com',23,'Male','1234',1);
INSERT INTO student(student_name,student_email,student_age,student_gender,student_password,cdac_branch_id) VALUES('Pranav','pranav@gmail.com',23,'Male','1234',1);
INSERT INTO student(student_name,student_email,student_age,student_gender,student_password,cdac_branch_id) VALUES('Vaishnavi','vaishnavi@gmail.com',24,'Female','1234',1);


INSERT INTO bill(bill_amount,due_amount,bill_date,payment_status,student_id) VALUES(200,0,'2019-08-12','false',1),(300,0,'2019-08-21','false',1);

INSERT INTO menu(chapati, sabji, rice, dal, salad, sweet_dish, chatani, pickle) VALUES(4, 'tomato', 'boiled', 'normal', 'onion salad', 'shira', 'groundnut', 'mango');

INSERT INTO orderlist(order_student_id, order_menu_id,order_date) VALUES(1, 1, '2019-12-12'),(1, 1, '2019-11-12'),(2, 1,'2019-12-11');