package com.dario.papa;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class lista extends ListActivity {
 

public void onCreate(Bundle icicle) {
    super.onCreate(icicle);
    String[] values = new String[] { "napoli", "caserta", "avellino",
        "benevento", "salerno" };
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        android.R.layout.simple_list_item_1, values);
    setListAdapter(adapter);
  }

   //String item = (String) getListAdapter().getItem(position);

  
protected void onListItemClick(ListView l, View v, int position, long id)
{
    super.onListItemClick(l, v, position, id);
    final Intent intent = new Intent();
    // Set up different intents based on the item clicked: 
    switch (position)
    {
        case 0:
            intent.setClass(this, napoli.class);
            break;
        case 1:
            intent.setClass(this, caserta.class);
            break;
        case 2:
            intent.setClass(this, avellino.class);
            break;
        case 3:
            intent.setClass(this, benevento.class);
            break;
        case 4:
            intent.setClass(this, salerno.class);
            break;

        default:
            break;
    }
    // Pass the item position as the requestCode parameter, so on the `Activity`'s
    // return you can examine it, and determine which activity were you in prior. 
    startActivityForResult(intent, position);
}
  





} 

