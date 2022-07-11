package Java8Features.FunctionalInterface;

// import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;

public class MethodReferencing {
    // Method references are a special type of lambda expressions. They're often
    // used to create simple lambda expressions by referencing existing methods.

    // There are four kinds of method references:

    // Static methods
    // Instance methods of particular objects
    // Instance methods of an arbitrary object of a particular type
    // Constructor

    //1st Reference to a Static Method

    List<String>  message = Arrays.asList("apple", "banana", "pineapple");
    //simple lambda expression calling the StringUtils.capitalize() method directly:

    // message.forEach(e -> StringUtils.capitalize(e));
    //
    //we can use a method reference to simply refer to the capitalize static method

    // message.forEach(StringUtils::capitalize);


    //2nd Reference to an Instance Method of a Particular Object


}
