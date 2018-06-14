package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ReleaseAddressesRequest  extends AbstractModel{


    /**
    * 标识 EIP 的唯一 ID 列表。EIP 唯一 ID 形如：`eip-11112222`。
    */
    @SerializedName("AddressIds")
    @Expose
    private String [] AddressIds;

    /**
     * 获取标识 EIP 的唯一 ID 列表。EIP 唯一 ID 形如：`eip-11112222`。
     * @return AddressIds 标识 EIP 的唯一 ID 列表。EIP 唯一 ID 形如：`eip-11112222`。
     */
    public String [] getAddressIds() {
        return this.AddressIds;
    }

    /**
     * 设置标识 EIP 的唯一 ID 列表。EIP 唯一 ID 形如：`eip-11112222`。
     * @param AddressIds 标识 EIP 的唯一 ID 列表。EIP 唯一 ID 形如：`eip-11112222`。
     */
    public void setAddressIds(String [] AddressIds) {
        this.AddressIds = AddressIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AddressIds.", this.AddressIds);

    }
}

