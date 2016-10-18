package infsolution.com.br.infin.dao;

import android.content.Context;
import java.sql.SQLException;
import android.database.sqlite.SQLiteDatabase;

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



}
