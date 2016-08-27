package String;
/**
 * 确定字符互异
 * @author HL
 *题目描述
 *请实现一个算法，确定一个字符串的所有字符是否全都不同。这里我们要求不允许使用额外的存储结构。
 *给定一个string iniString，请返回一个bool值,True代表所有字符全都不同，False代表存在相同的字符。保证字符串中的字符为ASCII字符。字符串的长度小于等于3000。
 *测试样例：
 *"aeiou"
 *返回：True
 *"BarackObama"
 *返回：False
 */
public class Solution1 {
    public static boolean checkDifferent(String iniString) {
        /**
         * 首先得考虑是ASCII字符串还是Unicode字符串
         * 若是ASCII字符串，则只有256个字符，不然就用Character的最大长度也行，但是有点浪费空间
         * 经过测试，貌似是65536个
         * 
         * 39ms 2484k
         */
    	if(iniString.trim().length()>256) return false;
    	int []c=new int[65536];
    	for(int i=0;i<iniString.length();i++){
    		System.out.println(iniString.charAt(i)-'0');
    		if(c[iniString.charAt(i)]==1)//iniString.charAt(i)-'0'是错的，会为负数，因为 Unicode：65536种码字，ASCII：256种
    			return false;
    		c[iniString.charAt(i)]=1;
    	}
    	return true;
    	
    }
    public static void main1(String[] args) {
		System.out.println(checkDifferent("D-5H0F6T%Z?QM9,\72:[A8X! ;YJ#"));
	}
    
    public static void main(String[] args) {

        System.out.println(test5());
    }

    public static int test5() {
        int b = 20;

        try {
            System.out.println("try block");
            
            b = b /0;

            return b += 80;
        } catch (Exception e) {

            System.out.println("catch block");
            return b += 15;
        } finally {

            System.out.println("finally block");

            if (b > 25) {
                System.out.println("b>25, b = " + b);
            }

             b += 50;
        }

        //return b;
    }
}
