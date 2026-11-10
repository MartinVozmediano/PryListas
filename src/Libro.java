public class Libro {

    private int codigo;
    private String autor;
    private String titulo;
    private String categoria;
    private int anioP;


    public Libro(int codigo, String autor, String titulo, String categoria, int anioP) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.categoria = categoria;
        this.anioP = anioP;
    }

    @Override
    public String toString() {
        return "Libro" +
                "codigo=" + codigo +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", anioP=" + anioP;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAnioP() {
        return anioP;
    }

    public void setAnioP(int anioP) {
        this.anioP = anioP;
    }
}
