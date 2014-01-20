import org.apache.camel.test.blueprint.CamelBlueprintTestSupport
import org.junit.Test

class RouteTest extends CamelBlueprintTestSupport {

    override protected def getBlueprintDescriptor = "/OSGI-INF/blueprint/blueprint.xml"

    @Test
    def testRoute {
      // the route is timer based, so every 5th second a message is send
      // we should then expect at least one message
      getMockEndpoint("mock:result").expectedMinimumMessageCount(1);

      // assert expectations
      assertMockEndpointsSatisfied();
    }

}
