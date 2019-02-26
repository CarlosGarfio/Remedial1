package remedialunidad1;

public class RemedialUnidad1 {

    public static void main(String[] args) {
        
        Operaciones<Double> op= new Operaciones<>(new Double[]{1.0,2.0,3.0,4.0,5.0},3d);
        
        op.print();
    }
    
}
