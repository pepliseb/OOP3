



public class Boss extends Employee {
    public Boss(String name, String id, int salary) {
        super(name, id, salary );


    }

    @Override
    public void getVoice() {
        System.out.println("Do roboty");
    }

    public void screamOnEmployee(){
        System.out.println("Krzykkkkkkkkkkkkkkkkkkkkk");
    }
}
