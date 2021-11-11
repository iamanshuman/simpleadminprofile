package fragments;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.example.admin.R;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PageFragment1 extends Fragment {

    private ImageView img1,img2,img3;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @NonNull ViewGroup container,
                             @NonNull Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_admin1, container, false);

        img1 = rootView.findViewById(R.id.github);
        img2 = rootView.findViewById(R.id.linkedin);
        img3 = rootView.findViewById(R.id.instagram);




        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open("https://github.com/iamanshuman");
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open("https://www.linkedin.com/in/anshuman-shekhar-0735231a6/");
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open("https://www.instagram.com/__iamanshuman/?hl=en");
            }
        });

        return rootView;
    }

    private void open(String s) {
        Uri uri = Uri.parse(s);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}