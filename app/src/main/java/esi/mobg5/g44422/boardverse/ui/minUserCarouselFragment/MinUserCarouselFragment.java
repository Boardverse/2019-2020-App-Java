package esi.mobg5.g44422.boardverse.ui.minUserCarouselFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import esi.mobg5.g44422.boardverse.R;

public class MinUserCarouselFragment extends Fragment {

    private MinUserCarouselFragmentViewModel minUserCarouselFragmentViewModel;

    private TextView title;

    private ImageButton viewAllButton;

    private LinearLayout listElements;

    public MinUserCarouselFragment() {

    }

    public static MinUserCarouselFragment newInstance() {
        return new MinUserCarouselFragment();
    }

    public MinUserCarouselFragmentViewModel getMinUserCarouselFragmentViewModel() {
        return minUserCarouselFragmentViewModel;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        minUserCarouselFragmentViewModel = ViewModelProviders.of(this).get(MinUserCarouselFragmentViewModel.class);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.min_user_carousel_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        title = view.findViewById(R.id.min_user_carousel_title);
        minUserCarouselFragmentViewModel.getTitle().observe(this, s -> title.setText(s));

        viewAllButton = view.findViewById(R.id.min_user_carousel_view_all_button);
        viewAllButton.setOnClickListener(v -> {
            CharSequence text = "View More";
            Toast toast = Toast.makeText(v.getContext(), text, Toast.LENGTH_SHORT);
            toast.show();
        });

        listElements = view.findViewById(R.id.min_user_carousel_list_elements);
        minUserCarouselFragmentViewModel.getMinUsers().observe(this, minUsers -> {
            // TODO
        });
    }
}
