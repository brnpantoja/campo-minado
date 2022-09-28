package test;

import static org.junit.jupiter.api.Assertions.*;

class myclassTest {

    @org.junit.jupiter.api.Test
    void testquotient() {
        myclass myclass = new myclass();
        assertEquals(6, myclass.quotient(2, 3));
    }
}