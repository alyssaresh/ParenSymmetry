import java.util.Arrays;
import java.util.List;

public class ParenSymmetry {

    public Boolean isBalanced(String s) {
        String str = s;
        char paren = '(';
        char thesis = ')';
        int parenCount = 0;
        int thesisCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == paren) {
                parenCount++;
            } else if (str.charAt(i) == thesis) {
                thesisCount++;
            }
        }
            if (parenCount == thesisCount) {
                return true;
            } else {
                return false;
            }
    }

    private void checkFile(String filename) {
        // open file named filename

        // for each line in the file
            // read the line
            // print whether or not the line's parenthesis are balanced

        // CLOSE the file
    }

    public static void main(String[] args) {
        ParenSymmetry ps = new ParenSymmetry();

        Boolean b0 = ps.isBalanced("()");
        printResult(b0, true);

        String[] falseStrings = {"(", "((", ")", "", "(()())((())))"};
        Boolean falses = true;
        for (String strToTest : falseStrings) {
            falses = ps.isBalanced(strToTest);
        }
        printResult(falses, false);

        String[] trueStrings = {"()", "(())", "(((())))", "", "(()())((()))", "(   )", "( () ( ) )"};
        Boolean trues = false;
        for (String strToTest : trueStrings) {
            trues = ps.isBalanced(strToTest);
        }
        printResult(trues, true);

    }

    private static void printResult(Boolean b0, boolean b) {
        if (b0 == null) {
            System.out.println("Null Failure");
            return;
        }
        if (b0 == b) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }
}
