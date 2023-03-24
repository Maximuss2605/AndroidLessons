package ru.mirea.yaninmu.dialog;
import androidx.annotation.NonNull;
import android.app.DatePickerDialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
public class MyDateDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public DatePickerDialog onCreateDialog(Bundle savedInstanceState){
        return  new DatePickerDialog(getActivity(), (DatePicker, year, month, day)->
                ((DialogActivity)getActivity()).onDateeee(year, month, day),
                2023,01,01);
    }
}