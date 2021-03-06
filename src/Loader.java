
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        int v1 = text.indexOf("Вася заработал");
        int v2 = text.indexOf("руб");
        String str1 = text.substring(v1 + 14, v2).trim();

        int p1 = text.indexOf("Петя ");
        int p2 = text.indexOf("рубля");
        String str2 = text.substring(p1 + 6, p2).trim();

        int m3 = text.indexOf("Маша - ");
        int m4 = text.lastIndexOf("руб");
        String str3 = text.substring(m3 + 6, m4).trim();

        int summ = Integer.parseInt(str1) + Integer.parseInt(str2) + Integer.parseInt(str3);
        System.out.println(String.format("Вася, Петя и Маша заработали %d рублей", summ));
        System.out.println(text);
    }
}