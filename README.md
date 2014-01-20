Camel Router Project for Blueprint (OSGi) using Scala DSL
=========================================

Project demonstrates how to use Scala Camel DSL for defining routes and tests. Blueprint is used for camel context instrumentation and can be for dependency injection. Maven is used to package application in OSGi bundle which can be deployed to OSGi runtime.

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run


To deploy the project in OSGi runtime install org.example.osgi/camel-osgi-scala/1.0-SNAPSHOT bundle.


Steps for Apache Karaf
------------------------

1.Download [Apache Karaf 3.0](http://karaf.apache.org/index/community/download.html#Karaf3.0.0.)

2.Install required features

    feature:repo-add camel 2.12.2
    feature:install camel-blueprint
    feature:install camel-scala

3.Build app

    mvn install 

4.Install app

    bundle:install -s mvn:org.example.osgi/camel-osgi-scala/1.0-SNAPSHOT



    
    
    
