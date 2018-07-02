package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ResetAccountPasswordRequest  extends AbstractModel{


    /**
    * 实例ID，形如postgres-4wdeb0zv
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 实例账户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * UserName账户对应的新密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

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
     * 获取实例账户名
     * @return UserName 实例账户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * 设置实例账户名
     * @param UserName 实例账户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * 获取UserName账户对应的新密码
     * @return Password UserName账户对应的新密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置UserName账户对应的新密码
     * @param Password UserName账户对应的新密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

