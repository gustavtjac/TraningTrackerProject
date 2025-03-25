Drop database if exists trainingLoggerDatabase;
create database trainingLoggerDatabase;
use trainingLoggerDatabase;




Create table USERS (
USER_ID int auto_increment primary key,
USER_USERNAME VARCHAR(30) not null unique,
USER_PASSWORD varchar(55) not null);

Create table TRANINGSPROGRAMS (
TP_ID int auto_increment primary key,
TP_USER_ID int,
FOREIGN KEY (TP_USER_ID) REFERENCES USERS(USER_ID)
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








