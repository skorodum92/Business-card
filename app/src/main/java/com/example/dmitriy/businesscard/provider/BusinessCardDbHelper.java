package com.example.dmitriy.businesscard.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Dmitriy on 06.07.2015.
 */
public class BusinessCardDbHelper extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;

    private static final String DB_NAME = "contacts";

    private static final String CREATE_CONTACTS =
            String.format("CREATE TABLE %s (%s INTEGER, %s TEXT, %s TEXT);",
                    ContactsTable.TABLE_NAME, ContactsTable._ID, ContactsTable.COLUMN_NAME, ContactsTable.COLUMN_PHONE);
    private static final String DROP_CONTACTS =
            String.format("DROP TABLE %s;", ContactsTable.TABLE_NAME);


    private static final String CREATE_COMPANIES =
            String.format("CREATE TABLE %s (%s INTEGER, %s TEXT, %s TEXT, %s TEXT);",
                    CompaniesTable.TABLE_NAME, CompaniesTable._ID, CompaniesTable.COLUMN_NAME, CompaniesTable.COLUMN_TYPE, CompaniesTable.COLUMN_LABEL);
    private static final String DROP_COMPANIES =
            String.format("DROP TABLE %s;", CompaniesTable.TABLE_NAME);

    public BusinessCardDbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_CONTACTS);
        db.execSQL(CREATE_COMPANIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_CONTACTS);
        db.execSQL(CREATE_CONTACTS);
        db.execSQL(DROP_COMPANIES);
        db.execSQL(CREATE_COMPANIES);
    }
}
