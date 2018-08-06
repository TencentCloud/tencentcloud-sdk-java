package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class RollbackTimeRange  extends AbstractModel{


    /**
    * 实例可回档开始时间，时间格式：2016-10-29 01:06:04
    */
    @SerializedName("Begin")
    @Expose
    private String Begin;

    /**
    * 实例可回档结束时间，时间格式：2016-11-02 11:44:47
    */
    @SerializedName("End")
    @Expose
    private String End;

    /**
     * 获取实例可回档开始时间，时间格式：2016-10-29 01:06:04
     * @return Begin 实例可回档开始时间，时间格式：2016-10-29 01:06:04
     */
    public String getBegin() {
        return this.Begin;
    }

    /**
     * 设置实例可回档开始时间，时间格式：2016-10-29 01:06:04
     * @param Begin 实例可回档开始时间，时间格式：2016-10-29 01:06:04
     */
    public void setBegin(String Begin) {
        this.Begin = Begin;
    }

    /**
     * 获取实例可回档结束时间，时间格式：2016-11-02 11:44:47
     * @return End 实例可回档结束时间，时间格式：2016-11-02 11:44:47
     */
    public String getEnd() {
        return this.End;
    }

    /**
     * 设置实例可回档结束时间，时间格式：2016-11-02 11:44:47
     * @param End 实例可回档结束时间，时间格式：2016-11-02 11:44:47
     */
    public void setEnd(String End) {
        this.End = End;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Begin", this.Begin);
        this.setParamSimple(map, prefix + "End", this.End);

    }
}

