FROM openjdk:17-alpine
COPY ./target/config-server-1.0.jar ~/jar/config-server.jar
ENTRYPOINT ["java", "-jar", "~/jar/config-server.jar"]