package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SharePermission  extends AbstractModel{


    /**
    * 镜像分享时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 镜像分享的账户ID
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
     * 获取镜像分享时间
     * @return CreateTime 镜像分享时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置镜像分享时间
     * @param CreateTime 镜像分享时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取镜像分享的账户ID
     * @return Account 镜像分享的账户ID
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * 设置镜像分享的账户ID
     * @param Account 镜像分享的账户ID
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Account", this.Account);

    }
}

