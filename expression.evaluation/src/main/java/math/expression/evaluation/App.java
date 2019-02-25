package math.expression.evaluation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         System.out.println(BinaryExpression.evaluate("10 + 2 * 6")); 
        System.out.println(BinaryExpression.evaluate("100 * 2 + 12")); 
        System.out.println(BinaryExpression.evaluate("100 * ( 2 + 12 )")); 
        System.out.println(BinaryExpression.evaluate("100 * ( 2 + 12 ) / 14")); 
    }
}
