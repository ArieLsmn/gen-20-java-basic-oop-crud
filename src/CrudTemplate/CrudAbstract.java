package FileCrud;

import java.io.File;
import DataSiswa.DataSiswa;

abstract class CrudAbstract {

    abstract void addData(File database, DataSiswa d);
    abstract void readData(File database);
    abstract void deleteData(File database, DataSiswa d);
    abstract void updateData(File database, int id,String nama,boolean kelulusan);
}
