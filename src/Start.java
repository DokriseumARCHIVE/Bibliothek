public class Start {
    public static void main(String[] args) {
        BiblioTestdaten biblioTest = new BiblioTestdaten();
        biblioTest.erzeugeTestdaten();
        Bibliotheksverzeichnis biblio = biblioTest.getBiblio();
        try {
            System.out.println(biblio);
            System.out.println();
            System.out.println(biblio.searchByLastname("Sult"));
            System.out.println();
            System.out.println(biblio.searchByKeyword("theoretisch"));
            System.out.println();
            System.out.println(biblio.searchByLastname("Ulm"));
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
