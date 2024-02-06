import org.testng.annotations.Test;
import org.testng.Assert;
public class CalculationTest {
    @Test
    public void testFindMaxCase1() {
        int[] arr = new int[]{1, 2, 3, 4, 5}; //standard Case
        int expected = 5;
        try {
            int result = Calculation.findMax(arr);
            Assert.assertEquals(result, expected);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testFindMaxCase2() {
        int[] arr2 = new int[]{5,2,3,4,1}; //position
        int expected2 = 5;
        try {
            int result2 = Calculation.findMax(arr2);
            Assert.assertEquals(result2, expected2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testFindMaxCase3() {
        int[] arr3 = new int[]{5,2,3,4,5}; //duplicate
        int expected3 = 5;
        try {
            int result3 = Calculation.findMax(arr3);
            Assert.assertEquals(result3, expected3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testFindMaxCase4() {
        int[] arr4 = new int[]{-1,-2,-3,-4,-5}; //negative
        int expected4 = -1;
        try {
            int result4 = Calculation.findMax(arr4);
            Assert.assertEquals(result4, expected4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void testFindMaxCase5() {
        int[] arr5 = new int[]{5}; //one Element
        int expected5 = 5;
        try {
            int result5 = Calculation.findMax(arr5);
            Assert.assertEquals(result5, expected5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(expectedExceptions = Exception.class)
    public void testFindMaxWithExceptionCase6() throws Exception{
        int[] arr6 = new int[]{}; //empty
        Calculation.findMax(arr6);
    }

    @Test
    public void testCubeCase1() {
        double n = 1;
        double expected = 1;
        double result = Calculation.cube(n);
        Assert.assertEquals(result, expected);
    }
    @Test
    public void testCubeCase2() {
        double n2 = 2;
        double expected2 = 4;
        double result2 = Calculation.cube(n2);
        Assert.assertEquals(result2, expected2);
    }
    @Test
    public void testCubeCase3(){
        double n3 = 3;
        double expected3 = 9;
        double result3 = Calculation.cube(n3);
        Assert.assertEquals(result3, expected3);
    }

    @Test
    public void testToThePowerOfCase1() {
        double b = 1;
        double e = 1;
        double expected = 1;
        double result = Calculation.toThePowerOf(b, e);
        Assert.assertEquals(result, expected);
    }
    @Test
    public void testToThePowerOfCase2() {
        double b2 = -2;
        double e2 = -2;
        double expected2 = 0.25;
        double result2 = Calculation.toThePowerOf(b2, e2);
        Assert.assertEquals(result2, expected2);
    }
    @Test
    public void testToThePowerOfCase3(){
        double b3 = 3;
        double e3 = 3;
        double expected3 = 27;
        double result3 = Calculation.toThePowerOf(b3, e3);
        Assert.assertEquals(result3, expected3);
    }

    @Test
    public void testReverseWordCase1(){

    }
}