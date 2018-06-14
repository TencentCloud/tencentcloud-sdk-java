package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AllocateAddressesRequest  extends AbstractModel{


    /**
    * 申请 EIP 数量，默认值为1。
    */
    @SerializedName("AddressCount")
    @Expose
    private Integer AddressCount;

    /**
     * 获取申请 EIP 数量，默认值为1。
     * @return AddressCount 申请 EIP 数量，默认值为1。
     */
    public Integer getAddressCount() {
        return this.AddressCount;
    }

    /**
     * 设置申请 EIP 数量，默认值为1。
     * @param AddressCount 申请 EIP 数量，默认值为1。
     */
    public void setAddressCount(Integer AddressCount) {
        this.AddressCount = AddressCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressCount", this.AddressCount);

    }
}

