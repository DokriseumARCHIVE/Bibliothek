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

    @org.junit.jupiter.api.Test
    void gutSearchByLastnameNormalfall() {
        // SETUP//
        String testString = "Gefundene Buecher:\n" +
                "\tMandy Sult: Theoretisches Testen gibt es nicht, 2016\n" +
                "\tRonald Dump, Mandy Sult: Java mal ganz anders, 2010\n";
        // TEST//
        Assertions.assertEquals(testString, testBiblio.searchByLastname("Sult"));
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

    @Test
    void gutAddABook() {
        //SETUP//
        String testTitle = "Java ist auch eine Insel";
        String testYear = "2019";
        String testAuthor = "Christian Ullenboom";
        //TEST//
        testBiblio.addBuch(new Buch(testTitle, testAuthor, testYear));
        Assertions.assertEquals(testAuthor, testBiblio.getBuch(5).getAuthor());
        Assertions.assertEquals(testTitle, testBiblio.getBuch(5).getTitle());
        Assertions.assertEquals(testYear, testBiblio.getBuch(5).getPublicationYear());
    }
}