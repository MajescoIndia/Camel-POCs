![Camel Logo](https://github.com/MajescoIndia/Camel-POCs/blob/master/img/Apache-camel-logo.png)
###Introduction To Camel

Camel is an Opensource([Apache 2.0 License](http://www.apache.org/licenses/LICENSE-2.0)) integration framework, routing and mediation engine written in Java. It provides a complete implementation of all known [enterprise integration patterns](http://www.enterpriseintegrationpatterns.com/).

Camel has support for various framework and languages which are called DSL(Domain Specific Language) in Camel world. Below listed some DSLs supported by Camel :

1. Java DSL
2. Spring DSL
3. Support for OSGI blueprints
4. Support for Scala and Groovy

The core of Camel is a routing engine. It offers higher-level abstractions that allow you to interact with various systems using the same API regardless of the protocol or data type the systems are using. Components in Camel provide specific implementations of the API that target different protocols and data types.

Camel is **NOT** an ESB as it does not have a container or a Service bus. but it can be used as an ESB with Apache ServiceMix of FuseESB.

### Benefits of Using Camel :

1. More than 150 connectors / components to connect with various systems.
2. Complete EIP implementations.
3. multiple protocol support - HTTP, FTP, TCP, UDP ...
4. Automatic type conversion ( Marshaling and Unmarshaling)


### Camel with Spring (the way we use) :

We use camel Proxy to initiate a camel route from Spring Service layer.
![Camel Proxy](https://github.com/MajescoIndia/Camel-POCs/blob/master/img/ProxyDiagram.PNG)
