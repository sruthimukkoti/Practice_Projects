package java_projects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;


public class DateCalender {
	public static void main(String[] args)
	{
		DateCalender dc=new DateCalender();
		dc.date();
		dc.calender();
	}
	
public void date()
{
	Date d = new Date();
	SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy");
	System.out.println(d.toString());
	System.out.println(sd.format(d));
	
}

public void calender()
{
	Calendar c=Calendar.getInstance();
	System.out.println(c.get(Calendar.DATE));
	System.out.println(c.get(Calendar.AM_PM));
}
}
