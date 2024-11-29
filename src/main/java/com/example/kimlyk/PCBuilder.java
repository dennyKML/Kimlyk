package com.example.kimlyk;

public class PCBuilder {
    private String cpu;
    private String ram;
    private String gpu;
    private String ssd;
    private String hdd;
    private String psu;
    private String os;

    public PCBuilder setCPU(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public PCBuilder setRAM(String ram) {
        this.ram = ram;
        return this;
    }

    public PCBuilder setGPU(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public PCBuilder setSSD(String ssd) {
        this.ssd = ssd;
        return this;
    }

    public PCBuilder setHDD(String hdd) {
        this.hdd = hdd;
        return this;
    }

    public PCBuilder setPSU(String psu) {
        this.psu = psu;
        return this;
    }

    public PCBuilder setOS(String os) {
        this.os = os;
        return this;
    }

    public PC build() {
        if (cpu == null || ram == null || psu == null || os == null)
            throw new IllegalArgumentException("CPU, RAM, PSU, and OS are mandatory components.");
        if (ssd == null || hdd == null)
            throw new IllegalArgumentException("SSD and HDD are mandatory components.");
        if (!(os.equalsIgnoreCase("Windows") || os.equalsIgnoreCase("Linux") ||
                os.equalsIgnoreCase("None")))
            throw new IllegalArgumentException("OS must be either Windows, Linux, or None.");
        return new PC(cpu, ram, gpu, ssd, hdd, psu, os);
    }
}
