package org.kodluyoruz;

/**
 * Bu sınıf bir işlemciyi temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her işlemcinin Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 *      - Çekirdek sayısı (cores) (int türünde)
 *      - Thread sayısı (threads) (int türünde)
 *
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class CPU extends Hardware {
    int cores;
    int threads;

    public int getCores() {
        return cores;
    }

    public void setCores(int core) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int thread) {
        this.threads = threads;
    }

    /*
     * Çekirdek sayısı 6 veya daha fazlaysa CPU'nun fiyatı %30 oranında artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */
    @Override
    public double price() {
        if (cores >= 6) {
            price *= 1.3;
        }
        return price;
    }
    public int power() {
        return power;
    }
}




