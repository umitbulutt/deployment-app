FROM adoptopenjdk/openjdk11:jre

WORKDIR usr/app

COPY target/deployment-app-0.0.1-SNAPSHOT.jar deployment-app-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java" , "-jar","deployment-app-0.0.1-SNAPSHOT.jar"]

