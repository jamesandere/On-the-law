//package com.andere.onthelaw;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ListView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//
//public class CasesActivity extends AppCompatActivity {
//    private String[] cases = new String[] {"Separating black and white students in public schools is unconstitutional.", "Upheld separate but equal segregation laws in states.",
//            "Lawsuits based on libel or defamation must show intent or recklessness.", "Denied citizenship to African American slaves.\n" +
//            "\n", "Criminal defendants have a right to an attorney even if they cannot afford one.", "President cannot use executive privilege to withhold evidence from criminal trial."
//            };
//    private String[] parties = new String[] {"Brown v. Board of Education, 1954 (9-0 decision)", "Plessy v. Ferguson, 1896 (7-1 decision)\n" +
//            "\n", "New York Times v. Sullivan, 1964 (9-0 decision)", "Dred Scott v. Sandford, 1857 (7-2 decision)", "Gideon v. Wainwright, 1963 (9-0 decision)", "United States v. Nixon, 1974 (8-0 decision)"};
//
//
//    @BindView(R.id.caseDisplay) TextView mcase;
//    @BindView(R.id.listView) ListView mListView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_cases);
//        ButterKnife.bind(this);
//        LawAdapter adapter = new LawAdapter(this, android.R.layout.simple_list_item_1, cases, parties);
//        mListView.setAdapter(adapter);
//
//        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String cases = ((TextView)view).getText().toString();
//                Toast.makeText(CasesActivity.this, cases, Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        Intent intent = getIntent();
//
//    }
//}
