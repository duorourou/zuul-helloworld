Basic usage of spring zuul with filter.

# Getting started

Start application:

    mvn spring-boot:run

Make direct request:

    $ curl http://localhost:8080/foo

You'll get 400 error because `x-foo` header is missing;

> {"timestamp":1453362939507,"status":400,"error":"Bad Request","exception":"org.springframework.web.bind.ServletRequestBindingException","message":"Missing request header 'x-foo' for method parameter of type String","path":"/foo"}

Make request via zuul with filter that adds header:

    $ curl http://localhost:8080/bar
    Hello World

See on console the content of `x-foo` header:

> some foo header content

