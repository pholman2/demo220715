import org.junit.Test
import junit.framework.TestCase.*
import main


class CalculatorTest {

    @Test
    fun passMain(){
        main()
        assertTrue(true)
    }

    @Test
    fun testMultiply2by2(){

        var calculator = Calculator()
        val s = "2 * 2"
        var result = calculator.parse(s)
        assertEquals(4,result)
    }
    @Test
    fun testSubtract5from10(){
        var calculator = Calculator()
        val s = "10 - 5"
        var result = calculator.parse(s)

    }
    @Test
    fun testAdd2and2(){
        var calculator = Calculator()
        var actual = calculator.add(2,2)
        // 2 + 2 = 4 (expected result)
        var expected = 4
        assertEquals(expected,actual)
    }
    @Test
    fun testIsEvenNumber(){
        var calculator = Calculator()
        var actual = calculator.isEvenNumber(3)
        assertFalse(actual)
    }
}