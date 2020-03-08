My intention for creating this project is to configure a springboot application with mysql database so that I do not have to spend each time for database related application each and every time.
-----------------------------------------------------

My Environment:
windows 10 home
64 bit os,x64-based processor 

In my local system:
F:\AllSpringApplWorkspaces\SpringHibernateWorkspace\springboot-mysql-jpa



I had created this project from spring initialiser by selecting devtools,spring web,jpa,mysql

Just after impotrting this project I tried to run this applicatin and got the below error.

APPLICATION FAILED TO START
***************************

Description:

Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.

Reason: Failed to determine a suitable driver class

In order to fix the above ,I just added the correct properties in the application.properties file and then I got the below issue

java.sql.SQLSyntaxErrorException: Unknown database 'demodb'
spring.datasource.url=jdbc:mysql://localhost:3306/demodb?useSSL=false

So I just connected to the mysql db and created the db with name demodb
CREATE SCHEMA `demodb` ;

you can find the video recording in the below location
My Drive => Google-Vid => Springboot-mysql-jpa
https://drive.google.com/open?id=18CTxIG8xYqHItggZBgx-C7bQzQv1RJEQ




