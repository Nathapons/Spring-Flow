
## Backend: Java spring boot

## Acknowledgements

 - [Java](https://www.w3schools.com/java/default.asp)
 - [Spring Boot](https://spring.io/guides/gs/spring-boot/)
## Project Structure

```bash
.
├── mvnw
├── mvnw.cmd
├── pom.xml
├── Readme.md
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── ltp
│   │   │           └── server
│   │   │               ├── controller
│   │   │               ├── dto
│   │   │               │   ├── request
│   │   │               │   └── response
│   │   │               ├── entity
│   │   │               │   ├── Book.java
│   │   │               │   ├── Publisher.java
│   │   │               │   ├── Purchase.java
│   │   │               │   ├── Review.java
│   │   │               │   └── User.java
│   │   │               ├── exception
│   │   │               ├── repository
│   │   │               │   ├── IBookRepository.java
│   │   │               │   ├── IPublisherRepository.java
│   │   │               │   ├── IPurchaseRepository.java
│   │   │               │   ├── IReviewRepository.java
│   │   │               │   └── IUserRepository.java
│   │   │               ├── ServerApplication.java
│   │   │               └── service
│   │   └── resources
│   │       ├── application.properties
│   │       ├── META-INF
│   │       │   └── additional-spring-configuration-metadata.json
│   │       ├── static
│   │       └── templates
│   └── test
│       └── java
│           └── com
│               └── ltp
│                   └── server
│                       └── ServerApplicationTests.java
```