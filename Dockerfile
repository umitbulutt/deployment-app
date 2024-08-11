FROM adoptopenjdk/openjdk11:jre

WORKDIR usr/app

COPY target/fake-user-app-0.0.1-SNAPSHOT.jar fake-user-app-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "fake-user-app-0.0.1-SNAPSHOT.jar"]
# java -jar fake-user-app-0.0.1-SNAPSHOT.jar

#ADD target/fake-user-app-0.0.1-SNAPSHOT.jar /fake-user-app/fake-user-app-0.0.1-SNAPSHOT.jar
#RUN apt-get install curl
#CMD "fake-user-app-0.0.1-SNAPSHOT.jar"
#ENV VARIABLENAME=VALUE     we use to pass environment variables to container
#VOLUME "/somepath"
