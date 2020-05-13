package com.utsakb.amxy.presenter;

import android.provider.BaseColumns;

public class DatabaseContract {

    static String TABLE_NAME = "friend";

    public static final class NoteColumns implements BaseColumns{
       public static String NIM = "nim";
       public static String NAMA = "nama";
       public static String KELAS = "kelas";
       public static String TELPON = "telpon";
       public static String EMAIL = "email";
       public static String IG = "ig";
       public static String DATE = "date";
    }
}
