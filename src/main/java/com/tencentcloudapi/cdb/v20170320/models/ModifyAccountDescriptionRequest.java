package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifyAccountDescriptionRequest  extends AbstractModel{


    /**
    * 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 云数据库账号。
    */
    @SerializedName("Accounts")
    @Expose
    private Account [] Accounts;

    /**
    * 数据库账号的备注信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * 获取实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     * @return InstanceId 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     * @param InstanceId 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取云数据库账号。
     * @return Accounts 云数据库账号。
     */
    public Account [] getAccounts() {
        return this.Accounts;
    }

    /**
     * 设置云数据库账号。
     * @param Accounts 云数据库账号。
     */
    public void setAccounts(Account [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * 获取数据库账号的备注信息。
     * @return Description 数据库账号的备注信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置数据库账号的备注信息。
     * @param Description 数据库账号的备注信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

