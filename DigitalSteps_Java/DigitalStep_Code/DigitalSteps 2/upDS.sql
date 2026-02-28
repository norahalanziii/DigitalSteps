-- -- 
-- DROP TABLE  Administrative;
-- DROP TABLE Player;
-- DROP TABLE  lesson;
-- DROP TABLE  Question;
-- DROP TABLE  Player_ID_Sequence;
-- DROP TABLE  Administrative_Update_lesson_question;
-- DROP TABLE  Administrative_control_player;
CREATE TABLE   Administrative (
  Admin_ID NUMERIC(10) PRIMARY KEY,
  Fname CHAR(10),
  Lname CHAR(10),
  Country VARCHAR(255),
  City VARCHAR(255),
  Zipcode CHAR(5),
  A_password VARCHAR(45) NOT NULL,
  phoneNumber VARCHAR(15),
  Username VARCHAR(45) NOT NULL UNIQUE,
  Email VARCHAR(320) NOT NULL
);
-- Create the Player table
CREATE TABLE Player (
    Player_ID INT PRIMARY KEY,
    Fname CHAR(10) NOT NULL,
    Lname CHAR(10),
    email VARCHAR(100) NOT NULL,
    username VARCHAR(45) NOT NULL UNIQUE,
    P_password VARCHAR(45) NOT NULL,
    phonenumber VARCHAR(15),
    country VARCHAR(255),
    Plyer_Level CHAR(20)
);

-- Create the lesson table

CREATE TABLE Quiz (
    Quiz_ID INT PRIMARY KEY ,
    Quiz_Name VARCHAR(255) NOT NULL,
    Quiz_Description VARCHAR(300),
 Question_Text VARCHAR(100),
    Quiz_Level VARCHAR(20),
    Choice_A VARCHAR(255),
    Choice_B VARCHAR(255),
    Choice_C VARCHAR(255),
    Choice_D VARCHAR(255),
    Correct_Answer VARCHAR(255)
);
-- Create the lesson table
CREATE TABLE lesson (
  lesson_id INT PRIMARY KEY,
  lesson_title VARCHAR(255),
  lesson_description VARCHAR(1000),
  lesson_content VARCHAR(10000),
  lesson_category VARCHAR(255),
  creation_date DATE,
  Player_ID INT NOT NULL,
  FOREIGN KEY (Player_ID) REFERENCES Player(Player_ID)
);

-- Create the Administrative table
CREATE TABLE Administrative (
  Admin_ID NUMERIC(10) PRIMARY KEY,
  Fname CHAR(10),
  Lname CHAR(10),
  Country VARCHAR(255),
  City VARCHAR(255),
  Zipcode CHAR(5),
  A_password VARCHAR(45) NOT NULL,
  phoneNumber VARCHAR(15),
  Username VARCHAR(45) NOT NULL UNIQUE,
  Email VARCHAR(320) NOT NULL
);

-- Create the Question table
-- Create the Question table
CREATE TABLE Question (
    question_id NUMERIC(10) PRIMARY KEY,
    question_type VARCHAR(30),
    question_text VARCHAR(1000),
    Player_score NUMERIC(5,1),
    Player_ID INT NOT NULL,
    lesson_id INT NOT NULL,
    FOREIGN KEY (Player_ID) REFERENCES Player(Player_ID),
    FOREIGN KEY (lesson_id) REFERENCES lesson(lesson_id)
);

-- Create the Player_ID_Sequence table
-- Create the Player_ID_Sequence table
CREATE TABLE Player_ID_Sequence (
    ID INT NOT NULL,
    PRIMARY KEY (ID)
);

-- Insert an initial value into the sequence table
INSERT INTO Player_ID_Sequence (ID) VALUES (1);

-- Create the Administrative_Update_lesson_question table
CREATE TABLE Administrative_Update_lesson_question (
  lesson_id INT NOT NULL,
  question_id NUMERIC(10),
  Admin_ID NUMERIC(10),
  Update_time TIMESTAMP,
  PRIMARY KEY (lesson_id, question_id, Admin_ID),
  FOREIGN KEY (lesson_id) REFERENCES lesson(lesson_id),
  FOREIGN KEY (question_id) REFERENCES Question(question_id),
  FOREIGN KEY (Admin_ID) REFERENCES Administrative(Admin_ID)
);

-- Create the Administrative_control_player table
CREATE TABLE Administrative_control_player (
  Admin_ID NUMERIC(10),
  Player_ID INT NOT NULL,
  PRIMARY KEY (Admin_ID, Player_ID),
  FOREIGN KEY (Admin_ID) REFERENCES Administrative(Admin_ID),
  FOREIGN KEY (Player_ID) REFERENCES Player(Player_ID)
);
-- CREATE TABLE Administrative (
--   Admin_ID NUMERIC(10) PRIMARY KEY,
--   Fname CHAR(10),
--   Lname CHAR(10),
--   Country VARCHAR(255),
--   City VARCHAR(255),
--   Zipcode CHAR(5),
--   A_password VARCHAR(45) NOT NULL,
--   phoneNumber VARCHAR(15),
--   Username VARCHAR(45) NOT NULL UNIQUE,
--   Email VARCHAR(320) NOT NULL
-- );
-- -- create table Administrative(
-- -- Admin_ID numeric (10)  primary key,
-- -- Fname  char(10) ,
-- -- Lname  char(10) ,
-- --  Country text,
-- -- City text,
-- -- Zipcode char(5),
-- -- A_password varchar(45) not null,
-- -- phoneNumber varchar(15),
-- -- Username varchar(45) not null UNIQUE,
-- -- Email varchar (320) not null
-- -- );
-- -- 
-- -- insert into Administrative 
-- -- values (2220000572,'Norah','Alanzi','Saudi Arabia','Dammam','12345','No1222$#8935','0551732744','NorahAlanzi.51','22200000572@iau.edu.sa'), 
-- -- ( 2220000552 , 'Nada' ,'Alrashidi',' Saudi Arabia','Dammam','33312','1115811Nn','0543559646','nada134','2220000552@iau.edu.sa'), 
-- -- ( 2220001292 , 'Wajood' ,'Khalid',' Saudi Arabia','Jubail',13067,'WKwk1234&','0540326426','WajoodK','2220001292@iau.edu.sa'),
-- -- (2220001372 , 'Waad' ,'Alshammari',' Saudi Arabia','Jubail',35817,'6676Ww','0566989760','Waad5120','2220001372@iau.edu.sa'),
-- -- (2230040060 , 'Sarah' ,'Alhethily',' Saudi Arabia','Khobar',34741,'Sa653','05646666514','sarah44','2230040060@iau.edu.sa'),
-- -- (2220001911,'Miad','Alosaimi','Saudi Arabia','Jubail','57689','Mia5678$','0545901215','Miah67','2220001911@iau.edu.sa'),
-- -- (2220003572 , 'Renad' ,'Alhktani',' Saudi Arabia','Khobar',34767,'rr761',' 0559795009','renad0','2220003572@iau.edu.sa');
-- -- 
-- INSERT INTO Administrative
-- VALUES (2220000572, 'Norah', 'Alanzi', 'Saudi Arabia', 'Dammam', '12345', 'No1222$#8935', '0551732744', 'NorahAlanzi.51', '22200000572@iau.edu.sa'), 
--        (2220000552, 'Nada', 'Alrashidi', 'Saudi Arabia', 'Dammam', '33312', '1115811Nn', '0543559646', 'nada134', '2220000552@iau.edu.sa'), 
--        (2220001292, 'Wajood', 'Khalid', 'Saudi Arabia', 'Jubail', '13067', 'WKwk1234&', '0540326426', 'WajoodK', '2220001292@iau.edu.sa'),
--        (2220001372, 'Waad', 'Alshammari', 'Saudi Arabia', 'Jubail', '35817', '6676Ww', '0566989760', 'Waad5120', '2220001372@iau.edu.sa'),
--        (2230040060, 'Sarah', 'Alhethily', 'Saudi Arabia', 'Khobar', '34741', 'Sa653', '05646666514', 'sarah44', '2230040060@iau.edu.sa'),
--        (2220001911, 'Miad', 'Alosaimi', 'Saudi Arabia', 'Jubail', '57689', 'Mia5678$', '0545901215', 'Miah67', '2220001911@iau.edu.sa'),
--        (2220003572, 'Renad', 'Alhktani', 'Saudi Arabia', 'Khobar', '34767', 'rr761', '0559795009', 'renad0', '2220003572@iau.edu.sa');
-- -- 
-- -- CREATE TABLE Player (
-- --     Player_ID INT AUTO_INCREMENT,
-- --     Fname CHAR(10) NOT NULL,
-- --     Lname CHAR(10),
-- --     email VARCHAR(100) NOT NULL,
-- --     username VARCHAR(45) NOT NULL UNIQUE,
-- --     P_password VARCHAR(45) NOT NULL,
-- --     phonenumber VARCHAR(15),
-- --     country TEXT,
-- --     Plyer_Level CHAR(20),
-- --     PRIMARY KEY (Player_ID)
-- -- ) AUTO_INCREMENT = 100;
-- CREATE TABLE Player (
--     Player_ID INT AUTO_INCREMENT PRIMARY KEY,
--     Fname CHAR(10) NOT NULL,
--     Lname CHAR(10),
--     email VARCHAR(100) NOT NULL,
--     username VARCHAR(45) NOT NULL UNIQUE,
--     P_password VARCHAR(45) NOT NULL,
--     phonenumber VARCHAR(15),
--     country TEXT,
--     Plyer_Level CHAR(20)
-- );
-- 
-- -- 
-- -- CREATE TABLE lesson (
-- --   lesson_id INT PRIMARY KEY,
-- --   lesson_title VARCHAR(255),
-- --   lesson_description VARCHAR(1000),
-- --   lesson_content TEXT,
-- --   lesson_category VARCHAR(255),
-- --   creation_date DATE,
-- --   Player_ID INT NOT NULL,
-- --   FOREIGN KEY (Player_ID) REFERENCES Player(Player_ID)
-- -- );
-- 
--  CREATE TABLE lesson (
--   lesson_id INT PRIMARY KEY,
--   lesson_title VARCHAR(255),
--   lesson_description VARCHAR(1000),
--   lesson_content VARCHAR(max),
--   lesson_category VARCHAR(255),
--   creation_date DATE,
--   Player_ID INT NOT NULL,
--   FOREIGN KEY (Player_ID) REFERENCES Player(Player_ID)
-- );
-- 
-- -- 
-- -- CREATE TABLE Question (
-- --     question_id NUMERIC(10) PRIMARY KEY,
-- --     question_type VARCHAR(30),
-- --     question_text TEXT,
-- --     Player_score NUMERIC(5,1),
-- --     Player_ID INT NOT NULL,
-- --     lesson_id INT NOT NULL,
-- --     FOREIGN KEY (Player_ID) REFERENCES Player(Player_ID),
-- --     FOREIGN KEY (lesson_id) REFERENCES lesson(lesson_id)
-- -- );
-- CREATE TABLE Question (
--     question_id NUMERIC(10) PRIMARY KEY,
--     question_type VARCHAR(30),
--     question_text VARCHAR(max),
--     Player_score NUMERIC(5,1),
--     Player_ID INT NOT NULL,
--     lesson_id INT NOT NULL,
--     FOREIGN KEY (Player_ID) REFERENCES Player(Player_ID),
--     FOREIGN KEY (lesson_id) REFERENCES lesson(lesson_id)
-- );
-- 
-- -- 
-- -- create table Administrative_Update_lesson_qustion(
-- -- lesson_id INT NOT NULL ,
-- -- question_id numeric (10) ,
-- -- Admin_ID numeric (10),
-- -- Update_time datetime,
-- -- primary key (lesson_id,question_id,Admin_ID)
-- -- );
-- -- alter table Administrative_Update_lesson_qustion add foreign key (lesson_id) references Lesson (lesson_id);
-- -- alter table Administrative_Update_lesson_qustion add foreign key (question_id) references Question (question_id);
-- -- alter table Administrative_Update_lesson_qustion add foreign key (Admin_ID) references Administrative (Admin_ID);
-- CREATE TABLE Administrative_Update_lesson_qustion (
--   lesson_id INT NOT NULL,
--   question_id NUMERIC(10),
--   Admin_ID NUMERIC(10),
--   Update_time TIMESTAMP,
--   PRIMARY KEY (lesson_id, question_id, Admin_ID)
-- );
-- 
-- ALTER TABLE Administrative_Update_lesson_qustion ADD FOREIGN KEY (lesson_id) REFERENCES Lesson (lesson_id);
-- ALTER TABLE Administrative_Update_lesson_qustion ADD FOREIGN KEY (question_id) REFERENCES Question (question_id);
-- ALTER TABLE Administrative_Update_lesson_qustion ADD FOREIGN KEY (Admin_ID) REFERENCES Administrative (Admin_ID);
-- create table Administrative_control_player(
-- Admin_ID numeric (10) ,
-- Player_ID INT NOT NULL,
-- primary key(Admin_ID,Player_ID)
-- );
-- alter table Administrative_control_player add foreign key (Admin_ID) references Administrative (Admin_ID);
-- alter table Administrative_control_player add foreign key (Player_ID) references Player (Player_ID);
-- 
-- insert into player 
-- values(101,'Maha','Mohammed','Maha@gmail.com','maha28','maha2003$','0540324624','Saudi Arabia','Beginner'),
-- (102,'Rash','Alghmdi','rash45676@gmail.com','rashz_44','Rasha567@$%','0551732677','Saudi Arabia',null),
-- (103,'Ghaida','Alkhtani','GhKhtani.66@gmail.com','Ghaidoo_566','khtanighid456&','0567600000','Saudi Arabia','intermediate'),
-- (104,'Shima','Alsaab','Shooshh.567@gmail.com','shosh_456','shoshso123456','0500067892','Saudi Arabia','Advanced'),
-- (105,'Ebhar','Alghmdi','Ebhar.679@gmail.com','Bobo_ty56','Ebhar5768#','0551230876','Saudi Arabia',null),
-- (106,'Lama','Khalid','lama.78@gmail.com','lmoosh_345','6lmlml875$','0567890001','Kwait','Beginner');
-- 
-- insert into lesson values
-- (101,'Print Statements','This lesson teach the user how to print statements in Java', 'Lets start by a simple program that prints \"Hello World\" to the screen. Write this -> System.out.println(\"Hello World\");\n" + "Note: Pay attention to uppercse aand lowercase leplayertters, as well as spaces','Beginner','2024-03-26',101);