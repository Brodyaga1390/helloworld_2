import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        //Задача№1
        int a1 = 1;
        System.out.println("Значение переменной a1 с типом int равно " + a1);
        byte b2 = 2;
        System.out.println("Значение переменной b2 с типом byte равно " + b2);
        short c3 = 3;
        System.out.println("Значение переменной c3 с типом short равно " + c3);
        long d4 = 4;
        System.out.println("Значение переменной d4 с типом long равно " + d4);
        float e5 = 5;
        System.out.println("Значение переменной e5 с типом float равно " + e5);
        double g1 = 6;
        System.out.println("Значение переменной g1 с типом double равно " + g1);

        //Задача№2
        float a = 21.12f;
        System.out.println(a);
        long b = 987_678_965_549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        int x = 27897;
        System.out.println(x);
        byte y = 67;
        System.out.println(y);

        //Задача№3
        byte lp = 23;
        byte fs = 27;
        byte ea = 30;
        short always = 480;
        int lpFsEa = lp + fs + ea;
        System.out.println(lpFsEa);
        double bd = always / lpFsEa;
        System.out.println(bd);
        System.out.println("На каждого ученика рассчитано " + bd + " листов бумаги");

        //Задача№4
        //Месяц взял 31 день!
        int lm = 8;
        System.out.println("Производительность в 1 минуту " + lm + " бутылок");
        int m = 20;
        int s = 1440;
        int ts = 4320;
        int mes = 44640;
        int m1 = m * lm;
        System.out.println("За " + m + " минут машина произвела " + m1 + " бутылок");
        int s1 = s * lm;
        System.out.println("За " + s + " минут (одни сутки) машина произвела " + s1 + " бутылок");
        int ts1 = ts * lm;
        System.out.println("За " + ts + " минут (три дня) машина произвела " + ts1 + " бутылок");
        int mes1 = mes * lm;
        System.out.println("За " + mes + " минут (один месяц) машина произвела " + mes1 + " бутылок");

        //Задача №5
        byte clas = 120;
        byte bel = 2;
        byte kor = 4;
        int kr = bel + kor;
        System.out.println("На один класс уходит " + kr + " банок краски");
        double clas1 = clas / kr;
        System.out.println("В школе " + clas1 + " классов");
        double bel1 = bel * clas1;
        System.out.println(bel1);
        double kor1 = kor * clas1;
        System.out.println(kor1);
        System.out.println("В школе, где " + clas1 + " классов, нужно " + bel1 + " банок белой краски и " + kor1 + " банок коричневой краски");

        //Задача№6
        int bananas = 5;
        int bananasGrams = 80;
        int bananas1 = bananas * bananasGrams;
        System.out.println(bananas1);
        int milk = 2;
        int milkGrams = 105;
        int milk1 = milk * milkGrams;
        System.out.println(milk1);
        int aceCream = 2;
        int aceCreamGrams = 100;
        int aceCream1 = aceCream * aceCreamGrams;
        System.out.println(aceCream1);
        int agg = 4;
        int aggGrams = 70;
        int agg1 = agg * aggGrams;
        System.out.println(agg1);
        int breakFast = bananas1 + milk1 + aceCream1 + agg1;
        System.out.println("Завтрак спортсмена имеет " + breakFast + " грамм веса");
        float breakFast1 = breakFast / 1000f;
        System.out.println("Завтрак спортсмена имеет " + breakFast1 + " грамм веса");

        //Задача№7
        short day1 = 250;
        short day2 = 500;
        int kgg = 7000;


        int day1Kg = kgg / day1;
        System.out.println("При " + day1 + " грамм в день " + day1Kg + " дней понадобится для похудения");
        int day2Kg = kgg / day2;
        System.out.println("При " + day2 + " грамм в день " + day2Kg + " дней понадобится для похудения");
        float daysAverage = (day1Kg + day2Kg) / 2f;
        System.out.println("Среднее число дней:" + daysAverage);

        //Задача№8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int yeah = 10;
        double masha1 = masha / yeah;
        System.out.println(masha1);
        double masha2 = masha + masha1;
        System.out.println(masha2);
        int monthOfYeah = 12;
        int mashaYeah1 = masha * monthOfYeah;
        System.out.println("Годовой доход до надбавки " + mashaYeah1 + " рублей");
        double mashaYeah2 = masha2 * monthOfYeah;
        System.out.println("Годовой доход после надбавки " + mashaYeah2 + " рублей");
        System.out.println("Маша теперь получает " + mashaYeah2 + " рублей.Годовой доход вырос на " + masha2 + " рублей");

        double denis1 = denis / yeah;
        System.out.println(denis1);
        double denis2 = denis1 + denis;
        System.out.println(denis2);
        int denisYeah1 = denis * monthOfYeah;
        System.out.println("Годовой доход до надбавки " + denisYeah1 + " рублей");
        double denisYeah2 = denis2 * monthOfYeah;
        System.out.println("Годовой доход после надбавки " + denisYeah2 + " рублей");
        System.out.println("Денис теперь получает " + denisYeah2 + " рублей.Годовой доход вырос на " + denis2 + " рублей");

        double kristina1 = kristina / yeah;
        System.out.println(kristina1);
        double kristina2 = kristina1 + kristina;
        System.out.println(kristina2);
        int kristinaYeah1 = kristina * monthOfYeah;
        System.out.println("Годовой доход до надбавки " + kristinaYeah1 + " рублей");
        double kristinaYeah2 = kristina2 * monthOfYeah;
        System.out.println("Годовой доход после надбавки " + kristinaYeah2 + " рублей");
        System.out.println("Кристина теперь получает " + kristinaYeah2 + " рублей.Годовой доход вырос на " + kristina2 + " рублей");



    }
}
