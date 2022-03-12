FROM openjdk:11
ADD target/dockerhub-springboot-hello.jar dockerhub-springboot-hello.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","dockerhub-springboot-hello.jar"]