FROM maven:3.8.4-openjdk-11 as build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM tomcat:9.0.82-jdk11-corretto
RUN rm -rf /usr/local/tomcat/webapps/ROOT
RUN rm -rf /usr/local/tomcat/webapps/examples
WORKDIR /usr/local/tomcat/webapps
COPY --from=build /app/target/Employees.war ./ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]
