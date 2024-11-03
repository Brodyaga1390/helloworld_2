import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        //Задача№2
        byte a = 67;
        System.out.println(a);
        short b = -159;
        System.out.println(b);
        int c = 27897;
        System.out.println(c);
        int z = 569;
        System.out.println(z);
        long d = 987679965549L;
        System.out.println(d);
        float e = 27.122f;
        System.out.println(e);
        double x = 2.786;
        System.out.println(x);
//Задача№3
        byte lp = 23;
        byte fs = 27;
        byte ea = 30;
        short always = 480;
        int lpFsEa = lp + fs + ea;
        System.out.println(lpFsEa);
        int bd = always / lpFsEa;
        System.out.println(bd);
        System.out.println("На каждого ученика рассчитано " + bd + " листов бумаги");

        //Задача№4
        //Месяц взял 31 день!
        byte lm = 8;
        System.out.println("Производительность в 1 минуту " + lm + " бутылок");
        byte m = 20;
        short s = 1440;
        short ts = 4320;
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
        int clas1 = clas / kr;
        System.out.println("В школе " + clas1 + " классов");
        int bel1 = bel * clas1;
        System.out.println(bel1);
        int kor1 = kor * clas1;
        System.out.println(kor1);
        System.out.println("В школе, где " + clas1 + " классов, нужно " + bel1 + " банок белой краски и " + kor1 + " банок коричневой краски");

        //Задача№6
        byte bananas = 5;
        byte bananasGrams = 80;
        int bananas1 = bananas * bananasGrams;
        System.out.println(bananas1);
        short milk = 2;
        byte milkGrams = 105;
        int milk1 = milk * milkGrams;
        System.out.println(milk1);
        byte aceCream = 2;
        byte aceCreamGrams = 100;
        int aceCream1 = aceCream * aceCreamGrams;
        System.out.println(aceCream1);
        byte agg = 4;
        byte aggGrams = 70;
        int agg1 = agg * aggGrams;
        System.out.println(agg1);
        int breakFast = bananas1 + milk1 + aceCream1 + agg1;
        System.out.println("Завтрак спортсмена имеет " + breakFast + " грамм веса");
        float breakFast1 = breakFast / 1000f;
        System.out.println("Завтрак спортсмена имеет " + breakFast1 + " грамм веса");

        //Задача№7
        short day1 = 250;
        short day2 = 500;
        byte kgg = 7;
        int kg1 = kgg * 1000;
        System.out.println(kg1);
        int day1Kg = kg1 / day1;
        System.out.println("При " + day1 + " грамм в день " + day1Kg + " дней понадобится для похудения");
        int day2Kg = kg1 / day2;
        System.out.println("При " + day2 + " грамм в день " + day2Kg + " дней понадобится для похудения");

        //Задача№8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        byte yeah = 10;
        int masha1 = masha / yeah;
        System.out.println(masha1);
        int masha2 = masha + masha1;
        System.out.println(masha2);
        byte monthOfYeah = 12;
        int mashaYeah1 = masha * monthOfYeah;
        System.out.println("Годовой доход до надбавки " + mashaYeah1 + " рублей");
        int mashaYeah2 = masha2 * monthOfYeah;
        System.out.println("Годовой доход после надбавки " + mashaYeah2 + " рублей");
        System.out.println("Маша теперь получает " + mashaYeah2 + " рублей.Годовой доход вырос на " + masha2 + " рублей");

        int denis1 = denis / yeah;
        System.out.println(denis1);
        int denis2 = denis1 + denis;
        System.out.println(denis2);
        int denisYeah1 = denis * monthOfYeah;
        System.out.println("Годовой доход до надбавки " + denisYeah1 + " рублей");
        int denisYeah2 = denis2 * monthOfYeah;
        System.out.println("Годовой доход после надбавки " + denisYeah2 + " рублей");
        System.out.println("Денис теперь получает " + denisYeah2 + " рублей.Годовой доход вырос на " + denis2 + " рублей");

        int kristina1 = kristina / yeah;
        System.out.println(kristina1);
        int kristina2 = kristina1 + kristina;
        System.out.println(kristina2);
        int kristinaYeah1 = kristina * monthOfYeah;
        System.out.println("Годовой доход до надбавки " + kristinaYeah1 + " рублей");
        int kristinaYeah2 = kristina2 * monthOfYeah;
        System.out.println("Годовой доход после надбавки " + kristinaYeah2 + " рублей");
        System.out.println("Кристина теперь получает " + kristinaYeah2 + " рублей.Годовой доход вырос на " + kristina2 + " рублей");



    }
}
