# build phase
FROM maven:3.9.8-eclipse-temurin-17 as builder

WORKDIR /app

COPY . /app

RUN mvn clean package

# packaging phase
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY --from=builder /app/target/*.jar /app/app.jar

EXPOSE 8080

CMD [ "java", "-jar", "app.jar" ]