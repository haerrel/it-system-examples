import java.util.ArrayList;
import java.util.List;

public class RAM {
    
    List<Integer> memory = new ArrayList<>(); 
    
    public Integer load(int mem_address) {
        return memory.get(mem_address);
    }
    
    public void store(int mem_address, Integer value) {
        memory.set(mem_address, value);
    }
    
    public int alloc() {
        int idx = this.memory.size();
        memory.add(idx, null);
        return idx;
    }

    private static RAM instance;
    private RAM () {}
    public static RAM getInstance () {
        if (RAM.instance == null) {
            RAM.instance = new RAM ();
        }
        return RAM.instance;
    }
}
