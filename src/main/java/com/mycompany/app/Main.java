public class Main {
    public static void main(String[] args) {

        BT nil = Nil.getNil();

        BT tree = new Node(
                3,
                new Node(1, nil, new Node(4, nil, nil)),
                new Node(2, nil, nil)
        );

        System.out.println(tree);
    }
}
