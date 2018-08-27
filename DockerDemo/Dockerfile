FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD /build/libs/dockerdemo-0.0.1-SNAPSHOT.jar dockerdemo.jar
ENTRYPOINT ["java", "-jar", "dockerdemo.jar"]
