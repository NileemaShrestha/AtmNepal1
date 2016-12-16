package com.wlit.nileema.atmnepal1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    String[] banks;
    int[] pictures;
//    TypedArray profile_pics;

    List<BankItem> bankItems;
    ListView mylistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bankItems = new ArrayList<BankItem>();
        banks = getResources().getStringArray(R.array.Bank_List);
        pictures = getResources().getIntArray(R.array.bank_pictures);
        for (int i = 0; i < banks.length; i++) {
            BankItem item =new BankItem(banks[i], pictures[i]);
            bankItems.add(item);
        }
        mylistview = (ListView) findViewById(R.id.list);
        CustomAdapter adapter = new CustomAdapter(this, bankItems);
        mylistview.setAdapter(adapter);
        mylistview.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String Bank_List = bankItems.get(position).getBank_List();
        Toast.makeText(getApplicationContext(), "" + Bank_List,
                Toast.LENGTH_SHORT).show();
    }

}
