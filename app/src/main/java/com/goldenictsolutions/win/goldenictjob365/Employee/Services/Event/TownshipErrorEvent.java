package com.goldenictsolutions.win.goldenictjob365.Employee.Services.Event;

/**
 * Created by kurio on 8/3/17.
 */

public class TownshipErrorEvent {
    private int errorCode;
    private String errorMsg;

    public TownshipErrorEvent(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
