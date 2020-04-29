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
            String string1 = biblio.searchByLastname("Sult");
            System.out.println();
            String string2 = biblio.searchByKeyword("theoretisch");
            System.out.println();
        } catch (Exception e) {
            e.getMessage();
        }

        /**
         try {
         FileWriter fw = new FileWriter("ausgabe.txt");
         PrintWriter pw = new PrintWriter(fw);
         pw.println(string1);
         pw.println();
         pw.println(string2);
         pw.close();
         } catch (FileNotFoundException e) {
         System.err.println("Die Datei wurde nicht gefunden.");
         } catch (FileAlreadyExistsException e) {
         System.err.println("Datei existiert bereits.");
         } catch (IOException e) {
         System.err.println("Eingabe- oder Ausgabefehler!");
         } catch (Exception e) {
         System.err.println("Fehler!");
         }
         */
    }
}
