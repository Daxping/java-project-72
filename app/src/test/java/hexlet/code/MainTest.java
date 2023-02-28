package hexlet.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class MainTest {
    @Test
    public void mapSchemaTest1() {
        App.main();
        System.out.println("Hello world!");
    }
}