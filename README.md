Author - Artjoms Skripko 101RMC169 Group Nr. 4;  169 % 2 = 1

Description of task: 1) Recursive Digit Sum

                     We define super digit of an integer using the following rules:
                     Given an integer, we need to find the super digit of the integer.
                     - If x has only 1 digit, then its super digit is x.
                     - Otherwise, the super digit of x is equal to the super digit of the sum of the digits of x.
                     For example, the super digit of 9875 will be calculated as:

                     superDigit(9875) 9+8+7+5 = 29
                     superDigit(29) 2 + 9 = 11
                     superDigit(11) 1 + 1 = 2
                     superDigit(2) = 2

                     public class Solution {

                     static long superDigit(long x) {
                     // TODO
                     }
                     }

SolutionTest class consists of 6 unit tests:
    1)testSuperDigit9875
    2)testSuperDigit29
    3)testSuperDigit11
    4)testSuperDigit2
    5)testSuperDigit43645645
    6)testSuperDigit948699