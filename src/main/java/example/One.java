package example;

import java.util.logging.Logger;

public class One {
  String message = "foo";
  private static Logger logger = Logger.getLogger("example.One");

  public String foo() {
    return message;
  }

  public void uncoveredMethod() {
    GiveMessage vGiveMessage = new GiveMessage();
    vGiveMessage.sayHello();
    logger.info("foo");
  }
}
