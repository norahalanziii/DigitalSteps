drop database DigitalStep1;
create database DigitalStep1;
use DigitalStep1;

create table Administrative(
Admin_ID numeric (10)  primary key,
Fname  char(10) ,
Lname  char(10) ,
 Country text,
City text,
Zipcode char(5),
A_password varchar(45) not null,
phoneNumber varchar(15),
Username varchar(45) not null UNIQUE,
Email varchar (320) not null
);

#--------------------------------------

CREATE TABLE Player (
    Player_ID INT AUTO_INCREMENT,
    Fname CHAR(10) NOT NULL,
    Lname CHAR(10),
    email VARCHAR(100) NOT NULL,
    username VARCHAR(45) NOT NULL UNIQUE,
    P_password VARCHAR(45) NOT NULL,
    phonenumber VARCHAR(15),
    country TEXT,
    Plyer_Level CHAR(20) ,
    PRIMARY KEY (Player_ID)
) AUTO_INCREMENT = 100;


#--------------------------------------
CREATE TABLE lesson (
  lesson_id INT PRIMARY KEY,
  lesson_title VARCHAR(255),
  lesson_category VARCHAR(255)
);

#--------------------------------------

CREATE TABLE Question (
    question_id NUMERIC(10) PRIMARY KEY,
    question_type VARCHAR(30),
    Answer char(30) not null,
    lesson_id INT NOT NULL,
    FOREIGN KEY (lesson_id) REFERENCES lesson(lesson_id)
);
#-----------------------------------------------------------
CREATE TABLE Quiz(
    Quiz_ID int PRIMARY KEY,
    Quiz_Name VARCHAR(255),
    DescriptionQ VARCHAR(1000),
    quizLevel  VARCHAR(20),
    Qustion TEXT,
    Choice_A char(20),
    Choice_B  char(20),
    Choice_C char(20),
    Choice_D char(20),
    correct_anwser TEXT
    
);

#--------------------------------------

create table Administrative_Display_player(
Admin_ID numeric (10) ,
Player_ID INT NOT NULL,
primary key(Admin_ID,Player_ID)
);
alter table Administrative_Display_player add foreign key (Admin_ID) references Administrative (Admin_ID);
alter table Administrative_Display_player add foreign key (Player_ID) references Player (Player_ID);
#-------------------------------------
create table player_anwser_qustion(
question_id NUMERIC(10) ,
Player_ID INT NOT NULL,
Player_score int,
primary key(question_id,Player_ID)
);
alter table player_anwser_qustion add foreign key (question_id) references Question (question_id);
alter table player_anwser_qustion add foreign key (Player_ID) references Player (Player_ID);
#-------------------------------------
create table player_Take_lesson(
lesson_id INT NOT NULL ,
Player_ID INT NOT NULL,

primary key(lesson_id,Player_ID)
);
alter table player_Take_lesson add foreign key (lesson_id) references lesson (lesson_id);
alter table player_Take_lesson add foreign key (Player_ID) references Player (Player_ID);
#-------------------------------------
create table Administrative_Update_Quize(
Quiz_ID int ,
Admin_ID numeric (10) ,
primary key(Quiz_ID,Admin_ID)
);
alter table Administrative_Update_Quize add foreign key (Quiz_ID) references Quiz (Quiz_ID);
alter table Administrative_Update_Quize add foreign key (Admin_ID) references Administrative (Admin_ID);
#--------------------------------------
insert into Administrative 
values (2220000572,'Norah','Alanzi','Saudi Arabia','Dammam','12345','No1222$#8935','0551732744','NorahAlanzi.51','22200000572@iau.edu.sa'), 
( 2220000552 , 'Nada' ,'Alrashidi','Saudi Arabia','Dammam','33312','1115811Nn','0543559646','nada134','2220000552@iau.edu.sa'), 
( 2220001292 , 'Wajood' ,'Khalid','Saudi Arabia','Jubail',13067,'WKwk1234&','0540326426','WajoodK','2220001292@iau.edu.sa'),
(2220001372 , 'Waad' ,'Alshammari','Saudi Arabia','Jubail',35817,'6676Ww','0566989760','Waad5120','2220001372@iau.edu.sa'),
(2230040060 , 'Sarah' ,'Alhethily','Saudi Arabia','Khobar',34741,'Sa653','05646666514','sarah44','2230040060@iau.edu.sa'),
(2220001911,'Miad','Alosaimi','Saudi Arabia','Jubail','57689','Mia5678$','0545901215','Miah67','2220001911@iau.edu.sa'),
(2220003572 , 'Renad' ,'Alhktani','Saudi Arabia','Khobar',34767,'rr761',' 0559795009','renad0','2220003572@iau.edu.sa');
#-------------------------------------
insert into player 
values(101,'Maha','Mohamed','Maha@gmail.com','maha28','maha2003$','0540324624','Saudi Arabia','Beginner'),
(102,'Rash','Alghmdi','rash45676@gmail.com','rashz_44','Rasha567@$%','0551732677','Saudi Arabia',null),
(103,'Ghaida','AlQahtani','GhKhtani.66@gmail.com','Ghaidoo_566','khtanighid456&','0567600000','Saudi Arabia','intermediate'),
(104,'Shima','Alsaab','Shooshh.567@gmail.com','shosh_456','shoshso123456','0500067892','Saudi Arabia','Advanced'),
(105,'Ebhar','Alghmdi','Ebhar.679@gmail.com','Bobo_ty56','Ebhar5768#','0551230876','Saudi Arabia',null),
(106,'Lama','Khalid','lama.78@gmail.com','lmoosh_345','6lmlml875$','0567890001','Kwait','Beginner'),
(107,'Yousef','Almarri', 'yousef123@gmail.com', 'yousef_m4', 'yousef253', '0551122334', 'Saudi Arabia', 'Intermediate'),
(108,'Aisha', 'AlHashemi', 'aisha.hash@gmail.com', 'Ayosh_67', 'Ayosh_455$6', '0509988776', 'United Arab Emirates', 'Beginner'),
(109,'Ahmad', 'Alghmdi', 'ahmad.saud@gmail.com', 'ahmad_22', 'Ahmad7123423', '0566655778', 'Saudi Arabia', 'Advanced'),
(110,'Fatima', 'AlAli', 'fatima.a@gmail.com', 'fati_al', 'Ftoomh67%_67', '0544433221', 'Bahrain', 'Intermediate'),
(111,'Mohammed', 'AlQahtani', 'm.alqahtani@gmail.com', 'mohd_85', 'Mohd@2023', '0501122334', 'Saudi Arabia', 'Beginner'),
(112,'Sara', 'Almazrooei', 'sara.maz@gmail.com', 'sara_99', 'Sara#123789', '0557788990', 'United Arab Emirates', 'Advanced'),
(113,'Nasser', 'AlShamsi', 'nasser.123@gmail.com', 'nasser123', 'Nasser456', '0564433221', 'Oman', 'Beginner'),
(114,'Hessa', 'AlMansoori', 'hessa.mansoori@gmail.com', 'hessa_22', 'Hessa@33789', '0543322110', 'Qatar', 'Intermediate'),
(115,'Abdullah', 'AlAnzi', 'abdullah.ar@gmail.com', 'abdullah_99', 'Abdullah@3321', '0509988776', 'Saudi Arabia', 'Advanced'),
(116,'Noor', 'AlHammadi', 'noor.hammadi@gmail.com', 'noor_23', 'Noor12234', '0556655443', 'United Arab Emirates', 'Intermediate'),
(117,'Ali', 'AlFarsi', 'ali.farsi@gmail.com', 'ali_123', 'Ali@456', '0567788990', 'Saudi Arabia', 'Intermediate'),
(118,'Layla', 'AlQasimi', 'layla.qasimi@gmail.com', 'layla_22', 'LaylaQ789', '0504433221', 'United Arab Emirates', 'Beginner'),
(119,'Hassan', 'AlMulla', 'hassan.mulla@gmail.com', 'hassan_99', 'Hassan#321', '0549988776', 'Bahrain', 'Advanced'),
(120,'Shikhah', 'AlHajri', 'Shikhah.hajri@gmail.com', 'Shosho_56', 'Sh3345#sf@', '0551122334', 'Saudi Arabia', 'Advanced'),
(121,'Khalid', 'AlKuwari', 'khalid.kuwari@gmail.com', '123456HKH', 'Khalid@2023', '0566655778', 'Qatar', 'Intermediate');

#-------------------------------------
insert into lesson 
values(1101,'Lesson1','Beginner'),(1102,'Lesson2','Beginner'), (1103,'Lesson3','Beginner'), (1104,'Lesson4','Beginner'),
(1105,'Lesson5','Beginner'), (1106,'Lesson6','Beginner'), (1107,'Lesson7','Beginner'), (1108,'Lesson8','Beginner'), 
(1109,'Lesson9','Beginner'), (1110,'Lesson10','Beginner'), (1111,'Lesson11','Beginner'),(1112,'Lesson12','Beginner'),
(1113,'Lesson13','Beginner'),(1114,'Lesson14','Beginner'), (1115,'Lesson15','Beginner'),
(1116,'Lesson16','intermediate'),(1117,'Lesson17','intermediate'),(1118,'Lesson18','intermediate'), (1119,'Lesson19','intermediate'),(1120,'Lesson20','intermediate'),
(1121,'Lesson21','intermediate'),(1122,'Lesson22','intermediate'), (1123,'Lesson23','intermediate'),(1124,'Lesson24','intermediate'),
(1125,'Lesson25','intermediate'),(1126,'Lesson26','intermediate'),(1127,'Lesson27','intermediate'), (1128,'Lesson28','intermediate'),(1129,'Lesson29','intermediate'),
(1130,'Lesson30','intermediate'),
(1131,'Lesson31','Advanced'),
(1132,'Lesson32','Advanced'),(1133,'Lesson34','Advanced'), (1134,'Lesson35','Advanced'),(1135,'Lesson36','Advanced'),
(1136,'Lesson37','Advanced'),(1137,'Lesson38','Advanced'), (1138,'Lesson39','Advanced'),(1139,'Lesson40','Advanced'),
(1140,'Lesson41','Advanced'),(1141,'Lesson42','Advanced'), (1142,'Lesson43','Advanced'),(1143,'Lesson44','Advanced'),
(1144,'Lesson45','Advanced'),(1145,'Lesson46','Advanced'), (1146,'Lesson47','Advanced'),(1148,'Lesson48','Advanced'),
(1149,'Lesson49','Advanced'),(1150,'Lesson50','Advanced');
#------------------------------------------

INSERT INTO Question 
VALUES(101,'Q1_for beginner','C',1101),(102,'Q2_for beginner','B',1102),(103,'Q3_for beginner','A',1103),
(104,'Q4_for beginner','A',1104),(105,'Q5_for beginner','D',1105),(106,'Q6_for beginner','C',1106),
(107,'Q7_for beginner','A',1107),(108,'Q8_for beginner','C',1108),(109,'Q9_for beginner','A',1109),
(110,'Q10_for beginner','A',1110),(201,'Q1_for intermediate','A',1116),(202,'Q2_for intermediate','C',1117),
(203,'Q3_for intermediate','A',1118),(204,'Q4_for intermediate','A',1119),(205,'Q5_for intermediate','B',1120),
(206,'Q6_for intermediate','B',1121),(207,'Q7_for intermediate','B',1122),(208,'Q8_for intermediate','C',1123),
(209,'Q9_for intermediate','A',1124),(210,'Q10_for intermediate','B',1125),(301,'Q1_for advanced','A',1131),
(302,'Q2_for advanced','B',1132),(303,'Q2_for advanced','A',1133),(304,'Q4_for advanced','C',1134),
(305,'Q5_for advanced','C',1135),(306,'Q6_for advanced','B',1136),(307,'Q7_for advanced','A',1137),
(308,'Q8_for advanced','C',1138),(309,'Q9_for advanced','B',1139),(310,'Q10_for advanced','C',1140);
#-------------------------------------------
INSERT INTO Quiz 
VALUES (01, 'OOP in Java', 'Test your understanding of Java OOP concepts.', 'Advance', 'Which of the following is NOT a principle of OOP?', 'Inheritance', 'Encapsulation', 'Polymorphism', 'Abstraction', 'Choice_D'),
(02, 'Exception Handling in Java', 'Check your knowledge of Java exception handling.', 'Intermediate', 'What is the purpose of the "finally" block?', 'Handle', 'Execute', 'Terminate', 'Catch', 'Choice_B'),
(03, 'Java Collections Framework', 'Test your understanding of Java collections.', 'Intermediate', 'Which collection class provides a resizable array?', 'HashSet', 'HashMap', 'ArrayList', 'LinkedList', 'Choice_C'),
(04, 'Java Multithreading', 'Check your knowledge of Java multithreading concepts.', 'Advanced', 'What is a deadlock in Java multithreading?', 'Wait', 'Access', 'Terminate', 'Enter', 'Choice_A'),
(05, 'Java I/O', 'Test your understanding of Java input/output operations.', 'Intermediate', 'Which class in Java reads input from the keyboard?', 'Scanner', 'BufferedReader', 'InputStream', 'FileReader', 'Choice_A'),
(06, 'Java Generics', 'Check your knowledge of Java generic programming.', 'Advanced', 'What is the purpose of using generics?', 'Performance', 'Type Safety', 'Memory Usage', 'Code Syntax', 'Choice_B'),
(07, 'Java Lambda Expressions', 'Test your understanding of Java lambda expressions.', 'Intermediate', 'Which functional interface takes two arguments and returns a result?', 'Runnable', 'Consumer', 'Predicate', 'BiFunction', 'Choice_D'),
(08, 'Java Reflection', 'Check your knowledge of Java reflection API.', 'Advanced', 'Which class represents a class or interface in Java?', 'Field', 'Method', 'Constructor', 'Class', 'Choice_D'),
(09, 'Java Serialization', 'Test your understanding of Java object serialization.', 'Intermediate', 'Which interface should be implemented for object serialization in Java?', 'Serializable', 'Cloneable', 'Externalizable', 'Comparable', 'Choice_A');

#-----------------------------------------

INSERT INTO Administrative_Display_player (Admin_ID, Player_ID)
VALUES
(2220000572, 101),(2220000572, 102),(2220000552, 103),(2220001292, 104),
(2220001372, 105),(2230040060, 106),(2220001911, 107),(2220003572, 108),
(2220000572, 109),(2220000552, 110),(2220001292, 111),(2220001372, 112),
(2230040060, 113),(2220001911, 114),(2220003572, 115),(2220000572, 116),
(2220000552, 117),(2220001292, 118),(2220001372, 119),(2230040060, 120),(2220001911, 121);

#------------------------------------------
INSERT INTO player_anwser_qustion
VALUES(101, 101,'1'),(102, 106,'0'), (102,102,'0'),(103, 108, '1'), (104, 111, '1'), 
(105, 113, '0'), (106, 118,'0'), (201, 103, '1'),(202, 107, '1'), (203, 110, '1'), 
(204, 114, '1'), (205, 116,'0'),(206, 117, '1'), (207, 121, '1'), (301, 104, '1'),
 (302, 109, '1'), (303, 112,'1'), (304, 115, '0'), (305, 119, '1'),(306, 120, '1');

#---------------------------------------------
#instaed of taking the player ids that in spsific level, the inner join will enabels me to insert each player according to their level with the matching lesson level
INSERT INTO player_Take_lesson (lesson_id, Player_ID)
SELECT l.lesson_id, p.Player_ID
FROM Player p
INNER JOIN lesson l ON p.Plyer_Level = l.lesson_category;
#-----------------------------------------------
INSERT INTO Administrative_Update_Quize (Quiz_ID, Admin_ID)
VALUES
(01, 2220000572),(01, 2220000552),(01, 2220001292),
(01, 2220003572),(02, 2220000572),(02, 2220000552),
(02, 2220001911),(03, 2220000572),(03, 2220000552),
(03, 2220001292),(03, 2220001372),(03, 2230040060),
(05, 2220000572),(05, 2220000552),(05, 2220001292),
(05, 2220001372),(05, 2230040060),(05, 2220001911),
(05, 2220003572),(06, 2220000572),(06, 2220000552),
(07, 2220000572),(07, 2220000552),(07, 2220001292),
(07, 2230040060),(08, 2220001911),(09, 2220001292);
#----------------------------------------------

