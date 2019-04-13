package dikdikmaulana48.gmail.project_dikdik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class TampilList extends AppCompatActivity {
    ListView list;
    //TODO 1 : Membuat Array maintitle, subtitle, dan imgid
    String[] maintitle = {
            "Nurul Islamy", "Agi Ayat",
            "Bayu Kuncara", "Dilla Nurfadillah",
            "Pande Kadek",
            "Nina Mariana",
            "Sandy","Elsa"
    };
    String[] subtitle = {
            "cibarenkok", "Cibodas",
            "Kalasan", "Bojong Jengkol",
            "Bali",
            "Tambaksari",
            "Kalimantan","Kalimantan"
    };
    Integer[] imgid = {
            R.drawable.f_unu,
            R.drawable.f_agi,
            R.drawable.f_bayu,
            R.drawable.f_dilla,
            R.drawable.f_kadek,
            R.drawable.f_nina,
            R.drawable.f_sandy,
            R.drawable.f_elsa
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_list);
        //TODO 2 : Membuat objek baru dari class MyListAdapter
        MyListAdapter adapter = new MyListAdapter(this, maintitle, subtitle, imgid);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //TODO 3 : Untuk meletakan posisi pada aplikasi
                if (position == 0) {
//code specific to first list item
                    Toast.makeText(getApplicationContext(), "Place Your First Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
//code specific to 2nd list item
                    Toast.makeText(getApplicationContext(), "Place Your Second Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 2) {
                    Toast.makeText(getApplicationContext(), "Place Your Third Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 3) {
                    Toast.makeText(getApplicationContext(), "Place Your Forth Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 4) {
                    Toast.makeText(getApplicationContext(), "Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
                }else if (position == 5) {
                    Toast.makeText(getApplicationContext(), "Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
                }else if (position == 6) {
                    Toast.makeText(getApplicationContext(), "Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
                }else if (position == 7) {
                    Toast.makeText(getApplicationContext(), "Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
