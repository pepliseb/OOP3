public class Main {
    public static void main(String[] args) {

        Worker kuba = new Worker("Kuba","222222", 1200);
        kuba.getVoice();


        Boss oskar = new Boss("Oskar", "123444", 4566, true);
        oskar.getVoice();
        oskar.screamOnEmployee();
        System.out.println("IsHappy " + oskar.isHappy());




        Lecturer irek = new Lecturer("Irek","11111111", 1222);
        irek.getVoice();

//        polimorfizm
        Employee michal = new Boss("Michał", "1212121212", 1111, false);
        michal.getVoice();

        CoBoss marta = new CoBoss("Marta","111111111111111", 121212);



        Employee[] arrayOfEmployee = {oskar,michal,irek, marta};
        for (Employee employee : arrayOfEmployee) {
            System.out.print("\n"+ employee.getName());
            System.out.print(" " + employee.getId());
            System.out.print(" " + employee.getSalary() + " ");
            employee.getVoice();
//             employee.getVoice(), employee.getSalary(), employee.getId());

        }

    }
}
