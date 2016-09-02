package String;
/**
 * 翻转子串
 * 
 * 题目描述
 * 假定我们都知道非常高效的算法来检查一个单词是否为其他字符串的子串。请将这个算法编写成一个函数，给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成，要求只能调用一次检查子串的函数。
 * 给定两个字符串s1,s2,请返回bool值代表s2是否由s1旋转而成。字符串中字符为英文字母和空格，区分大小写，字符串长度小于等于1000。
 * 测试样例：
 * "Hello world","worldhello "
 * 返回：false
 * "waterbottle","erbottlewat"
 * 返回：true
 * 
 * @author hl174
 * 时间：2016年9月1日 下午4:03:15
 */
public class Solution8 {
	 public boolean checkReverseEqual(String s1, String s2) {
	      /**
	       * s1=xy
	       * 
	       * s2=yx
	       * 
	       * s1s1=xyxy
	       * 
	       * 所以s2一定是s1s1的子串
	       *   
	       *  当然你非要用计算ascii码的方法来计算也无可厚非
	       *   
	       *   34ms 796k
	       */
		 if(s1.length()!=s2.length()) return false;
		return (s1+s1).contains(s2);
	    }
}
