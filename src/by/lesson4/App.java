package by.lesson4;

public class App {
    public static void main(String[] args) {
        String[][] incorrectSizeArr1 = new String[][]{
                {"1", "6", "8", "3"},
                {"5", "8", "10", "7"},
                {"1", "1", "3", "3", "3"},
                {"6", "2", "5", "1"}
        };
        String[][] incorrectSizeArr2 = new String[][]{
                {"1", "6", "8", "3"},
                {"5", "8", "10", "7"},
                {"1", "1", "3", "3"},
                {"6", "2", "5", "1"},
                {"2", "5", "0", "2"}
        };
        String[][] incorrectDataArr = new String[][] {
                {"2", "6", "2", "3"},
                {"5", "8", "f10", "7"},
                {"g", "6", "3", "5"},
                {"6", "7", "5", "0"}
        };

        String[][] correctArr = new String[][] {
                {"2", "3", "2", "3"},
                {"5", "8", "1", "4"},
                {"2", "6", "9", "5"},
                {"6", "7", "5", "0"}
        };
        exceptionChecker(incorrectSizeArr1);
        exceptionChecker(incorrectSizeArr2);
        exceptionChecker(incorrectDataArr);
        exceptionChecker(correctArr);
    }

    public static void stringToIntSum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException("Incorrect array size");
        }
        for(int i = 0; i < 4; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Incorrect array size");
            }
        }

        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                }
                catch (Exception ex) {
                    throw new MyArrayDataException ("Incorrect data type at [" + i + "][" + j + "]");
                }
            }
        }
        System.out.println("Sum of elements: " + result);
    }

    public static void exceptionChecker(String[][] arr) {
        try {
            stringToIntSum(arr);
        }
        catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
    }
}