# Build stage
FROM openjdk:11.0.6-slim AS build
WORKDIR /build
COPY . .
RUN ./mvnw package -D maven.test.skip

# package stage

FROM openjdk:11.0.6-slim AS deploy
WORKDIR /app
COPY --from=build /build/target/*.jar app.jar
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "app.jar"]