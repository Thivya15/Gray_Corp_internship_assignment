# Java base image
FROM openjdk:17-jdk-slim

# Workdir inside container
WORKDIR /app

# Copy jar file
COPY target/student-management-system-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Command to run the app
ENTRYPOINT ["java","-jar","app.jar"]
