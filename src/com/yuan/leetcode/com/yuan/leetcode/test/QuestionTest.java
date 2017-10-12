import com.yuan.leetcode.Question461;
import org.junit.Assert;
import org.junit.Test;

public class QuestionTest {

    @Test
    public void queset461() {
        int distance = new Question461().hammingDistance(0, 1);
        System.out.print("distance: " + distance);
        Assert.assertEquals(1, distance);
    }
}
