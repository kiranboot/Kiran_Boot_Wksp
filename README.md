# Kiran_Boot_Wksp

ProblemsAndSolutions   (-web)


Problem: 404 on http://localhost:8080/hello
Sol: The Controller package should be under SpringBootApplication package
Read here: http://stackoverflow.com/questions/31318107/spring-boot-cannot-access-rest-controller-on-localhost-404

Problem: When tried with this http://localhost/hello got localhost refused to connect.
sol: added port http://localhost:8080/hello
Make sure to add port :8080

**************************

SpringBootApiRunningOnCustomPort  (-web)

Problem:

*
APPLICATION FAILED TO START
*

Description:

The Tomcat connector configured to listen on port 9999 failed to start. The port may already be in use or the connector may be misconfigured.

Action:

Verify the connector's configuration, identify and stop any process that's listening on port 9999, or configure this application to listen on another port.


Solution:

server.port=9999  (added this in the application.properties) then you can have same api running on multiple ports in the local

**************************

SpringBootWithActuator (-web and -Actuator)

Problem: Application was not even starting and /health call was not working


Solution: -Actuator to work you nee -web also (Earelier I just had Actuator alone so server was not even starting)


How i found: when added the Controller class, I was unable to import @RestController and @RequestMappings 


problem: by default /health endpoint works for other to work you need to add


management.security.enabled=false in the application.properties and restart


**************************

ApiReloadsAutomaticallyWithDevTools  (-web, -Actuator, -DevTools)


With help of DevTools there is no need to Re-Deploy the api. 


Api ges reloaded withe new changes automatically


After making the code changes Ctrl + s and Ctrl + b


**************************

Produce and Consume SOAP webservice using Spring Boot
https://www.javacodegeeks.com/2016/07/writing-consuming-soap-webservice-spring.html

**************************
BuildAndRunDockerImageUsingMavenPlugin


Create a controller with a sample Get Endpoint


Add the below dependencies or watch the below or watch this to understand https://www.youtube.com/watch?v=0nHSgo4YShU  



<plugin>
    <groupId>com.spotify</groupId>
    <artifactId>docker-maven-plugin</artifactId>
    <version>0.4.5</version>
    <configuration>
        <imageName>kirankumarimage</imageName>
        <baseImage>java</baseImage>
        <entryPoint>["java", "-jar", "/${project.build.finalName}.jar"]</entryPoint>
        <!-- copy the service's jar file from target into the root directory 
            of the image -->
        <resources>
            <resource>
                <targetPath>/</targetPath>
                <directory>${project.build.directory}</directory>
                <include>${project.build.finalName}.jar</include>
            </resource>
        </resources>
    </configuration>
</plugin>



go to project location


1. mvn clean


2. mvn -U install


3. mvn package


4. mvn docker:build (make sure image is created)


5. dokcer images


6. docker run -p 8080:8080 -t kirankumarimage


**************************


**************************


**************************


**************************


**************************


**************************
