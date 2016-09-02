package String;
/**
 * 原串翻转
 * 
 * 题目描述
 * 请实现一个算法，在不使用额外数据结构和储存空间的情况下，翻转一个给定的字符串(可以使用单个过程变量)。
 * 给定一个string iniString，请返回一个string，为翻转后的字符串。保证字符串的长度小于等于5000。
 * 测试样例：
 * "This is nowcoder"
 * 返回："redocwon si sihT"
 * 
 * 
 * @author hl174
 * 时间：2016年8月31日 下午4:27:59
 */
public class Solution2 {
    public String reverseString(String iniString) {
    	/**
    	 * 这题的不能开辟存储空间不知道具体指啥，
    	 * 
    	 * 47ms 973k
    	 */
        // write code here
        if(iniString==null||iniString.trim().length()==0) return iniString;
//前后交换就好
int i=0,j=iniString.length()-1;
char[] chs=iniString.toCharArray();
while(i<j){
	char ch=chs[i];
	chs[i]=chs[j];
	chs[j]=ch;
	i++;
	j--;
}
return new String(chs);
    }
}
