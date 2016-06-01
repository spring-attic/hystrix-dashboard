# Hystrix Dashboard

To run locally:

````
mvn install
java -jar target/hystrix-dashboard-0.0.1.BUILD-SNAPSHOT.jar
````

In your browser, go to [http://localhost:7979/](http://localhost:7979/) # port configurable in `application.yml`

On the home page is a form where you can
enter the URL for an event stream to monitor, for example (the
customers service running locally):
`http://localhost:9000/hystrix.stream`. Any app that uses
`@EnableHystrix` will expose the stream.

To aggregate many streams together you can use the
[Turbine sample](https://github.com/spring-cloud-samples/turbine).
