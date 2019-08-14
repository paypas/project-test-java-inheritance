class Mobil extends Kendaraan{
    int jumlahPenumpang;

    Mobil(int roda, int tahun, String warna, int jumlahPenumpang){
        super(roda, tahun, warna);
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public String print(Mobil m){
        return "Mobil\nJumlah Roda : "+m.roda+
            "\nTahun : "+m.tahun+
            "\nWarna : "+m.warna+
            "\nJumlah Penumpang : "+jumlahPenumpang+" Orang\n";
    }
}