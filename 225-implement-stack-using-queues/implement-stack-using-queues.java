import java.util.Queue;
import java.util.LinkedList;

class MyStack {
    Queue<Integer> main = new LinkedList();
    Queue<Integer> aux = new LinkedList();

    public MyStack() {}
    
    public void push(int x) {
        aux.add(x);

        while(!main.isEmpty()){
            aux.add(main.poll());
        }

        Queue<Integer> temp = aux;
        aux = main;
        main = temp;
    }
    
    public int pop() {
        return main.poll();
    }
    
    public int top() {
        return main.peek();
    }
    
    public boolean empty() {
        return main.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */