package com.tencentcloudapi.dts.v20180330.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SyncOption  extends AbstractModel{


    /**
    * 同步对象，1-整个实例，2-指定库表
    */
    @SerializedName("SyncObject")
    @Expose
    private Integer SyncObject;

    /**
    * 同步开始设置，1-立即开始
    */
    @SerializedName("RunMode")
    @Expose
    private Integer RunMode;

    /**
    * 同步模式， 3-增量同步
    */
    @SerializedName("SyncType")
    @Expose
    private Integer SyncType;

    /**
    * 数据一致性检测， 1-不配置
    */
    @SerializedName("ConsistencyType")
    @Expose
    private Integer ConsistencyType;

    /**
     * 获取同步对象，1-整个实例，2-指定库表
     * @return SyncObject 同步对象，1-整个实例，2-指定库表
     */
    public Integer getSyncObject() {
        return this.SyncObject;
    }

    /**
     * 设置同步对象，1-整个实例，2-指定库表
     * @param SyncObject 同步对象，1-整个实例，2-指定库表
     */
    public void setSyncObject(Integer SyncObject) {
        this.SyncObject = SyncObject;
    }

    /**
     * 获取同步开始设置，1-立即开始
     * @return RunMode 同步开始设置，1-立即开始
     */
    public Integer getRunMode() {
        return this.RunMode;
    }

    /**
     * 设置同步开始设置，1-立即开始
     * @param RunMode 同步开始设置，1-立即开始
     */
    public void setRunMode(Integer RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * 获取同步模式， 3-增量同步
     * @return SyncType 同步模式， 3-增量同步
     */
    public Integer getSyncType() {
        return this.SyncType;
    }

    /**
     * 设置同步模式， 3-增量同步
     * @param SyncType 同步模式， 3-增量同步
     */
    public void setSyncType(Integer SyncType) {
        this.SyncType = SyncType;
    }

    /**
     * 获取数据一致性检测， 1-不配置
     * @return ConsistencyType 数据一致性检测， 1-不配置
     */
    public Integer getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * 设置数据一致性检测， 1-不配置
     * @param ConsistencyType 数据一致性检测， 1-不配置
     */
    public void setConsistencyType(Integer ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SyncObject", this.SyncObject);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "SyncType", this.SyncType);
        this.setParamSimple(map, prefix + "ConsistencyType", this.ConsistencyType);

    }
}

