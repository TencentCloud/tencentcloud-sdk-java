package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Address  extends AbstractModel{


    /**
    * `EIP`的`ID`，是`EIP`的唯一标识。
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * `EIP`名称。
    */
    @SerializedName("AddressName")
    @Expose
    private String AddressName;

    /**
    * `EIP`状态。
    */
    @SerializedName("AddressStatus")
    @Expose
    private String AddressStatus;

    /**
    * 弹性外网IP
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
    * 绑定的资源实例`ID`。可能是一个`CVM`，`NAT`，或是弹性网卡。
    */
    @SerializedName("BindedResourceId")
    @Expose
    private String BindedResourceId;

    /**
    * 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * 获取`EIP`的`ID`，是`EIP`的唯一标识。
     * @return AddressId `EIP`的`ID`，是`EIP`的唯一标识。
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * 设置`EIP`的`ID`，是`EIP`的唯一标识。
     * @param AddressId `EIP`的`ID`，是`EIP`的唯一标识。
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * 获取`EIP`名称。
     * @return AddressName `EIP`名称。
     */
    public String getAddressName() {
        return this.AddressName;
    }

    /**
     * 设置`EIP`名称。
     * @param AddressName `EIP`名称。
     */
    public void setAddressName(String AddressName) {
        this.AddressName = AddressName;
    }

    /**
     * 获取`EIP`状态。
     * @return AddressStatus `EIP`状态。
     */
    public String getAddressStatus() {
        return this.AddressStatus;
    }

    /**
     * 设置`EIP`状态。
     * @param AddressStatus `EIP`状态。
     */
    public void setAddressStatus(String AddressStatus) {
        this.AddressStatus = AddressStatus;
    }

    /**
     * 获取弹性外网IP
     * @return AddressIp 弹性外网IP
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * 设置弹性外网IP
     * @param AddressIp 弹性外网IP
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    /**
     * 获取绑定的资源实例`ID`。可能是一个`CVM`，`NAT`，或是弹性网卡。
     * @return BindedResourceId 绑定的资源实例`ID`。可能是一个`CVM`，`NAT`，或是弹性网卡。
     */
    public String getBindedResourceId() {
        return this.BindedResourceId;
    }

    /**
     * 设置绑定的资源实例`ID`。可能是一个`CVM`，`NAT`，或是弹性网卡。
     * @param BindedResourceId 绑定的资源实例`ID`。可能是一个`CVM`，`NAT`，或是弹性网卡。
     */
    public void setBindedResourceId(String BindedResourceId) {
        this.BindedResourceId = BindedResourceId;
    }

    /**
     * 获取创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     * @return CreatedTime 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * 设置创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     * @param CreatedTime 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "AddressName", this.AddressName);
        this.setParamSimple(map, prefix + "AddressStatus", this.AddressStatus);
        this.setParamSimple(map, prefix + "AddressIp", this.AddressIp);
        this.setParamSimple(map, prefix + "BindedResourceId", this.BindedResourceId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

