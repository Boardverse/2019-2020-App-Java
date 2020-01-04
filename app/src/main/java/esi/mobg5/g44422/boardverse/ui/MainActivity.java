package esi.mobg5.g44422.boardverse.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Account[] accounts = AccountManager.get(this).getAccountsByType("esi.mobg5.g44422.boardverse");
        if(accounts.length > 0) {
            // try to log in
            // if working, go to home activity
            // if not, the go to log in screen and delete old account
        } else {
            startActivity(new Intent(this, LoginActivity.class));
        }
    }
}
