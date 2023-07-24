import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*final é uma constante
        final double taxaJuros = 13.23;
        int [] valores = {5,6,7,8,923,5237,8,412};
        String [][] carros = {{"Fiat", "BMDW" }, {"JEEP", "AUDI" }};
        Arrays.sort(valores);
        System.out.println(Arrays.toString(valores));
        System.out.println(Arrays.toString(carros));
        System.out.print(carros[0]);
        //System.out.printf(Arrays.deepToString(carros));
        System.out.println(taxaJuros);*/
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
        System.out.println(Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println(Arrays.toString(my_array1));
        System.out.println(Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println(Arrays.toString(my_array2));
    }
}

