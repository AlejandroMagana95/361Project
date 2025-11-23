class Nil extends BT {

    private static Nil nil;

    private Nil() {}

    public static Nil getNil() {
        if (nil == null)
            nil = new Nil();
        return nil;
    }

    public int height() {
        return -1;
    }

    public String toString() {
        return "Nil";
    }
}
