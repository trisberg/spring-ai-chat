# Introduction spring-ai-chat

The spring-ai-chat app provides you an out-of-the-box application setup to fast start development of a Web Application for AI Chat based on [Spring AI](https://spring.io/projects/spring-ai).

This web application is using Spring AI to offer an interactive chat experience utilizing RAG (Retrieval Augmented Generation) to enable a user to ask questions about their own uploaded documents.

# Local

## Prerequisites

In order to further develop this application the following tools needs to be setup:
- Java Development Kit (https://bell-sw.com/)
- Visual Studio Code or IntelliJ IDEA as Integrated Development Environment (IDE)
- Tanzu Developer Tools plugin for the mentioned IDE

## Build
In order to compile the production code:

```sh
./mvnw clean compile
```

After that it is a good habit to compile the test classes and execute those tests to see if your application is still behaving as you would expect:

```sh
./mvnw verify
```

## Start the app
Spring Boot has its own integrated Web Server (Apache Tomcat (https://tomcat.apache.org/)).

Set the `AI_API_KEY` environment variable with the API key to be used by your app:

```sh
export AI_API_KEY='<your-api-key>'
```

Launch application using default profile:

```sh
./mvnw spring-boot:run
```

# Use PostgreSQL with pgvector

## Start pgvector instance

```
docker run --rm -d --name pgvector -p 5432:5432 -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=dataflow pgvector/pgvector:pg17
```

## Build with pgvector profile

In order to compile the production code:

```sh
./mvnw clean compile -P pgvector
```

After that it is a good habit to compile the test classes and execute those tests to see if your application is still behaving as you would expect:

```sh
./mvnw verify -P pgvector -Dspring.profiles.active=pgvector
```

## Start the app
Spring Boot has its own integrated Web Server (Apache Tomcat (https://tomcat.apache.org/)).

Set the `AI_API_KEY` environment variable with the API key to be used by your app:

```sh
export AI_API_KEY='<your-api-key>'
```

Launch application using pgvector profile:

```sh
./mvnw spring-boot:run -P pgvector -Dspring-boot.run.profiles=pgvector
```

# Accessing home page

You can access the public page at `http://localhost:8080/` by a web browser or using `curl`:

```sh
curl -L -H 'Content-Type: application/html' http://localhost:8080/
```

You'll be presented with a login page. You may login with either of the following sets
of credentials:

 - buzz / infinity
 - woody / bullseye

The security around the application is primarily so that each user will have their own,
distinct chat history and so that conversations with the LLM do not bleed into each
other.

# How to proceed from here?

Having the application locally running and deployed to a cluster you could add your domain logic, related persistence and new Spring MVC controllers.

Some tips:
- You can add images, additional CSS, etc to `src/main/resources/static` folder. It will be served by Spring Boot under `/static`. Those resources can be referenced to by Thymeleaf `@` character.
- In order to add a new page, create a new Controller, method and .html file in `src/main/resource/template` folder.

# References
- [Spring Boot](https://spring.io/projects/spring-boot/)
- [Spring AI](https://spring.io/projects/spring-ai)
- [Tanzu Application Platform](https://tanzu.vmware.com/application-platform)
- [Tanzu Developer Tools for Visual Studio Code](https://docs.vmware.com/en/VMware-Tanzu-Application-Platform/1.2/tap/GUID-vscode-extension-about.html)
- [Tanzu Developer Tools for IntelliJ](https://docs.vmware.com/en/VMware-Tanzu-Application-Platform/1.2/tap/GUID-intellij-extension-about.html)
- [Thymeleaf](https://www.thymeleaf.org/)
