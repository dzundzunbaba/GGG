package com.example.intenttrain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // создание полей
    private TextView dataTraveler; // поле вывода информации из главной активити
    private Button button; // кнопка переключения на главную активити

    private Traveler traveler; // поле сущности пользователя

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // привязка id к полю
        dataTraveler = findViewById(R.id.dataTraveler);
        button = findViewById(R.id.button);

        // считывание данных из главной активити
        Bundle bundleIntent = getIntent().getExtras();

        if (bundleIntent != null) { // если в данном контейнере что-то есть, то

            // инициализация поля сущности пользователя
            traveler = (Traveler) bundleIntent.getSerializable(Traveler.class.getSimpleName());

            // вывод на экран данных из главной активити
            dataTraveler.setText("Id: " + traveler.getId() + "\n" +
                    "Имя: " + traveler.getName() + "\n"
                    + "Адрес отбытия: " + traveler.getAddress1() + "\n" +
                    "Адрес прибытия: " + traveler.getAddress2() + "\n"
                    + "Время отбытия и прибытия: " + traveler.getTime() + "\n"
                    +"Цена билета: " + traveler.getCost());
        }

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // переключение на другой экран
            Intent intent = new Intent(getApplicationContext(), MainActivity.class); // создание намерения переключения на другой экран
            startActivity(intent); // запуск дополнительной активити через намерение
        }
    };}