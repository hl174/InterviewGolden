package Array;
/**
 * 像素翻转
 * 
 * 
 * 题目描述
 * 有一副由NxN矩阵表示的图像，这里每个像素用一个int表示，请编写一个算法，在不占用额外内存空间的情况下(即不使用缓存矩阵)，将图像顺时针旋转90度。
 * 给定一个NxN的矩阵，和矩阵的阶数N,请返回旋转后的NxN矩阵,保证N小于等于500，图像元素小于等于256。
 * 测试样例：
 * [[1,2,3],[4,5,6],[7,8,9]],3
 * 返回：[[7,4,1],[8,5,2],[9,6,3]]
 * 
 * 
 * @author hl174
 * 时间：2016年8月31日 下午9:11:26
 */
public class Solution6 {
	 public int[][] transformImage(int[][] mat, int n) {
	/**
	 * 这题目测没有啥捷径
	 * 既然是方阵，要旋转的话就一层的旋转
	 * 注意统计层数，这里移的时候每次移动一个，不是一次把一行移动完毕
	 * 
	 * 
	 * 这基本是最优的算法了，任何算法的时间复杂度最后都是o{n2}
	 * 
	 * 259k 235ms
	 */
		for(int layer=0;layer<n/2;layer++){//层数
			int left=layer;
			int right=n-1-layer;
			for(int i=left;i<right;i++){//比如n=4的时候，只转3个
				int temp=mat[left][i];//暂存上面的元素
				mat[left][i]=mat[n-1-i][layer];//左-》上
				mat[n-1-i][layer]=mat[n-1-layer][n-1-i];//下-》左
				mat[n-1-layer][n-1-i]=mat[i][n-1-layer];//右-》下				
				mat[i][n-1-layer]=temp;			
			}

		}
	 
	 return mat;
	 }
}
