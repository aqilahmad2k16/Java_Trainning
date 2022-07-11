// package mockito;


// public class UnitTesting {
//     Step 1 − Create an interface called CalculatorService to provide mathematical functions

// File: CalculatorService.java

// public interface CalculatorService {
//    public double add(double input1, double input2);
//    public double subtract(double input1, double input2);
// //    public double multiply(double input1, double input2);
// //    public double divide(double input1, double input2);
// // }
// // Step 2 − Create a JAVA class to represent MathApplication

// // File: MathApplication.java

// // public class MathApplication {
// //    private CalculatorService calcService;

// //    public void setCalculatorService(CalculatorService calcService){
// //       this.calcService = calcService;
// //    }
   
// //    public double add(double input1, double input2){
// //       return calcService.add(input1, input2);
// //    }
   
// //    public double subtract(double input1, double input2){
// //       return calcService.subtract(input1, input2);
// //    }
   
// //    public double multiply(double input1, double input2){
// //       return calcService.multiply(input1, input2);
// //    }
   
// //    public double divide(double input1, double input2){
// //       return calcService.divide(input1, input2);
// //    }
// // }

// Step 3 − Test the MathApplication class

// Let's test the MathApplication class, by injecting in it a mock of calculatorService. Mock will be created by Mockito.

// File: MathApplicationTester.java

// import static org.mockito.Mockito.when;

// import org.junit.Assert;
// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.runners.MockitoJUnitRunner;

// @RunWith attaches a runner with the test class to initialize the test data
// @RunWith(MockitoJUnitRunner.class)
// public class MathApplicationTester {
	
//    //@InjectMocks annotation is used to create and inject the mock object
//    @InjectMocks 
//    MathApplication mathApplication = new MathApplication();

//    //@Mock annotation is used to create the mock object to be injected
//    @Mock
//    CalculatorService calcService;

//    @Test
//    public void testAdd(){
//       //add the behavior of calc service to add two numbers
//       when(calcService.add(10.0,20.0)).thenReturn(30.00);
		
//       //test the add functionality
//       Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
//    }
// }
// }
