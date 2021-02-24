package java_chobo.ch06.test;

public class Exercise06_04 {

	public static void main(String[] args) {
//		testStack();
		
		testQueue();
		
	}

	public static void testQueue() {
		MyQueue queue = new MyQueue();
		System.out.println(queue);
		
		// 6개 데이터 삽입
		
//		char ch = 'a';
//		for (int i = 0; i<6; i++) {
//			queue.insertItem(ch++);
//			queue.prnQueue();
//		}
		
		queue.prnQueue();
		queue.insertItem('t');
		queue.prnQueue();
		queue.insertItem('e');
		queue.prnQueue();
		queue.insertItem('s');
		queue.prnQueue();
		queue.insertItem('t');
		queue.prnQueue();
		queue.insertItem('a');
		queue.prnQueue();
		queue.insertItem('l');
		
		// 6개 데이터 삭제
		
//		for(int i = 0; i < 6; i++) {
//			ch = queue.deleteItem();
//			System.out.printf("%c %n", ch);
//			queue.prnQueue();
//		}
		System.out.println(queue);
		System.out.println(queue.deleteItem()); 
		queue.prnQueue();
		System.out.println(queue);
		System.out.println(queue.deleteItem()); 
		queue.prnQueue();
		System.out.println(queue);
		System.out.println(queue.deleteItem()); 
		queue.prnQueue();
		System.out.println(queue);
		System.out.println(queue.deleteItem());
		queue.prnQueue();
		System.out.println(queue);
		System.out.println(queue.deleteItem()); 
		queue.prnQueue();
		System.out.println(queue);
		System.out.println(queue.deleteItem()); 
		queue.prnQueue();
		System.out.println(queue);
	}

	public static void testStack() {
		MyStack stack = new MyStack();
		
		stack.prnStack();	// top = -1
		stack.push('t');
		stack.prnStack();	// top = 0
		stack.push('e');
		stack.prnStack();	// top = 1
		stack.push('s');
		stack.prnStack();	// top = 2
		stack.push('t');
		stack.prnStack();	// top = 3
		stack.push('a');
		stack.prnStack();	// top = 4
		stack.push('l');	// "stack is overflow"
		stack.prnStack();
		
		System.out.println();
		
		System.out.println(stack.pop()); // a
		stack.prnStack();
		System.out.println(stack.pop()); // t
		stack.prnStack();
		System.out.println(stack.pop()); // s
		stack.prnStack();
		System.out.println(stack.pop()); // e
		stack.prnStack();
		System.out.println(stack.pop()); // t
		stack.prnStack();
		System.out.println(stack.pop()); // underflow
		stack.prnStack();
	}

}
