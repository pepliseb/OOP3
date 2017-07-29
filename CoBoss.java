public class CoBoss extends Boss {

    public CoBoss(String name, String id, int salary) {
        super(name, id, salary, true);
    }

    @Override
    public void getVoice() {
        System.out.println(" Szefie mamy jeszcze czas na zyski");
    }
}
