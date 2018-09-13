package enhancement;

import org.junit.BeforeClass;
import org.junit.Test;

public class RequestClientConfigurationTest {

	@BeforeClass
	public static void setSystemProperties() {
		if (System.getProperty(PactUtilityConstants.PACT_BROKER_USERNAME) == null) {
			System.out.println("No Environment Variable Set for PACT_BROKER_TARGET_FOLDER");
			System.setProperty(PactUtilityConstants.PACT_BROKER_USERNAME, "dummyName");
			System.setProperty(PactUtilityConstants.PACT_BROKER_PASSWORD, "password");
		}
	}

	@Test
	public void testConfigureRequestClient() {
		org.junit.Assert.assertNotNull(RequestClientConfiguration.configureRequestClient());
	}
}
