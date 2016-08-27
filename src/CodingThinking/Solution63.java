package CodingThinking;
/**
 * 无判断max
 * @author HL
 *题目描述
 *请编写一个方法，找出两个数字中最大的那个。条件是不得使用if-else等比较和判断运算符。
 *给定两个int a和b，请返回较大的一个数。若两数相同则返回任意一个。
 *测试样例：
 *1，2
 *返回：2
 *
 *64ms 854k
 */
public class Solution63 {
    public int getMax(int a, int b) {
      int gap=(a-b)>>31;//正数右移31位肯定为0，负数右移31位结果为-1

      return a+gap*(a-b);
    }
    public static void main(String[] args) {
		System.out.println(0>>31);
		System.out.println(1113>>31);
		System.out.println(-3>>31);
		System.out.println(-123>>31);
	}
}
