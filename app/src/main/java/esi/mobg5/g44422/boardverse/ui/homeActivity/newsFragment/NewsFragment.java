package esi.mobg5.g44422.boardverse.ui.homeActivity.newsFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import esi.mobg5.g44422.boardverse.R;

public class NewsFragment extends Fragment {

    private NewsFragmentViewModel newsFragmentViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        newsFragmentViewModel =
                ViewModelProviders.of(this).get(NewsFragmentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_news, container, false);
        final TextView textView = root.findViewById(R.id.text_news);
        newsFragmentViewModel.getText().observe(this, s -> textView.setText(s));
        return root;
    }
}