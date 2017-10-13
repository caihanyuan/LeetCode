import com.yuan.leetcode.Question461;
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
}
