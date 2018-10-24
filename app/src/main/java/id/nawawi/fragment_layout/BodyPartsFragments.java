package id.nawawi.fragment_layout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class BodyPartsFragments extends Fragment {

    private List<Integer>mImageIds;
    private Integer mListIndex;
    private static String TAG="BodyPartsFragments";
    public static final String IMAGE_ID_LIST ="image_ids";
    public static final String LIST_INDEX ="list_index";

    public BodyPartsFragments(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if (savedInstanceState != null){
            mImageIds=savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            mListIndex=savedInstanceState.getInt(LIST_INDEX);
        }

//        inisialisasi activity tsb sebagai fragment.
        View rootView = inflater.inflate(R.layout.body_part_layout_fragment, container, false);

//        merefrensi id yang ada di layout fragment
        final ImageView imageView = (ImageView) rootView.findViewById(R.id.imgView_body_part_fragment);

//        ambil gambar untuk ditampilkan , di mulai dari 0
//        ImageAssets.getHeads() {fungsi static digunakan ketika pemanggilan method dalam class tanpa harus inisialisasi objek}
//        imageView.setImageResource(ImageAssets.getHeads().get(8));
        imageView.setImageResource(mImageIds.get(mListIndex));

//        merubah gambar pada imageView secara dinamis
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListIndex < mImageIds.size()-1){
                    mListIndex++;
                }else {
                    mListIndex=0;
                }
                imageView.setImageResource(mImageIds.get(mListIndex));
            }
        });
        return rootView;
    }

    @Override
    public void onSaveInstanceState(Bundle currentState) {
        currentState.putIntegerArrayList(IMAGE_ID_LIST, (ArrayList<Integer>) mImageIds);
        currentState.putInt(LIST_INDEX, mListIndex);
    }

    public void setmImageIds(List<Integer> mImageIds){

        this.mImageIds = mImageIds;
    }

    public void setmListIndex(Integer mListIndex){
        this.mListIndex = mListIndex;
    }

}
