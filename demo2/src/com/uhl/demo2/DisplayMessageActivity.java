package com.uhl.demo2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.MenuItem;
import android.widget.TextView;
import android.content.Intent;
import android.support.v4.app.NavUtils;

class DisplayMessageActivity extends Activity {

//  @SuppressLint("NewApi")
//  @Override
//  protected void onCreate(Bundle savedInstanceState) {
//    super.onCreate(savedInstanceState);
//    setContentView(R.layout.activity_display_message);
//
//     Make sure we're running on Honeycomb or higher to use ActionBar APIs
//    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//       Show the Up button in the action bar.
//      getActionBar().setDisplayHomeAsUpEnabled(true);
//    }
//  }

//  @SuppressLint("NewApi")
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  
    // Get the message from the intent
    Intent intent = getIntent();
    String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
  
    // Create the text view
    TextView textView = new TextView(this);
    textView.setTextSize(40);
    textView.setText(message);
  
    // Set the text view as the activity layout
    setContentView(textView);
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
    case android.R.id.home:
      NavUtils.navigateUpFromSameTask(this);
      return true;
    }
    return super.onOptionsItemSelected(item);
  }
}
