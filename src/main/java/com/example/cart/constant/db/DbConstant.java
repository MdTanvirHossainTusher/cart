package com.example.cart.constant.db;

public class DbConstant {
    private DbConstant() {
    }

    public static class DbCommon {
        public static final String ID = "id";
        public static final String CREATED_AT = "create_at";
        public static final String LAST_UPDATED_AT = "last_updated_at";
        public static final String CREATED_BY = "create_by";
        public static final String LAST_UPDATED_BY = "last_updated_by";
        public static final String DELETED = "deleted";

        DbCommon() {
        }
    }

    public static class DbUser extends DbCommon {
        public static final String TABLE_NAME = "users";
        public static final String USER_NAME = "name";
        public static final String USER_EMAIL = "email";
        public static final String USER_PASSWORD = "password";
    }

    public static class DbRole extends DbCommon {
        public static final String TABLE_NAME = "roles";
        public static final String ROLE = "role";
    }

    public static class DbProfile extends DbCommon {
        public static final String TABLE_NAME = "profiles";
        public static final String IMAGE_URL = "profile_image_url";
        public static final String IMAGE_FILE = "profile_image_file";
    }

    public static class DbProduct extends DbCommon {
        public static final String TABLE_NAME = "products";
        public static final String PRODUCT_ID = "product_id";
        public static final String PRODUCT_NAME = "name";
        public static final String PRODUCT_DESCRIPTION = "description";
        public static final String PRODUCT_PRICE = "price";
        public static final String PRODUCT_QUANTITY = "quantity";
        public static final String PRODUCT_CATEGORY = "category";
        public static final String PRODUCT_IMAGE_URL = "image_url";
    }

    public static class DbCart extends DbCommon {
        public static final String TABLE_NAME = "carts";
        public static final String TOTAL_AMOUNT = "total_amount";
    }

    public static class DbCartItem extends DbCommon {
        public static final String TABLE_NAME = "cart_items";
        public static final String QUANTITY = "quantity";
        public static final String UNIT_PRICE = "unit_price";
        public static final String TOTAL_PRICE = "total_price";
    }

    public static class DbCategory extends DbCommon {
        public static final String TABLE_NAME = "categories";
        public static final String CATEGORY_NAME = "category_name";
    }

    public static class DbOrder extends DbCommon {
        public static final String TABLE_NAME = "orders";
        public static final String ORDER_DATE = "order_date";
        public static final String TOTAL_AMOUNT = "total_amount";
    }

    public static class DbOrderItem extends DbCommon {
        public static final String TABLE_NAME = "orders";
        public static final String ITEM_QUANTITY = "item_quantity";
        public static final String ITEM_PRICE = "item_price";
    }

    public static class DbImage extends DbCommon {
        public static final String TABLE_NAME = "images";
        public static final String FILE_NAME = "file_name";
        public static final String FILE_TYPE = "file_type";
        public static final String DOWNLOAD_URL = "download_url";
    }



}
