FROM openjdk:17-alpine
WORKDIR /app
COPY build/libs/restaurant-service-0.0.1-SNAPSHOT.jar /app/restaurant-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "restaurant-service-0.0.1-SNAPSHOT.jar"]

