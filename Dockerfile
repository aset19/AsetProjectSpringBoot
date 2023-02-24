FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/spring-boot-docker.jar
WORKDIR /opt/asetProject
COPY ${JAR_FILE} asetProject.jar
ENTRYPOINT ["java","-jar","asetProject.jar"]