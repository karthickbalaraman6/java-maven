FROM tomcat:10-jdk17
COPY target/loginapp.war /usr/local/tomcat/webapps/loginapp.war
EXPOSE 8080
CMD ["catalina.sh", "run"]