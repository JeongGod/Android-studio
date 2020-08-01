package com.example.stage_4_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent = getIntent();
        String message = "Order : " + intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.order_textview);
        textView.setText(message);

        // spinner를 만든다.
        Spinner spinner = findViewById(R.id.label_spinner);
        if(spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }
        // spinner의 레이아웃, 문자열 배열을 이용하여 ArrayAdapter를 만든다.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.labels_array, android.R.layout.simple_spinner_item);
        // 선택 목록이 나타날 때 사용하는 레이아웃을 지정한다.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if(spinner != null) {
            // Adapter를 spinner에 적용한다.
            spinner.setAdapter(adapter);
        }
    }

    // Toast 메시지 출력
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    // RadioButton
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.sameday:
                if(checked) {
                    displayToast(getString(R.string.same_day_messenger_service));
                }
                break;
            case R.id.nextday:
                if(checked) {
                    displayToast(getString(R.string.next_day_ground_delivery));
                }
                break;
            case R.id.pickup:
                if(checked) {
                    displayToast(getString(R.string.pick_up));
                }
                break;
            default:
                break;
        }
    }

    // 선택했을 떄
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String spinnerlabel = adapterView.getItemAtPosition(i).toString();
        displayToast(spinnerlabel);
    }

    // 선택하지 않았을 때
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        // Do nothing ..
    }

    public void showDatePicker(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }
    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string + "/" + day_string + "/" + year_string);
        displayToast(dateMessage);
    }
}