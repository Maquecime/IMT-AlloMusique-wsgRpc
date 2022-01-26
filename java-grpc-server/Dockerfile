# the first stage of our build will use a maven 3.6.1 parent image
FROM maven:3.6.1-jdk-11-slim
# set workdir
WORKDIR /home/app
# copy the pom and src code to the container
COPY ./src /home/app/src
COPY ./pom.xml /home/app
# open port
EXPOSE 5000
# package our application code
RUN mvn clean install
RUN mvn verify
# set the startup command to execute the jar
ENTRYPOINT ["mvn", "exec:java", "-Dexec.mainClass=com.music.grpc.server.MainServer"]






