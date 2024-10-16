import  java.util.*;

// Interface that declares a 'print' method
interface printable{
    void print();
}

// Class 'MyNumber' extends 'Number' and implements 'printable'
class MyNumber extends Number implements printable {
    private final int value;  // 'value' will hold the integer value

    // Constructor to initialize 'value'
    public MyNumber(int value){
        this.value = value;
    }

    // 'print' method from 'printable' interface, which could contain logic for printing
    public void print(){
        System.out.println("Value: " + value);
    }

    // Implementations of abstract methods from 'Number'
    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

// Generic class 'Boxx' with a bounded type parameter
// 'T' is constrained to classes that extend 'Number' and implement 'printable'
class Boxx<T extends Number & printable> {
    private T item;  // 'item' is of type T

    // Constructor to initialize 'item'
    public Boxx(T item){
        this.item = item;
    }

    // Method to call 'print' on the 'item' object
    public void display(){
        item.print(); // Calls the 'print' method of the 'item'
    }

    // Method to return the 'item'
    public T getItem(){
        return item;
    }
}

// Main class to test the functionality
public class BoundedType {
    public static void main(String[] args){
        MyNumber n = new MyNumber(12); // Create an instance of 'MyNumber'
        Boxx<MyNumber> bxx = new Boxx<MyNumber>(n); // Create a 'Boxx' object with 'MyNumber'
        bxx.display(); // Call 'display' to print the number
    }
}
