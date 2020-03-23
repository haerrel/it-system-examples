public class Pointer<T> {
    
    private T value;
    
    public Pointer(T value) {
        this.setReference(value);
    }
    
    public void setReference(T value) {
        this.value = value;
    }
    
    public T dereference() {
        return this.value;
    }
    
    
}
