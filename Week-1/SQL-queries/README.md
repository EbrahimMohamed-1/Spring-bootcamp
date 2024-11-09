# 50 SQL questions
## Table of contents
* ### [`Easy`](#easy)
* ### [`Medium`](#medium)
*  ### [`Advanced`](#advanced) 

<br/>

### start by running the readymade SQL scripts to create the test data. These scripts include a sample Worker table, a Bonus, and a Title table with pre-filled data
<br/>

``` sql
CREATE TABLE Worker (
    WORKER_ID INT NOT NULL PRIMARY KEY,
    FIRST_NAME CHAR(25),
    LAST_NAME CHAR(25),
    SALARY INT,
    JOINING_DATE DATETIME,
    DEPARTMENT CHAR(25)
);

INSERT INTO Worker (WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
    (1, 'Monika', 'Arora', 100000, '2021-02-20 09:00:00', 'HR'),
    (2, 'Niharika', 'Verma', 80000, '2021-06-11 09:00:00', 'Admin'),
    (3, 'Vishal', 'Singhal', 300000, '2021-02-20 09:00:00', 'HR'),
    (4, 'Amitabh', 'Singh', 500000, '2021-02-20 09:00:00', 'Admin'),
    (5, 'Vivek', 'Bhati', 500000, '2021-06-11 09:00:00', 'Admin'),
    (6, 'Vipul', 'Diwan', 200000, '2021-06-11 09:00:00', 'Account'),
    (7, 'Satish', 'Kumar', 75000, '2021-01-20 09:00:00', 'Account'),
    (8, 'Geetika', 'Chauhan', 90000, '2021-04-11 09:00:00', 'Admin');

CREATE TABLE Bonus (
    WORKER_REF_ID INT,
    BONUS_AMOUNT INT,
    BONUS_DATE DATETIME,
    FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID) ON DELETE CASCADE
);

INSERT INTO Bonus (WORKER_REF_ID, BONUS_AMOUNT, BONUS_DATE) VALUES
    (1, 5000, '2023-02-20'),
    (2, 3000, '2023-06-11'),
    (3, 4000, '2023-02-20'),
    (1, 4500, '2023-02-20'),
    (2, 3500, '2023-06-11');

CREATE TABLE Title (
    WORKER_REF_ID INT,
    WORKER_TITLE CHAR(25),
    AFFECTED_FROM DATETIME,
    FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID) ON DELETE CASCADE
);

INSERT INTO Title (WORKER_REF_ID, WORKER_TITLE, AFFECTED_FROM) VALUES
    (1, 'Manager', '2023-02-20 00:00:00'),
    (2, 'Executive', '2023-06-11 00:00:00'),
    (8, 'Executive', '2023-06-11 00:00:00'),
    (5, 'Manager', '2023-06-11 00:00:00'),
    (4, 'Asst. Manager', '2023-06-11 00:00:00'),
    (7, 'Executive', '2023-06-11 00:00:00'),
    (6, 'Lead', '2023-06-11 00:00:00'),
    (3, 'Lead', '2023-06-11 00:00:00');
    
```

<br/>


## Questions & answers

<br/>

## Easy

#### 1. Write an SQL query to fetch “FIRST_NAME” from the Worker table using the alias name <WORKER_NAME>.
``` sql
SELECT FIRST_NAME FROM worker AS WORK_NAME;
```
<!-- ![View](https://github.com/ebrahimMohamed11/ava-boot-camp/Week-1/SQL-queries/output) -->

<br/><br/>

#### 2. Write an SQL query to fetch “FIRST_NAME” from the Worker table in upper case.
``` sql
SELECT UPPER(FIRST_NAME) FROM worker;
```
Another sol:
``` sql
SELECT UCASE(FIRST_NAME) FROM worker;
```
<!-- ![View](https://github.com/ebrahimMohamed11/ava-boot-camp/Week-1/SQL-queries/output) -->

<br/><br/>

#### 3. Write an SQL query to fetch unique values of DEPARTMENT from the Worker table.
``` sql
SELECT DISTINCT DEPARTMENT FROM worker;
```
<!-- ![View](https://github.com/ebrahimMohamed11/ava-boot-camp/Week-1/SQL-queries/output) -->

<br/><br/>

#### 4. Write an SQL query to print the first three characters of  FIRST_NAME from the Worker table.
``` sql
SELECT substring(FIRST_NAME, 1, 3) FROM worker;
```
Anothor sol:
``` sql
SELECT SUBSTR(FIRST_NAME, 1, 3) FROM worker;
```
<br/><br/>

#### 5.  Write an SQL query to find the position of the alphabet (‘a’) in the first name column ‘Amitabh’ from the Worker table.
``` sql
SELECT INSTR(FIRST_NAME, 'a') FROM Worker WHERE FIRST_NAME = 'Amitabh';
```
Another sol:
```sql
SELECT INSTR('Amitabh', 'a');
```
Another sol:
```sql
SELECT POSITION('a' IN 'Amitabh');
```
<br/><br/>

#### 6. Write an SQL query to print the FIRST_NAME from the Worker table after removing white spaces from the right side.
``` sql
SELECT RTRIM(FIRST_NAME) FROM Worker;
```
<br/><br/>

#### 7. Write an SQL query to print the DEPARTMENT from the Worker table after removing white spaces from the left side.
``` sql
SELECT TRIM(DEPARTMENT) FROM worker;
```
<br/><br/>

#### 8. Write an SQL query that fetches the unique values of DEPARTMENT from the Worker table and prints its length.
``` sql
SELECT DISTINCT DEPARTMENT, LENGTH(DEPARTMENT) FROM worker;
```
Another sol;
``` sql 
SELECT DISTINCT DEPARTMENT, CHAR_LENGTH(DEPARTMENT) FROM worker;
```

<br/><br/>

#### 9. Write an SQL query to print the FIRST_NAME from the Worker table after replacing ‘a’ with ‘A’.
``` sql
SELECT REPLACE(FIRST_NAME , 'a', 'A') FROM worker;
```
<br/><br/>

#### 10. Write an SQL query to print the FIRST_NAME and LAST_NAME from the Worker table into a single column COMPLETE_NAME. A space char should separate them.
``` sql 
SELECT CONCAT(FIRST_NAME,' ' ,LAST_NAME) FROM worker as COMPLETE_NAME; /*supported by MySQL*/
```
Another sol:
``` sql
SELECT FIRST_NAME || ' ' || LAST_NAME AS COMPLETE_NAME FROM Worker; /*supported by Oracle, PostgreSQL and SQLite*/
```
<br/><br/>

#### 11. Write an SQL query to print all Worker details from the Worker table order by FIRST_NAME Ascending.
``` sql
SELECT * FROM worker ORDER BY FIRST_NAME ASC;
```
<br/><br/>

#### 12. Write an SQL query to print all Worker details from the Worker table order by FIRST_NAME Ascending and DEPARTMENT Descending.
``` sql
SELECT * FROM worker ORDER BY FIRST_NAME ASC , DEPARTMENT DESC ;
```
<br/><br/>

#### 13. Write an SQL query to print details for Workers with the first names “Vipul” and “Satish” from the Worker table.
``` sql
SELECT * FROM worker WHERE FIRST_NAME IN ('Vipul' , 'Satish') ;
```
<br/><br/>

#### 14. Write an SQL query to print details of workers excluding first names, “Vipul” and “Satish” from the Worker table.
``` sql
SELECT * FROM worker WHERE FIRST_NAME NOT IN ('Vipul' , 'Satish') ;
```
<br/><br/>

#### 15. Write an SQL query to print details of Workers with DEPARTMENT name as “Admin”.
``` sql
SELECT * FROM worker WHERE DEPARTMENT LIKE 'Admin%';
```
<br/><br/>

#### 16. Write an SQL query to print details of the Workers whose FIRST_NAME contains ‘a’.
``` sql
SELECT * FROM worker WHERE FIRST_NAME LIKE '%a%';
```
<br/><br/>

#### 17.  Write an SQL query to print details of the Workers whose FIRST_NAME ends with ‘a’.
``` sql
SELECT * FROM worker WHERE FIRST_NAME LIKE '%a';
```
<br/><br/>

#### 18.  Write an SQL query to print details of the Workers whose FIRST_NAME ends with ‘h’ and contains six alphabets.
``` sql
SELECT FIRST_NAME FROM worker WHERE FIRST_NAME LIKE '_____h%';
```
<br/><br/>

#### 19. Write an SQL query to print details of the Workers whose SALARY lies between 100000 and 500000.
``` sql
SELECT * FROM worker WHERE SALARY BETWEEN 100000 AND 500000;
```
<br/><br/>

#### 20. Write an SQL query to print details of the Workers who joined in Feb 2021.
``` sql
SELECT * FROM worker WHERE DATE_FORMAT(JOINING_DATE, '%Y')= '2021' AND DATE_FORMAT(JOINING_DATE,'%m' )='02';
```
<br/><br/>

## Medium

#### 21. Write an SQL query to fetch the count of employees working in the department ‘Admin’.
``` sql
SELECT COUNT(*) as Admin FROM worker WHERE DEPARTMENT='Admin';
```
<br/><br/>

#### 22. Write an SQL query to fetch worker names with salaries >= 50000 and <= 100000.
``` sql
SELECT FIRST_NAME, LAST_NAME AS name FROM worker WHERE SALARY  BETWEEN 5000 AND 100000;
```
<br/><br/>

### 23.  Write an SQL query to fetch the number of workers for each department in descending order.
``` sql
SELECT COUNT(WORKER_ID) as workersGrouping FROM worker GROUP BY DEPARTMENT ORDER BY workersGrouping ;
```
<br/><br/>

#### 24. Write an SQL query to print details of the Workers who are also Managers
``` sql
SELECT DISTINCT CONCAT(FIRST_NAME, ' ' , LAST_NAME),WORKER_TITLE FROM Worker
INNER JOIN title  ON worker.WORKER_ID = title.WORKER_REF_ID AND title.WORKER_TITLE LIKE 'Manager';
```
<br/><br/>

#### 25. Write an SQL query to fetch duplicate records having matching data in some fields of a title table.
``` sql
SELECT WORKER_TITLE, AFFECTED_FROM, COUNT(*) FROM Title GROUP BY WORKER_TITLE, AFFECTED_FROM HAVING COUNT(*) > 1;
```
<br/><br/>

#### 26. Write an SQL query to show only odd rows from a table.
``` sql
SELECT * FROM worker WHERE WORKER_ID % 2 !=0;
```
<br/><br/>

#### 27. Write an SQL query to show only even rows from a table
``` sql
SELECT * FROM worker WHERE WORKER_ID % 2 =0;
```
<br/><br/>

#### 28. Write an SQL query to clone a new table from another table.
``` sql
CREATE TABLE WorkerClone AS SELECT * FROM Worker;
```
<br/><br/>

#### 29. Write an SQL query to fetch intersecting records of two tables.
``` sql
SELECT * FROM worker INNER JOIN workerclone WHERE worker.WORKER_ID=workerclone.WORKER_ID;
```
<br/><br/>

#### 30. Write an SQL query to show records from one table that another table does not have.
``` sql
SELECT *FROM worker LEFT JOIN workerclone ON worker.WORKER_ID = workerclone.WORKER_ID WHERE workerclone.WORKER_ID IS NULL;
```
<br/><br/>

#### 31.  Write an SQL query to show the current date and time.
``` sql 
SELECT CURRENT_TIMESTAMP(); 
```
<br/><br/>

#### 32. Write an SQL query to show the top n (say 10) records of a table.
``` sql
SELECT * FROM worker LIMIT 3;
```
<br/><br/>

## Advanced
<br/>

#### 33. Write an SQL query to determine the nth (say n=5) highest salary from a table.
``` sql
SELECT DISTINCT SALARY FROM Worker ORDER BY SALARY DESC LIMIT 1 OFFSET 4;
```
<br/><br/>

#### 34.  Write an SQL query to determine the 5th highest salary without using the TOP or limit method.
``` sql 
SELECT Salary FROM Worker W1 WHERE 4 = (SELECT COUNT(DISTINCT W2.Salary) FROM Worker W2 WHERE W2.Salary >= W1.Salary;
/* spicfic salary from outer query w1 compared with all salary from w2 in the inner query*/
```
<br/><br/>

#### 35. Write an SQL query to fetch the list of employees with the same salary.
``` sql
SELECT distinct W.WORKER_ID, W.FIRST_NAME, W.Salary from Worker W, Worker W1 
where W.Salary = W1.Salary and W.WORKER_ID != W1.WORKER_ID;
```
<br/><br/>

#### 36. Write an SQL query to show the second-highest salary from a table.
``` sql
SELECT DISTINCT SALARY FROM worker ORDER BY SALARY DESC LIMIT 1 OFFSET 1;
```
Another sol:
``` sql
SELECT DISTINCT w1.SALARY FROM worker as w1 WHERE 2= (SELECT COUNT(DISTINCT w2.SALARY) FROM worker as w2 
WHERE w2.SALARY >= w1.SALARY)
```
Another sol:
``` sql
SELECT MAX(SALARY) FROM worker WHERE SALARY NOT in (SELECT MAX(SALARY) FROM worker);/* You can use "like" */
```

<br/><br/>

#### 37. Write an SQL query to show one row twice in the results from a table.
``` sql
SELECT * FROM worker UNION ALL SELECT * FROM worker;
```
<br/><br/>

#### 38. Write an SQL query to fetch intersecting records of two tables.
``` sql
SELECT * FROM worker INNER JOIN workerclone On worker.WORKER_ID=workerclone.WORKER_ID;
```
<br/><br/>

#### 39. Write an SQL query to fetch the first 50% of records from a table.
``` sql
SELECT * FROM worker WHERE WORKER_ID <= (SELECT COUNT(WORKER_ID)/2 FROM worker);
```
<br/><br/>

#### 40. Write an SQL query to fetch the departments that have less than five people in them.
``` sql
SELECT DEPARTMENT , COUNT(DEPARTMENT) FROM worker GROUP BY DEPARTMENT HAVING COUNT(DEPARTMENT)< 5;
```
<br/><br/>

#### 41. Write an SQL query to show all departments along with the number of people in there.
``` sql
 SELECT DEPARTMENT, COUNT(DEPARTMENT) FROM worker GROUP BY DEPARTMENT ORDER BY COUNT(DEPARTMENT) DESC /*order by not required*/
 ```
 <br/><br/>

 #### 42. Write an SQL query to show the last record from a table.
 ``` sql
 SELECT * FROM worker WHERE WORKER_ID= (SELECT COUNT(WORKER_ID) FROM worker);
 ```
 Another sol;
 ``` sql
 SELECT * FROM Worker WHERE WORKER_ID = (SELECT max(WORKER_ID) FROM Worker);
 ```

 <br/><br/>

 #### 43. Write an SQL query to fetch the first row of a table.
 ``` sql
 SELECT * FROM worker LIMIT 1;
 ```
 Another sol;
 ``` sql
 SELECT * FROM worker WHERE WORKER_ID=(SELECT MIN(WORKER_ID) FROM worker);
 ```
 <br/><br/>

 #### 44.  Write an SQL query to fetch the last five records from a table.
 ``` sql 
 Write an SQL query to fetch the last five records from a table.
 ```
<br/><br/>

#### 45. Write an SQL query to print the names of employees having the highest salary in each department.
``` sql
SELECT FIRST_NAME, MAX(SALARY), DEPARTMENT FROM worker GROUP BY DEPARTMENT;
```
Another sol:
``` sql
/* If max salary duplication requierd*/
SELECT t.DEPARTMENT, t.FIRST_NAME, t.Salary from (SELECT max(Salary) as TotalSalary, DEPARTMENT 
from Worker group by DEPARTMENT)as TempNew 
Inner Join Worker t on TempNew.DEPARTMENT = t.DEPARTMENT and TempNew.TotalSalary = t.Salary;
```
<br/><br/>

#### 46. Write an SQL query to fetch three max salaries from a table.
``` sql
SELECT DISTINCT SALARY FROM worker ORDER BY SALARY DESC LIMIT 3;
```
Another sol:
``` sql
SELECT distinct Salary from Worker a WHERE 3 >= (SELECT count(distinct Salary)
from Worker b WHERE a.Salary <= b.Salary) order by a.Salary desc;
```
<br/><br/>

#### 47. Write an SQL query to fetch three min salaries from a table.
``` sql
SELECT SALARY FROM worker ORDER BY SALARY ASC LIMIT 3;
```
<br/><br/>

#### 48. Write an SQL query to fetch nth max salaries from a table.
``` sql
/*Set 4 as n*/
SELECT DISTINCT SALARY FROM worker AS w1 WHERE 4 = ( SELECT  DISTINCT COUNT(SALARY)
 FROM worker as w2 WHERE w1.SALARY <w2.SALARY);
```
<br/><br/>

#### 49.Write an SQL query to fetch departments along with the total salaries paid for each of them.
``` sql
SELECT DEPARTMENT, SUM(SALARY) FROM worker GROUP BY DEPARTMENT;
```
<br/><br/>

#### 50.Write an SQL query to fetch the names of workers who earn the highest salary.
``` sql
SELECT FIRST_NAME, SALARY FROM Worker WHERE SALARY=(SELECT max(SALARY) from Worker);
```
<br/><br/><br/>







