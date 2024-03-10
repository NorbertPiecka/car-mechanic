FROM eclipse-temurin:21-jdk-alpine
VOLUME ./mechanic
COPY build/libs/car-mechanic-0.0.1-SNAPSHOT.jar mechanic.jar
ENTRYPOINT ["java","-jar","/mechanic.jar"]