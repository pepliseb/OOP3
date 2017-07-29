public class Main {
    public static void main(String[] args) {
        Boss oskar = new Boss("Oskar", "123444", 4566);
        Boss seb = new Boss("Seb", "123443334", 455);
        Worker kuba = new Worker("Kuba","222222", 1200);
        Lecturer irek = new Lecturer("Irek","11111111", 1222);
        kuba.getVoice();
        oskar.getVoice();
        irek.getVoice();


    }
}
