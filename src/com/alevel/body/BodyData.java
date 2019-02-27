package com.alevel.body;

public class BodyData {
    private String[] data;
    private int counter;

    public BodyData(String[] data) {
        this.data = data;
        this.counter = data.length;
    }

    public BodyData() {
        data = new String[10];
        counter = 0;
    }

    public void add(String data) {
        if (counter == this.data.length - 1) {
            // Like ArrayList
            String[] newData = new String[this.data.length + this.data.length / 2 + 1];
            System.arraycopy(this.data,
                    0,
                    newData,
                    0,
                    data.length());
            this.data = newData;
        }
        this.data[++counter] = data;
    }
}
