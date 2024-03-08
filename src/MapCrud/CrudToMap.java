import java.util.Map;
import java.util.Collections;
public class CrudToMap implements CrudInterface {

    @Override
    public void addData(Map<Integer, DataSiswa> m, DataSiswa d) {
        int maxKey = 0;
        if (!m.isEmpty())
            maxKey = Collections.max(m.keySet());
        m.put(maxKey + 1, d);
    }
    @Override
    public void readData(Map<Integer,DataSiswa> m) {
        for (Map.Entry<Integer, DataSiswa> x : m.entrySet()) {
            System.out.print(x.getKey() + ":");
            System.out.println(x.getValue().getNama());
        }
    }

    @Override
    public void deleteData(Map<Integer,DataSiswa> m, int id) {
        for (Map.Entry<Integer, DataSiswa> entry : m.entrySet()) {
            if ((entry.getValue().getId())==id) {
                m.remove(entry.getKey());
            }
        }

    }

    @Override
    public void deleteData(Map<Integer,DataSiswa> m, DataSiswa d) {
        for (Map.Entry<Integer, DataSiswa> entry : m.entrySet()) {
            if ((entry.getValue().getId())==d.getId()) {
                m.remove(entry.getKey());
            }
        }

    }
    @Override
    public void updateData(Map<Integer,DataSiswa> m,DataSiswa d) {
        for (Map.Entry<Integer, DataSiswa> entry : m.entrySet()) {
            if ((entry.getValue().getId())==d.getId()) {
                m.put(entry.getKey(),d);
            }
        }

    }
}
