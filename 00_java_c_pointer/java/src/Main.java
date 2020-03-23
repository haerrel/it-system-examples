public class Main {

    
    
    public static void main(String[] args) {
        int x = 3;
        int x2 = 4;
        Pointer<Integer> y = new Pointer<Integer>(x2);
        
        int result1 = square(y);
        int result2 = square(toPointer(x));
        
        System.out.println(result1);
        System.out.println(result2);
    }
    
    
    static int square(Pointer<Integer> value) {
        return value.dereference() * value.dereference();
    }

    
    
    // JUST A HELPER
    static <T> Pointer<T> toPointer(T value) {
        return new Pointer<>(value);
    }

}
