package esi.mobg5.g44422.boardverse.ui.homeActivity.wishlistFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import esi.mobg5.g44422.boardverse.R;

public class WishlistFragment extends Fragment {

    private WishlistFragmentViewModel wishlistFragmentViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        wishlistFragmentViewModel =
                ViewModelProviders.of(this).get(WishlistFragmentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_wishlist, container, false);
        final TextView textView = root.findViewById(R.id.text_wishlist);
        wishlistFragmentViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}