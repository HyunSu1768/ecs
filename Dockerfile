FROM openjdk:17
COPY build/libs/argocd-0.0.1-SNAPSHOT.jar.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]