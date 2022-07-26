public class Main {

    public static void main(String[] args) {
        // booleans
        /*
        booleans hold 1 bit, either a 0 or 1 to indicate true or false
        true and false are written as lowercase
        to store a basic boolean, you can write:
        boolean t = true;
        or
        boolean f = false;
        like other primitive types, a boolean will be converted to a String when printed
         */
        System.out.println("-----Basic Booleans-----");
        boolean t = true;
        boolean f = false;
        System.out.println(true);           // prints true
        System.out.println(false);          // prints false

        // if statements
        /*
        an if statement will run the code inside only if its condition is met
        if (condition) {
            // CODE //
        }
        for example:
        boolean shouldRun = true;
        if (shouldRun) {
            System.out.println("It ran");
        }
        this will print It ran

        boolean shouldPrint = false;
        if (shouldPrint) {
            System.out.println("It printed");
        }
        this will not print It printed
         */
        System.out.println("-----If Statements-----");
        boolean doFirst = true;
        boolean doSecond = false;
        boolean doThird = true;
        System.out.println("doFirst: " + doFirst + ", doSecond: " + doSecond + ", doThird: " + doThird);
        if (doFirst) {
            System.out.println("doFirst was " + doFirst);       // prints
        }
        if (doSecond) {
            System.out.println("doSecond was " + doSecond);     // does not print
        }
        if (doThird) {
            System.out.println("doThird was " + doThird);       // prints
        }

        // if else statements
        /*
        you can combine an if statement with an else clause
        if the condition is true, it will run the code inside the if brackets
        if the condition is not true, it will run the code inside the else brackets
        if (condition) {
            // CODE RUNS ONLY IF CONDITION IS TRUE //
        } else {
            // CODE RUNS ONLY IF CONDITION IS FALSE //
        }
         */
        System.out.println("-----If Else Statements-----");
        boolean runIf = true;
        boolean runElse = false;
        System.out.println("runIf: " + runIf);
        if (runIf) {
            System.out.println("if (runIf) was true! if code ran");          // prints
        } else {
            System.out.println("if (runIf) was false! else code ran");       // does not print
        }
        System.out.println("runElse: " + runElse);
        if (runElse) {
            System.out.println("if (runElse) was true! if code ran");          // does not print
        } else {
            System.out.println("id (runElse) was false! else code ran");       // prints
        }

        // else if statements
        /*
        else statements can be combined with another if statement to check for more conditions
        if (condition1) {
            // CODE RUNS ONLY IF CONDITION 1 IS TRUE //
        } else if (condition2) {
            // CODE RUNS ONLY IF CONDITION 2 IS TRUE //
        } else if (condition3) {
            // CODE RUNS ONLY IF CONDITION 3 IS TRUE //
        } else if (condition4) {
            // CODE RUNS ONLY IF CONDITION 4 IS TRUE //
        } else if (condition5) {
            // CODE RUNS ONLY IF CONDITION 5 IS TRUE //
        } else {
            // CODE RUNS ONLY IF ALL PREVIOUS CONDITIONS ARE FALSE
        }
         */
        System.out.println("-----Else If Statements-----");
        boolean condition1 = false;
        boolean condition2 = false;
        boolean condition3 = false;
        boolean condition4 = true;
        boolean condition5 = false;
        System.out.println("booleans 1 to 5 in order: " + condition1 + " " + condition2 + " " + condition3 + " " + condition4 + " " + condition5);
        if (condition1) {
            System.out.println("condition1 was " + condition1);                         // does not print
        } else if (condition2) {
            System.out.println("condition2 was " + condition2);                         // does not print
        } else if (condition3) {
            System.out.println("condition3 was " + condition3);                         // does not print
        } else if (condition4) {
            System.out.println("condition4 was " + condition4);                         // prints
        } else if (condition5) {
            System.out.println("condition5 was " + condition5);                         // does not print
        } else {
            System.out.println("No conditions were true. The final else block ran");    // does not print
        }

        // compound boolean expressions
        /*
        boolean expressions may not be just a simple true or false
        booleans can be combined to represent more complicated conditions
        boolean expressions cna be modified using logical operators
        && means and
        || means or
        ! means not

        && or and requires both sides to be true for the whole compound expression to be true
        || or or requires at least one of the sides to be true for the whole compound expression to be true
        ! or not negates the boolean expression attached after it. !true is false and !false is true
         */
        System.out.println("-----Compound Boolean Expressions-----");
        System.out.println("Not true (!true): " + !true);
        System.out.println("Not false (!false): " + !false);
        System.out.println("true and true (true && true): " + (true && true));
        System.out.println("true and false (true && false): " + (true && false));
        System.out.println("false and false (false && false): " + (false && false));
        System.out.println("true or true (true || true): " + (true || true));
        System.out.println("true or false (true || false): " + (true || false));
        System.out.println("false or false (false || false): " + (false || false));

        // short circuited evaluation
        /*
        when the result of a logical comparison using && or || can be determined by just the first value, the rest of the expression will not be evaluated
        && requires both sides to be true. if the left side is false, it is immediately false and does not evaluate the right side
        boolean shortAnd = false && (true || false);
        shortAnd is immediately false after reading the false on the left side of the &&. (true || false), which is true, is never actually evaluated since it won't change the result of the && comparison either way

        || requires at least one side ot be true; if the left side is true, it is immediately true and does not evaluate the right side
        boolean shortOr = true || (false && true && false)
        shortOr is immediately true after reading the true on the left side of the ||. (false && true && false), which is false, is never actually evaluated since it won;t change the result of the || comparison either way

        short circuited and is useful later on to check that an object is not null before calling methods on it
        for example, assume there is a Person class with a isSleeping() method, and we want to run code if the person is asleep
        the following code will cause an error:
        Person noPerson = null;
        boolean asleep = noPerson.isSleeping();
        if (asleep) {
            System.out.println("Shh, it's bedtime);
        }

        however, this check works:
        Person noPerson = null;
        if (noPerson != null && noPerson.isSleeping()) {    // THIS WILL NOT CAUSE AN ISSUE
            System.out.println("Shh, it's bedtime);
        }
        the reason this code works is it will never call the method if noPerson is null. as soon as noPerson is null, the left side of the && is false. This immediately makes the entire compound expression false, and Java never attempts to evaluate the right side
         */
        System.out.println("-----Short Circuited Evaluation-----");
        String noString = null;
        if (noString != null && noString.length() > 10) {
            System.out.println("noString was not null and length was over 10");     // does not print and does not cause error
        } else {
            System.out.println("noString was null or length was not over 10");      // prints
        }

        // equivalent boolean expressions
        /*
        equivalent boolean expressions will always evaluate to the same result in all conditions
        we can use De Morgan's Laws to distribute the ! operator to expressions
        ! distributed to && becomes ||
        ! distributed to || becomes &&
        ! distributed to > becomes <=
        ! distributed to < becomes >=
        ! distributed to >= becomes <
        ! distributed to <= becomes >
        ! distributed to == becomes !=
        You can learn and practice De Morgan's Laws with booleans at https://runestone.academy/ns/books/published/apcsareview/Conditionals/cDeMorgans.html
         */
        System.out.println("-----Equivalent Boolean Expressions-----");
        // try changing first and second to different values and see if the expressions always evaluate to the same result
        double first = 5.7;
        double second = 13.5;
        System.out.println("first: " + first + ", second: " + second);
        System.out.println("!(first < 10 && second >= 20): " + !(first < 10 && second >= 20));      // will always print the same value as the line below
        System.out.println("first >= 10 || second < 20: " + (first >= 10 || second < 20));          // will always print the same value as the line above

        // comparing objects
        /*
        the == operator can be used on two variables to see if they refer to the same object
        this operator is not used to check if the content in two variables is the same
        this should only be used to check the content of primitive type variables
        many objects implement a .equals() method to check if the content inside the variables is the same
        using == on two variables only tells if the variables are the exact same object
         */
        System.out.println("-----Comparing Objects-----");
        String s1 = new String("abcde");
        String s2 = new String("abcde");
        System.out.println("s1: " + s1 + "\ns2: " + s2);
        System.out.println("s1 == s2: " + s1 == s2);                // are s1 and s2 the exact same object in memory?   false
        System.out.println("s1.equals(s2): " + s1.equals(s2));      // do s1 and s2 have the same content?              true
    }

}