package example;

import java.util.logging.Logger;

public class One {
  String message = "foo";

  public String foo() {
    return message;
  }

  private final static Logger logger = Logger.getLogger("example.One");

  public void uncoveredMethod() {
    //System.out.println(foo());
    logger.info("foo");
  }
}
