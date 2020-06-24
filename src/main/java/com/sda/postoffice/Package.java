package com.sda.postoffice;

import java.util.UUID;

public class Package {

    private String description;
    private String id;

    private PackageStatus status;

    public Package(String description) {
        this.description = description;
        this.id = UUID.randomUUID().toString();
        this.status=PackageStatus.SENT;
    }


    public void changeStatus(PackageStatus newStatus) {
        this.status = newStatus;

    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Package{" +
                "description='" + description + '\'' +
                ", id='" + id + '\'' +
                ", status=" + status +
                '}';
    }
}