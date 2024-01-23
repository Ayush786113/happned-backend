FROM openjdk:20-jdk

EXPOSE 8080

ADD target/happned-0.0.1-SNAPSHOT.jar happned-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "happned-0.0.1-SNAPSHOT.jar"]
