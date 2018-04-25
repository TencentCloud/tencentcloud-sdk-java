package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeAccountPrivilegesResponse  extends AbstractModel{


    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
    * 权限列表。
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;
    

    /**
    * 数据库账号用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;
    

    /**
    * 数据库账号Host
    */
    @SerializedName("Host")
    @Expose
    private String Host;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取实例Id
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取权限列表。
     * @return Privileges 权限列表。
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * 设置权限列表。
     * @param Privileges 权限列表。
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    /**
     * 获取数据库账号用户名
     * @return UserName 数据库账号用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * 设置数据库账号用户名
     * @param UserName 数据库账号用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * 获取数据库账号Host
     * @return Host 数据库账号Host
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * 设置数据库账号Host
     * @param Host 数据库账号Host
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

