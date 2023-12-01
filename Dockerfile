# FROM openjdk:17-alpine
# RUN addgroup -S spring && adduser -S spring -G spring
# USER spring:spring
# EXPOSE 8080
# ADD /build/libs/spring-boot-0.0.1-SNAPSHOT.jar spring-boot-0.0.1-SNAPSHOT.jar
# ENTRYPOINT ["java","-jar","/spring-boot-0.0.1-SNAPSHOT.jar"]
# Dockerfile content
FROM adoptopenjdk/openjdk17:alpine
WORKDIR /app
COPY spring-boot-0.0.1-SNAPSHOT.jar /app/spring-boot-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-boot-0.0.1-SNAPSHOT.jar"]
