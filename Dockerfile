# Use Tomcat 9 with JDK 17
FROM tomcat:9.0-jdk17

# Remove default apps to keep image clean (optional)
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy WAR produced by Maven
COPY target/loginapp.war /usr/local/tomcat/webapps/loginapp.war

EXPOSE 8081
CMD ["catalina.sh", "run"]
