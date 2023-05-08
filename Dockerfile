FROM openjdk:20
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/03_SpringPostmanCrud-2-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
