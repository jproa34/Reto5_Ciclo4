FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/hipercalorico-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} hipercalorico-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "hipercalorico-0.0.1-SNAPSHOT.jar"]