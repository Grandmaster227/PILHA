public class Main {
    public static void main(String[] args) {

        Pilha pilha = new Pilha(5);


        pilha.push(5);
        pilha.push(4);
        pilha.push(19);
        pilha.push(8);
        pilha.push(1);
        pilha.pop();

        pilha.peak();
        pilha.isEmpty();
        pilha.isFull();


        System.out.println("Peak: " + pilha.peak());
        System.out.println("Cheio: " + pilha.isFull());
        System.out.println("Vazio: " + pilha.isEmpty());

    }
}