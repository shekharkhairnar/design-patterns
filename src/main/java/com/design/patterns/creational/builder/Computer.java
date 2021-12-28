package com.design.patterns.creational.builder;

public class Computer {
    private Integer ramSize;
    private Integer hardDriveSize;
    private Monitor monitor;

    private Computer(Builder builder) {
        this.ramSize = builder.ramSize;
        this.hardDriveSize = builder.hardDriveSize;
        this.monitor = builder.monitor;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Computer{");
        sb.append("ramSize=").append(ramSize);
        sb.append(", hardDriveSize=").append(hardDriveSize);
        sb.append(", monitor=").append(monitor);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {
        Integer ramSize;
        Integer hardDriveSize;
        Monitor monitor;

        public Builder setRamSize(Integer ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        public Builder setHardDriveSize(Integer hardDriveSize) {
            this.hardDriveSize = hardDriveSize;
            return this;
        }

        public Builder setMonitor(Monitor monitor) {
            this.monitor = monitor;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
