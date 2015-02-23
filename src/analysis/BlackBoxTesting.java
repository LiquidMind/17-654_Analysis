package analysis;

import org.junit.Assert;
import org.junit.Test;

public class BlackBoxTesting {
  @Test
  public void testEvaluateGuess() {
    ShapeClassifier c = new ShapeClassifier();
    
    Assert.assertEquals("Yes", c.evaluateGuess("Line,Small,No,1"));
    Assert.assertEquals("Yes", c.evaluateGuess("Circle,Small,Yes,16,16"));
    Assert.assertEquals("Yes", c.evaluateGuess("Ellipse,Small,Yes,2,4"));
    Assert.assertEquals("Yes", c.evaluateGuess("Equilateral,Large,No,35,35,35"));
    Assert.assertEquals("No", c.evaluateGuess("Isosceles,Small,Yes,2,4,2"));
    Assert.assertEquals("Yes", c.evaluateGuess("Scalene,Large,No,49,21,31"));
    Assert.assertEquals("Yes", c.evaluateGuess("Square,Small,Yes,2,2,2,2"));
    Assert.assertEquals("Yes", c.evaluateGuess("Rectangle,Large,No,23,29,23,29"));
    Assert.assertEquals("Yes", c.evaluateGuess("Line,Large,Yes,4094"));
    Assert.assertEquals("Yes", c.evaluateGuess("Circle,Small,No,15,15"));
    Assert.assertEquals("Yes", c.evaluateGuess("Ellipse,Large,No,4095,4093"));
    Assert.assertEquals("Yes", c.evaluateGuess("Equilateral,Small,Yes,32,32,32"));
    Assert.assertEquals("Yes", c.evaluateGuess("Isosceles,Large,No,4095,4093,4095"));
    Assert.assertEquals("Yes", c.evaluateGuess("Scalene,Small,Yes,34,36,30"));
    Assert.assertEquals("Yes", c.evaluateGuess("Square,Large,No,4095,4095,4095,4095"));
    Assert.assertEquals("Yes", c.evaluateGuess("Rectangle,Small,Yes,25,24,25,24"));
    Assert.assertEquals("No", c.evaluateGuess("Line,Large,No,99"));
    Assert.assertEquals("No", c.evaluateGuess("Circle,Small,Yes,16,16"));
    Assert.assertEquals("No", c.evaluateGuess("Ellipse,Small,No,15,17"));
    Assert.assertEquals("No", c.evaluateGuess("Equilateral,Large,No,33,33,33"));
    Assert.assertEquals("No", c.evaluateGuess("Isosceles,Small,Yes,33,34,34"));
    Assert.assertEquals("No", c.evaluateGuess("Scalene,Small,Yes,32,34,36"));
    Assert.assertEquals("No", c.evaluateGuess("Square,Small,No,27,27,27,27"));
    Assert.assertEquals("No", c.evaluateGuess("Rectangle,Large,Yes,26,24,26,24"));
    Assert.assertEquals("No", c.evaluateGuess("Line,Large,No,102"));
    Assert.assertEquals("No", c.evaluateGuess("Circle,Small,Yes,15,15"));
    Assert.assertEquals("No", c.evaluateGuess("Ellipse,Large,No,24,26"));
    Assert.assertEquals("No", c.evaluateGuess("Equilateral,Small,No,32,32,32"));
    Assert.assertEquals("No", c.evaluateGuess("Isosceles,Small,Yes,33,33,33"));
    Assert.assertEquals("No", c.evaluateGuess("Scalene,Small,Yes,33,35,31"));
    Assert.assertEquals("No", c.evaluateGuess("Square,Large,Yes,27,27,27,27"));
    Assert.assertEquals("No", c.evaluateGuess("Rectangle,Large,Yes,3,49,3,49"));
    Assert.assertEquals("No", c.evaluateGuess("Circle,Large,No,17,27"));
    Assert.assertEquals("No", c.evaluateGuess("Equilateral,Small,Yes,32,34,34"));
    Assert.assertEquals("No", c.evaluateGuess("Isosceles,Large,No,113,211,99"));
    Assert.assertEquals("No", c.evaluateGuess("Scalene,Large,Yes,48,6,48"));
    Assert.assertEquals("No", c.evaluateGuess("Square,Small,Yes,2,4,2,4"));
    Assert.assertEquals("No", c.evaluateGuess("Rectangle,Small,No,23,25,27,25"));
    Assert.assertEquals("No", c.evaluateGuess("Circle,Large,No,103"));
    Assert.assertEquals("No", c.evaluateGuess("Ellipse,Small,Yes,16"));
    Assert.assertEquals("No", c.evaluateGuess("Equilateral,Large,Yes,52,52"));
    Assert.assertEquals("No", c.evaluateGuess("Isosceles,Small,Yes,1,1"));
    Assert.assertEquals("No", c.evaluateGuess("Scalene,Large,Yes,50,52"));
    Assert.assertEquals("No", c.evaluateGuess("Square,Small,No,33,33,33"));
    Assert.assertEquals("No", c.evaluateGuess("Rectangle,Small,No,25,25,25"));
    Assert.assertEquals("No", c.evaluateGuess("Line,Large,No,101,1"));
    Assert.assertEquals("No", c.evaluateGuess("Circle,Small,Yes,2,2,2"));
    Assert.assertEquals("No", c.evaluateGuess("Ellipse,Large,No,111,1107,1113"));
    Assert.assertEquals("No", c.evaluateGuess("Equilateral,Small,No,23,23,23,23"));
    Assert.assertEquals("No", c.evaluateGuess("Isosceles,Small,No,13,1,13,1"));
    Assert.assertEquals("No", c.evaluateGuess("Scalene,Small,Yes,24,26,22,28"));
    Assert.assertEquals("No", c.evaluateGuess("Isosceles,Large,No,39,39,701"));
    Assert.assertEquals("No", c.evaluateGuess("Scalene,Small,Yes,2,4,8"));
    Assert.assertEquals("Yes", c.evaluateGuess("Ellipse,Large,No,15,17"));
    Assert.assertEquals("Yes", c.evaluateGuess("Isosceles,Small,Yes,2,4,2"));
    Assert.assertEquals("Yes", c.evaluateGuess("Rectangle,Small,Yes,2,1,2,1"));
 }
}
