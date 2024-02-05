import org.testng.annotations.Test;
import org.testng.Assert;
public class CalculationTest {
    @Test
    public void testFindMax(){
        int[] arr = new int[]{1,2,3,4,5}; //Normaler Testfall
        int expected = 5;

        int[] arr2 = new int[]{5,2,3,4,1}; //Position
        int expected2 = 5;

        int[] arr3 = new int[]{5,2,3,4,5}; //Duplikat
        int expected3 = 5;

        int[] arr4 = new int[]{-1,-2,-3,-4,-5}; //Negativ
        int expected4 = -1;

        int[] arr5 = new int[]{5}; //eine Stelle
        int expected5 = 5;

        //int[] arr6 = new int[]{}; //Leer
        //int expected6 = 0;

        int result = Calculation.findMax(arr);
        int result2 = Calculation.findMax(arr2);
        int result3 = Calculation.findMax(arr3);
        int result4 = Calculation.findMax(arr4);
        int result5 = Calculation.findMax(arr5);

        Assert.assertEquals(result, expected);
        Assert.assertEquals(result2, expected2);
        Assert.assertEquals(result3, expected3);
        Assert.assertEquals(result4, expected4);
        Assert.assertEquals(result5, expected5);
    }
}