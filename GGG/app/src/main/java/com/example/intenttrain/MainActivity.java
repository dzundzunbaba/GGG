package com.example.intenttrain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // определение полей
    private EditText nameIn; // поле имени
    private EditText addressIn1; // поле адреса
    private EditText addressIn2;
    private EditText costIn;
    private EditText timeIn; // поле электронного адреса
    private Button button; // поле кнопки

    private String name, time ; // поле хранения имени и времени
    private String address1, address2; // поле хранения адреса
    private String cost; // поле хранения цены

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка id к полям
        nameIn = findViewById(R.id.nameIn);
        addressIn1 = findViewById(R.id.addressIn1);
        addressIn2 = findViewById(R.id.addressIn2);
        costIn = findViewById(R.id.CostIn);
        timeIn = findViewById(R.id.TimeIn);
        button = findViewById(R.id.button);

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // переключение на другой экран и передача данных

            // считывание данных с экрана
            name = nameIn.getText().toString();
            time = timeIn.getText().toString();
            address1 = addressIn1.getText().toString();
            address2 = addressIn2.getText().toString();
            cost = costIn.getText().toString();

            // создадим объект нашей сущности и через конструктор инициализируем его
            Traveler user = new Traveler(name, address1, address2, time, cost);

            // создание намерения
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

            // запаковка данных в контейнер намерения
            intent.putExtra(Traveler.class.getSimpleName(), user); // User.class.getSimpleName() является ключом для запаковки в контейнер

            // старт переключения активити и передачи данных
            startActivity(intent);
        }
    };
}