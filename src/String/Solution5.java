package String;

/**
 * 基本字符串压缩
 * 
 * 题目描述
 * 利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。若压缩后的字符串没有变短，则返回原先的字符串。
 * 给定一个string iniString为待压缩的串(长度小于等于10000)，保证串内字符均由大小写英文字母组成，返回一个string，为所求的压缩后或未变化的串
 * 测试样例
 * "aabcccccaaa"
 * 返回："a2b1c5a3"
 * "welcometonowcoderrrrr"
 * 返回："welcometonowcoder5"


 * @author hl174
 * 时间：2016年8月31日 下午6:25:05
 */
public class Solution5 {
	 public static String zipString(String s) {
		 /**
		  * 字符串压缩，感觉就用一个last，一个count就可以搞定了
		  *
		  * 73ms 9467k
		  */
		 if(s==null||s.length()==0) return s;
		 String result="";
		 char last=' ';
		 int count=0;
		 for(int i=0;i<s.length();i++){
			 if(i==0){
				 last=s.charAt(0);
				 count=1;
			 }else{
				 if(s.charAt(i)==last){
					 count++;
				 }else{
					 result+=last+""+count;
					 last=s.charAt(i);
					 count=1;
					 
				 }
			 }
			 
		 }
		 result+=last+""+count;
		 
		 if(result.length()>=s.length())
			 return s;
	     return result; 
		 // write code here
	     
	     /**
	         StringBuffer sb=new StringBuffer();
 	      int i;
	      for ( i = 0; i < iniString.length(); ) {
	    	  int j;
			  for( j=i;j<iniString.length();j++){
				  if(iniString.charAt(i)!=iniString.charAt(j)){
					  sb.append(iniString.charAt(i)+""+(j-i));				  
					  break;
				  }
			  }
			  if(j==iniString.length()){
				  sb.append(iniString.charAt(i)+""+(j-i));	
			  }
              if(sb.toString().length()>iniString.length())
					 return iniString;
              i=j;
		}
	     return sb.toString().length()>iniString.length()?iniString:sb.toString(); 
	       
	      
	      */
	    }
	
	public static void main(String[] args) {
		System.out.println(zipString("welcometonowcoderrrrr"));
	}
	
/*	  public static int nQueens(int n) {
		  
		  public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			while(sc.hasNextInt()){
				int[][]a=new int[7][7];
				int[]flag=new int[7];//标记，下标表示星期，值表示和尚
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a.length; j++) {
						a[i][j]=sc.nextInt();
					}
				}//数据处理完毕
				ArrayList<ArrayList<Integer>> result=new ArrayList<>();
		 		huisu(0,result,flag,a);
		 		System.out.println("一共有："+result.size()+"种解法");
		 		for(ArrayList<Integer> list:result){
		 			for(int i=0;i<list.size()-1;i++){
		 				System.out.print(list.get(i)+1+" ");
		 			}
		 			System.out.println(list.get(list.size()-1)+1);
		 		}
			}
		}
		public static void huisu(int j,	ArrayList<ArrayList<Integer>> result,int[]flag,int[][]a){
			if(j>=7){
				ArrayList<Integer> t=new ArrayList<>();
				for(int j1=0;j1<7;j1++){
					t.add(flag[j1]);		
				}
				result.add(t);//一次结束
				return;
			}
			
			//i要从0到n
			for(int i=0;i<7;i++){
				flag[j]=i;
				if(a[i][j]==1&&check(j,flag)){
					huisu(j+1, result, flag,a);
				}
			}	
		}
		public static boolean check(int index,int[] flag){
			
			for(int j=0;j<index;j++){
				if(flag[j]==flag[index])
					return false;
			}
			return true;
		}
	      *//**
	     * 
	     * 用一个n长的一维数组来存储数据，下标就是行号，这样就保证了行唯一，然后值就是列中的左边，容易判断
	     * 最后是判断正负对角线，|row-i|=|col-a[i]| 这样就是元素在一条对角线上
	     * 
	     *//*
		   //1，使用回溯递归法
		    int result[]=new int[1];//计数的,下标从1开始，免得麻烦
		   int value[]=new int[n+1];//值表示列的索引，默认都是0则没有
		   findQueens(1,n,value,result);
		   return result[0];
	   }
	    
	   *//**
	    * 行号和结果
	    * @param i
	    * @param count
	    *//*
	      public static void findQueens(int i,int n,int []value, int[] result) {
		     int []temp=new int[n+1];//保存值
		     if(i>n){//一次遍历结束
		    	 result[0]++;
	            *//**
		    	  * 打印所有的值
		    	  *//*
	             
		    	 for(int i1=1;i1<=n;i1++){
		    		 System.out.print(value[i1]);
		    	 }
	             System.out.println("一次查找结束");//打印列位置索引
	             
	             return;
		     }
		     //否则遍历回溯
		     for(int j=1;j<=n;j++){
		    	 value[i]=j;//一维数组存储
		    	 if(checkPlace(value, i)){
	                findQueens(i+1, n, value, result);//继续下一行查找	    		 
		    	 }    	 
		     }  
	        }
	   
	      public static boolean checkPlace(int []value,int index){
	    	 *//**
	    	   * 检查当前位置是否可放
	    	   *//*
	    	  for(int i=1;i<index;i++){
	    		  if(value[i]==value[index]||Math.abs(value[i]-value[index])==Math.abs(i-index))
	    			  return false;
	    	  }
	    	  return true;
	    }
	      
	      public static void main(String[] args) {
			  System.out.println(nQueens(4));
		}*/
}
