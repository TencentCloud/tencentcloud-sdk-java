package com.tencentcloudapi.ds.v20180523.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SignInfo  extends AbstractModel{


    /**
    * 账户ID
    */
    @SerializedName("AccountResId")
    @Expose
    private String AccountResId;
    

    /**
     * 获取账户ID
     * @return AccountResId 账户ID
     */
    public String getAccountResId() {
        return this.AccountResId;
    }

    /**
     * 设置账户ID
     * @param AccountResId 账户ID
     */
    public void setAccountResId(String AccountResId) {
        this.AccountResId = AccountResId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountResId", this.AccountResId);

    }
}

