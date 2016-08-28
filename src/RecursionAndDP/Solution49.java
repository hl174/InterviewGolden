package RecursionAndDP;
/**
 * n皇后问题
 * @author HL
 *题目描述
 *请设计一种算法，解决著名的n皇后问题。这里的n皇后问题指在一个nxn的棋盘上放置n个棋子，使得每行每列和每条对角线上都只有一个棋子，求其摆放的方法数。
 *给定一个int n，请返回方法数，保证n小于等于10
 *测试样例：
 *1
 *返回：1
 */
public class Solution49 {
	/* public static int nQueens(int n) {
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
	    	 /**
	    	   * 检查当前位置是否可放
	    	   
	    	  for(int i=1;i<index;i++){
	    		  if(value[i]==value[index]||Math.abs(value[i]-value[index])==Math.abs(i-index))
	    			  return false;
	    	  }
	    	  return true;
	    }
   */
	
	 public static int nQueens(int n) {
	     /**
	      * n皇后只是每行、每列和对角线不能有两个，对角线就是正负两个
	      */
	        // write code here
	    int []flag=new int[n];//下标表示列，值表示行,这里最好这样表示，如果单独分为i,j，后面没办法串联起来i和j
	     count=0;
		 huisu(0,flag, n);
	      return count;
	    }
	    public static  int count;
	    
	    public static void huisu(int j,int[] flag,int n){
	    	/**
	    	 * 回溯的时候，从第0列开始找，然后每列中从0到n试探
	    	 */
	           if(j>=n){
	        	   count++;	//检查完毕
	           return;
	           }
	           for(int i=0;i<n;i++){
	        	   flag[j]=i;//这里就是类似的回退，每次都是直接覆盖,检查的时候都是从j前面的检查，已经覆盖完了，所以后面没有回退的步骤
	        	   if(checkXL(j,flag)){
	        		   //当前点可行，则进行下一步
	            	    
	            	   huisu(j+1, flag, n);//下一列
	           }	
	           }
	    }
	    
	    /**
	     * 检查对角线上是否满足条件
	     */
	   public static boolean checkXL(int j,int flag[]){
	      /**
	       * 这里题目假定的是判定是主对角线
	       * 
	       */
		   for(int k=0;k<j;k++){
			   //行重复或者对角线
			   if(flag[k]==flag[j]||Math.abs(flag[k]-flag[j])==Math.abs(k-j))
	 			  return false;
		   }
		   return true;	   
	    }
	   
   public static void main(String[] args) {
	System.out.println(nQueens(4));
}
}