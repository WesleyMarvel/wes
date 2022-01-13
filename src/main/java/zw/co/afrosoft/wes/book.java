package zw.co.afrosoft.wes;

import javax.persistence.*;

@Entity
public class book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="book_ID")
    private int book_ID;

    @Column(name="title")
    private String title;

    @Column(name="author")
    private String author;

    @Column(name="publicationYear")
    private int publicationYear;

    public int getBook_ID(){
        return book_ID;
    }

    public void setBook_ID(){
        this.book_ID = book_ID;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(){
        this.author = author;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    public void setPublicationYear(){
        this.publicationYear= publicationYear;
    }
}

