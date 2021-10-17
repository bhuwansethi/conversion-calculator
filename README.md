# conversion-calculator
Spring Boot REST project for converting Metric to Imperial unit and vice-versa

## Java Technical Test Instructions
1. Create a Spring Boot application using rest API’s to do a conversions.
2. Convert Metric to imperial and vice versa. The API must cater for at least 5 conversions (include temperature conversion please).
3. Ensure that you have proper Unit and Integration testing that accompany the project.
4. Postman/Jmeter project with your RestAPI's.
5. Use the latest Angular to create a front end for your project. (Only if you have time)
6. Upload your project into your own GIT repository and share the project with us.
7. The project must be able to run in its own Docker environment
8. Build system must use Maven.

## Executing the Application (Locally)

```cmd
mvn clean install
```

```cmd
java -jar target/conversion-calculator-0.0.1-SNAPSHOT.jar
```

## Executing the Application (Docker)

```cmd
docker pull bhuwansethi/conversion-calculator:latest
```

```cmd
docker run -p 8080:8080 bhuwansethi/conversion-calculator
```

## API Documentation

After running the application successfully, use the below link to access the [API Documentation](http://localhost:8080/swagger-ui.html).

```
http://localhost:8080/swagger-ui.html
```
## Testing

Click on the button below to get the Postman Collection for Conversion Calculator.

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/c162bdb0accbdddbf8d0)

## API Monitoring

### Prometheus

1. Download [Prometheus](https://prometheus.io/download/) distributions for your environment. Extract the distribution in your selected directory in the file system.
2. Refer [prometheus.yml](https://github.com/bhuwansethi/conversion-calculator/blob/main/prometheus.yml) for configuring Prometheus.
3. Start the Prometheus server by using the below command 
```
prometheus.exe --config.file=YAML_FILE_PATH. 
```
4. Test the server by browsing to the [URL](http://localhost:9090/) http://localhost:9090/


### Grafana

1. Download [Grafana](https://grafana.com/grafana/download) distributions for your environment. Extract the distribution in your selected directory in the file system.
2. Start the server by executing grafana-server.exe from the bin directory of the distribution.
3. Log in to [Grafana](http://localhost:3000) by browsing to http://localhost:3000.
4. Configure Prometheus as Datasource
5. Import the attached Grafana Dashboard [Grafana - Spring Boot Statistics.json](https://github.com/bhuwansethi/conversion-calculator/blob/main/Grafana%20-%20Spring%20Boot%20Statistics.json) for monitoring the application.

## Health Check Probes for Kubernetes

[Liveness Check](http://localhost:8080/actuator/health/liveness): http://localhost:8080/actuator/health/liveness

[Readiness Check](http://localhost:8080/actuator/health/readiness): http://localhost:8080/actuator/health/readiness
