package com.dario.papa;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class info extends Activity {
	
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.info);
	        
	        
	        Button chiamaci = (Button) findViewById(R.id.chiamaci);
	        chiamaci.setOnClickListener(new View.OnClickListener() {
	        	  public void onClick(View view) { 
	        		  Intent callIntent = new Intent(Intent.ACTION_CALL);
	        		  callIntent.setData(Uri.parse("tel:0818349746"));
	        		  startActivity(callIntent);
	        	  }
	        	});


	    }
	    
	    
/////////////////// MENU //////////////////////////	
    	
public boolean onCreateOptionsMenu(Menu menu)
{
super.onCreateOptionsMenu(menu);
MenuInflater inflater = getMenuInflater();
inflater.inflate(R.menu.menu, menu);
return true;
} 

@Override
public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
        case R.id.credits:
            Uri uri = Uri.parse( "http://www.estrostudiografico.it" );
            startActivity(new Intent( Intent.ACTION_VIEW, uri));
            return true;

    }
    return super.onOptionsItemSelected(item);
};

//////////////////////////////////////////////////


}