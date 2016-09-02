package String;
/**
 *确定两串乱序同构
 *
 *题目描述
 *给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。这里规定大小写为不同字符，且考虑字符串重点空格。
 *给定一个string stringA和一个string stringB，请返回一个bool，代表两串是否重新排列后可相同。保证两串的长度都小于等于5000。
 *测试样例：
 *"This is nowcoder","is This nowcoder"
 *返回：true
 *"Here you are","Are you here"
 *返回：false
 * @author hl174
 * 时间：2016年8月31日 下午4:37:18
 */
public class Solution3 {
	 public boolean checkSam(String stringA, String stringB) {
            /**
             * 第一思路想到的就是用哈希表来村粗一个个的单词，当然是要在对两个字符串进行字符串模式分割后
             * 
             * 后来发现是对空格和字符，则用ascii码的数组来检查是一样的
             * 
             * 57ms 1367k
             */
		 if(stringA.length()!=stringB.length()) return false;
	      int[] a=new int[256];
	      int[] b=new int[256];
	      for (int i = 0; i <stringA.length(); i++) {
		          a[stringA.charAt(i)]++;
		          b[stringB.charAt(i)]++;
		}
	      for (int i = 0; i < 256; i++) {
			if(a[i]!=b[i])
				return false;
		}
	        return true;
	    }
}
