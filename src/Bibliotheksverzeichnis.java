public class Bibliotheksverzeichnis {
    private Buch[] bookList = new Buch[32];
    private int indexOfBiblio = 0;

    /**
     * method. which add a book in buecherliste
     *
     * @param buch is from the class Buch
     */
    public void addBuch(Buch buch) {
        bookList[this.indexOfBiblio] = buch;
        indexCounter();
    }

    /**
     * method, which get a book from the list buecherliste with the index
     *
     * @param index variable, which give the index number of the buecherliste, where the book is
     * @return get the book
     */
    public Buch getBuch(int index) {
        return bookList[index];
    }

    private void indexCounter() {
        this.indexOfBiblio++;
    }

    /**
     * method, which give the string from an object Bibliotheksverzeichnis
     *
     * @return all book with their parameters from the Bibliotheksverzeichnis
     */
    @Override
    public String toString() {
        String ausgabe = "Buecherliste:\n";
        for (int index = 0; index < this.indexOfBiblio; index++) {
            if (bookList[index] != null) {
                ausgabe += bookList[index].toString();
                ausgabe += "\n";
            }
        }
        return ausgabe;
    }

    /**
     * method, which search a author by initiated surname
     *
     * @param lastname the surname from an author
     * @return a arraylist of books with the initiated author
     */
    private Buch[] searchAllBookByLastname(String lastname) {
        String surname = lastname.toUpperCase();
        Buch[] booksByLastname = new Buch[this.indexOfBiblio];
        int indexBook = 0;
        try {
            for (int i = 0; i < bookList.length; i++) {
                if (bookList[i] != null) {
                    String authors = bookList[i].getAuthor();
                    if (authors.toUpperCase().contains(surname)) {
                        booksByLastname[indexBook] = bookList[i];
                        indexBook++;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Fehler ArrayIndexOutOfBoundsException Surname");
        } catch (NumberFormatException e) {
            System.err.println("Fehler NumberFormatException Surname");
        } catch (NullPointerException e) {
            System.err.println("Fehler NullPointerException Surname");
        } catch (Exception e) {
            System.err.println("Fehler " + e.getClass().toString() + " Surname");
        }
        return booksByLastname;
    }

    /**
     * method, which output a list as string from books from the initiated author by surname, which the user can input
     *
     * @param lastname the surname from an author
     * @return a list of books with the initiated author as string
     */
    public String searchByLastname(String lastname) {
        String ausgabe = "Gefundene Buecher:\n";
        Buch[] searchBookBySurname = searchAllBookByLastname(lastname);
        for (Buch buch : searchBookBySurname) {
            if (buch != null) {
                ausgabe += "\t" + buch;
                ausgabe += "\n";
            }
        }
        return ausgabe;
    }

    /**
     * method, which search all books by initiated keyword from the title
     *
     * @param keyword the keyword from the title of the books
     * @return a arraylist of books with the initiated keyword in the title
     */
    private Buch[] searchAllBooksByKeyword(String keyword) {
        String keywordBookTitles = keyword.toUpperCase();
        Buch[] booksByKeyword = new Buch[this.indexOfBiblio];
        int indexBook = 0;
        try {
            for (int i = 0; i < bookList.length; i++) {
                if (bookList[i] != null) {
                    String title = bookList[i].getTitle();
                    if (title.toUpperCase().contains(keywordBookTitles)) {
                        booksByKeyword[indexBook] = bookList[i];
                        indexBook++;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Fehler ArrayIndexOutOfBoundsException Keyword");
        } catch (NumberFormatException e) {
            System.err.println("Fehler NumberFormatException Keyword");
        } catch (NullPointerException e) {
            System.err.println("Fehler NullPointerException Keyword");
        } catch (Exception e) {
            System.err.println("Fehler " + e.getClass().toString() + " Keyword");
        }
        return booksByKeyword;
    }

    /**
     * method, which output a list as string from books from the initiated keyword in the title, which the user can input
     *
     * @param keyword the keyword from the title of the books
     * @return a list of books with the initiated author as string
     */
    public String searchByKeyword(String keyword) {
        String ausgabe = "Gefundene Buecher:\n";
        Buch[] searchBookByKeyword = searchAllBooksByKeyword(keyword);
        for (Buch buch : searchBookByKeyword) {
            if (buch != null) {
                ausgabe += "\t" + buch;
                ausgabe += "\n";
            }
        }
        return ausgabe;
    }
}
