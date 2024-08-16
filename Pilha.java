public class Pilha {
    private int size = 5;
    private int top;
    private int[] items;


    public Pilha(int size) {
        this.size = size;
        this.items =  new int[size];
        this.top = -1;

    }

    public void push(int item) {
        if(top == size -1) {
            System.out.println("Pilha cheia");
        }
        else {
            items[++top] = item;
        }
    }


    public int pop() {
        if (top == -1) {
            System.out.println("Pilha Vazia");
            return -1;
        }
        else {
            return items[top--];
        }
    }


    public int peak() {
        if (top == -1) {
            System.out.println("Pilha vazia");
            return -1;
        }
        else {
            return items[top];
        }
    }


    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        if (top == this.size -1) {
            return true;
        }
        else {
            return false;
        }
    }

}