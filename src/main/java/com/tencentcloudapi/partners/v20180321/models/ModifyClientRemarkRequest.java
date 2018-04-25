package com.tencentcloudapi.partners.v20180321.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifyClientRemarkRequest  extends AbstractModel{


    /**
    * 客户备注名称
    */
    @SerializedName("ClientRemark")
    @Expose
    private String ClientRemark;
    

    /**
    * 客户账号ID
    */
    @SerializedName("ClientUin")
    @Expose
    private String ClientUin;
    

    /**
     * 获取客户备注名称
     * @return ClientRemark 客户备注名称
     */
    public String getClientRemark() {
        return this.ClientRemark;
    }

    /**
     * 设置客户备注名称
     * @param ClientRemark 客户备注名称
     */
    public void setClientRemark(String ClientRemark) {
        this.ClientRemark = ClientRemark;
    }

    /**
     * 获取客户账号ID
     * @return ClientUin 客户账号ID
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * 设置客户账号ID
     * @param ClientUin 客户账号ID
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientRemark", this.ClientRemark);
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);

    }
}

