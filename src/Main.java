public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 2;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 3.5;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var ivanIvanovich = 78.2;
        var inokentiiNikolaevich = 82.7;
        var totalWeight = inokentiiNikolaevich + ivanIvanovich;
        System.out.println(totalWeight);
        var weightDifference = inokentiiNikolaevich - ivanIvanovich;
        System.out.println(weightDifference);

        totalWeight = inokentiiNikolaevich - ivanIvanovich;
        System.out.println(totalWeight);
        weightDifference = inokentiiNikolaevich % ivanIvanovich;
        System.out.println(weightDifference);

        var totalWorkTime = 640;
        var timeWorked = 8;
        var totalEmployees = totalWorkTime / timeWorked;
        System.out.println("Всего работников в компании - " + totalEmployees);

        totalEmployees =  totalEmployees + 94;
        timeWorked = timeWorked * totalEmployees;
        System.out.println("Если в компании работает " +
                totalEmployees + " человек, то всего " +
                timeWorked + " часов работы может быть поделено между сотрудниками");








    }
}
