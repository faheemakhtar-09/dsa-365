public class VariableExample {
    int instanceVar = 10; // Instance variable
    static int staticVar = 20; // Static variable

    public void display() {
        int localVar = 30; // Local variable
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        VariableExample obj = new VariableExample();
        obj.display();
    }
}
