package ch.juventus.collections;

import java.util.Iterator;
import java.util.Map;

public class MapFilter {
    public <K, V> void cleanup(Map<K, V> map, V filter)
    {
        map.entrySet().removeIf(entry -> !entry.getValue().equals(filter));
    }

    public <K, V> void cleanupIterator(Map<K, V> map, V filter)
    {
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            if (!entry.getValue().equals(filter)) {
                iterator.remove();
            }
        }
    }
}
