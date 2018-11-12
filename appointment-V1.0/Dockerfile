# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="ext_lavergarav@falabella.cl"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 9991

# The application's jar file
ARG JAR_FILE=build/libs/appointment-service¿¿-V1.0-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} appointment-service-V1.0-0.0.1-SNAPSHOT.jar

# Run the jar file 
ENTRYPOINT ["java -jar ","appointment-service-V1.0-0.0.1-SNAPSHOT.jar"] 
