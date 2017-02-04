package edu.cofc.csci490.inclass_activity_01_rugema;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class InclassMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inclass_main);

        final TextView displayText = (TextView) findViewById(R.id.display_datetime);
        final TimePicker time = (TimePicker) findViewById(R.id.timePicker);
        final DatePicker date = (DatePicker) findViewById(R.id.datePicker);

        Calendar cal = Calendar.getInstance();

        date.init(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener(){

            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth){
                Calendar calendar = Calendar.getInstance();
                calendar.set(year,monthOfYear,dayOfMonth, time.getHour(), time.getMinute());
                displayText.setText(calendar.getTime().toString());
            }
        });

        time.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener(){
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute){
                Calendar calendar = Calendar.getInstance();
                calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH), hourOfDay,minute);
                displayText.setText(calendar.getTime().toString());
            }
        });
    }
}
