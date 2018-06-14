package com.tencentcloudapi.cis.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ContainerLog  extends AbstractModel{


    /**
    * 容器名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 日志
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * 日志记录时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
     * 获取容器名称
     * @return Name 容器名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置容器名称
     * @param Name 容器名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取日志
     * @return Log 日志
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * 设置日志
     * @param Log 日志
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * 获取日志记录时间
     * @return Time 日志记录时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * 设置日志记录时间
     * @param Time 日志记录时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

