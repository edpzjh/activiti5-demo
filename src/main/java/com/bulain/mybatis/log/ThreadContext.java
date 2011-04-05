package com.bulain.mybatis.log;

import java.util.ArrayList;
import java.util.List;

public class ThreadContext {
    private static ThreadLocal<Boolean> threadLocalActive = new ThreadLocal<Boolean>();
    private static ThreadLocal<List<String>> threadLocalData = new ThreadLocal<List<String>>();

    public static void active() {
        threadLocalActive.set(Boolean.TRUE);
        List<String> list = threadLocalData.get();
        if (list == null) list = new ArrayList<String>();
        threadLocalData.set(list);
    }

    public static void add(String log) {
        Boolean bool = threadLocalActive.get();
        if (bool != null && bool.booleanValue() == true) {
            List<String> list = threadLocalData.get();
            list.add(log);
        }
    }
    public static List<String> get() {
        List<String> list = threadLocalData.get();
        if (list == null) list = new ArrayList<String>();
        return list;
    }
    
    public static void clear() {
        threadLocalActive.set(Boolean.FALSE);
        List<String> list = threadLocalData.get();
        if (list != null) list.clear();
    }
}
