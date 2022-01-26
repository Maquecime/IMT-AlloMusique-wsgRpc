#
# Build stage
#
# FROM maven:3.8.4-jdk-11-slim AS build
# COPY ./src /home/app/src
# COPY ./pom.xml /home/app
# RUN mvn -f /home/app/pom.xml clean package

# #
# # Package stage
# #
# FROM openjdk:11-jre-slim
# COPY --from=build /home/app/src /home/app/src
# COPY --from=build /home/app/pom.xml /home/app
# EXPOSE 5000
# CMD ["javac" ,"/home/app/src/main/java/com/music/grpc/server/MainServer.java"]
# # ENTRYPOINT [ "java", "MainServer" ]

# the first stage of our build will use a maven 3.6.1 parent image
FROM maven:3.6.1-jdk-11-slim
# set workdir
WORKDIR /home/app
# copy the pom and src code to the container
COPY ./src /home/app/src
COPY ./pom.xml /home/app
# package our application code
RUN mvn clean install
RUN mvn verify
# set the startup command to execute the jar
ENTRYPOINT ["mvn", "exec:java", "-Dexec.mainClass=com.music.grpc.server.MainServer"]
#mvn compile exec:java -Dexec.mainClass="com.music.grpc.server.MainServer"






