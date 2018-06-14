package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SlaveInfo  extends AbstractModel{


    /**
    * 第一备机信息
    */
    @SerializedName("First")
    @Expose
    private First First;

    /**
    * 第二备机信息
    */
    @SerializedName("Second")
    @Expose
    private First Second;

    /**
     * 获取第一备机信息
     * @return First 第一备机信息
     */
    public First getFirst() {
        return this.First;
    }

    /**
     * 设置第一备机信息
     * @param First 第一备机信息
     */
    public void setFirst(First First) {
        this.First = First;
    }

    /**
     * 获取第二备机信息
     * @return Second 第二备机信息
     */
    public First getSecond() {
        return this.Second;
    }

    /**
     * 设置第二备机信息
     * @param Second 第二备机信息
     */
    public void setSecond(First Second) {
        this.Second = Second;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "First.", this.First);
        this.setParamObj(map, prefix + "Second.", this.Second);

    }
}

