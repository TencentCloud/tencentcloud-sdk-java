package com.tencentcloudapi.dc.v20180410.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class BgpPeer  extends AbstractModel{


    /**
    * 用户侧，BGP Asn
    */
    @SerializedName("Asn")
    @Expose
    private Integer Asn;

    /**
    * 用户侧BGP密钥
    */
    @SerializedName("AuthKey")
    @Expose
    private String AuthKey;

    /**
     * 获取用户侧，BGP Asn
     * @return Asn 用户侧，BGP Asn
     */
    public Integer getAsn() {
        return this.Asn;
    }

    /**
     * 设置用户侧，BGP Asn
     * @param Asn 用户侧，BGP Asn
     */
    public void setAsn(Integer Asn) {
        this.Asn = Asn;
    }

    /**
     * 获取用户侧BGP密钥
     * @return AuthKey 用户侧BGP密钥
     */
    public String getAuthKey() {
        return this.AuthKey;
    }

    /**
     * 设置用户侧BGP密钥
     * @param AuthKey 用户侧BGP密钥
     */
    public void setAuthKey(String AuthKey) {
        this.AuthKey = AuthKey;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Asn", this.Asn);
        this.setParamSimple(map, prefix + "AuthKey", this.AuthKey);

    }
}

