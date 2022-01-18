package com.company;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, int pagAtual, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.leitor = leitor;
        this.setAberto(false);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalher(){
        System.out.println("Livro: " + this.getTitulo() + ",\nAutor: " + this.getAutor() +
                ",\nTotal de páginas: " + this.getTotPaginas() + ",\nPagina Atual: " + this.getPagAtual() +
                ",\nAberto: " + this.isAberto() + ",\nLeitor: " + this.getLeitor().getNome());
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear() {
        if(this.getPagAtual() < this.getTotPaginas() && this.isAberto() == true){
            for(int i = 0; i <= this.getTotPaginas() && i <= 10; i += 1){
                setPagAtual(getPagAtual() + 1);
                System.out.println("Folheando: " + getPagAtual());;
            }
        }
    }

    @Override
    public void avanPagina() {
        if(this.isAberto() == true){
            this.setPagAtual(getPagAtual() + 1);
        }
    }

    @Override
    public void voltarPag() {
        if(this.isAberto() == true){
            this.setPagAtual(getPagAtual() - 1);
        }
    }
}
