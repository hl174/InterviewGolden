package StackAndQueue;

import java.util.ArrayList;

/**
 * 集合栈
 * 
 * 题目描述
 * 请实现一种数据结构SetOfStacks，由多个栈组成，其中每个栈的大小为size，当前一个栈填满时，
 * 新建一个栈。该数据结构应支持与普通栈相同的push和pop操作。
 * 给定一个操作序列int[][2] ope(C++为vector<vector<int>>)，每个操作的第一个数代表操作类型，
 * 若为1，则为push操作，后一个数为应push的数字；
 * 若为2，则为pop操作，后一个数无意义。
 * 请返回一个int[][](C++为vector<vector<int>>)，为完成所有操作后的SetOfStacks，顺序应为从下到上，
 * 默认初始的SetOfStacks为空。保证数据合法。
 * 
 * @author hl174
 * 时间：2016年9月4日 下午4:34:04
 */
public class Solution14 {
	 public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
		/**
		 * 每次操作就判断，
		 *    加入的时候到达size就加入，然后新开一个list
		 *    推出的时候若当前为空，就继续退出上一个list
		 * 
		 * 
		 * 78ms 1218k
		 */
		 ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
	     ArrayList<Integer> temp=new ArrayList<Integer>();
	     for (int i = 0; i < ope.length; i++) {
			if(ope[i][0]==1){//进栈
				temp.add(ope[i][1]);
				if(temp.size()==size){
					result.add(temp);
					temp=new ArrayList<Integer>();
				}
			}else if(ope[i][0]==2){//出栈
				if(temp.size()>0){
					temp.remove(temp.size()-1);//最后一个出去
				}else{//temp为空时
					if(result.size()>0){
					 temp=result.get(result.size()-1);
					 result.remove(result.size()-1);
					 temp.remove(size-1);
					}
				}
				
			}
		}
	    //最后看看temp满没满
	     if(temp.size()>0)
	     	 result.add(temp);
	     return result;
		 
		 
	    }
}
