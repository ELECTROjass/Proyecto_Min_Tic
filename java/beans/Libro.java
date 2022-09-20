package beans;

public class Libro {
    private int id;
    private String titulo;
    private String categoria;
    private int num_paginas;
    private int inventario;
    private String autor;
    private String descripcion;
    private String editorial;

    public Libro(int id, String titulo, String categoria, int num_paginas, int inventario, String autor, String descripcion, String editorial) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.num_paginas = num_paginas;
        this.inventario = inventario;
        this.autor = autor;
        this.descripcion = descripcion;
        this.editorial = editorial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getNum_paginas() {
        return num_paginas;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", titulo=" + titulo + ", categoria=" + categoria + ", num_paginas=" + num_paginas + ", inventario=" + inventario + ", autor=" + autor + ", descripcion=" + descripcion + ", editorial=" + editorial + '}';
    }  
    
}
