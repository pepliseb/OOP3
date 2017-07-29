public class Lecturer extends Employee {
    public Lecturer(String name, String id, int salary) {
        super(name, id, salary);

    }

    @Override
    public void getVoice() {
        System.out.println(" Uczcie sie pilnie a bedziecie bogaci");
    }
}
