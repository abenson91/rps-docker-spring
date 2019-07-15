FROM openjdk:11-slim

WORKDIR /usr/apps

COPY /target/*.jar rps-spring.jar

CMD ["java", "-jar", "-Dspring.profiles.active=local", "rps-spring.jar" ]




