import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;

public class ExpensiveInheritance {
    @PerformanceCritical
    public void critical() {
        Cheap c = new Costly();
        Cheap d = new Cheap();
        c.compute();
        d.compute();
    }
}

class Cheap {
    public void compute() {
    }
}

class Costly extends Cheap {
    public void compute() {
        costly();
    }

    @Expensive
    public void costly() {
    }
}
