package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Account  extends AbstractModel{


    /**
    * 新账户的名称
    */
    @SerializedName("User")
    @Expose
    private String User;
    

    /**
    * 新账户的域名
    */
    @SerializedName("Host")
    @Expose
    private String Host;
    

    /**
     * 获取新账户的名称
     * @return User 新账户的名称
     */
    public String getUser() {
        return this.User;
    }

    /**
     * 设置新账户的名称
     * @param User 新账户的名称
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * 获取新账户的域名
     * @return Host 新账户的域名
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * 设置新账户的域名
     * @param Host 新账户的域名
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

