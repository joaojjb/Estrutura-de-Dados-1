
public class Livro {
    private String titulo, autor, editora;

    public Livro(String t, String a, String e) {
        titulo = t;
        autor = a;
        editora = e;
    }

    public String getLivro() {
        return (titulo + "\n" + autor + "\n" + editora + "\n");
    }
}
