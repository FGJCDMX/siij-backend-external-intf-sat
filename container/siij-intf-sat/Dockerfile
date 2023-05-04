# Spring Boot Application siij-intf-sat
FROM openjdk:8-jdk

ENV CATALINA_OPTS="$CATALINA_OPTS -Djava.security.egd=file:/dev/./urandom"
ENV TZ America/Mexico_City
 
VOLUME /tmp
COPY app/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]