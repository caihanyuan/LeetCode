import com.yuan.leetcode.Question461;
import com.yuan.leetcode.Question557;
import com.yuan.leetcode.Question561;
import com.yuan.leetcode.Question657;
import org.junit.Assert;
import org.junit.Test;

public class QuestionTest {

    @Test
    public void queset461() {
        int distance = new Question461().hammingDistance(0, 1);
        System.out.print("distance: " + distance);
        Assert.assertEquals(1, distance);
    }

    @Test
    public void quest657() {
        String steps = "UURRDDLL";
        Assert.assertTrue(Question657.judgeCircle(steps));
    }

    @Test
    public void quest561() {
        int arr[] = {1, 4, 3, 2, 8, 7};
        int sum = Question561.arrayPairSum(arr);
        System.out.println(sum);
    }

    @Test
    public void quest557(){
        String words = "H";
        words = Question557.reverseWords(words);
        System.out.println(words);
    }
}
