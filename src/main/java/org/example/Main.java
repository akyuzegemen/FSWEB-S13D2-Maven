package org.example;

import java.lang.invoke.SwitchPoint;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public static boolean isPalindrome (int num)
    {
        String num2 = String.valueOf(num);
        if(num2.contains("-"))
        {
            int b = 1;
            int s = num2.length() -1;
            while(b <= s)
            {
                if(num2.charAt(b) != num2.charAt(s))
                {
                    return false;
                }
                b++;
                s--;
            }
            return true;
        }
        int b = 0;
        int s = num2.length() -1;
        while(b <= s)
        {
            if(num2.charAt(b) != num2.charAt(s))
            {
                return false;
            }
            b++;
            s--;
        }
        return true;

    }

    public static boolean isPerfectNumber(int num)
    {
        if (num < 0)
            return false;
        int sum = 0;
        for(int i = 1; i < num; i++)
        {
            if(num % i == 0)
            {
                sum += i;
            }
        }
        return sum == num;
    }

    public static String numberToWords(int param)
    {
        if (param < 0)
            return  "Invalid Value";
        String result = "";
        String sparam = String.valueOf(param);

        for (int i = 0; i < sparam.length(); i++)
        {
            switch (sparam.charAt(i))
            {
                case '1':
                    result = result + "One ";
                    break;
                case '2':
                    result = result + "Two ";
                    break;
                case '3':
                    result = result + "Three ";
                    break;
                case '4':
                    result = result + "Four ";
                    break;
                case '5':
                    result = result + "Five ";
                    break;
                case '6':
                    result = result + "Six ";
                    break;
                case '7':
                    result = result + "Seven ";
                    break;
                case '8':
                    result = result + "Eight ";
                    break;
                case '9':
                    result = result + "Nine ";
                    break;
                case '0':
                    result = result + "Zero ";
                    break;
            }

        }
        return result.trim();
    }
}
