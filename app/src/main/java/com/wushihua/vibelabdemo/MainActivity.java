package com.wushihua.vibelabdemo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String KEY_ACK_COUNT = "ack_count";

    private int acknowledgeCount = 0;
    private TextView statusTextView;
    private TextView countTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        statusTextView = findViewById(R.id.text_status);
        countTextView = findViewById(R.id.text_ack_count);
        Button acknowledgeButton = findViewById(R.id.button_acknowledge);

        if (savedInstanceState != null) {
            acknowledgeCount = savedInstanceState.getInt(KEY_ACK_COUNT, 0);
        }

        renderStatus();
        acknowledgeButton.setOnClickListener(view -> {
            acknowledgeCount++;
            renderStatus();
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_ACK_COUNT, acknowledgeCount);
    }

    private void renderStatus() {
        boolean ready = acknowledgeCount > 0;
        String statusLabel = ready
                ? getString(R.string.status_ready)
                : getString(R.string.status_pending);

        statusTextView.setText(getString(R.string.status_format, statusLabel));
        countTextView.setText(getString(R.string.ack_count_format, acknowledgeCount));
    }
}
