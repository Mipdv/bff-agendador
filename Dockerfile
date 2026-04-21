FROM maven:3.8-eclipse-temurin-21-alpine as BUILD

WORKDIR /app

COPY . .
RUN mvn clean install -DskipTest
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8089

CMD ["java","-jar", "/app/bff-agendador.jar"]
