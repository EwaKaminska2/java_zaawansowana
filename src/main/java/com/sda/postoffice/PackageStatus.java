package com.sda.postoffice;

public enum PackageStatus {
    SENT("Already sent",500),
    TRAVELLING("Is still travelling",401),
    COURIER(" Courier have it",402),
    DELIVERED( "Allready delivered",501),
    LOST(" Is lost",404),
    RETURNED(" Returned",507);

private final String message;
private final int code;

PackageStatus ( String message, int code){
    this.message=message;
    this.code=code;
}

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "PackageStatus{" +
                "message='" + message + '\'' +
                ", code=" + code +
                '}';
    }
}
