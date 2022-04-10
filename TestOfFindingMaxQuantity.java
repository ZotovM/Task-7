import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestOfFindingMaxQuantity {

    @Test
    public void testArrayWithAllZeroes() {
        int[] testingArray = new int[5];
        int actualResult = FindingMaxQuantity.countMaxNumberOfNonzeroElements(testingArray);
        int correctResult = 0;

        assertEquals(correctResult, actualResult);
    }

    @Test
    public void testArrayWithTwoZeroes() {
        int[] testingArray = new int[]{1, 2, 0, 1, 1, 2, 3, 5, 0};
        int actualResult = FindingMaxQuantity.countMaxNumberOfNonzeroElements(testingArray);
        int correctResult = 5;

        assertEquals(correctResult, actualResult);
    }

    @Test
    public void testArrayWithThreeZeroes() {
        int[] testingArray = new int[]{1, 2, 0, 1, 1, 2, 3, 5, 0, 10, 11, 4, 2, 6, 79, 100, 10, 2, 0, 1, 2, 3};
        int actualResult = FindingMaxQuantity.countMaxNumberOfNonzeroElements(testingArray);
        int correctResult = 9;

        assertEquals(correctResult, actualResult);
    }

    @Test
    public void testArrayWithOneZeroes() {
        int[] testingArray = new int[]{1, 2, 0, 1, 1, 2, 3, 5};
        int actualResult = FindingMaxQuantity.countMaxNumberOfNonzeroElements(testingArray);
        int correctResult = 2;

        assertEquals(correctResult, actualResult);
    }

    @Test
    public void testArrayWithManyZeroes() {
        int[] testingArray = new int[]{1, 2, 0, 1, 1, 0, 2, 3, 0, 5, 0, 2, 2, 2, 2, 1, 1, 1, 4, 0, 8, 7, 0};
        int actualResult = FindingMaxQuantity.countMaxNumberOfNonzeroElements(testingArray);
        int correctResult = 8;

        assertEquals(correctResult, actualResult);
    }
}
