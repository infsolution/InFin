package infsolution.com.br.infin.dao;

import android.content.ContentValues;
import android.content.Context;
import java.sql.SQLException;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import infsolution.com.br.infin.model.User;

/**
 * Created by Cicero on 18/10/2016.
 */
public class DaoUser {
    private SQLiteDatabase db;
    private DaoInFin infDao;
    public DaoUser(Context context){
        infDao = new DaoInFin(context);
    }
    public void open() throws SQLException {
        db = infDao.getWritableDatabase();
    }

    public void close() {
        infDao.close();
    }

    public long addUser(User user){
        long id =0;
        if(getIdUser()){
        ContentValues cv = new ContentValues();
        cv.put("name",user.getName());
        cv.put("date_birth", String.valueOf(user.getDate_birth()));
        cv.put("image",user.getImageProfile());
         id = infDao.getWritableDatabase().insert("user",null,cv);
        }
        return id;
    }

    public boolean getIdUser(){
        String sql = "SELECT * FROM user;";
        Cursor cr = infDao.getReadableDatabase().rawQuery(sql,null);
        if(cr.moveToFirst()){
            return true;
        }else{
            return false;
        }
    }
    public User getUser(){
        User user=null;
        String sql = "SELECT * FROM user";
        Cursor cr = infDao.getReadableDatabase().rawQuery(sql,null);
        if(cr.moveToNext()){
            String name = cr.getString(cr.getColumnIndex("name"));
            user = new User(name);
        }
        return user;
    }

}
