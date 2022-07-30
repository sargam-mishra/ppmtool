FROM openjdk:8-slim as build
MAINTAINER sargammishra
ADD target/ppmtool-0.0.1-SNAPSHOT.jar ppmtool-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java" , "-jar", "/ppmtool-0.0.1-SNAPSHOT.jar"]
