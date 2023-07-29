public class Test{
    public static <E extends Number> Double mean(E x[]) {
        Double avg = 0.0;
        for (int i = 0; i < x.length; i++) {
            avg = avg + x[i].doubleValue();
        }
        return avg / x.length;
    }
    public static <E extends Number> Double STD(E Y[]){
        Double Std = 0.0;
        double mv = mean(Y);
        for (E number : Y)
            Std = Std + Math.pow((number.doubleValue() - mv), 2);
        return Math.sqrt(Std / Y.length);
    }
    public static void main(String[] args){
        Integer[] a = {10, 15, 20, 25};
        System.out.println(mean(a));
        Integer[] b = {10, 15, 20, 25};
        System.out.println(STD(b));
    }
}
