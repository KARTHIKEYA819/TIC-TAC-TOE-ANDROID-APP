package com.example.tic_tac_toe_android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private String c1;
	private String c2;
	private String c3;
	private String c4;
	private String c5;
	private String c6;
	private String c7;
	private String c10;
	private String c9;
	private int b1=0;
	private int b2=0;
	private int b3=0;
	private int b4=0;
	private int b5=0;
	private int b6=0;
	private int b7=0;
	private int b8=0;
	private int b9=0;
	public int press=0;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
	private TextView lblNewLabel_1 ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tictactoe();
	}
	public void disable() {
		 button9.setEnabled(false);
		 button8.setEnabled(false);
		 button1.setEnabled(false);
		 button2.setEnabled(false);
		 button3.setEnabled(false);
		 button4.setEnabled(false);
		 button5.setEnabled(false);
		 button6.setEnabled(false);
		 button7.setEnabled(false);	 
	}
	//////
	public void ocheck() {
		c1=(String) button1.getText();
		 c2=(String) button2.getText();
		 c3=(String) button3.getText();
		 c4=(String) button4.getText();
		 c5=(String) button5.getText();
		 c6=(String) button6.getText();
		 c7=(String) button7.getText();
		 c10=(String) button8.getText();
		 c9=(String) button9.getText();
		 lblNewLabel_1 =  (TextView) findViewById(R.id.textView2);
		if(c1.equals("O")&&c2.equals("O")&&c3.equals("O")) {
			lblNewLabel_1.setText("O HAS WON THIS GAME");
			disable();
		}
		else if(c4.equals("O")&&c5.equals("O")&&c6.equals("O")) {
			lblNewLabel_1.setText("O HAS WON THIS GAME");
			disable();
		}
		else if(c7.equals("O")&&c10.equals("O")&&c9.equals("O")) {
			lblNewLabel_1.setText("O HAS WON THIS GAME");
			disable();
		}
		else if(c1.equals("O")&&c4.equals("O")&&c7.equals("O")) {
			lblNewLabel_1.setText("O HAS WON THIS GAME");
			disable();

		}
		else if(c2.equals("O")&&c5.equals("O")&&c10.equals("O")) {
			lblNewLabel_1.setText("O HAS WON THIS GAME");
			disable();

		}
		else if(c7.equals("O")&&c5.equals("O")&&c3.equals("O")) {
			lblNewLabel_1.setText("O HAS WON THIS GAME");
			disable();
		}
		else if(c1.equals("O")&&c5.equals("O")&&c9.equals("O")) {
			lblNewLabel_1.setText("O HAS WON THIS GAME");
			disable();
		}
		else if(c3.equals("O")&&c6.equals("O")&&c9.equals("O")) {
			lblNewLabel_1.setText("O HAS WON THIS GAME");
			disable();
		}
		else {
		}
	}
	///////////
	public void xcheck() {
		 c1= (String) button1.getText();
		 c2=(String) button2.getText();
		 c3=(String) button3.getText();
		 c4=(String) button4.getText();
		 c5=(String) button5.getText();
		 c6=(String) button6.getText();
		 c7=(String) button7.getText();
		 c10=(String)button8.getText();
		 c9=(String) button9.getText();			
		if(c1.equals("X")&&c2.equals("X")&&c3.equals("X")) {
			lblNewLabel_1.setText("X HAS WON THIS GAME");
			disable();
		}
		else if(c4.equals("X")&&c5.equals("X")&&c6.equals("X")) {
			lblNewLabel_1.setText("X HAS WON THIS GAME");
			disable();
		}
		else if(c7.equals("X")&&c10.equals("X")&&c9.equals("X")) {
			lblNewLabel_1.setText("X HAS WON THIS GAME");
			disable();
		}
		else if(c1.equals("X")&&c4.equals("X")&&c7.equals("X")) {
			lblNewLabel_1.setText("X HAS WON THIS GAME");
			disable();
		}
		else if(c2.equals("X")&&c5.equals("X")&&c10.equals("X")) {
			lblNewLabel_1.setText("X HAS WON THIS GAME");
			disable();
		}
		else if(c3.equals("X")&&c6.equals("X")&&c9.equals("X")) {
			lblNewLabel_1.setText("X HAS WON THIS GAME");
			disable();
		}
		else if(c1.equals("X")&&c5.equals("X")&&c9.equals("X")) {
			lblNewLabel_1.setText("X HAS WON THIS GAME");
			disable();
		}
		else if(c7.equals("X")&&c5.equals("X")&&c3.equals("X")) {
			lblNewLabel_1.setText("X HAS WON THIS GAME");
			disable();
		}
		else {
			
		}
	}
	//////
	public void check() {
		if (button1.getText()!=""&& button2.getText()!=""&&button3.getText()!= ""&&button4.getText()!=""&&button5.getText()!= ""&& button6.getText()!=""&&button7.getText()!= ""&&button8.getText()!=""&&button9.getText()!="") {
			lblNewLabel_1.setText("THIS GAME IS DRAW");
			 disable();
		}
		else {
				
		}
		xcheck();
		ocheck();
	}
	public void tictactoe() {
		button1 = (Button)findViewById(R.id.Button01);
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(b1==0) {
				if(press==0) {
					button1.setText("X");
					check();
					press=1;
				}
				else {
					button1.setText("O");
					press=0;
					check();
				}
				b1=1;
			}
				else {
					
				}
			 }
			
		});
		button2 = (Button)findViewById(R.id.Button02);
		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(b2==0) {
				if(press==0) {
					button2.setText("X");
					press=1;
					check();
				}
				else {
					button2.setText("O");
					press=0;
					check();
				}
				b2=1;
				  }
				else {
					
				}	
			}
		});
		button3 = (Button)findViewById(R.id.Button03);
		button3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(b3==0) {
				if(press==0) {
					button3.setText("X");
					press=1;
					check();
				}
				else {
					button3.setText("O");
					press=0;
					check();
				}
				b3=1;
				 }
			}
		});
		button4 = (Button)findViewById(R.id.Button04);
		button4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(b4==0) {
				if(press==0) {
					button4.setText("X");
					press=1;
					check();
				}
				else {
					button4.setText("O");
					press=0;
					check();
				}
				b4=1;
				 }
				else {
					
				}
			}
		});
		button5 = (Button)findViewById(R.id.Button05);
		button5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(b5==0) {
				if(press==0) {
					button5.setText("X");
					press=1;
					check();
				}
				else {
					button5.setText("O");
					press=0;
					check();
				}
				b5=1;
				 }
			}
		});
		button6 = (Button)findViewById(R.id.Button06);
		button6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(b6==0) {
				if(press==0) {
					button6.setText("X");
					press=1;
					check();
				}
				else {
					button6.setText("O");
					press=0;
					check();
				}
				b6=1;
				 } 
			}
		});
		button7 = (Button)findViewById(R.id.Button07);
		button7.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(b7==0) {
				if(press==0) {
					button7.setText("X");
					press=1;
					check();
				}
				else {
					button7.setText("O");
					press=0;
					check();
				}
				b7=1;
				 }
			}
		});
		button8 = (Button)findViewById(R.id.Button08);
		button8.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(b8==0) {
				if(press==0) {
					button8.setText("X");
					press=1;
					check();
				}
				else {
					button8.setText("O");
					press=0;
					check();
				}
				b8=1;
				 }
			}
		});
		button9 = (Button)findViewById(R.id.Button09);
		button9.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(b9==0) {
				if(press==0) {
					button9.setText("X");
					press=1;
					check();
				}
				else {
					button9.setText("O");
					press=0;
					check();
				}
				b9=1;
				 }
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
