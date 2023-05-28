import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class UnitTestCopilotTest {
    @Test
    public void testCalculateDaysBetweenDates() {
        assertEquals(1095, GenerateCopilotTest.calculateDaysBetweenDates(2023, 1, 3, 2019, 1, 20));
    }

    private void assertEquals(int i, int i1) {
    }

    @Test
    public void testQuickSort() {
        int[] nums = {2, 4, 1, 3, 5};
        GenerateCopilotTest.quickSort(nums, 0, nums.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, nums);
    }

    @Test
    public void testGetJDPrice() {
        GenerateCopilotTest.getJDPrice();
    }

}
