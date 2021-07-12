package com.paralun.model;

public class Book {

    private String id;
    private String judul;
    private String penulis;
    private String penerbit;

    public Book() {
    }

    public Book(String id, String judul, String penulis, String penerbit) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", judul='" + judul + '\'' +
                ", penulis='" + penulis + '\'' +
                ", penerbit='" + penerbit + '\'' +
                '}';
    }
}
