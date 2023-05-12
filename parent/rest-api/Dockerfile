FROM openjdk:17-jdk

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} rest-api.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]