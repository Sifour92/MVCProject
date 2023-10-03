# CRUD Application with PostgreSQL
This is a CRUD (Create, Read, Update, Delete) application built with SpringMVC,Hibernate and PostgreSQL. It allows you to manage employee records on a local network.
#Getting Started

#Prerequistes
Java 8 or higher installed on your system.
PostgreSQL database installed and running locally.

#Installation
Clone the repository to your local machine:

Configure PostgreSQL:

Create a new database in your local PostgreSQL instance.
Update the database configurations in applicationContext.xml with your database details.

    <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource"
          destroy-method="close">
        <property name="driverClass" value="org.postgresql.Driver"/>
        <property name="jdbcUrl" value="jdbc:postgresql://localhost:5432/ YOU_DATABASE_NAME"/>
        <property name="user" value="YOUR_USER_NAME"/>
        <property name="password" value="YOUR_USER_PASSWORD"/>
    </bean>
