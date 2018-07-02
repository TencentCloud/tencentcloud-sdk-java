package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ErrLogDetail  extends AbstractModel{


    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 数据库名字
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 错误发生时间
    */
    @SerializedName("ErrTime")
    @Expose
    private String ErrTime;

    /**
    * 错误消息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * 获取用户名
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * 设置用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * 获取数据库名字
     * @return Database 数据库名字
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * 设置数据库名字
     * @param Database 数据库名字
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * 获取错误发生时间
     * @return ErrTime 错误发生时间
     */
    public String getErrTime() {
        return this.ErrTime;
    }

    /**
     * 设置错误发生时间
     * @param ErrTime 错误发生时间
     */
    public void setErrTime(String ErrTime) {
        this.ErrTime = ErrTime;
    }

    /**
     * 获取错误消息
     * @return ErrMsg 错误消息
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * 设置错误消息
     * @param ErrMsg 错误消息
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "ErrTime", this.ErrTime);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

