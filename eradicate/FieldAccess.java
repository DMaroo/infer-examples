public class FieldAccess {
    public static void main(String[] args) {
        Fields f = new Fields(0);
        int x = get_first(f);
        
        Fields g = f.rest;
        int y = get_first(g);
    }

    public static int get_first(@Nullable Fields f) {
        return f.first;
    }
}

class Fields {
    public int first;
    @Nullable
    public Fields rest;

    public Fields(int x) {
        first = x;
        rest = null;
    }
}
