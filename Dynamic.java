public class Dynamic {
    private int size;
    private int top;

    private int[] items;


    public Dynamic(int dynSize) {
        this.size = dynSize;
        this.items = new int[dynSize];
        this.top = -1;
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

    public void push(int item) {
        if (top == size -1) {
            ampliarPilha();
        }
        items[++top] = item;
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

    protected void ampliarPilha() {
        int [] novaPilha = new int[items.length * 2];

        for (int i = 0; i < items.length; i++) {
            novaPilha[i] = items[i];
        }

        items = novaPilha;

        size = novaPilha.length;

        System.out.println("A Pilha foi recarregada com o tamanho " + size);
    }


}
