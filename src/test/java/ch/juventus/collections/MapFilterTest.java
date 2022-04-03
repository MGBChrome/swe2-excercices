package ch.juventus.collections;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapFilterTest {

    @Test
    void testCleanupIntegerKeyStringValue() {
        // Arrange
        Map<Integer, String> map = new HashMap<>();
        MapFilter mapFilter = new MapFilter();
        setupIntegerString(map);
        String filter = "beta";

        // Act
        mapFilter.cleanup(map, filter);

        // Assert
        assertArrayEquals(map.values().toArray(new String[3]), new String[]{filter, filter, filter},
                "map is not filtered correctly");
    }

    @Test
    void testCleanupIteratorIntegerKeyStringValue() {
        // Arrange
        Map<Integer, String> map = new HashMap<>();
        MapFilter mapFilter = new MapFilter();
        setupIntegerString(map);
        String filter = "beta";

        // Act
        mapFilter.cleanupIterator(map, filter);

        // Assert
        assertArrayEquals(map.values().toArray(new String[3]), new String[]{filter, filter, filter},
                "map is not filtered correctly");
    }

    @Test
    void testCleanupStringKeyLongValue() {
        // Arrange
        Map<String, Long> map = new HashMap<>();
        MapFilter mapFilter = new MapFilter();
        setupStringLong(map);
        Long filter = 200L;

        // Act
        mapFilter.cleanup(map, filter);

        // Assert
        assertArrayEquals(map.values().toArray(new Long[4]), new Long[]{filter, filter, filter, filter},
                "map is not filtered correctly");
    }

    @Test
    void testCleanupIteratorStringKeyLongValue() {
        // Arrange
        Map<String, Long> map = new HashMap<>();
        MapFilter mapFilter = new MapFilter();
        setupStringLong(map);
        Long filter = 200L;

        // Act
        mapFilter.cleanupIterator(map, filter);

        // Assert
        assertArrayEquals(map.values().toArray(new Long[4]), new Long[]{filter, filter, filter, filter},
                "map is not filtered correctly");
    }

    private void setupIntegerString(Map<Integer, String> map) {
        map.put(1, "alpha");
        map.put(2, "beta");
        map.put(3, "gamma");
        map.put(4, "beta");
        map.put(5, "beta");
        map.put(6, "delta");
    }

    private void setupStringLong(Map<String, Long> map) {
        map.put("a", 100L);
        map.put("b", 200L);
        map.put("c", 200L);
        map.put("d", 300L);
        map.put("e", 200L);
        map.put("f", 400L);
        map.put("g", 200L);
    }
}