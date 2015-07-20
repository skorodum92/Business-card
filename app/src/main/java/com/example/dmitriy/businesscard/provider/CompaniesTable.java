package com.example.dmitriy.businesscard.provider;


import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;
/**
 * Created by Dmitriy on 20.07.2015.
 */
public class CompaniesTable implements BaseColumns{

    public static String AUTHORITY = "com.example.dmitriy.businesscard.provider.BusinessCardContentProvider";

    public static String TABLE_NAME = "companies";

    public static Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/" + TABLE_NAME);

    public static String COLUMN_NAME = "name";
    public static String COLUMN_Type = "type";
    public static String COLUMN_Label = "label";
}
