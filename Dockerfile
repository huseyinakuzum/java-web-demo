FROM adoptopenjdk/openjdk11:jdk-11.0.2.9-slim
WORKDIR /opt
ENV PORT 5000
EXPOSE 5000
COPY target/*.jar /opt/java-demo.jar
ENTRYPOINT exec java -jar java-demo.jar