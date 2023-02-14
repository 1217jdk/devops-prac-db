FROM openjdk:17-alpine

ARG JAR_FILE=./*.jar

COPY ${JAR_FILE} db.jar

ENTRYPOINT ["java", "-jar", "db.jar"]
