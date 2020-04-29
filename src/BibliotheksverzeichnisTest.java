/**
 *
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BibliotheksverzeichnisTest {
    static Bibliotheksverzeichnis testBiblio;

    @org.junit.jupiter.api.BeforeAll
    static void setUpBeforeClass() throws Exception {
        BiblioTestdaten biblioTest = new BiblioTestdaten();
        biblioTest.erzeugeTestdaten();
        testBiblio = biblioTest.getBiblio();
    }

    @Test
    void gutAddABook() {
        //SETUP//
        String testTitle = "Java ist auch eine Insel";
        String testYear = "2019";
        String testAuthor = "Christian Ullenboom";
        Bibliotheksverzeichnis testLocalBiblio = testBiblio;
        //TEST//
        testLocalBiblio.addBuch(new Buch(testTitle, testAuthor, testYear));
        Assertions.assertEquals(testAuthor, testLocalBiblio.getBuch(5).getAuthor());
        Assertions.assertEquals(testTitle, testLocalBiblio.getBuch(5).getTitle());
        Assertions.assertEquals(testYear, testLocalBiblio.getBuch(5).getPublicationYear());
    }

    @org.junit.jupiter.api.Test
    void gutSearchByLastnameNormalfall1() {
        // SETUP//
        String testString = "Gefundene Buecher:\n" +
                "\tMandy Sult: Theoretisches Testen gibt es nicht, 2016\n" +
                "\tRonald Dump, Mandy Sult: Java mal ganz anders, 2010\n";
        // TEST//
        Assertions.assertEquals(testString, testBiblio.searchByLastname("Sult"));
    }

    @org.junit.jupiter.api.Test
    void gutSearchByLastnameNormalfall2() {
        // SETUP//
        String testString = "Gefundene Buecher:\n" +
                "\tRonald Dump, Mandy Sult: Java mal ganz anders, 2010\n" +
                "\tRonald Dump: Theoretisch gesagt, praktisch gemacht, 2015\n";
        // TEST//
        Assertions.assertEquals(testString, testBiblio.searchByLastname("Dump"));
    }

    @org.junit.jupiter.api.Test
    void gutSearchByLastnameNormalfall3() {
        // SETUP//
        String testString = "Gefundene Buecher:\n" +
                "\tAnette Neumann: Grundlagen theoretischer Physik, 2007\n";
        // TEST//
        Assertions.assertEquals(testString, testBiblio.searchByLastname("Neumann"));
    }

    @org.junit.jupiter.api.Test
    void gutSearchByLastnameNormalfall4() {
        // SETUP//
        String testString = "Gefundene Buecher:\n" +
                "\tThomas Ulm: Grundlagen der Programmierung mit Java, 2016\n";
        // TEST//
        Assertions.assertEquals(testString, testBiblio.searchByLastname("Ulm"));
    }

    @org.junit.jupiter.api.Test
    void gutSearchByLastnameNormalfall5() {
        //SETUP//
        String testTitle = "Java ist auch eine Insel";
        String testYear = "2019";
        String testAuthor = "Christian Ullenboom";
        Bibliotheksverzeichnis testLocalBiblio = testBiblio;
        testLocalBiblio.addBuch(new Buch(testTitle, testAuthor, testYear));
        //TEST//
        String testString = "Gefundene Buecher:\n" +
                "\tChristian Ullenboom: Java ist auch eine Insel, 2019\n";
        // TEST//
        Assertions.assertEquals(testString, testLocalBiblio.searchByLastname("Ullenboom"));
    }

    @org.junit.jupiter.api.Test
    void gutSearchByKeywordNormalfall() {
        // SETUP//
        String testString = "Gefundene Buecher:\n" +
                "\tMandy Sult: Theoretisches Testen gibt es nicht, 2016\n" +
                "\tRonald Dump: Theoretisch gesagt, praktisch gemacht, 2015\n" +
                "\tAnette Neumann: Grundlagen theoretischer Physik, 2007\n";
        // TEST//
        Assertions.assertEquals(testString, testBiblio.searchByKeyword("theoretisch"));
    }
}