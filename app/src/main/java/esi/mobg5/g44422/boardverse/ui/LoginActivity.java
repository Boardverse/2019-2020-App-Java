package esi.mobg5.g44422.boardverse.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.os.Bundle;

import esi.mobg5.g44422.boardverse.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /**
     * @throws IllegalArgumentException if the credentials provided don't match
     * @return the token of the authenticated user
     */
    public String tryLogin(String username, String password) {
        return "";
    }

    public void addAccount(String username, String token) {
        AccountManager.get(this).addAccountExplicitly(new Account(username, "esi.mobg5.g44422.boardverse"), token, null);
    }
}
