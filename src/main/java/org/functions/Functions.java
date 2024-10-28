package org.functions;

public class Functions {
    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Hàm kiểm tra số chẵn
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    // Hàm tính giai thừa
    public static long factorial(int num) {
        if(num < 0 || num > 20 )
            throw new IllegalArgumentException("Invalid argument");

        if (num == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Hàm kiểm tra năm nhuận
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }

    // Hàm kiểm tra số hoàn hảo
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            return true;
        }
        return false;
    }
}
