import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "";
    public static final String TABLE_CONTACTS = "";

    public static final String KEY_ID = "_id";
    public static final String KEY_NAME = "_id";
    public static final String KEY_MAIL = "_id";

    public DBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //db.execSQL("create table " + TABLE_CONTACTS + "(" + KEY_ID +
        //        " integer primary key," + KEY_NAME + "text," + KEY_MAIL + " text," + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
