/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnau
 */
public class Book {
    private String author, title;
    private int pageCount;
    
    public Book(String author, String name, int pages){
        this.author = author;
        this.title = name;
        this.pageCount = pages;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.title;
    }
    
    public int getPages(){
        return this.pageCount;
    }
    
    public String toString(){
        return getAuthor() + ", " + getName() + ", " + getPages() + " pages";
    }
}
