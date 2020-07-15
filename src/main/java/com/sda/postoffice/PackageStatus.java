package com.sda.postoffice;
import java.util.*;

public enum PackageStatus {
    SENT("Package sent",400) {
        @Override
        public List<PackageStatus> getNextStatuses() {
            List<PackageStatus> list = new ArrayList<>();
            list.add(PackageStatus.TRAVELLING);
            list.add(PackageStatus.LOST);
            return list;
        }
    },
    TRAVELLING("Package travelling",403) {
        @Override
        public List<PackageStatus> getNextStatuses() {
            List<PackageStatus> list = new ArrayList<>();
            list.add(PackageStatus.COURIER);
            list.add(PackageStatus.LOST);
            return list;
        }
    },
    COURIER("Package with courier",301) {
        @Override
        public List<PackageStatus> getNextStatuses() {
            List<PackageStatus> list = new ArrayList<>();
            list.add(PackageStatus.DELIVERED);
            list.add(PackageStatus.RETURNED);
            list.add(PackageStatus.LOST);
            return list;
        }
    },
    DELIVERED("Package delivered",500) {
        @Override
        public List<PackageStatus> getNextStatuses() {
            return new ArrayList<>();
        }
    },
    LOST("Package lost",404) {
        @Override
        public List<PackageStatus> getNextStatuses() {
            return new ArrayList<>();
        }
    },
    RETURNED("Package returned",406) {
        @Override
        public List<PackageStatus> getNextStatuses() {
            return new ArrayList<>();
        }
    };

    private final String message;
    private final int statusCode;

    PackageStatus(String message,int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public abstract List<PackageStatus> getNextStatuses();
}