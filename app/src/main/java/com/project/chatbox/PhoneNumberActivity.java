package com.project.chatbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.project.chatbox.databinding.ActivityPhoneNumberActivityBinding;

public class PhoneNumberActivity extends AppCompatActivity {

        ActivityPhoneNumberActivityBinding binding;
//        FirebaseAuth auth;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = ActivityPhoneNumberActivityBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());

//            auth = FirebaseAuth.getInstance();
//
//            if(auth.getCurrentUser() != null) {
//                Intent intent = new Intent(PhoneNumberActivity.this, MainActivity.class);
//                startActivity(intent);
//                finish();
//            }

            getSupportActionBar().hide();

            binding.phoneBox.requestFocus();

            binding.continueBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PhoneNumberActivity.this, OTPActivity.class);
                    intent.putExtra("phoneNumber", binding.phoneBox.getText().toString());
                    startActivity(intent);
                }
            });

        }
    }