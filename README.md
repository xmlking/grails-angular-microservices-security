Work-In-Progress

Grails microservices security with OAuth or JWT demo
Client: SPA (Angular)

gradle auth-server:run
gradle auth-server:clean

gradle async-resource:run
gradle async-resource:clean
 

 
curl -H "Accept: application/json" user:password@localhost:8080/oauth/token -d grant_type=client_credentials


Ref: https://github.com/dsyer/spring-security-angular/tree/master/oauth2

