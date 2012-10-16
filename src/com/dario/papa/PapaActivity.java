package com.dario.papa;



import android.app.AlertDialog;
import android.app.TabActivity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class PapaActivity extends TabActivity {
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);

	    Resources res = getResources(); // Resource object to get Drawables
	    TabHost tabHost = getTabHost();  // The activity TabHost
	    TabHost.TabSpec spec;  // Resusable TabSpec for each tab
	    Intent intent;  // Reusable Intent for each tab

	    // Create an Intent to launch an Activity for the tab (to be reused)
	    intent = new Intent().setClass(this, papa.class);

	    // Initialize a TabSpec for each tab and add it to the TabHost
	    spec = tabHost.newTabSpec("Papa").setIndicator("Papa",
	                      res.getDrawable(R.drawable.grid))
	                  .setContent(intent);
	    tabHost.addTab(spec);

	  // Do the same for the other tabs
	    intent = new Intent().setClass(this, mappa.class); //lista.class
	    spec = tabHost.newTabSpec("Lista").setIndicator("Calendario",
	                      res.getDrawable(R.drawable.today))
	                  .setContent(intent);
	    tabHost.addTab(spec);

	      intent = new Intent().setClass(this, info.class);
	    spec = tabHost.newTabSpec("info").setIndicator("info",
	                      res.getDrawable(R.drawable.about))
	                  .setContent(intent);
	    tabHost.addTab(spec); 
	    
	  /*    intent = new Intent().setClass(this, gioco.class);
	    spec = tabHost.newTabSpec("gioco").setIndicator("gioco",
	                      res.getDrawable(R.drawable.about))
	                  .setContent(intent);
	    tabHost.addTab(spec);  */

	    tabHost.setCurrentTab(0);
	}
	
	protected void onDestroy(){  
        super.onStart();  
        
        

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Avviso");
        builder.setMessage("grazie di aver usato quest'App");
        builder.setCancelable(false);
        builder.setPositiveButton("Chiudi",new OnClickListener(){
                public void onClick(DialogInterface dialog, int id){
                        dialog.dismiss();
                        }
                });
        
        
        
        
        

	}  
}