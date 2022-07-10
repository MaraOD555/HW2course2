package HW2;

public class Main {

       public static void main(String[] args) {

        GryffindorStudents harry = new GryffindorStudents("Гарри Поттер", 14, 12, 5, 5, 5);
        GryffindorStudents hermione = new GryffindorStudents("Гермиона Грейнджер", 15, 20, 4, 4, 4);
        GryffindorStudents ron = new GryffindorStudents("Рон Уизли", 5, 8, 5, 5, 5);

        SlytherinStudents draco = new SlytherinStudents("Драко Малфой", 8, 11, 5, 2, 8, 5, 10);
        SlytherinStudents graham = new SlytherinStudents("Грэхэм Монтегю", 13, 10, 1, 1, 1, 1, 3);
        SlytherinStudents goyle = new SlytherinStudents("Грегори Гойл", 4, 9, 2, 2, 2, 2, 3);

        HufflepuffStudents zacharia = new HufflepuffStudents("Захария Смит", 7, 16, 5, 5, 5);
        HufflepuffStudents cedric = new HufflepuffStudents("Седрик Диггори", 10, 18, 4, 6, 8);
        HufflepuffStudents justin = new HufflepuffStudents("Джастин Финч-Флетчли", 11, 17, 3, 4, 7);

        RavenclawStudents joe = new RavenclawStudents("Джоу Чанг", 6, 15, 6, 3, 7, 10);
        RavenclawStudents padma = new RavenclawStudents("Падма Патил", 12, 13, 2, 3, 4, 5);
        RavenclawStudents marcus = new RavenclawStudents("Маркус Белби", 9, 19, 6, 8, 10, 5);

        harry.printStudents();
        hermione.printStudents();
        ron.printStudents();
        draco.printStudents();
        graham.printStudents();
        goyle.printStudents();
        zacharia.printStudents();
        cedric.printStudents();
        justin.printStudents();
        joe.printStudents();
        padma.printStudents();
        marcus.printStudents();

        harry.compareGryffindor(hermione);
        graham.compareSlytherin(goyle);
        zacharia.compareHufflepuff(justin);
        padma.compareRavenclaw(joe);
        harry.compareHogwards(joe);

    }
}

