package org.ieslosremedios.daw1.prog.util;
public class Calculadora {
        public static Integer suma(Integer a, Integer b) {
            return a+b;
        }
        public static Float suma(Integer a, Integer b, Float  c){return suma(a,b)+c;};
        public static Integer resta(Integer a, Integer b) {return a-b;}
        public static Integer multiplicar(Integer a, Integer b) {return a*b;}
        public static Integer division(Integer a, Integer b) {return a/b;}
        public static Integer factorial(Integer a) {
            int i = 1;
            int factorial = 1;
            while (i <= a ){
                factorial = factorial * i;
            }
            return factorial;
        }
        public static Integer mayor (Integer a, Integer b){
            if (a > b) return a;
            else return b;
    }
        public static Integer mayor (Integer a, Integer b, Integer c) {
            if (a > b && a > c) return a;
            else if (b > a && b > c) return b;
            else return c;
    }
}

