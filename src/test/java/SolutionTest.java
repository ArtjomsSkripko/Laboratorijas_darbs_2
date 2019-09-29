import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testSuperDigit9875(){
        //superDigit(9875) 9+8+7+5 = 29
        //superDigit(29) 2 + 9 = 11
        //superDigit(11) 1 + 1 = 2
        //superDigit(2) = 2
        assertThat(Solution.superDigit(9875)).isEqualTo(2);
    }

    @Test
    public void testSuperDigit29(){
        //superDigit(29) 2 + 9 = 11
        //superDigit(11) 1 + 1 = 2
        //superDigit(2) = 2
        assertThat(Solution.superDigit(29)).isEqualTo(2);
    }

    @Test
    public void testSuperDigit11(){
        //superDigit(11) 1 + 1 = 2
        //superDigit(2) = 2
        assertThat(Solution.superDigit(11)).isEqualTo(2);
    }

    @Test
    public void testSuperDigit2(){
        //superDigit(2) = 2
        assertThat(Solution.superDigit(2)).isEqualTo(2);
    }

    @Test
    public void testSuperDigit43645645(){
        //superDigit(43645645) 4+3+6+4+5+6+4+5 = 37
        //superDigit(37) 3 + 7 = 10
        //superDigit(10) 1 + 0 = 1
        //superDigit(1) = 1
        assertThat(Solution.superDigit(43645645)).isEqualTo(1);
    }

    @Test
    public void testSuperDigit948699(){
        //superDigit(948699) 9+4+8+6+9+9 = 45
        //superDigit(45) 4 + 5 = 9
        //superDigit(9) = 9
        assertThat(Solution.superDigit(948699)).isEqualTo(9);
    }
}
