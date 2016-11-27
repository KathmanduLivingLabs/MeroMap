package org.kll.app.meromapv1.Manipulation;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.kll.app.meromapv1.BaseActivity;
import org.kll.app.meromapv1.Database.DetailDatabaseHandler;
import org.kll.app.meromapv1.Database.DetailOperations;
import org.kll.app.meromapv1.MainActivitys;
import org.kll.app.meromapv1.Model.Information;
import org.kll.app.meromapv1.R;
import org.w3c.dom.Text;

import static android.R.attr.button;
import static android.R.attr.detailColumn;

/**
 * Created by Rahul Singh Maharjan on 11/27/16.
 * Project for Kathmandu Living Labs
 */

public class DetailInfo extends BaseActivity{

    private String getName;
    private String getDisc;
    private Button ok;
    private Button edit;
    private Information newInfo;
    private DetailOperations infoData;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getName = getIntent().getStringExtra("DetailName");
        getDisc = getIntent().getStringExtra("DetailDisc");



        setContentView(R.layout.detail_activity);

        final TextView textNametoChange = (TextView) findViewById(R.id.text_infoname);
        final TextView textDisctoChange = (TextView) findViewById(R.id.text_infodisc);
        textNametoChange.setText(getName);
        textDisctoChange.setText(getDisc);
        ok = (Button) findViewById(R.id.info_ok);

        infoData = new DetailOperations(this);
        infoData.open();


        ok.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
               /* newInfo.setInfoName(getName.toString());
                newInfo.setInfoDescription(getDisc.toString());*/
              //  infoData.addInformation(newInfo);


               // Toast.makeText(getApplicationContext(), "Name :" + newInfo.getInfoName(), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(DetailInfo.this, MainActivitys.class);
                i.putExtra("Select", "school");
                startActivity(i);

            }
        });

    }



}
