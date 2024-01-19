/* 
 instanceof keywordü(anahtar kelimesi): Bir objenin hangi sınıftan olduğunu öğrenmemizi sağlıyor.
*/
class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus() {
        return " Hayvan konuşuyor...";
    }
}
class Kedi extends Hayvan {

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyor...";
    }
}
class Kopek extends Hayvan {

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havlıyor...";
    }
}
class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kişniyor...";
    }
}
public class Main {

    /*
    public static void konustur(Hayvan hayvan) {

        System.out.println(hayvan.konus());

    }
    public static void main(String[] args) {

        // instanceof

        Kopek kopek = new Kopek("Karabaş");

        if(kopek instanceof Kopek) { /* kopek referansı Kopek sınıfından mıdır? sorgulamasını yapıyoruz. True ya da
                                        False değer dönecek
            System.out.println("Bu nesne Kopek sınıfındandır...");
        }
        if (kopek instanceof Hayvan) { /* Bu sefer de Kopek class'ı yerine Hayvan yazdık. Inheritanceden dolayı
                                        True değer döndü ve yine aynı çıktıyı verdi.
                                        Hayvan veya Kopek yerine Kedi veya At yazarsak direkt olarak hata alıyoruz
            System.out.println("Bu nesne Hayvan sınıfındandır...");
        }

    }
    */

    public static void konustur(Object object) { /*Javada defaultta bulunan Object class'ında object referansı
                                                    oluşturduk. Hayvan hayvan yerine yazdık.*/

        System.out.println(object.konus()); //Burada da hayvan referansı yerine object yazdık.

    }
    public static void main(String[] args) {

        Kopek kopek = new Kopek("Karabaş");
        Kedi kedi = new Kedi("Tekir");
        At at = new At("Gülbatur");
        Hayvan hayvan = new Hayvan("Limon");
        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);


    }

}