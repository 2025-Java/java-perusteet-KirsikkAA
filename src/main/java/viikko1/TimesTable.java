package viikko1;
//palauta n:n kertotaulun 1..10, rivit muodossa n x i = tulos ja jokaisen rivin lopussa \n.

public class TimesTable {
    public static String table(int n) {
    String tulos = "";
    for (int i = 1; i <= 10; i++){
        tulos += n + " x " + i + " = " + (n * i) + "\n";
    }
    return tulos;
    }
}
