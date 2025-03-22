package com.mirea.sichinskiyle.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private CheckBox cbYesIAm;
    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textViewStudent = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        cbYesIAm = findViewById(R.id.checkBox);

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = true;
                textViewStudent.setText("Мой номер по списку № 23");
                cbYesIAm.setText("ВКЛ");
                cbYesIAm.setChecked(flag);
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);

        View.OnClickListener oclbtnItIsNotMe = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = false;
                textViewStudent.setText("Это не я сделал");
                cbYesIAm.setText("ВЫКЛ");
                cbYesIAm.setChecked(flag);
            }
        };
        btnItIsNotMe.setOnClickListener(oclbtnItIsNotMe);



        View.OnClickListener oclCheckBox = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = !flag;
                if (flag == true)
                {
                    cbYesIAm.setText("ВКЛ");
                }
                else
                {
                    cbYesIAm.setText("ВЫКЛ");
                }
                cbYesIAm.setChecked(flag);
            }
        };
        cbYesIAm.setOnClickListener(oclCheckBox);

    }
    public void onMyButtonClick(View view)
    {
        flag = false;
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
        cbYesIAm.setText("ВЫКЛ");
        cbYesIAm.setChecked(flag);
    }
}