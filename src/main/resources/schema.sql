use db1;
DROP TABLE IF exists userTable;
create table userTable(account_number int AUTO_INCREMENT PRIMARY KEY, firstName varchar(50),lastName varchar(50), contact varchar(10),dOB int, email varchar(20), password varchar(15), accountType varchar(15));