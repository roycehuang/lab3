import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlace2(){
    int[] input2 = {1, 2};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{2,1}, input2);
  }

  @Test
  public void testReverseInPlace3(){
    int[] input3 = {1,2,3};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{3,2,1}, input3);
    //assertArrayEquals(new int[]{3,2,3}, input3);
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed1(){
    int[] input2 = { 3 };
    ArrayExamples.reversed(input2);
    assertArrayEquals(new int[]{3}, input2);
  }

  @Test
  public void testReversed2(){
    int[] input3 = {2, 3};
    assertArrayEquals(new int[]{3,2}, ArrayExamples.reversed(input3));
  }

  @Test
  public void testReversed3(){
    int[] input4 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input4));
  }

  @Test
  public void testaverageWithoutLowest(){
    double[] input1 = {5,10};
    double output = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(10.0, output, 0.0001);
  }
}

