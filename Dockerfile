# Base image with Java 11
FROM adoptopenjdk/openjdk11:alpine-slim

# Set the working directory
WORKDIR /app

# Copy the Maven project and pom.xml to the working directory
COPY . /app/

# Run Maven to build the project
RUN ./mvnw clean package

# Expose the port used by the application
EXPOSE 8080

# Set the entrypoint for the Docker container to run the application
ENTRYPOINT ["java", "-jar", "target/your-application.jar"]
