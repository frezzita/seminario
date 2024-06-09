// Trabajo Práctico 3

Compilación:
javac *.java

Ejecución
java main
------------------------------------

mysql 8.x must be running at port 7788

How to run:

mvn spring-boot:run 


// docker 

FROM mysql:8.0
ENV MYSQL_ROOT_PASSWORD=seminario
EXPOSE 3306


docker build -t custom-mysql8 .
docker run --name mysql8-container -p 7788:3306 -d custom-mysql8
