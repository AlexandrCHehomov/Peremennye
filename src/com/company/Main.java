package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        byte a = 127;
        short b = 348;
        int c = 14522;
        long d = 4456686841L;
        float f = (float) 1.454785123E06;
        double m = 23458.1234;
        char l = 1238;
        boolean j = true;




        float weightFirstBoxer = (float) 78.2;
        float weightSecondBoxer = (float) 82.7;
        float totalWeight = weightFirstBoxer + weightFirstBoxer;
        System.out.println("Общий вес боксёров " + totalWeight + " кг");
        float weightDifference = weightFirstBoxer - weightSecondBoxer;
        System.out.println("Разница в весе боксёров " + weightDifference + " кг");



        int bananas = 5;
        int weightBananas = 80;
        int milk = 2;
        int weightMilk = 105;
        int iceCream = 2;
        int weightIceCream = 100;
        int eggs = 4;
        int weightEggs = 70;
        int totalWeightProducts = bananas * weightBananas + milk * weightMilk + iceCream * weightIceCream + eggs * weightEggs;
        System.out.println("Вес завтрака " + totalWeightProducts + " в граммах");
        float kgTotalWeight = (float) totalWeightProducts / 1000;
        System.out.println("Вес завтрака " + kgTotalWeight + " в киллограммах");




        int loseWeightKg = 7;
        int loseWeightInDayInGr1 = 250;
        int loseWeightInDayInGr2 = 500;
        int loseWeightGr = loseWeightKg * 1000;
        int day1 = loseWeightGr / loseWeightInDayInGr1;
        int day2 = loseWeightGr / loseWeightInDayInGr2;
        System.out.println("Если спортсмен хочет сбросить " + loseWeightKg + " кг" + " и будет сбрасывать в день по " + loseWeightInDayInGr1 + " грамм, то ему понадобиться " + day1 + " дней");
        System.out.println("Если спортсмен хочет сбросить " + loseWeightKg + " кг" + " и будет сбрасывать в день по " + loseWeightInDayInGr2 + " грамм, то ему понадобиться " + day2 + " дней");




        int zpMasha = 67760;
        int povishenieMasha = (int) (zpMasha * 0.1);
        int zpMashaNew = zpMasha + povishenieMasha;
        int month = 12;
        int differenceZpMasha = zpMashaNew * month - zpMasha * month;
        int zpDenis = 83690;
        int povishenieDenis = (int) (zpDenis * 0.1);
        int zpDenisNew = zpDenis + povishenieDenis;
        int differenceZpDenis = zpDenisNew * month - zpDenis * month;
        int zpKristina = 76230;
        int povishenieKristina = (int) (zpKristina * 0.1);
        int zpKristinaNew = zpKristina + povishenieKristina;
        int differenceZpKristina = zpKristinaNew * month - zpKristina * month;
        System.out.println("Маша теперь получает " + zpMashaNew + " рублей. Годовой доход вырос на " + differenceZpMasha + " рублей");
        System.out.println("Денис теперь получает " + zpDenisNew + " рублей. Годовой доход вырос на " + differenceZpDenis + " рублей");
        System.out.println("Кристина теперь получает " + zpKristinaNew + " рублей. Годовой доход вырос на " + differenceZpKristina + " рублей");

    }
}

