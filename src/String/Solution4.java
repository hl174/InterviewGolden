package String;
/**
 * 空格替换
 * 
 * 题目描述
 * 请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，并且知道字符串的真实长度(小于等于1000)，同时保证字符串由大小写的英文字母组成。
 * 给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。
 * 测试样例：
 * "Mr John Smith”,13
 * 返回："Mr%20John%20Smith"
 * ”Hello  World”,12
 * 返回：”Hello%20%20World”
 * @author hl174
 * 时间：2016年8月31日 下午4:42:04
 */
public class Solution4 {
	 public String replaceSpace(String s, int length) {
	        // write code here
		 /**
		  * 这题当然可以用传统的方法，从前面往后面找空格，然后替换，但是这样移动的字符会比较多
		  * 既然知道总的长度，则可以尝试用两个指针来夹
		  * 当然先要遍历一次，知道有多少个空格
		  * 
		  * 44ms 603k
		  */
		 if(s==null||s.length()==0) return s;
		 int count=0;
		 for(int i=0;i<s.length();i++){
			 if(s.charAt(i)==' ')
				 count++;
		 }
		 //统计完毕空格的数量，然后用一个char数组来存放增长后的数组
		 char[] c=new char[s.length()+2*count];
		 
		 /**
		  * 用两个指针来指向两个位置p1,p2，最后p1和p2相等的话就没有空格了
		  */
		 int p1=s.length()-1,p2=c.length-1;
		 while(p1>=0&&p2>=p1){
			 if(s.charAt(p1)==' '){
				 c[p2--]='0';
				 c[p2--]='2';
				 c[p2--]='%';
			 }else{//不是空格
				c[p2--]=s.charAt(p1); 
			 }
			 
			 p1--;
		 }
		 
		 return new String(c);
	    }
}
