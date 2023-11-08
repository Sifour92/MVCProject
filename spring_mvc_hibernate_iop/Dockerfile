FROM maven:latest-openjdk-8 as build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM tomcat:9.0-jre8-alpine
RUN rm -rf /usr/local/tomcat/webapps/ROOT
RUN rm -rf /usr/local/tomcat/webapps/examples
WORKDIR /usr/local/tomcat/webapps
COPY --from=build /app/target/Employees.war ./ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]

#t seems that you are deploying your web app to the root context path in the local tomcat. However, the tomcat in the docker images already have a welcome page app deployed to the root context path.
#
#What you need to do is to delete this welcome page app and rename your app to ROOT.war , then deploy it.
#
#FROM tomcat:8.5.31-jre8
#RUN rm -rvf /usr/local/tomcat/webapps/ROOT
#ADD  /target/my-app.war /usr/local/tomcat/webapps/ROOT.war
#CMD ["catalina.sh", "run"]
#EXPOSE 8080