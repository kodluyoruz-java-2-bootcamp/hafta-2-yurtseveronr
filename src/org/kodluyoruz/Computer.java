package org.kodluyoruz;

import javax.swing.plaf.basic.BasicTreeUI;

/**
 * Bu sınıf bir bilgisayarı temsil eder.
 * Bilgisayarın beş adet donamımı vardır:
 *      - Anakart
 *      - CPU
 *      - RAM
 *      - SSD
 *      - Ekran kartı
 *
 * TODO Bu alanların getter ve setter metotlarını oluşturun.
 */
public class Computer
{

    /**
     * anakart
     */
    private Hardware Motherboard;

    /**
     * işlemci
     */
    private Hardware cpu;


    /**
     * RAM
     */
    private Hardware ram;

    /**
     * SSD
     * İsteğe bağlı: Her bilgisayarda SSD olmayabilir
     */
    private Hardware ssd;

    /**
     * ekran kartı
     * İsteğe bağlı: Her bilgisayarda ekran kartı olmayabilir
     */
    private Hardware gpu;

    public Hardware getMotherboard() {
        return Motherboard;
    }

    public void setMotherboard(Hardware motherboard) {
        Motherboard = motherboard;
    }

    public Hardware getCpu() {
        return cpu;
    }

    public void setCpu(Hardware cpu) {
        this.cpu = cpu;
    }

    public Hardware getRam() {
        return ram;
    }

    public void setRam(Hardware ram) {
        this.ram = ram;
    }

    public Hardware getSsd() {
        return ssd;
    }

    public void setSsd(Hardware ssd) {
        this.ssd = ssd;
    }

    public Hardware getGpu() {
        return gpu;
    }

    public void setGpu(Hardware gpu) {
        this.gpu = gpu;
    }
    public double getTotalPrice()
    {
        // Bu metot bilgisayarın donanımlarına bakarak toplam fiyatını hesaplar.
        // TODO metodu doldurun
        gpu.price();
        cpu.price();
        ssd.price();
        ram.price();
        Motherboard.price();

       return gpu.price+cpu.price+ssd.price+ram.price+Motherboard.price;
    }

    public int getTotalPower()
    {
        // Bu metot bilgisayarın donanımlarına bakarak toplamda ne kadar güç tüketeceğini hesaplar.
        // TODO metodu doldurun
        gpu.power();
        cpu.power();
        ssd.power();
        ram.power();
        Motherboard.power();

        return gpu.power+cpu.power+ssd.power+ram.power+Motherboard.power;


    }
}
