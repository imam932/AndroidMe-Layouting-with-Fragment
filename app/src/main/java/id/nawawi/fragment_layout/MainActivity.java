package id.nawawi.fragment_layout;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

//    overide ini memanggil onCreate dari method yang sudah tersedia di AppCompatActivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mengambil fragment, inisialisasi class BodyPartsFragments
        BodyPartsFragments headFragment = new BodyPartsFragments();
//        inisialisasi adapter untuk mengaktifkan fragment
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
//        transaksi fragment
        fragmentManager.beginTransaction()
                .add(R.id.heads_container, headFragment).commit();
    }
}
