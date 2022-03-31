package ch.juventus.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapFilterTest {
    private Map<Integer, String> map;
    private MapFilter<Integer, String> mapFilter;

    @BeforeEach
    private void setup() {
        map = new HashMap<>();
        map.put(1, "alpha");
        map.put(2, "beta");
        map.put(3, "gamma");
        map.put(4, "delta");

        mapFilter = new MapFilter<>();
    }

    @Test
    void testCleanupIntegerKeyStringValue() {
        // Arrange
        String filter = "beta";

        // Act
        mapFilter.cleanup(map, filter);

        // Assert
        assertFalse(map.containsValue(filter), "filter is still in the map");
    }

    @Test
    void testCleanupIteratorIntegerKeyStringValue() {
        // Arrange
        String filter = "beta";

        // Act
        mapFilter.cleanupIterator(map, filter);

        // Assert
        assertFalse(map.containsValue(filter), "filter is still in the map");
    }
}