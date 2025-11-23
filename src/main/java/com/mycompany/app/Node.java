class Node extends BT {

    int num;
    BT left;
    BT right;

    Node(int n, BT l, BT r) {
        num = n;
        left = l;
        right = r;
    }

    public int height() {
        int lh = left.height();
        int rh = right.height();
        return (lh < rh ? rh : lh) + 1;
    }

    @Override
    public String toString() {
        return "Node(" + num + ", " + left.toString() + ", " + right.toString() + ")";
    }
}

