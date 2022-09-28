package test;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    void testarSeIgualADois() {
        int a = 1 + 1;
        assertEquals(2, a);
    }
    @org.junit.Test
    void testarSeIgualATres() {
        int a = 1 + 2;
        assertEquals(3, a);
    }
}
