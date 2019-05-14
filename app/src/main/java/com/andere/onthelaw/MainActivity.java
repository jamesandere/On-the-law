//package com.andere.onthelaw;
//
//import android.content.Intent;
//import android.graphics.Typeface;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//
//public class MainActivity extends AppCompatActivity {
//  @BindView(R.id.findbutton) Button mFindcaseButton;
//  @BindView(R.id.appNameTextView) TextView mAppNameTextView;
//  @BindView(R.id.caseInput) EditText mcase;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        ButterKnife.bind(this);
//
//        Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/font1.ttf");
//
//        mFindcaseButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String year = mcase.getText().toString();
//                Toast.makeText(MainActivity.this , "searching .." ,Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(MainActivity.this , CasesActivity.class);
//                intent.putExtra("year", year);
//
//                startActivity(intent);
//
//            }
//        });
//    }
//
//}
