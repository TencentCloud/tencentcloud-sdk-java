package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifyAccountRemarkRequest  extends AbstractModel{


    /**
    * 实例ID，形如postgres-4wdeb0zv
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 实例用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户UserName对应的新备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * 获取实例ID，形如postgres-4wdeb0zv
     * @return DBInstanceId 实例ID，形如postgres-4wdeb0zv
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * 设置实例ID，形如postgres-4wdeb0zv
     * @param DBInstanceId 实例ID，形如postgres-4wdeb0zv
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * 获取实例用户名
     * @return UserName 实例用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * 设置实例用户名
     * @param UserName 实例用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * 获取用户UserName对应的新备注
     * @return Remark 用户UserName对应的新备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * 设置用户UserName对应的新备注
     * @param Remark 用户UserName对应的新备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

