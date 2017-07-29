public class Main {
    public static void main(String[] args) {

        Worker kuba = new Worker("Kuba","222222", 1200);
        kuba.getVoice();


        Boss oskar = new Boss("Oskar", "123444", 4566);
        oskar.getVoice();
        oskar.screamOnEmployee();

        Lecturer irek = new Lecturer("Irek","11111111", 1222);
        irek.getVoice();

//        polimorfizm
        Employee michal = new Boss("Michał", "1212121212", 1111);
        michal.getVoice();

        Employee[] arrayOfEmployee = {oskar,michal,irek};
        for (Employee employee : arrayOfEmployee) {
            System.out.print("\n"+ employee.getName());
            System.out.print(" " + employee.getId());
            System.out.print(" " + employee.getSalary() + " ");
            employee.getVoice();
//             employee.getVoice(), employee.getSalary(), employee.getId());

        }

    }
}
