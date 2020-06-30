package com.sda.postoffice;

import com.sun.jdi.request.InvalidRequestStateException;

import java.util.UUID;
import java.util.*;

public class Package {

    private final String description;
    private final String id;
    private PackageStatus status;

    Package(String description) {
        status = PackageStatus.SENT;
        id = UUID.randomUUID().toString();
        this.description = description;
    }

    void setStatus(PackageStatus status) {

        List<PackageStatus> list = availableStatuses();

        if (!list.contains(status)) {
            throw new InvalidRequestStateException("Cannot accept this status");
        }
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public PackageStatus getStatus() {
        return status;
    }

    public List<PackageStatus> availableStatuses() {
        return status.getNextStatuses();
    }

    @Override
    public String toString() {
        return "Package{" +
                "description='" + description + '\'' +
                ", id='" + id + '\'' +
                ", status=" + status + " : " + status.getMessage() + " [" + status.getStatusCode() + "]" +
                '}';
    }
}