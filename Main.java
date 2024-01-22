/* 
    instanceof keywordü(anahtar kelimesi): Bir objenin hangi sınıftan olduğunu öğrenmemizi sağlıyor.
    Bu derste Polymorphism'in önemini, eğer olmasaydı nasıl zorluklarla karşılaşabileceğimizi, ne kadar uzun kodlar yazmamız gerekebileceğini göreceğiz.
    İlk derste oluşturduğumuz hiyerarşik Hayvan - Kedi - Köpek - At classlarını aynı şekilde yapıştırdım. Asıl olay main
    metodu içerisinde yazılanlarda.
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

    public static void konustur(Object object) { /* Javada defaultta bulunan Object class'ında object referansı
                                                    oluşturduk. Bu Object class'ı diğer bütün classları kapsayan
                                                     bir class. Hayvan hayvan yerine yazdık.
                                                    Polymorphism 1'de burası Hayvan hayvan iken sadece bir fonksiyon
                                                    yazarak tüm hayvanları konuşturmuştuk. Aşağıdaki gibi if koşulları
                                                    ile kontrol sağlamamıza gerek kalmadan. Hayvan hayvan diğer
                                                    alt sınıflara referans gösterebiliyordu.
                                                    "hayvan.konus()" dediğimiz zaman override edilen methodlara
                                                    bakıyordu ve hangi nesne ise onu çalıştırıyordu.
                                                    Fakat burada object yazdığımız zaman bu objenin hangi nesneden oldu
                                                   -nu anlamamız için ekstradan kontroller yapmamız gerekti.
                                                   */

        //System.out.println(object.konus()); //Burada da hayvan referansı yerine object yazdık.

        if (object instanceof Hayvan) {
            Hayvan hayvan = (Hayvan) object; /* hayvan referansını object referansına eşitleyebilmemiz için
                                                (Hayvan) object yaptık. Bu bir çevrim yöntemi.
                                                int, double veya float veri tiplerinin birbirlerine çevrimlerini
                                                hatırla. Orada da "(double)25" gibi ifadeler kullanıyorduk. */

            System.out.println(hayvan.konus());

        }
        else if (object instanceof Kedi) {
            Kedi kedi = (Kedi) object;
            System.out.println(kedi.konus());

        }
        else if (object instanceof Kopek ) {
            Kopek kopek = (Kopek) object;
            System.out.println(kopek.konus());

        }
        else if (object instanceof At) {
            At at = (At) object;
            System.out.println(at.konus());

        }

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