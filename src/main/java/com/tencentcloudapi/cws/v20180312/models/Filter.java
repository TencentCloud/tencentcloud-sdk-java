package com.tencentcloudapi.cws.v20180312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Filter  extends AbstractModel{


    /**
    * 过滤键的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;
    

    /**
    * 一个或者多个过滤值。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;
    

    /**
     * 获取过滤键的名称。
     * @return Name 过滤键的名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置过滤键的名称。
     * @param Name 过滤键的名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取一个或者多个过滤值。
     * @return Values 一个或者多个过滤值。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * 设置一个或者多个过滤值。
     * @param Values 一个或者多个过滤值。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

