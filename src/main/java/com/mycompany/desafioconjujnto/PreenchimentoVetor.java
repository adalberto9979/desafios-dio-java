package com.mycompany.desafioconjujnto;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;
public class PreenchimentoVetor {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));
        double X = leitor.nextDouble();
        BigDecimal[] N = new BigDecimal[100];
        N[0] = new BigDecimal(X).setScale(6, RoundingMode.HALF_UP);
        for (int i = 1; i < N.length; i++) {
            BigDecimal temp = N[i-1];
            N[i] = temp.divide(new BigDecimal("2.00"), MathContext.UNLIMITED);
        }
        for (int i = 0; i < N.length; i++) {
            BigDecimal temp = N[i];
            System.out.println(String.format("N[" + i + "] = %.4f", temp.setScale(4, RoundingMode.HALF_EVEN)));
        }
    }
}
/*
double X = leitor.nextDouble();

BigDecimal[] N = new BigDecimal[100];

N[0] = new BigDecimal(X).setScale(6, RoundingMode.HALF_UP);

for (int i = 1; i < N.length; i++) {

BigDecimal temp = N[i - 1];

N[i] = temp.divide(new BigDecimal("2.00"), MathContext.UNLIMITED);

}

for (int i = 0; i < N.length; i++) {

BigDecimal temp = N[i];

System.out.println(String.format("N[" + i + "] = %.4f", temp.setScale(4, RoundingMode.HALF_EVEN)));

}



99999912343000007654329925.7865
Saída esperada:
N[0] = 99999912342999999470108672.0000
N[1] = 49999956171499999735054336.0000
N[2] = 24999978085749999867527168.0000
N[3] = 12499989042874999933763584.0000
N[4] = 6249994521437499966881792.0000
N[5] = 3124997260718749983440896.0000



777
Saída esperada:
N[0] = 777.0000
N[1] = 388.5000
N[2] = 194.2500
N[3] = 97.1250
N[4] = 48.5625
N[5] = 24.2812
N[6] = 12.1406
N[7] = 6.0703
N[8] = 3.0352
N[9] = 1.5176
N[10] = 0.7588
N[11] = 0.3794
N[12] = 0.1897
N[13] = 0.0948
N[14] = 0.0474
N[15] = 0.0237
N[16] = 0.0119
N[17] = 0.0059
N[18] = 0.0030
N[19] = 0.0015
N[20] = 0.0007
N[21] = 0.0004
N[22] = 0.0002
N[23] = 0.0001
*/