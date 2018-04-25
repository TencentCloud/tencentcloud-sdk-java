package com.tencentcloudapi.cws.v20180312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SitesVerification  extends AbstractModel{


    /**
    * 根域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;
    

    /**
    * txt解析域名验证的name。
    */
    @SerializedName("TxtName")
    @Expose
    private String TxtName;
    

    /**
    * txt解析域名验证的text。
    */
    @SerializedName("TxtText")
    @Expose
    private String TxtText;
    

    /**
    * 验证有效期，在此之前有效。
    */
    @SerializedName("ValidTo")
    @Expose
    private String ValidTo;
    

    /**
    * 验证状态：0-未验证；1-已验证；2-验证失效，待重新验证。
    */
    @SerializedName("VerifyStatus")
    @Expose
    private Integer VerifyStatus;
    

    /**
    * CreatedAt。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;
    

    /**
    * UpdatedAt。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;
    

    /**
     * 获取根域名。
     * @return Domain 根域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置根域名。
     * @param Domain 根域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取txt解析域名验证的name。
     * @return TxtName txt解析域名验证的name。
     */
    public String getTxtName() {
        return this.TxtName;
    }

    /**
     * 设置txt解析域名验证的name。
     * @param TxtName txt解析域名验证的name。
     */
    public void setTxtName(String TxtName) {
        this.TxtName = TxtName;
    }

    /**
     * 获取txt解析域名验证的text。
     * @return TxtText txt解析域名验证的text。
     */
    public String getTxtText() {
        return this.TxtText;
    }

    /**
     * 设置txt解析域名验证的text。
     * @param TxtText txt解析域名验证的text。
     */
    public void setTxtText(String TxtText) {
        this.TxtText = TxtText;
    }

    /**
     * 获取验证有效期，在此之前有效。
     * @return ValidTo 验证有效期，在此之前有效。
     */
    public String getValidTo() {
        return this.ValidTo;
    }

    /**
     * 设置验证有效期，在此之前有效。
     * @param ValidTo 验证有效期，在此之前有效。
     */
    public void setValidTo(String ValidTo) {
        this.ValidTo = ValidTo;
    }

    /**
     * 获取验证状态：0-未验证；1-已验证；2-验证失效，待重新验证。
     * @return VerifyStatus 验证状态：0-未验证；1-已验证；2-验证失效，待重新验证。
     */
    public Integer getVerifyStatus() {
        return this.VerifyStatus;
    }

    /**
     * 设置验证状态：0-未验证；1-已验证；2-验证失效，待重新验证。
     * @param VerifyStatus 验证状态：0-未验证；1-已验证；2-验证失效，待重新验证。
     */
    public void setVerifyStatus(Integer VerifyStatus) {
        this.VerifyStatus = VerifyStatus;
    }

    /**
     * 获取CreatedAt。
     * @return CreatedAt CreatedAt。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * 设置CreatedAt。
     * @param CreatedAt CreatedAt。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * 获取UpdatedAt。
     * @return UpdatedAt UpdatedAt。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * 设置UpdatedAt。
     * @param UpdatedAt UpdatedAt。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "TxtName", this.TxtName);
        this.setParamSimple(map, prefix + "TxtText", this.TxtText);
        this.setParamSimple(map, prefix + "ValidTo", this.ValidTo);
        this.setParamSimple(map, prefix + "VerifyStatus", this.VerifyStatus);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

