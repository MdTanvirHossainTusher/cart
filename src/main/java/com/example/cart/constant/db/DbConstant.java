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

        DbCommon() {
        }
    }

    public static class DbUser extends DbCommon {
        public static final String TABLE_NAME = "users";
        public static final String USER_NAME = "name";
        public static final String USER_EMAIL = "email";
        public static final String USER_PASSWORD = "password";
        public static final String USER_DELETED = "user_deleted";
    }

    public static class DbRole extends DbCommon {
        public static final String TABLE_NAME = "roles";
        public static final String ROLE = "role";
        public static final String ROLE_DELETED = "role_deleted";
    }

    public static class DbProfile extends DbCommon {
        public static final String TABLE_NAME = "profiles";
        public static final String IMAGE_URL = "profile_image_url";
        public static final String IMAGE_FILE = "profile_image_file";
        public static final String PROFILE_DELETED = "profile_deleted";
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
        public static final String PRODUCT_DELETED = "product_deleted";

    }
}
