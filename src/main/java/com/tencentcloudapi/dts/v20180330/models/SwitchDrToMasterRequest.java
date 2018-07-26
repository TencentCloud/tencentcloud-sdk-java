package com.tencentcloudapi.dts.v20180330.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SwitchDrToMasterRequest  extends AbstractModel{


    /**
    * 灾备实例的信息
    */
    @SerializedName("DstInfo")
    @Expose
    private SyncInstanceInfo DstInfo;

    /**
    * 数据库的类型  （如 mysql）
    */
    @SerializedName("DatabaseType")
    @Expose
    private String DatabaseType;

    /**
     * 获取灾备实例的信息
     * @return DstInfo 灾备实例的信息
     */
    public SyncInstanceInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * 设置灾备实例的信息
     * @param DstInfo 灾备实例的信息
     */
    public void setDstInfo(SyncInstanceInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * 获取数据库的类型  （如 mysql）
     * @return DatabaseType 数据库的类型  （如 mysql）
     */
    public String getDatabaseType() {
        return this.DatabaseType;
    }

    /**
     * 设置数据库的类型  （如 mysql）
     * @param DatabaseType 数据库的类型  （如 mysql）
     */
    public void setDatabaseType(String DatabaseType) {
        this.DatabaseType = DatabaseType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamSimple(map, prefix + "DatabaseType", this.DatabaseType);

    }
}

