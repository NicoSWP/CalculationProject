
public class CalculationTest {
    public void testFindMax(){
        Calculation c = new Calculation();
        int[] arr = new int[]{1,2,3,4,5};

        int expected = 5;
        int result = c.findMax(arr);

        //Assert.assertEquals(expected, result);
    }
}