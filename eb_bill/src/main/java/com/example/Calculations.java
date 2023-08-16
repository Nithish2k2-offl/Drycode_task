package com.example;

public class Calculations {

    public static double limit101_200, limit1_100, limit201_400, limit401_500, limit101_400;
    public static double limit501_600, limit601_800, limit801_1000;

    static double segregate(int units) {
        double resultBill = 0;
        if (units <= 500) {
            limit1_100 = 0;
            limit101_200 = 2.25;
            limit201_400 = 4.5;
            limit401_500 = 6;

            resultBill = calculate(units, limit1_100, limit101_200, limit201_400, limit401_500);
        } else {
            limit1_100 = 0;
            limit101_400 = 4.5;
            limit401_500 = 6;
            limit501_600 = 8;
            limit601_800 = 9;
            limit801_1000 = 10;
            resultBill = calculate(units, limit1_100, limit101_400, limit401_500, limit501_600, limit601_800,
                    limit801_1000);
        }

        return resultBill;
    }
    

    static double calculate(int units, double a, double b, double c, double d) {
        double bill = 0;

        if (units >= 1 && units <= 100) {
            bill = 0;
            return bill;
        }
        if (!(units >= 101 && units <= 200)) {
            bill += limit101_200 * 100;

            if (!(units >= 201 && units <= 400)) {
                bill += limit201_400 * 200;
                bill += (units - 401 + 1) * 6;
            } else {
                bill += (units - 201 + 1) * 4.5;
            }
        } else {
            bill += (units - 101 + 1) * 2.25;
        }

        return bill;

    }

    static double calculate(int units, double a, double b, double c, double d, double e, double f) {
        double bill = 0;

        if (units >= 1 && units <= 100)
            {
                bill = 0;
                return bill;
            }

        if (!(units >= 101 && units <= 400)) {
            bill += limit101_400 * 300;
            if (!(units >= 401 && units <= 500)) {
                bill += limit401_500 * 100;
                if (!(units >= 501 && units <= 600)) {
                    bill += limit501_600 * 100;
                    if (!(units >= 601 && units <= 800)) {
                        bill += limit601_800 * 200;
                        if (!(units >= 801 && units <= 1000)) {
                            bill += limit801_1000 * 200;
                            if (units > 1000) {
                                bill += (units - 1000) * 10;
                            }
                        }
                        else bill+=(units - 801 + 1)*limit801_1000;
                    }
                    else bill+=(units -601+1)*limit601_800;
                }
                else bill+=(units-501+1)*limit501_600;
            }
            else bill+=(units-401+1)*limit401_500;            
        }
        else bill+=(units-101+1)*limit101_400;

        return bill;
    }

}
