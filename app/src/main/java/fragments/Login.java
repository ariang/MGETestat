package fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.doubl.gadgeothek.R;

import service.Callback;
import service.LibraryService;

public class Login extends AppCompatActivity {

    TextView emailTextView;
    TextView passwordTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);

        emailTextView = (TextView) findViewById(R.id.email);
        passwordTextView = (TextView) findViewById(R.id.password);
       /* LibraryService.login(emailTextView, passwordTextView, new Callback<Boolean>() {
            @Override
            public void onCompletion(Boolean input) {

            }

            @Override
            public void onError(String message) {

            }
        });
*/


    }
}
