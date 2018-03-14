package com.rratliff.coffee;

public class Mug {

    private String slogan;
    private int handleSize;

    public Mug(String slogan, int handleSize) {
        this.slogan = slogan;
        this.handleSize = handleSize;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public int getHandleSize() {
        return handleSize;
    }

    public void setHandleSize(int handleSize) {
        this.handleSize = handleSize;
    }

    @Override
    public String toString() {
        return "com.rratliff.coffee.Mug{" +
                "slogan='" + slogan + '\'' +
                ", handleSize=" + handleSize +
                '}';
    }
}
