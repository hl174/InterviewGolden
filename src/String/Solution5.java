package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution5 {
/*public static void main(String[] args) {
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
}*/
}
