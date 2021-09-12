# yLicense
Free license system

### Configuration
/src/main/resources/application.properties
```properties
## Database connection configuration
spring.datasource.url = jdbc:mysql://db_host:db_port/db_name?useSSL=false
pring.datasource.password = your_db_password
spring.datasource.username = db_username

## JPA and hibernate configuration
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto = update
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type=TRACE

## Server configuration
//Application port. Default 8080
server.port = 8080
server.error.whitelabel.enabled=false

```

### Run using maven

```bash
mvn spring-boot:run
```
### Create jar file and run using jar file

```bash
mvn package

java -jar target/yLicense-0.0.1-SNAPSHOT.jar
```

