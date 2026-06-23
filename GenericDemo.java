public class GenericDemo {
    class SimpleGeneric<V>
    {
        V value;
        public SimpleGeneric(V value)
        {
            this.value = value;
        }
    }
    public void showObjectType()
    {
        SimpleGeneric<Integer> obj1 = new SimpleGeneric<>(10);
        System.out.println("The type of value is: "+obj1.value.getClass().getName());
        SimpleGeneric<String> obj2 = new SimpleGeneric<>("Hello");
        System.out.println("The type of value is: "+obj2.value.getClass().getName());
    }

    public static void main(String[] args) {
        GenericDemo demo = new GenericDemo();
        demo.showObjectType();
    }
}
