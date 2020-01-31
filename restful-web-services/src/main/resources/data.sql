
INSERT INTO cdac_branch(branch_name,course_start,course_end) VALUES('DAC','2019-08-12','2020-02-01'),('DBDA','2019-07-09','2020-02-01'),('DITISS','2019-07-21','2020-02-01');

INSERT INTO student(student_name,student_email,student_age,student_gender,student_password,cdac_branch_id) VALUES('Pranjan','pranjan@gmail.com',23,'Male','1234',1);
INSERT INTO student(student_name,student_email,student_age,student_gender,student_password,cdac_branch_id) VALUES('Ashish','ashish@gmail.com',23,'Male','1234',1);
INSERT INTO student(student_name,student_email,student_age,student_gender,student_password,cdac_branch_id) VALUES('Pranav','pranav@gmail.com',23,'Male','1234',1);
INSERT INTO student(student_name,student_email,student_age,student_gender,student_password,cdac_branch_id) VALUES('Vaishnavi','vaishnavi@gmail.com',24,'Female','1234',1);

INSERT INTO student(student_name,student_email,student_age,student_gender,student_password,cdac_branch_id) VALUES('Ram','ram@gmail.com',23,'Male','1234',2);
INSERT INTO student(student_name,student_email,student_age,student_gender,student_password,cdac_branch_id) VALUES('Aditi','aditi@gmail.com',25,'Female','1234',3);
INSERT INTO student(student_name,student_email,student_age,student_gender,student_password,cdac_branch_id) VALUES('Apurup','apurup@gmail.com',22,'Male','1234',1);
INSERT INTO student(student_name,student_email,student_age,student_gender,student_password,cdac_branch_id) VALUES('Punam','punam@gmail.com',24,'Female','1234',1);

INSERT INTO bill(bill_amount,due_amount,bill_date,payment_status,student_id) VALUES(200,0,'2019-08-12','false',1),(300,0,'2019-08-21','false',1);

INSERT INTO menu(chapati, sabji, rice, dal, salad, sweet_dish, chatani, pickle) VALUES(4, 'tomato', 'boiled', 'normal', 'onion salad', 'shira', 'groundnut', 'mango');
INSERT INTO menu(chapati, sabji, rice, dal, salad, sweet_dish, chatani, pickle) VALUES(4, 'bhindi', 'boiled', 'Special', 'onion salad', 'jalebi', 'groundnut', 'mango');
INSERT INTO orderlist(order_student_id, order_menu_id,order_date) VALUES(1, 1, '2019-12-12'),(1, 1, '2019-11-12'),(2, 1,'2019-12-11');




INSERT INTO bill(bill_amount,due_amount,bill_date,payment_status,student_id) VALUES(200,500,'2019-08-12','false',2),(100,600,'2019-08-21','false',3);
INSERT INTO bill(bill_amount,due_amount,bill_date,payment_status,student_id) VALUES(200,0,'2019-07-01','true',4),(250,0,'2019-06-21','true',5);
INSERT INTO bill(bill_amount,due_amount,bill_date,payment_status,student_id) VALUES(800,500,'2020-01-12','false',7),(100,700,'2020-01-21','false',6);
INSERT INTO bill(bill_amount,due_amount,bill_date,payment_status,student_id) VALUES(500,0,'2020-01-02','true',8);

INSERT INTO orderlist(order_student_id, order_menu_id,order_date) VALUES(3, 1, '2019-12-12'),(4, 1, '2019-11-12'),(5, 1,'2019-12-11');
INSERT INTO orderlist(order_student_id, order_menu_id,order_date) VALUES(6, 1, '2020-01-05'),(7, 1, '2020-01-12'),(8, 1,'2020-01-15');





