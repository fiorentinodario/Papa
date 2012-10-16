package com.dario.papa;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class mappa extends Activity {

	public String selected = "";

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mappa);

        
    /*    ImageButton campania = (ImageButton) findViewById(R.id.campania);
        
        int color = campania.getDrawingCacheBackgroundColor(); // x and y are the location of the touch event in Bitmap space
        int alpha = Color.alpha(color);
        boolean isTransparent = (alpha==0);
        
        
        if (isTransparent = true) {
			campania.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {

					Intent intent = new Intent(getApplicationContext(),
							lista.class);
					startActivity(intent);

				}
			});
		} */
        
        
        Spinner spinner = (Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        		this,
        		android.R.layout.simple_spinner_item,
        		new String[]{"","campania"}
        		);
        spinner.setAdapter(adapter);

        
        
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
        	public void onItemSelected(AdapterView<?> adapter, View view,int pos, long id) {
        		String selected = (String)adapter.getItemAtPosition(pos);
        		
        		
        		
        		if(selected == "campania"){
        			Intent intent = new Intent(getApplicationContext(),
							lista.class);
					startActivity(intent);
        			
        		} 
        		

        		
        		else{
        			Toast.makeText(
            				getApplicationContext(), 
            				"Seleziona una regione", 
            				Toast.LENGTH_LONG
            			).show(); 
            	
        			
        		} 
        		
        	
        		
        		
        		
        		
        		
        	} 
        	

        	public void onNothingSelected(AdapterView<?> arg0) {}
		});
        
        
        
    }
    
	


}