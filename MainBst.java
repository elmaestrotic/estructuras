public class MainBst {

    public static void main(String[] args) {
        BST bst = new BST();

        // Insertar valores en el árbol
        bst.insert(7);
        bst.insert(3);
        bst.insert(9);
        bst.insert(1);
        bst.insert(5);
        bst.insert(8);
        bst.insert(10);

        // Imprimir el recorrido en orden
        System.out.println("Recorrido en orden:");
        bst.inorder();

        // Buscar valores en el árbol
        System.out.println("Buscar 5: " + bst.search(5));
        System.out.println("Buscar 11: " + bst.search(11));
    }
}
