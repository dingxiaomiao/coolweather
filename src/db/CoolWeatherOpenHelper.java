package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;


public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	/**
	 * Province表建表语句
	 */
	public static final String CREATE_PROVINCE="create table Province("
			+"id integer primary key antoincrement,"
			+"province_name text,"
			+"province_code text)";
//	City表建表语句
	public static final String CREATE_CITY="create table City("
			+"id integer primary key antoincrement,"
			+"city_name text,"
			+"city_code text,"
			+"Province_id integer";
//	Country表建表语句
	public static final String CREATE_COUNTY="create table County("
			+"id integer primary key antoincrement,"
			+"county_name text,"
			+"county_code text,"
			+"City_id integer";
	public CoolWeatherOpenHelper(Context context,String name,CursorFactory factory,int version){
		super(context,name,factory,version);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_PROVINCE);
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNTY);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
