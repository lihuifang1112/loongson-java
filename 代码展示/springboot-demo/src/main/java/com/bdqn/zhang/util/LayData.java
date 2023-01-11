package com.bdqn.zhang.util;

import java.util.HashMap;
import java.util.List;

public class LayData extends HashMap<String, Object> {

    public static LayData data(int count, List<?> data){
        LayData r = new LayData();
        r.put("code", 0);
        r.put("msg", "");
        r.put("count", count);
        r.put("data", data);
        return r;
    }

    public static LayData data_upload(int code,String msg){
        LayData r = new LayData();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }
}