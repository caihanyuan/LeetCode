import com.yuan.leetcode.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

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
    public void quest557() {
        String words = "H";
        words = Question557.reverseWords(words);
        System.out.println(words);
    }

    @Test
    public void quest682() {
        String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        int sum = Question682.calPoints(ops);
        System.out.println(sum);
    }

    @Test
    public void queset575() {
        int[] candies = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 8, 2, 3};
        int kinds = Question575.distributeCandies(candies);
        System.out.println(kinds);
    }

    @Test
    public void quest412() {
        List<String> resultList = Question412.fizzBuzz(15);
        for (String result : resultList) {
            System.out.println(result);
        }
    }

    @Test
    public void quest566(){
        int[][] datas = new int[][]{{1,2},{3,4},{5,6}};
        Question566.matrixReshape(datas, 2,3);
    }
}
