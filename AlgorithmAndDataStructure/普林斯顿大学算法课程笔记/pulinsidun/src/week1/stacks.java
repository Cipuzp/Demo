package week1;

public class stacks {
	private Node first = null;

	private class Node {
		String item;
		Node next;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void push(String items) {
		Node oldfirst = first;//现将链表头的指针保存
		first = new Node();//新建节点
		first.item = items;//插入节点
		first.next = oldfirst;//更新链表
	}

	public void pop() {
		String item = first.item;//将现在的栈中元素保存
		first = first.next;//去掉第一个节点
		return;
	}
}
