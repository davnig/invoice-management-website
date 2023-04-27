FROM openjdk:17-jdk AS BUILD_STAGE
RUN microdnf install findutils
WORKDIR /usr/app
COPY --chown=gradle:gradle . ./
RUN ./gradlew bootJar || return 1

FROM openjdk:17-slim
WORKDIR /app
COPY --from=BUILD_STAGE /usr/app/build/libs/app.jar ./
ENTRYPOINT ["java", "-jar", "app.jar"]