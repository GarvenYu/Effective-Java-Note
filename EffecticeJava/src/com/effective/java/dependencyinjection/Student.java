package com.effective.java.dependencyinjection;

import java.util.Objects;

/**
 * @author freesia <yukaibo@bytedance.com>
 * @date 2019-08-01 00:22
 **/
public class Student {
    private final Book book;

    public Student(Book book){
        //依赖注入
        this.book = Objects.requireNonNull(book);
    }

    public boolean isValid(){
        return this.book == null;
    }

    public static void main(String []args){
        Student s = new Student(new Book());
        s.isValid();
    }
}
