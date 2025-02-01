public class Lab {
  
    public String sayHello() {
        return "Hello, world!";
    }

    public static void main(String[] args) {
        Lab lab = new Lab();
        System.out.println(lab.sayHello());
    }
}
