import java.util.HashMap;
import java.util.Map;

public class hasher {
  public static void main(String[] args) {
    Map<String, String> capitalCities = new HashMap<>();

    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    String kk = capitalCities.get("USA");
    System.out.println(capitalCities);
    System.out.println(kk);
  }
}
