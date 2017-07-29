public class Worker  extends Employee {
    public Worker(String name, String id, int salary) {
        super(name,id,salary);
    }

    @Override
    public void getVoice() {
        System.out.println("Pracuj a garb sam Ci wyrosnie...");
    }
}
