Drop database if exists trainingLoggerDatabase;
create database trainingLoggerDatabase;
use trainingLoggerDatabase;




Create table USERS (
USER_USERNAME VARCHAR(30) not null unique primary key,
USER_NAME varchar(30),
USER_PASSWORD varchar(55) not null);


Create table TRANINGSPROGRAMS (
TP_ID int auto_increment primary key,
TP_USER_USERNAME varchar(30),
FOREIGN KEY (TP_USER_ID) REFERENCES USERS(USER_USERNAME)
);
Create table EXERCISE (
EXERCISE_ID int auto_increment primary key,
EXERCISE_TP_ID int,
FOREIGN KEY (EXERCISE_TP_ID) REFERENCES TRANINGSPROGRAMS(TP_ID)
);
CReate table SETS (
SET_ID int auto_increment primary key,
SET_EXERCISE_ID int,
FOREIGN KEY (SET_EXERCISE_ID) REFERENCES EXERCISE(EXERCISE_ID)
);








