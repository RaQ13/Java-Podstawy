package com.testeroprogramowania.app;

import com.testeroprogramowania.app.database.DatabaseConnection;
import com.testeroprogramowania.app.database.DatabaseUtils;

public class App {

    public static void main(String[] args) {

        DatabaseConnection databaseConnection = new DatabaseConnection();
        DatabaseUtils databaseUtils = new DatabaseUtils();
        Pages.DatabaseUtils databaseUtils1 = new Pages.DatabaseUtils();
        //deklaruje że chce paczkę o tej samej nazwie DatabesUtils ale z paczki Pages
    }
}
