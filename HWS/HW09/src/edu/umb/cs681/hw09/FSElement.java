package edu.umb.cs681.hw09;

import java.time.LocalDateTime;
import java.util.concurrent.locks.ReentrantLock;

public abstract class FSElement {
    protected String name;
    protected int size;
    protected LocalDateTime createTime;
    protected ApfsDirectory parent;
    protected ReentrantLock lock = new ReentrantLock();

    public FSElement(ApfsDirectory parent, String name, int size, LocalDateTime createTime){
        this.parent = parent;
        this.name= name;
        this.size = size;
        this.createTime = createTime;
    }

    public String getName() {
        lock.lock();
        try{
            return name;
        }finally {
            lock.unlock();
        }
    }

    public void setName(String name) {
        lock.lock();
        try{
            this.name = name;
        }finally {
            lock.unlock();
        }

    }

    public int getSize() {
        lock.lock();
        try {
            return this.size;
        } finally {
            lock.unlock();
        }
    }

    public ApfsDirectory getParent(){
        lock.lock();
        try {
            return this.parent;
        }finally {
            lock.unlock();
        }
    }

    public void setSize(int size) {
        lock.lock();
        try {
            this.size = size;
        }finally {
            lock.unlock();
        }
    }

    public LocalDateTime getCreateTime(){
        lock.lock();
        try {
            return this.createTime;
        }finally {
            lock.unlock();
        }
    }

    public void setCreateTime(LocalDateTime createTime) {
        lock.lock();
        try {
            this.createTime = createTime;
        }finally {
            lock.unlock();
        }
    }

//  Implement by the subclass
    public abstract boolean isDirectory();
    public abstract boolean isFile();
}
