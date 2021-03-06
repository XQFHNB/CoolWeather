package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	public static final String CREATE_PROVINCE="create table Province("
			+"id integer primary key autoincrement,"
			+"province_name text,"
			+"province_code text)";
	public static final String CREATE_CITY="create table City("
			+"id integer primary key auotincrement,"
			+"city_name tect,"
			+"city_code text,"
			+"province_id integer)";
	public static final String CREATE_COUTY="create table County("
			+"id integer primary key autoincrement,"
			+"county_name text,"
			+"county_code text,"
			+"city_id integer)";
	public CoolWeatherOpenHelper(Context context ,String name,CursorFactory factory,int version){
		super(context,name,factory,version);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_PROVINCE);
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUTY);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
