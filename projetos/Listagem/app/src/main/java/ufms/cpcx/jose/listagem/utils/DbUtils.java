package ufms.cpcx.jose.listagem.utils;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by jose on 16/07/16.
 */
@Database(name = DbUtils.NAME, version = DbUtils.VERSION)
public class DbUtils {

    public static final String NAME = "Lista"; // we will add the .db extension

    public static final int VERSION = 1;
}