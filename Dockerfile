FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /myapp
COPY target/spring-boot-docker.jar /myapp/spring-boot-docker.jar
ENTRYPOINT ["java","-jar","spring-boot-docker.jar"]