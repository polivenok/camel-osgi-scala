Camel Router Project for Blueprint (OSGi) using Scala DSL
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi, for example using Apache ServiceMix
or Apache Karaf, you can run the following command from its shell 
(make sure that you have camel, camel-blueprint and camel-scala installed):

    bundle:install -s mvn:org.example.osgi/camel-osgi-scala/1.0-SNAPSHOT

Steps for Karaf 3.0:

    feature:repo-add camel 2.12.2
    feature:install camel-blueprint
    feature:install camel-scala
    bundle:install -s mvn:org.example.osgi/camel-osgi-scala/1.0-SNAPSHOT
    
