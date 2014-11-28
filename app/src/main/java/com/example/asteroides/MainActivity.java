package com.example.asteroides;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Typeface bonitaFont;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		bonitaFont = Typeface.createFromAsset(getAssets(), getString(R.string.tipoDeLetra_Bdebonita));

		TextView txtVista = (TextView) findViewById(R.id.textView1);
		txtVista.setTypeface(bonitaFont);
//		txtVista.setTextColor(colors);
		Button MiBoton = (Button) findViewById(R.id.button1);
		MiBoton.setTypeface(bonitaFont);


    }
	
	public void lanzarAcercaDe(View view){
		
		Intent i = new Intent(this, AcercaDe.class);
		startActivity(i);
	}
	
	public void lanzarAcercaDe(){
		Intent i = new Intent(this, AcercaDe.class);
		startActivity(i);
	}
	
	public void bSalir(View view){
		finish();
	}
	
	@Override
	public boolean  onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return true;   /** true -> ahora el menu est� visible */
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()){
		case R.id.acercaDe:
			lanzarAcercaDe();
			break;
		}
		return true;   /** true -> consumimos el item, no se propaga */
	}

	
}
