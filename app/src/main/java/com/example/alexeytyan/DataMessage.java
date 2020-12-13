package com.example.alexeytyan;

public class DataMessage {

    private final DataPoint mDataPoint;

    public DataMessage(DataPoint dataPoint) {
        mDataPoint = dataPoint;
    }

    public DataPoint getDataPoint() {
        return mDataPoint;
    }
}
