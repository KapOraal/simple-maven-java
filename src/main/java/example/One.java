package example;

import java.util.logging.Logger;

public class One {
  String message = "foo";

  public String foo() {
    return message;
  }

  private static final Logger logger = Logger.getLogger("example.One");

  public void uncoveredMethod() {
    logger.info("foo");
  }
}
