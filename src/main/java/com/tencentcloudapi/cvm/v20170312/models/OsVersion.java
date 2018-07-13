package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class OsVersion  extends AbstractModel{


    /**
    * 操作系统类型
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 支持的操作系统版本
    */
    @SerializedName("OsVersions")
    @Expose
    private String [] OsVersions;

    /**
    * 支持的操作系统架构
    */
    @SerializedName("Architecture")
    @Expose
    private String [] Architecture;

    /**
     * 获取操作系统类型
     * @return OsName 操作系统类型
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * 设置操作系统类型
     * @param OsName 操作系统类型
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * 获取支持的操作系统版本
     * @return OsVersions 支持的操作系统版本
     */
    public String [] getOsVersions() {
        return this.OsVersions;
    }

    /**
     * 设置支持的操作系统版本
     * @param OsVersions 支持的操作系统版本
     */
    public void setOsVersions(String [] OsVersions) {
        this.OsVersions = OsVersions;
    }

    /**
     * 获取支持的操作系统架构
     * @return Architecture 支持的操作系统架构
     */
    public String [] getArchitecture() {
        return this.Architecture;
    }

    /**
     * 设置支持的操作系统架构
     * @param Architecture 支持的操作系统架构
     */
    public void setArchitecture(String [] Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamArraySimple(map, prefix + "OsVersions.", this.OsVersions);
        this.setParamArraySimple(map, prefix + "Architecture.", this.Architecture);

    }
}

