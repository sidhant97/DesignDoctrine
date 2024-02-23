import java.util.HashMap;
import java.util.Map;

public class SearchRegistry {
    Map<String, SearchAPI> registry = new HashMap<>();

    public void setRegistry(String key, SearchAPI value) {
        registry.put(key, value);
    }

    public SearchAPI getRegistry(String key) {
        return registry.get(key);
    }

}
