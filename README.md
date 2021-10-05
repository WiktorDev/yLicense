# yLicense
Free license system (This is my first spring boot project)

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


<p align="center">
  <img src="https://cdn.discordapp.com/attachments/675621761676476426/895027441754583060/unknown.png" width="350" title="hover text">
</p>
