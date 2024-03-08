package MapCrud;

import DataSiswa.DataSiswa;

import java.util.Map;

public interface CrudInterface {

    void addData(Map<Integer, DataSiswa> m, DataSiswa d);

    void readData(Map<Integer, DataSiswa> m);
    void readData(Map<Integer, DataSiswa> m,int id);

    void deleteData(Map<Integer, DataSiswa> m, int id);
    void deleteData(Map<Integer, DataSiswa> m, DataSiswa d);
    void updateData(Map<Integer, DataSiswa> m, int id, String nama,boolean kelulusan);
}
