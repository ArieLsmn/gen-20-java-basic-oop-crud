package MapCrud;

public class DataSiswa {
    int id;
    String nama;
    boolean lulus;

    public DataSiswa(int id, String nama, boolean lulus){
        this.id=id;
        this.nama=nama;
        this.lulus=lulus;
    }
    int getId(){
        return id;
    }
    String getNama(){
        return nama;
    }
    boolean getLulus(){
        return lulus;
    }
}
