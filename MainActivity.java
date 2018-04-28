package theway.count;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity
  extends ActionBarActivity
{
  Button add;
  int count = 0;
  TextView display;
  Button reset;
  Button sub;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903063);
    this.add = ((Button)findViewById(2131230784));
    this.sub = ((Button)findViewById(2131230785));
    this.reset = ((Button)findViewById(2131230786));
    this.display = ((TextView)findViewById(2131230783));
    this.add.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        paramAnonymousView = MainActivity.this;
        paramAnonymousView.count += 1;
        MainActivity.this.display.setText("Count is " + MainActivity.this.count);
      }
    });
    this.sub.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        paramAnonymousView = MainActivity.this;
        paramAnonymousView.count -= 1;
        MainActivity.this.display.setText("Count is " + MainActivity.this.count);
      }
    });
    this.reset.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        MainActivity.this.count = 0;
        MainActivity.this.display.setText("Count is " + MainActivity.this.count);
      }
    });
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131492864, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131230787) {
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
}


/* Location:              C:\Users\admin\Desktop\github\Android counter\theway.count-1\dex2jar-2.0\classes-dex2jar.jar!\theway\count\MainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */