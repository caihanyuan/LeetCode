import com.yuan.leetcode.QuickSort;
import org.junit.Test;

public class SortTest {

    @Test
    public void quickSort() {
        int[] sortArr = {7, 2, 5, 3, 4, 9, 8, 10, 16, 13, 15, 5};
        QuickSort.quickSort(sortArr, 0, sortArr.length - 1);

        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + ", ");
        }
    }
}
