public class Main {
    public static void main(String[] args) {
        System.out.println("");
        // Задача 1
        System.out.println("Задача 1");
        System.out.println("Типы переменных");
        byte apples = 127;
        System.out.println("Значение переменной apples с типом byte равно " + apples + " штук");
        short pears = 500;
        System.out.println("Значение переменной pears с типом short равно " + pears + " штук");
        int peaches = 576;
        System.out.println("Значение переменной peaches с типом int равно " + peaches + " штук" );
        long bananas = 710;
        System.out.println("Значение переменной bananas с типом long равно " + bananas + " штук");
        float coconuts = 5f;
        System.out.println("Значение переменной coconuts с типом float равно " + coconuts + " тонн" );
        double plums = 6.85;
        System.out.println("Значение переменной plums с типом double равно " + plums + " кг." );
        System.out.println("");

        // Задача 2
        System.out.println("Задача 2");
        System.out.println("float");
        float f = 27.12f;
        System.out.println(f);
        System.out.println("");
        System.out.println("long");
        long d = 987678965549l;
        System.out.println(d);
        System.out.println("");
        System.out.println("double");
        double e = 2.786;
        System.out.println(e);
        System.out.println("");
        System.out.println("boolean");
        boolean h = false;
        System.out.println(h);
        System.out.println("");
        System.out.println("char");
        char g = 27897;
        System.out.println(g);
        System.out.println("");
        System.out.println("short");
        short b = -159;
        System.out.println(b);
        System.out.println("");
        System.out.println("int");
        int c = 569;
        System.out.println(c);
        System.out.println("");
        System.out.println("byte");
        byte a = 67;
        System.out.println(a);
        System.out.println("");

        // Задача 3
        System.out.println("Задача 3");
        short lP = 23;
        short aS = 27;
        short eA = 30;
        int totalStudents = lP + aS + eA;
        short totalQuantityPaper = 480;
        long quantityPerStudent = totalQuantityPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + quantityPerStudent + " листов бумаги " );
        System.out.println("");

        // Задача 4
        System.out.println("Задача 4");
        byte perfomanceBottleTwoMinetes = 16;
        byte totalMinutes = 20;
        long quantityTwoMinutesPeriods = totalMinutes / 2;
        long quantityBottle = quantityTwoMinutesPeriods * perfomanceBottleTwoMinetes;
        System.out.println("За " + totalMinutes + " минут машина произвела бутылок " + quantityBottle + " штук ");
        long dayBottlePerfomance = 720 * perfomanceBottleTwoMinetes;
        System.out.println("За сутки машина произвела бутылок " + dayBottlePerfomance + " штук ");
        long threeDayBottlePerfomance = dayBottlePerfomance * 3;
        System.out.println("За 3 дня машина произвела бутылок " + threeDayBottlePerfomance + " штук ");
        long monthBottlePerfomance = dayBottlePerfomance * 30;
        System.out.println("За месяц машина произвела бутылок " + monthBottlePerfomance + " штук ");
        System.out.println("");

        // Задача 5
        System.out.println("Задача 5");
        byte quantityPaintsTinsWhitePerClass = 2;
        byte quantityPaintsTinsBrownPerClass = 4;
        long totalPaintsTins = quantityPaintsTinsWhitePerClass + quantityPaintsTinsBrownPerClass;
        long totalNumberClasses = 120 / totalPaintsTins;
        long totalPaintsTinsWhite = totalNumberClasses * 2;
        long totalPaintsTinsBrown = totalNumberClasses * 4;
        System.out.println("В школе, где " + totalNumberClasses + " классов, нужно " + totalPaintsTinsWhite + " банок белой краски и " + totalPaintsTinsBrown + " банок коричневой краски");
        System.out.println("");

        // Задача 6
        System.out.println("Задача 6");
        short bananasWeight = 80;
        short quantityBananas = 5;
        long totalWeightBananas = quantityBananas * bananasWeight;
        short volumeMilk = 200;
        short mlHundredWeightMilk = 105;
        long totalWeightMilk = volumeMilk / 100 * mlHundredWeightMilk;
        short iceCreamBriquette = 100;
        short quantityIceCreamBriquette = 2;
        long totalWeightIceCream = iceCreamBriquette * quantityIceCreamBriquette;
        short quantityEggs = 4;
        short weightEgg = 70;
        long totalWeightEggs = quantityEggs * weightEgg;
        long sportsBreakfastWeight = totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightEggs;
        System.out.println("Вес спорт-завтрака нашего спортсмена " + sportsBreakfastWeight + " грамм");
        float sportsBreakfastWeightKg = (float) sportsBreakfastWeight / 1000;
        System.out.println("Вес спорт-завтрака нашего спортсмена " + sportsBreakfastWeightKg + " кг");
        System.out.println("");

        // Задача 7
        System.out.println("Задача 7");
        short bodyWeightLoss = 7000;
        short bodyWeightOneLossDay = 250;
        short bodyWeightTwoLossDay = 500;
        byte dayNumber = 2;
        long sumWeights = bodyWeightOneLossDay + bodyWeightTwoLossDay;
        long bodyAverageWeightLoss = sumWeights / dayNumber;
        long periodWeightOneLoss =  bodyWeightLoss / bodyWeightOneLossDay;
        long periodWeightTwoLoss =  bodyWeightLoss / bodyWeightTwoLossDay;
        long averagePeriodWeightLoss = bodyWeightLoss / bodyAverageWeightLoss;
        System.out.println("Чтобы добится нужного результата похудения,нашему спортсмену нужно минимум " + periodWeightOneLoss + " дней");
        System.out.println("Чтобы добится нужного результата похудения,нашему спортсмену нужно максимум " + periodWeightTwoLoss + " дней");
        System.out.println("Чтобы добится нужного результата похудения,нашему спортсмену нужно в среднем " + averagePeriodWeightLoss + " дней");
        System.out.println("");

        // Задача 8
        System.out.println("Задача 8");
        float salaryIncreaseFactor = 1.1f;
        int salaryMasha = 67760;
        double newSalaryMasha = salaryMasha * salaryIncreaseFactor;
        double incomeIncreaseMasha = newSalaryMasha - salaryMasha;
        double increaseIncomePerYearMasha = incomeIncreaseMasha * 12;
        int salaryDenis = 83690;
        double newSalaryDenis = salaryDenis * salaryIncreaseFactor;
        double incomeIncreaseDenis = newSalaryDenis - salaryDenis;
        double increaseIncomePerYearDenis = incomeIncreaseDenis * 12;
        int salaryKristina = 76230;
        double newSalaryKristina = salaryKristina * salaryIncreaseFactor;
        double incomeIncreaseKristina = newSalaryKristina - salaryKristina;
        double increaseIncomePerYearKristina = incomeIncreaseKristina * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + increaseIncomePerYearMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + increaseIncomePerYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + increaseIncomePerYearKristina + " рублей");
    }
}