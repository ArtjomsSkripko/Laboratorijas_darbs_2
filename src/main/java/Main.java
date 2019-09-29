public class Main {

    public static void main(String[] args) {
        //superDigit(9875) 9+8+7+5 = 29
        //superDigit(29) 2 + 9 = 11
        //superDigit(11) 1 + 1 = 2
        //superDigit(2) = 2
        System.out.println(Solution.superDigit(9875));

        //superDigit(43645645) 4+3+6+4+5+6+4+5 = 37
        //superDigit(37) 3 + 7 = 10
        //superDigit(10) 1 + 0 = 1
        //superDigit(1) = 1
        System.out.println(Solution.superDigit(43645645));

        //superDigit(948699) 9+4+8+6+9+9 = 45
        //superDigit(45) 4 + 5 = 9
        //superDigit(9) = 9
        System.out.println(Solution.superDigit(948699));
    }

}
