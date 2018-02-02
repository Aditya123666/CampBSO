package camp.bso.inf.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.LinkedList;

public class RecycleView extends AppCompatActivity {

    private final LinkedList<String> mWordList1 = new LinkedList<>();
    private final LinkedList<String> mWordList2 = new LinkedList<>();


    String timkita[] = {"Persib", "Persib", "Persib"};
    String timlawan[] = {"PSM", "Persija", "Persipura"};

    private TeamListOpenHelper mDB;
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        Button btnacity;

        mDB = new TeamListOpenHelper(this);

        btnacity = findViewById(R.id.kemain);

        btnacity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RecycleView.this,MainActivity.class);
                startActivity(i);

            }
        });
        //contoh RV https://medium.com/@dimas_vm/tutorial-android-recyclerview-dan-cardview-9a62aaa6cc0c
        for (int i = 0; i < 3; i++) {
            mWordList1.addLast(timkita[i]);
            mWordList2.addLast(timlawan[i]);
           // Log.d("WordList1:", mWordList1.getLast());
            ///Log.d("WordList2:", mWordList2.getLast());
        }

        //	Get	a	handle	to	the	RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.rv);

        //	Create	an	adapter	and	supply	the	data	to	be	displayed.
        mAdapter = new WordListAdapter(this, mDB);

        //	Connect	the	adapter	with	the	RecyclerView.
        mRecyclerView.setAdapter(mAdapter);

        //	Give	the	RecyclerView	a	default	layout	manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
