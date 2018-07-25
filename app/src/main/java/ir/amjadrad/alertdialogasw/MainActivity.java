package ir.amjadrad.alertdialogasw;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import ir.amjadrad.alertdialog_asw.AlertDialogASW;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialogASW alertDialogASW = new AlertDialogASW(MainActivity.this);
                alertDialogASW.setTitle("عنوان");
                alertDialogASW.onConfirmButtonClick(MainActivity.this);
                alertDialogASW.show();

            }
        });


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnConfirm: {
                Toast.makeText(this, "confirmed!!!!!!!!", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }
}
