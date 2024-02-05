import org.testng.annotations.Test;
import org.testng.Assert;
public class CalculationTest {
    @Test
    public void testFindMax(){
        int[] arr = new int[]{1,2,3,4,5}; //Normaler Testfall
        int expected = 5;

        int[] arr2 = new int[]{5,2,3,4,1}; //Position
        int expected2 = 5;

        int[] arr3 = new int[]{5,2,3,4,5}; //Duplikation
        int expected4 = 5;

        int result = Calculation.findMax(arr);

        Assert.assertEquals(expected, result);
    }
}