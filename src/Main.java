public class Main {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        System.out.println();

        l1.removeFront();

        l1.print();
        l1.count();

    }
}