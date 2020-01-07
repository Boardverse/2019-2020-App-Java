package esi.mobg5.g44422.boardverse.ui.homeActivity.logoutFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import esi.mobg5.g44422.boardverse.R;

public class LogoutFragment extends Fragment {

    private LogoutFragmentViewModel logoutFragmentViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        logoutFragmentViewModel = ViewModelProviders.of(this).get(LogoutFragmentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_logout, container, false);
        final TextView textView = root.findViewById(R.id.text_logout);
        logoutFragmentViewModel.getText().observe(this, s -> textView.setText(s));
        return root;
    }
}