public class ExceptionHandlingExample {
    public static void main(String[] args) {
            // Exception handling for division
                    try {
                                // Code that may throw an exception
                                            int result = 10 / 0;  // This will cause ArithmeticException
                                                        System.out.println("Result: " + result);
                                                                } catch (ArithmeticException e) {
                                                                            // Handle the specific exception
                                                                                        System.out.println("Caught an ArithmeticException: " + e.getMessage());
                                                                                                } finally {
                                                                                                            // Code in the finally block always executes
                                                                                                                        System.out.println("This is the finally block for division operation.");
                                                                                                                                }
                                                                                                                                
                                                                                                                                        System.out.println(); // Blank line for separation
                                                                                                                                        
                                                                                                                                                // Exception handling for array access
                                                                                                                                                        try {
                                                                                                                                                                    // Create an array of size 3
                                                                                                                                                                                int[] numbers = new int[3];
                                                                                                                                                                                
                                                                                                                                                                                            // Add numbers to the array
                                                                                                                                                                                                        numbers[0] = 10;
                                                                                                                                                                                                                    numbers[1] = 20;
                                                                                                                                                                                                                                numbers[2] = 30;
                                                                                                                                                                                                                                
                                                                                                                                                                                                                                            // Attempt to access 
