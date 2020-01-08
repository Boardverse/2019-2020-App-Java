package esi.mobg5.g44422.boardverse.ui.minUserCarouselFragment.minUserFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.bumptech.glide.Glide;

import esi.mobg5.g44422.boardverse.R;
import esi.mobg5.g44422.boardverse.ui.userActivity.UserActivity;

public class MinUserFragment extends Fragment {

    private MinUserFragmentViewModel minUserFragmentViewModel;

    private ImageView user_icon;

    private TextView user_name;

    public MinUserFragment() {

    }

    public static MinUserFragment newInstance() {
        return new MinUserFragment();
    }

    public MinUserFragmentViewModel getMinUserFragmentViewModel() {
        return minUserFragmentViewModel;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        minUserFragmentViewModel = ViewModelProviders.of(this).get(MinUserFragmentViewModel.class);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.min_user_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.setOnClickListener(v -> startActivity(new Intent(getActivity(), UserActivity.class)));
        // TODO pass indent to know which user profile to open

        user_icon = view.findViewById(R.id.min_user_fragment_user_icon);

        user_name = view.findViewById(R.id.min_user_fragment_user_name);

        minUserFragmentViewModel.getMinUser().observe(this, minUser -> {
            if(minUser.get_user_icon_url() != null) {
                Glide
                    .with(view)
                    .load(minUser.get_user_icon_url())
                    .centerCrop()
                    .placeholder(R.drawable.loading_spinner)
                    .into(this.user_icon);
            }
            user_name.setText(minUser.get_user_name() == null ? "Unnamed User" : minUser.get_user_name());
        });
    }
}
