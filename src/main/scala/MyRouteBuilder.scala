package org.example.osgi

import org.apache.camel.scala.dsl.builder.RouteBuilder
import org.apache.camel.Exchange

/**
 * A Camel Router using the Scala DSL
 */
class MyRouteBuilder extends RouteBuilder {

  // an example of a Processor method
  val myProcessorMethod = (exchange: Exchange) => {
    exchange.getIn.setBody("block test")
  }

  // a route using Scala blocks
  "timer://foo?period=5s" ==> {
    process(myProcessorMethod)
    log("block")
    to("mock:result")
  }
}