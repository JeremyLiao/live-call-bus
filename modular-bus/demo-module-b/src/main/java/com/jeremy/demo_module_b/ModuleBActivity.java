package com.jeremy.demo_module_b;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jeremy.modularbus.ModularEventBus;
import com.jeremy.modularbus.generated.module_b.EventsDefineOfModuleBEvents;


public class ModuleBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getClass().getSimpleName());
        setContentView(R.layout.activity_module_b);
    }

    public void sendMsg(View view) {
        ModularEventBus.get()
                .of(EventsDefineOfModuleBEvents.class)
                .EVENT1()
                .setValue("Hello world!");
    }
}