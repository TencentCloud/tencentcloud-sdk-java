package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class RestartDBInstanceRequest  extends AbstractModel{


    /**
    * 实例ID，形如postgres-6r233v55
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
     * 获取实例ID，形如postgres-6r233v55
     * @return DBInstanceId 实例ID，形如postgres-6r233v55
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * 设置实例ID，形如postgres-6r233v55
     * @param DBInstanceId 实例ID，形如postgres-6r233v55
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);

    }
}

