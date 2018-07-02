package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifyDBInstanceNameRequest  extends AbstractModel{


    /**
    * 数据库实例ID，形如postgres-6fego161
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 新的数据库实例名字
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * 获取数据库实例ID，形如postgres-6fego161
     * @return DBInstanceId 数据库实例ID，形如postgres-6fego161
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * 设置数据库实例ID，形如postgres-6fego161
     * @param DBInstanceId 数据库实例ID，形如postgres-6fego161
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * 获取新的数据库实例名字
     * @return InstanceName 新的数据库实例名字
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置新的数据库实例名字
     * @param InstanceName 新的数据库实例名字
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

