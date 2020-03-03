package testingpractice;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MainTest {

    Main main;

    @BeforeEach
    void init() {
        main = new Main();
    }

    @AfterEach
    void cleanup(){
        System.out.println("Cleaning up....");
    }

    @Test
    void testAdd() {
        int expected = 2;
        int actual = main.add(1, 1);
        assertEquals(expected, actual );
    }

    @Test
    void testDivide(){
        assertThrows(ArithmeticException.class, () -> main.divide(1, 0), "Divide by zero should throw exception");
    }


    @Test
    @DisplayName("Multiply Method")
    void testMultiply(){
        assertAll(
                ()-> assertEquals(4, main.multiply(2,2)),
                ()-> assertEquals(0, main.multiply(2,0)),
                ()-> assertEquals(-2, main.multiply(2,-1))
                );
    }

    @Nested
    @DisplayName("AddTests")
    class AddTest {
        @Test
        @DisplayName("adding two positive numbers")
        void testAddPositive() {
            assertEquals(5, main.add(1,4));
        }

        @Test
        @DisplayName("adding two negative numbers")
        void testAddNegative() {
            assertEquals(-6, main.add(-3,-3));
        }

    }

    @Test
    void testName(){
        assertEquals("Sofia Gharaibeh", main.name("Sofia", "Gharaibeh"));
    }

    @Test
    void testException() {
        assertThrows(Exception.class, main::throwsException);
    }



}

