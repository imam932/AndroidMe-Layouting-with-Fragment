package id.nawawi.fragment_layout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class BodyPartsFragments extends Fragment {

    public BodyPartsFragments(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

//        inisialisasi activity tsb sebagai fragment.
        View rootView = inflater.inflate(R.layout.body_part_layout_fragment, container, false);

//        merefrensi id yang ada di layout fragment
        ImageView imageView = (ImageView) rootView.findViewById(R.id.imgView_body_part_fragment);

//        ambil gambar untuk ditampilkan , di mulai dari 0
//        ImageAssets.getHeads() {fungsi static digunakan ketika pemanggilan method dalam class tanpa harus inisialisasi objek}
        imageView.setImageResource(ImageAssets.getHeads().get(8));

        return rootView;
    }

}
