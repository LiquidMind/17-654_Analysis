package analysis;

import org.junit.Assert;
import org.junit.Test;

public class BlackBoxTesting {
  @Test
  public void testEvaluateGuess() {
    Assert.assertEquals("Line,Small,No,1", "Yes");
    Assert.assertEquals("Circle,Large,Yes,16,16", "Yes");
    Assert.assertEquals("Ellipse,Small,Yes,2,4", "Yes");
    Assert.assertEquals("Equilateral,Large,No,35,35,35", "Yes");
    Assert.assertEquals("Isosceles,Small,Yes,2,4,2", "Yes");
    Assert.assertEquals("Scalene,Large,No,49,21,31", "Yes");
    Assert.assertEquals("Square,Small,Yes,2,2,2,2", "Yes");
    Assert.assertEquals("Rectangle,Large,No,23,29,23,29", "Yes");
    Assert.assertEquals("Line,Large,Yes,4094", "Yes");
    Assert.assertEquals("Circle,Small,No,15,15", "Yes");
    Assert.assertEquals("Ellipse,Large,No,4095,4093", "Yes");
    Assert.assertEquals("Equilateral,Small,Yes,32,32,32", "Yes");
    Assert.assertEquals("Isosceles,Large,No,4095,4093,4095", "Yes");
    Assert.assertEquals("Scalene,Small,Yes,34,36,30", "Yes");
    Assert.assertEquals("Square,Large,No,4095,4095,4095,4095", "Yes");
    Assert.assertEquals("Rectangle,Small,Yes,25,24,25,24", "Yes");
    Assert.assertEquals("Line,Large,No,99", "No");
    Assert.assertEquals("Circle,Small,Yes,16,16", "No");
    Assert.assertEquals("Ellipse,Small,No,15,17", "No");
    Assert.assertEquals("Equilateral,Large,No,33,33,33", "No");
    Assert.assertEquals("Isosceles,Small,Yes,33,34,34", "No");
    Assert.assertEquals("Scalene,Small,Yes,32,34,36", "No");
    Assert.assertEquals("Square,Small,No,27,27,27,27", "No");
    Assert.assertEquals("Rectangle,Large,Yes,26,24,26,24", "No");
    Assert.assertEquals("Line,Large,No,102", "No");
    Assert.assertEquals("Circle,Small,Yes,15,15", "No");
    Assert.assertEquals("Ellipse,Large,No,24,26", "No");
    Assert.assertEquals("Equilateral,Small,No,32,32,32", "No");
    Assert.assertEquals("Isosceles,Small,Yes,33,33,33", "No");
    Assert.assertEquals("Scalene,Small,Yes,33,35,31", "No");
    Assert.assertEquals("Square,Large,Yes,27,27,27,27", "No");
    Assert.assertEquals("Rectangle,Large,Yes,3,49,3,49", "No");
    Assert.assertEquals("Circle,Large,No,17,27", "No");
    Assert.assertEquals("Equilateral,Small,Yes,32,34,34", "No");
    Assert.assertEquals("Isosceles,Large,No,113,211,99", "No");
    Assert.assertEquals("Scalene,Large,Yes,48,6,48", "No");
    Assert.assertEquals("Square,Small,Yes,2,4,2,4", "No");
    Assert.assertEquals("Rectangle,Small,No,23,25,27,25", "No");
    Assert.assertEquals("Circle,Large,No,103", "No");
    Assert.assertEquals("Ellipse,Small,Yes,16", "No");
    Assert.assertEquals("Equilateral,Large,Yes,52,52", "No");
    Assert.assertEquals("Isosceles,Small,Yes,1,1", "No");
    Assert.assertEquals("Scalene,Large,Yes,50,52", "No");
    Assert.assertEquals("Square,Small,No,33,33,33", "No");
    Assert.assertEquals("Rectangle,Small,No,25,25,25", "No");
    Assert.assertEquals("Line,Large,No,101,1", "No");
    Assert.assertEquals("Circle,Small,Yes,2,2,2", "No");
    Assert.assertEquals("Ellipse,Large,No,111,1107,1113", "No");
    Assert.assertEquals("Equilateral,Small,No,23,23,23,23", "No");
    Assert.assertEquals("Isosceles,Small,No,13,1,13,1", "No");
    Assert.assertEquals("Scalene,Small,Yes,24,26,22,28", "No");
    Assert.assertEquals("Isosceles,Large,No,39,39,701", "No");
    Assert.assertEquals("Scalene,Small,Yes,2,4,8", "No");
    Assert.assertEquals("Ellipse,Large,No,15,17", "Yes");
    Assert.assertEquals("Isosceles,Small,Yes,2,4,2", "Yes");
    Assert.assertEquals("Rectangle,Small,Yes,2,1,2,1", "Yes");
  }
}
