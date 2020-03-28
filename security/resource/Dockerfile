FROM openjdk:8-jre-alpine
RUN addgroup -S spring && adduser -S spring -G spring
LABEL maintainer="proxyshadow@gmail.com"
ENV APP_HOME /opt/mtagab/healthtracker
USER spring:spring
WORKDIR $APP_HOME
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar","/opt/mtagab/healthtracker/app.jar"]
