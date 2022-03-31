package ch.juventus.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapFilter<K, V> {
    public void cleanup(Map<K, V> map, V filter)
    {
        map.entrySet().removeIf(entry -> entry.getValue().equals(filter));
    }

    public void cleanupIterator(Map<K, V> map, V filter)
    {
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            if (entry.getValue().equals(filter)) {
                iterator.remove();
            }
        }
    }
}
