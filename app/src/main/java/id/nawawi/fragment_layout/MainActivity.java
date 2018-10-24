package id.nawawi.fragment_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    //    overide ini memanggil onCreate dari method yang sudah tersedia di AppCompatActivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState==null) {

            //        inisialisasi adapter untuk mengaktifkan fragment
            android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();

//        mengambil fragment, inisialisasi class BodyPartsFragments

            BodyPartsFragments bodyFragment;

            //        membuat objek untuk heads
            bodyFragment = new BodyPartsFragments();
            bodyFragment.setmImageIds(ImageAssets.getHeads());
            bodyFragment.setmListIndex(0);
            //        transaksi fragment
            fragmentManager.beginTransaction().add(R.id.heads_container, bodyFragment).commit();

            //        membuat objek untuk body
            bodyFragment = new BodyPartsFragments();
            bodyFragment.setmImageIds(ImageAssets.getBodys());
            bodyFragment.setmListIndex(0);

            fragmentManager.beginTransaction().add(R.id.bodys_container, bodyFragment).commit();

            //        membuat objek untuk legs
            bodyFragment = new BodyPartsFragments();
            bodyFragment.setmImageIds(ImageAssets.getLegs());
            bodyFragment.setmListIndex(0);

//        fragmentManager.beginTransaction().replace()
            fragmentManager.beginTransaction().add(R.id.legs_container, bodyFragment).commit();

        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
