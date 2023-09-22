package interfacepackage.com;

 interface Constants {
    // Constant variables (implicitly public, static, final)
    int  MAX_COUNT = 100;
    String DEFAULT_NAME = "Reddy Rajesh";
    
    // Non-constant variable (implicitly public, static, final)
    // This will produce a compile-time error, as non-constant variables are not allowed in interfaces.
    // int nonConstantVariable;

    // Method signature (implicitly public and abstract)
    void displayInfo();
}

public class example implements Constants {
    public void displayInfo() {
        System.out.println("Max count: " + MAX_COUNT);
        System.out.println("Default name: " + DEFAULT_NAME);
    }

    public static void main(String[] args) {
        example obj = new example();
        obj.displayInfo();
    }
}
