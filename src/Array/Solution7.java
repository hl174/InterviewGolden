package Array;
/**
 * 清除行列
 * 题目描述
 * 请编写一个算法，若N阶方阵中某个元素为0，则将其所在的行与列清零。
 * 给定一个N阶方阵int[][](C++中为vector>)mat和矩阵的阶数n，请返回完成操作后的int[][]方阵(C++中为vector>)，保证n小于等于300，矩阵中的元素为int范围内。
 * 测试样例：
 * [[1,2,3],[0,1,2],[0,0,1]]
 * 返回：[[0,0,3],[0,0,0],[0,0,0]]
 * 
 * @author hl174
 * 时间：2016年8月31日 下午9:49:53
 */
public class Solution7 {
    public int[][] clearZero(int[][] mat, int n) {
        // write code here
    	/**
    	 * 清除行列的话则必须一个个的判断
    	 * 
    	 * 优化后的算法：
    	 *    只需要统计某行或者某列有0即可，具体是哪个不用管
    	 *    下次遍历的时候，在这行或者列上的元素全部置为0   
    	 *    
    	 *    304ms  223k
    	 */
    	
    	int rows[]=new int[mat.length];
    	int cols[]=new int[mat[0].length];
    	
    	for(int i=0;i<rows.length;i++){
    		for(int j=0;j<cols.length;j++){
    			if(mat[i][j]==0){
    				rows[i]=1;
    				cols[j]=1;
    			}
    		}
    	}
    	
    	
    	for(int i=0;i<rows.length;i++){
    		for(int j=0;j<cols.length;j++){
    			  if(rows[i]==1||cols[j]==1)
    				  mat[i][j]=0;
    		}
    	}
    	
    	return mat;
    }
}
