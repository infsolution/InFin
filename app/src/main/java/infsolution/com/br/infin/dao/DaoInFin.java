package infsolution.com.br.infin.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Cicero on 18/10/2016.
 */
public class DaoInFin extends SQLiteOpenHelper {
    static int version=1;
    static String dbName="dbInFin";
    public DaoInFin(Context context) {
        super(context, dbName, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE income(id_income INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "description VARCHAR(255), value DOUBLE, date Date);";
        db.execSQL(sql);
        sql = "CREATE TABLE user(id_user INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name VARCHAR(60), date_birth DATE, DOUBLE income)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String up = "DROP TABLE IF EXIST income";
        db.execSQL(up);
        up = "DROP TABLE IF EXIST usesr";
        db.execSQL(up);
    }
}
