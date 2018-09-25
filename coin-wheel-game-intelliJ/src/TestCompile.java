public class TestCompile {
    private String testVar;

    public TestCompile(){

    }

    public int TestMethod(){
        this.testVar = "Hello World!";
        System.out.println("Printing " + this.testVar);
        return 0;
    }
}
