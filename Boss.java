



public class Boss extends Employee {
    private boolean isHappy;

//    public Boss(String name, String id, int salary) {
//        super(name, id, salary );
//    }


    public Boss(String name, String id, int salary, boolean isHappy) {
        super(name, id, salary );
        this.isHappy = isHappy;
    }

    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }

    @Override
    public void getVoice() {
        System.out.println("Do roboty");
    }

    public void screamOnEmployee(){
        System.out.println("Krzykkkkkkkkkkkkkkkkkkkkk");
    }
}
