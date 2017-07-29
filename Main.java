public class Main {
    public static void main(String[] args) {

        Worker kuba = new Worker("Kuba","222222", 1200);
        kuba.getVoice();


        Boss oskar = new Boss("Oskar", "123444", 4566);
        oskar.getVoice();

        Lecturer irek = new Lecturer("Irek","11111111", 1222);
        irek.getVoice();


    }
}
