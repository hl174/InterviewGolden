package StackAndQueue;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 双栈排序
 *
 * 
 * 题目描述
 * 
 * 请编写一个程序，按升序对栈进行排序（即最大元素位于栈顶），要求最多只能使用一个额外的栈存放临时数据（如数组），但不得将元素复制到别的数据结构中。
 * 给定一个int[] numbers(C++中为vector&ltint>)，其中第一个元素为栈顶，请返回排序后的栈。请注意这是一个栈，意味着排序过程中你只能访问到第一个元素。
 * 测试样例：
 * [1,2,3,4,5]
 * 返回：[5,4,3,2,1]
 * 
 * @author hl174
 * 时间：2016年9月4日 下午4:59:00
 */
public class Solution16 {

	 public ArrayList<Integer> twoStacksSort(int[] numbers) {
	       /**
	        * 思路：
	        *     双栈排序，那就用两个栈好了，免得用一个栈还得取用数组存储；这里JAVA实现是用数组来代替栈的感觉
	        * 
	        *     137ms 665k
	        * 
	        */
		 ArrayList<Integer> result=new ArrayList<>();
		 Stack<Integer>  stack=new Stack<>();//额外的栈，假定是排好序的
		 for(int i=0;i<numbers.length;i++){
			 if(stack.isEmpty()||numbers[i]>stack.peek()){
				 stack.push(numbers[i]);
			 }else{
				 int count=0;
				 while(!stack.isEmpty()&&numbers[i]<stack.peek()){//万一比所有的数都小,所以要先判空
					 numbers[count++]=stack.pop();//这里不用担心数组没有排序的数据会被冲走
				 }
				 count--;
				 stack.push(numbers[i]);
				 //原始数据回填
				 while(count>=0)
					 stack.push(numbers[count--]);
			 } 
		 }
		 while(!stack.isEmpty()){
			 result.add(stack.pop());
		 }
		 return result;
		 
	    }
}
