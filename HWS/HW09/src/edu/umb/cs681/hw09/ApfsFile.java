package edu.umb.cs681.hw09;

import java.time.LocalDateTime;

public class ApfsFile extends ApfsElement {

    public ApfsFile(ApfsDirectory parent, String name, int size, LocalDateTime createTime, LocalDateTime lastModified){
        super(parent, name, size, createTime, lastModified);
    }

    public String getName(){
        return name;
    }

    public boolean isDirectory(){
        return false;
    }

    public boolean isFile(){
        return true;
    }

    public LocalDateTime getCreateTime(){
        return createTime;
    }

    public boolean isLink(){
        return false;
    }
}
