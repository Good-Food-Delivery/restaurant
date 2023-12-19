FROM openjdk:17-alpine
WORKDIR /app
COPY spring-boot-0.0.1-SNAPSHOT.jar /app/spring-boot-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-boot-0.0.1-SNAPSHOT.jar"]
