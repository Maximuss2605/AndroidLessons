package ru.mirea.yaninmu.dialog;
import androidx.annotation.NonNull;
import android.app.TimePickerDialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
public class MyTimeDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public TimePickerDialog onCreateDialog(Bundle savedInstanceState){
        return  new TimePickerDialog(getActivity(), (TimePicker,hour, minute)->
                ((DialogActivity)getActivity()).onTimeee(hour,minute),
                0,0,true);
    }
}