package com.example.mina.mydic;


import com.example.vichay.mydic.R;

public class DB {
    public static String[] getData(int id) {
        if (id == R.id.action_ilo_eng) {
            return getKhEng();
        } else if (id == R.id.action_eng_ilo) {
            return getEngKh();
        }
        return new String[0];
    }

    public static String[] getEngKh() {
        String[] source = new String[]{
                "A",
                "a la mode",
                "A level",
                "A&E",
                "A (1)",
                "a (2)",
                "A, D",
                "A, a",
                "A-bomb",
                "A-OK ",
                "a-peak",
                "a-riot",
                "a-ripple",
                "A-road",
                "A.c. (also ac)",
                "a.m",
                "AA",
                "AAA",
                "aback",
                "abactor",
        };
        return source;
    }

    public static String[] getKhEng() {
        String[] source = new String[]{
                "ក",
                "កក",
                "កករ",
                "កកាត",
                "កកាយ",
                "កកិចកកុច",
                "កកិត",
                "កកិល",
                "កកូរ",
                "កកេបកកាប",
                "កកេរ",
                "កកេះ",
                "កកែកកកោក",
                "កកែកករ",
                "កកែងកកោង",
                "កកែប",
                "កកោក",
                "កកោស",
                "កកោះ",
                "កក់",
        };
        return source;
    }

    public static String[] getKhKh() {
        String[] source = new String[]{
                "ក",
                "កក",
                "កកកុញ",
                "កកឈាម",
                "កកស្ទះ",
                "កកិត",
                "កកើតឡើងវិញ",
                "កក់",
                "កក់ក្ដៅ",
                "កក់ក្តៅ",
                "កក់ទុក",
                "កក់សាប៊ូ",
                "កខ្វក់",
                "កង",
                "កងកម្លាំង",
                "កងកុម្ម៉ង់",
                "កងខ្នង",
                "កងជីវពល",
                "កងដៃកងជើង",
                "កងថែរក្សាសន្តិភាព",
        };
        return source;
    }


}
