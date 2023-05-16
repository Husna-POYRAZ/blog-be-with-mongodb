package com.hpoyraz.restapi.utils.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Apis {

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Article {
        public static final String BASE_URL = "/article";
        public static final String PUBLIC_BASE_URL = "/public/article";
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Author {
        public static final String BASE_URL = "/author";
        public static final String PUBLIC_BASE_URL = "/public/author";
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Category {
        public static final String BASE_URL = "/category";
        public static final String PUBLIC_BASE_URL = "/public/category";
    }

}
