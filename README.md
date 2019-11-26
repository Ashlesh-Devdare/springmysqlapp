# springmysqlapp
Connecting Spring Boot Application with DB

1. The Spring Boot app uses the artifacts provided by the spring 
    spring-boot-starter-web
    spring-boot-starter-data-jpa

  It helps to start the REST Service which is exposed via http://{hostname}/hospital 
  It has doctors and patients service exposed which can perform CRUD operations 
  http://{hostname}/hospital/doctors
  http://{hostname}/hospital/patients

2. For DB connection with MySql we have used the artifact mysql-connector-java

3. Included the folder named 'SqlScripts' which includes DDL as well as dml which contains the DB tables that application expects to be present. 
