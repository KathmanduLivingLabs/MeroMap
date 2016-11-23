package org.kll.app.meromapv1;




import android.os.Bundle;
import android.view.MenuItem;


public class EditActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
    }

    @Override
    protected boolean useDrawerToggle() {
        return false;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {



        if(item.getItemId() == android.R.id.home)
            onBackPressed();

        return super.onOptionsItemSelected(item);

    }
}
