package com.example.lia.inventory.data;
import android.provider.BaseColumns;

/**
 * Created by Lia on 2018.07.12..
 */
/**
 * API Contract for the Inventory app.
 */

public final class BookContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private BookContract() {}

    /**
     * Inner class that defines constant values for the books database table.
     * Each entry in the table represents a single book.
     */
    public static final class BookEntry implements BaseColumns {

        /** Name of database table for books */
        public final static String TABLE_NAME = "books";

        /**
         * Unique ID number for the book (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the book.
         *
         * Type: TEXT
         */
        public final static String COLUMN_BOOK_NAME ="name";

        /**
         * Price of the book.
         *
         * Type: TEXT
         */
        public final static String COLUMN_BOOK_PRICE = "price";

        /**
         * Quantity of the book.
         *
         * The only possible values are {@link #QUANTITY_UNKNOWN}, {@link #QUANTITY_IN_STOCK},
         * or {@link #QUANTITY_OUT_OF_STOCK}.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_BOOK_QUANTITY = "quantity";

        /**
         * Supplier of the book.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_BOOK_SUPPLIER = "supplier name";

        public final static String COLUMN_BOOK_SUPPLIER_PHONE_NUMBER = "supplier phone number";

        /**
         * Possible values for the quantity of the book.
         */
        public static final int QUANTITY_OUT_OF_STOCK = 0;
        public static final int QUANTITY_IN_STOCK = 1;
        public static final int QUANTITY_UNKNOWN = 2;
    }

}

