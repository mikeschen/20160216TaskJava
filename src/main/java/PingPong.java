import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class PingPong {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/main.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");
      String userStringNumber = request.queryParams("number");
      Integer userNumber = Integer.parseInt(userStringNumber);
      ArrayList<Object> results = new ArrayList<Object>();
      results = PingPong.isPingPong(userNumber);

      model.put("results", results);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static ArrayList isPingPong(Integer number) {
    ArrayList<Object> numbersArray = new ArrayList<Object>();
      //code goes here
    return numbersArray;
  }

}
