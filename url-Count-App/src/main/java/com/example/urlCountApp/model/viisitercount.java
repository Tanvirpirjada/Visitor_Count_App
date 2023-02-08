package com.example.urlCountApp.model;

public class viisitercount {

    private int count;
    private String username;

    public viisitercount(int count){
        this.count++;
    }
    public viisitercount(int count, String username) {
        this.count = count;
         this.username=username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "viisitercount{" +
                "count=" + count +
                ", username='" + username + '\'' +
                '}';
    }
}
