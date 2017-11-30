package x.wsxf.igank.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import x.wsxf.igank.R;

public class MainActivity extends AppCompatActivity implements mainContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
