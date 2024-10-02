public class BST {
     Node root;
    public BST() {
        root = null;
    }
    // Método para insertar un nuevo valor
    public void insert(int key) {
        root = insertRec(root, key);
    }
    // Método recursivo para insertar un nuevo valor
    private Node insertRec(Node root, int key) {
        // Si el árbol está vacío, devuelve un nuevo nodo
        if (root == null) {
            root = new Node(key);
            return root;
        }
        // De forma recursiva, inserta en el subárbol izquierdo o derecho
        if (key < root.value) {
            root.left = insertRec(root.left, key);
        } else if (key > root.value) {
            root.right = insertRec(root.right, key);
        }
        // Devuelve el nodo sin cambios
        return root;
    }

    // Método para buscar un valor
    public boolean search(int key) {
        return searchRec(root, key);
    }

    // Método recursivo para buscar un valor
    private boolean searchRec(Node root, int key) {
        // Si el nodo es nulo o el valor es el valor del nodo actual
        if (root == null) {
            return false;
        }
        if (root.value == key) {
            return true;
        }
        // Valor menor que el valor del nodo actual, busca en el subárbol izquierdo
        if (key < root.value) {
            return searchRec(root.left, key);
        }
        // Valor mayor que el valor del nodo actual, busca en el subárbol derecho
        return searchRec(root.right, key);
    }

    // Método para realizar un recorrido en orden (in-order)
    public void inorder() {
        inorderRec(root);
        System.out.println(); // Para añadir un salto de línea al final del recorrido
    }

    // Método recursivo para realizar un recorrido en orden
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }
}

