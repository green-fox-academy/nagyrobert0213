    public class Counter{

    /*Create Counter class
    which has an integer field value
    when creating it should have a default value 0 or we can specify it when creating
    we can add(number) to this counter another whole number
    or we can add() without parameters just increasing the counter's value by one
    and we can get() the current value
    also we can reset() the value to the initial value*/

    int value = 0;

    public int add(int a){
        a = value++;
        return a;
    }
    public int get(int a){
        System.out.println(value);
        return value;
    }
    public void reset(){
        value = 0;
        System.out.println("Value reseted.");
    }

    }