package ir.amjadrad.alertdialog_asw;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by Amjad Qasemie Rad on 7/25/2018.
 */

public class AlertDialogASW {

    private AlertDialog alertDialog;
    private View view;

    public AlertDialogASW(Context context) {
        alertDialog = new AlertDialog.Builder(context).create();
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.dialog_layout, null);
        alertDialog.setView(view);
    }


    public void setTitle(String title) {
            TextView tvTitle = view.findViewById(R.id.tvTitle);
            tvTitle.setText(title);
    }

    public void setContent(String content) {
        TextView tvContent = view.findViewById(R.id.tvContent);
        tvContent.setText(content);
    }


    public void onConfirmButtonClick(View.OnClickListener listener){
        Button btnConfirm = view.findViewById(R.id.btnConfirm);
        btnConfirm.setOnClickListener(listener);

    }

    public void onNoButtonClick(View.OnClickListener listener){
        Button btn = view.findViewById(R.id.btnNo);
        btn.setOnClickListener(listener);

    }

    public void onYesButtonClick(View.OnClickListener listener){
        Button btn = view.findViewById(R.id.btnYes);
        btn.setOnClickListener(listener);
    }

    public void setNoButtonText(String text){
        Button btn = view.findViewById(R.id.btnNo);
        btn.setText(text);
    }

    public void setYesButtonText(String text){
        Button btn = view.findViewById(R.id.btnYes);
        btn.setText(text);
    }

    public void setConfirmButtonText(String text){
        Button btn = view.findViewById(R.id.btnConfirm);
        btn.setText(text);
    }


    public void show() {
        alertDialog.show();
    }


}
