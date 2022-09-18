public class Selam {
    String word = "Millet"; // isim girilmediği zaman miilet yazacağı için selam classında tanımladık

    public String SelamVer(String kisiyeSelamVer) {   // Selam vereceğimiz kişinin eylemini yaptık
        String cumle;           // cümleyi geri dönüş için kullacağız
        if (kisiyeSelamVer != "")    // eğer  selam vereceğimiz kişi boş ise cümleye ismi ata
            cumle = "Selam " + kisiyeSelamVer + " :)";
        else
            cumle = "Selam " + word + " :)"; // eğer selam vereceğimiz kişi yoksa toplu mesaj ver
        return cumle;
    }
}
