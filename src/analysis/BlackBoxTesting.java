package analysis;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

public class BlackBoxTesting {
  private HashMap<String, String> testCases = new HashMap<String, String>();
  
  @Test
  public void testEvaluateGuess() {
    testCases.put("Line,Small,No,1", "No");
    testCases.put("Circle,Large,Yes,16,16", "No");
    testCases.put("Ellipse,Small,Yes,2,4", "No");
    testCases.put("Equilateral,Large,No,35,35,35", "No");
    testCases.put("Isosceles,Small,Yes,2,4,2", "No");
    testCases.put("Scalene,Large,No,49,21,31", "No");
    testCases.put("Square,Small,Yes,2,2,2,2", "No");
    testCases.put("Rectangle,Large,No,23,29,23,29", "No");
    testCases.put("Line,Large,Yes,4094", "No");
    testCases.put("Circle,Small,No,15,15", "No");
    testCases.put("Ellipse,Large,No,4095,4093", "No");
    testCases.put("Equilateral,Small,Yes,32,32,32", "No");
    testCases.put("Isosceles,Large,No,4095,4093,4095", "No");
    testCases.put("Scalene,Small,Yes,34,36,30", "No");
    testCases.put("Square,Large,No,4095,4095,4095,4095", "No");
    testCases.put("Rectangle,Small,Yes,25,24,25,24", "No");
    testCases.put("Line,Large,No,99", "Yes");
    testCases.put("Circle,Small,Yes,16,16", "Yes");
    testCases.put("Ellipse,Small,No,15,17", "Yes");
    testCases.put("Equilateral,Large,No,33,33,33", "Yes");
    testCases.put("Isosceles,Small,Yes,33,34,34", "Yes");
    testCases.put("Scalene,Small,Yes,32,34,36", "Yes");
    testCases.put("Square,Small,No,27,27,27,27", "Yes");
    testCases.put("Rectangle,Large,Yes,26,24,26,24", "Yes");
    testCases.put("Line,Large,No,102", "Yes");
    testCases.put("Circle,Small,Yes,15,15", "Yes");
    testCases.put("Ellipse,Large,No,24,26", "Yes");
    testCases.put("Equilateral,Small,No,32,32,32", "Yes");
    testCases.put("Isosceles,Small,Yes,33,33,33", "Yes");
    testCases.put("Scalene,Small,Yes,33,35,31", "Yes");
    testCases.put("Square,Large,Yes,27,27,27,27", "Yes");
    testCases.put("Rectangle,Large,Yes,3,49,3,49", "Yes");
    testCases.put("Circle,Large,No,17,27", "Yes");
    testCases.put("Equilateral,Small,Yes,32,34,34", "Yes");
    testCases.put("Isosceles,Large,No,113,211,99", "Yes");
    testCases.put("Scalene,Large,Yes,48,6,48", "Yes");
    testCases.put("Square,Small,Yes,2,4,2,4", "Yes");
    testCases.put("Rectangle,Small,No,23,25,27,25", "Yes");
    testCases.put("Circle,Large,No,103", "Yes");
    testCases.put("Ellipse,Small,Yes,16", "Yes");
    testCases.put("Equilateral,Large,Yes,52,52", "Yes");
    testCases.put("Isosceles,Small,Yes,1,1", "Yes");
    testCases.put("Scalene,Large,Yes,50,52", "Yes");
    testCases.put("Square,Small,No,33,33,33", "Yes");
    testCases.put("Rectangle,Small,No,25,25,25", "Yes");
    testCases.put("Line,Large,No,101,1", "Yes");
    testCases.put("Circle,Small,Yes,2,2,2", "Yes");
    testCases.put("Ellipse,Large,No,111,1107,1113", "Yes");
    testCases.put("Equilateral,Small,No,23,23,23,23", "Yes");
    testCases.put("Isosceles,Small,No,13,1,13,1", "Yes");
    testCases.put("Scalene,Small,Yes,24,26,22,28", "Yes");
    testCases.put("Isosceles,Large,No,39,39,701", "Yes");
    testCases.put("Scalene,Small,Yes,2,4,8", "Yes");
    testCases.put("Ellipse,Large,No,15,17", "No");
    testCases.put("Isosceles,Small,Yes,2,4,2", "No");
    testCases.put("Rectangle,Small,Yes,2,1,2,1", "No");
    
    ShapeClassifier classifier = new ShapeClassifier();
    
    Iterator<Entry<String, String>> it = testCases.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry<String, String> testCase = it.next();
        it.remove(); // avoids a ConcurrentModificationException
        Assert.assertEquals(testCase.getValue(), classifier.evaluateGuess(testCase.getKey()));
    }
  }
}
