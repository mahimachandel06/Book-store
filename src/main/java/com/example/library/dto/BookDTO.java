
package com.example.library.dto;


public class BookDTO {

private Long id;
private String title;
private String authorName;
private boolean available;

BookDTO(){
}

BookDTO(Long id , String title , String authorName , boolean available)
{
    this.id=id;
    this.title=title;
    this.authorName=authorName;
    this.available=available;
}

public Long getId(){
    return id;
}

public void setId(Long id){
    this.id =id;
}

public String getTitle(){
    return title;
}

public void setTitle(String title){
     this.title = title;
}

public String getAuthorName(){
     return authorName;
}

public void setAuthorName(String authorName){
    this.authorName = authorName;
}

public boolean getAvailable(){
    return available;
}

public void setAvailable(boolean available){

    this.available = available;
}


}