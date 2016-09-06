package StackAndQueue;

import java.util.Stack;

/**
 * 用两个栈实现队列
 * 
 * 
 * 题目描述
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * 
 * @author hl174
 * 时间：2016年9月4日 下午4:53:36
 */
public class Solution15 {
	    Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public void push(int node) {
		/**
		 * 这题剑指offer里面也有
		 *  
		 *     31ms 629k
		 */
	    	 stack1.push(node);
	    	
		    }
		    
		    public int pop() {
		    	  if(!stack2.isEmpty())
		              return  stack2.pop();
		              while(!stack1.isEmpty()){   
		                  stack2.push(stack1.pop());
		              }
		            return  stack2.pop();  
		    }
}
