package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class PrivateIpAddressSpecification  extends AbstractModel{


    /**
    * 内网IP地址。
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;
    

    /**
    * 是否是主IP。
    */
    @SerializedName("Primary")
    @Expose
    private Boolean Primary;
    

    /**
    * 公网IP地址。
    */
    @SerializedName("PublicIpAddress")
    @Expose
    private String PublicIpAddress;
    

    /**
    * EIP实例ID，例如：eip-11112222。
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;
    

    /**
    * 内网IP描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;
    

    /**
    * 公网IP是否被封堵。
    */
    @SerializedName("IsWanIpBlocked")
    @Expose
    private Boolean IsWanIpBlocked;
    

    /**
     * 获取内网IP地址。
     * @return PrivateIpAddress 内网IP地址。
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * 设置内网IP地址。
     * @param PrivateIpAddress 内网IP地址。
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * 获取是否是主IP。
     * @return Primary 是否是主IP。
     */
    public Boolean getPrimary() {
        return this.Primary;
    }

    /**
     * 设置是否是主IP。
     * @param Primary 是否是主IP。
     */
    public void setPrimary(Boolean Primary) {
        this.Primary = Primary;
    }

    /**
     * 获取公网IP地址。
     * @return PublicIpAddress 公网IP地址。
     */
    public String getPublicIpAddress() {
        return this.PublicIpAddress;
    }

    /**
     * 设置公网IP地址。
     * @param PublicIpAddress 公网IP地址。
     */
    public void setPublicIpAddress(String PublicIpAddress) {
        this.PublicIpAddress = PublicIpAddress;
    }

    /**
     * 获取EIP实例ID，例如：eip-11112222。
     * @return AddressId EIP实例ID，例如：eip-11112222。
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * 设置EIP实例ID，例如：eip-11112222。
     * @param AddressId EIP实例ID，例如：eip-11112222。
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * 获取内网IP描述信息。
     * @return Description 内网IP描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置内网IP描述信息。
     * @param Description 内网IP描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取公网IP是否被封堵。
     * @return IsWanIpBlocked 公网IP是否被封堵。
     */
    public Boolean getIsWanIpBlocked() {
        return this.IsWanIpBlocked;
    }

    /**
     * 设置公网IP是否被封堵。
     * @param IsWanIpBlocked 公网IP是否被封堵。
     */
    public void setIsWanIpBlocked(Boolean IsWanIpBlocked) {
        this.IsWanIpBlocked = IsWanIpBlocked;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "Primary", this.Primary);
        this.setParamSimple(map, prefix + "PublicIpAddress", this.PublicIpAddress);
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsWanIpBlocked", this.IsWanIpBlocked);

    }
}

