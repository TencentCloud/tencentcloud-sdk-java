package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifyAddressAttributeRequest  extends AbstractModel{


    /**
    * 标识 EIP 的唯一 ID。EIP 唯一 ID 形如：`eip-11112222`。
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;
    

    /**
    * 修改后的 EIP 名称。长度上限为20个字符。
    */
    @SerializedName("AddressName")
    @Expose
    private String AddressName;
    

    /**
     * 获取标识 EIP 的唯一 ID。EIP 唯一 ID 形如：`eip-11112222`。
     * @return AddressId 标识 EIP 的唯一 ID。EIP 唯一 ID 形如：`eip-11112222`。
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * 设置标识 EIP 的唯一 ID。EIP 唯一 ID 形如：`eip-11112222`。
     * @param AddressId 标识 EIP 的唯一 ID。EIP 唯一 ID 形如：`eip-11112222`。
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * 获取修改后的 EIP 名称。长度上限为20个字符。
     * @return AddressName 修改后的 EIP 名称。长度上限为20个字符。
     */
    public String getAddressName() {
        return this.AddressName;
    }

    /**
     * 设置修改后的 EIP 名称。长度上限为20个字符。
     * @param AddressName 修改后的 EIP 名称。长度上限为20个字符。
     */
    public void setAddressName(String AddressName) {
        this.AddressName = AddressName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "AddressName", this.AddressName);

    }
}

