package edu.umb.cs681.hw09;

import java.time.LocalDateTime;

public class APFS extends FileSystem{
    private LocalDateTime LastModified;
    private LocalDateTime createTime;
    protected static APFS a = null;
    private String name;
    protected ApfsDirectory root;

    public static APFS getInstance(){
        if(a == null){
            a = new APFS();
        }
        return a;
    }

    public ApfsElement initFS(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        ApfsElement root = createDefaultRoot();
        if(root.isDirectory() && capacity >= root.getSize()){
            setRoot(root);
            this.id = root.hashCode();
            return root;
        }
        else{
            return null;
        }
    }

    protected ApfsDirectory createDefaultRoot() {
//        super(parent, name,size, createTime, lastModified);
        root = new ApfsDirectory(null, "root", 0, createTime, LastModified);
        return root;
    }

    public ApfsDirectory getRootDir(){
        return root;
    }
}
