public class Main {
    public static void main(String[] args) {

        // 1 задание
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // 2 задание
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // 3 задание
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // 4 задание
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // 5 задание
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // 6 задание
        var fighterWeight1 = 78.2;
        var fighterWeight2 = 82.7;
        var sumWeight = fighterWeight1 + fighterWeight2;
        System.out.println(sumWeight);
        var weightDifference = fighterWeight2 - fighterWeight1;
        System.out.println(weightDifference);

        // 7 задание
        var num1 = 78.2;
        var num2 = 82.7;
        var mod = num2 % num1;
        System.out.println(mod);

        // 8 задание
        var hours = 640;
        var coworkerWorkTime = 8;
        var numOfCoworkers = hours / coworkerWorkTime;
        System.out.println("Всего работников в компании - " + numOfCoworkers + " человек.");
        numOfCoworkers = numOfCoworkers + 94;
        hours = coworkerWorkTime * numOfCoworkers;
        System.out.println("Если в компании работает " + numOfCoworkers + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками.");
    }
}