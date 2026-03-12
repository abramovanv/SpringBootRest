FROM openjdk:17-ea-jdk-alpine
EXPOSE 8080
ADD target/SpringBootRest-0.0.1-SNAPSHOT.jar apprest.jar
CMD ["java", "-jar", "apprest.jar"]