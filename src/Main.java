public class Main {
    public static void main(String[] args) {
        Box<Integer>box1=new Box<Integer>();
        box1.setValue(1);
        System.out.println(box1.getValue());

        Box<String>box2=new Box<String>();
        box2.setValue("Hi");
        System.out.println(box2.getValue());

        Pair<String,Integer>pair=new Pair<>("Id",1);
        System.out.println(pair.getKey()+" "+pair.getValue());

    }
}