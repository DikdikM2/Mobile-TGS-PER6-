package dikdikmaulana48.gmail.project_dikdik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){
        //TODO 1 : Menmbuat intent dengan nama List dan Regis yang mengambil dari class TampilList dan class Registrasi
        Intent List=new Intent(getApplicationContext(), TampilList.class);
        Intent Regis=new Intent(getApplicationContext(), Registrasi.class);
        //TODO 2 : Mendeklarasikan Variabel username dan password dan memberikan nilai pada variabel
        String username = "dikdik";
        String password = "244342";
        //TODO 3 : Mengambil nilai dari field editText7 dan editText8
        EditText user=findViewById(R.id.editText7);
        EditText pass=findViewById(R.id.editText8);
        //TODO 4 : Mengkonversi nilai di variabel ke String
        String inputuser = user.getText().toString();
        String inputpass = pass.getText().toString();
        //TODO 5 : Logika untuk login jika benar dan  jika salah
        if(inputuser.equals(username) && inputpass.equals(password)){
            startActivity(List);
        }else{
            startActivity(Regis);
        }

    }
}
