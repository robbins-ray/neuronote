package app.neuronote;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.*;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ImageViewCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.Objects;

import app.neuronote.databinding.FragmentHomeBinding;

public class HomeScreen extends Fragment {

    private FragmentHomeBinding fhbinding;
    private int button = R.id.button_emoji;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        fhbinding = FragmentHomeBinding.inflate(inflater, container, false);
        return fhbinding.getRoot();

    }

    public void onViewCreated(@NonNull View view, int button, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        fhbinding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(HomeScreen.this).navigate(R.id.action_Home_to_emojiSelector);
            }

        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        fhbinding = null;
    }

}