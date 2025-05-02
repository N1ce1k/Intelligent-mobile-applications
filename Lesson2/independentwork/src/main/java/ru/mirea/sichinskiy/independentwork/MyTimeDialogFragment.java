package ru.mirea.sichinskiy.independentwork;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;
import java.util.Locale;

public class MyTimeDialogFragment extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(), this, hour, minute, true);
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        String time = String.format(Locale.getDefault(), "%02d:%02d", hourOfDay, minute);
        Toast.makeText(getActivity(), "Selected time: " + time, Toast.LENGTH_SHORT).show();
    }
}