//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 2
        System.out.println("Task 2");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 3
        System.out.println("Task 3");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 4
        System.out.println("Task 4");

        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend + 2 = " + friend);
        friend = friend / 7;
        System.out.println("friend / 7 = " + friend);

        //Task 5
        System.out.println("Task 5");

        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("frog / 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("frog + 4 = " + frog);

        //Task 6
        System.out.println("Task 6");

        var boxer1 = 78.2;
        var boxer2 = 82.7;

        var totalWeight = boxer1 + boxer2;
        System.out.println("Общая масса двух бойцов - " + totalWeight + " кг!");

        var weightDifference = boxer2 - boxer1;
        System.out.println("Разница веса бойцов - " + weightDifference + " кг!");

        //Task 7
        System.out.println("Task 7");

        weightDifference = boxer2 % boxer1;
        System.out.println("Разница веса бойцов - " + weightDifference + " кг!");

        //Task 8
        System.out.println("Task 8");

        var totalHours = 640;
        var load = 8;
        var employee = totalHours / load;
        System.out.println("Всего работников в компании - " + employee + " человек.");

        employee = employee + 94;
        totalHours = employee * load;
        System.out.println("Если в компании работает " + employee + " человек, то всего " + totalHours + " часов работы можно поделить между сотрудниками.");
    }
}