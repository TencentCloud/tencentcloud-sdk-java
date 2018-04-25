package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AllocateAddressesResponse  extends AbstractModel{


    /**
    * 申请到的 EIP 的唯一 ID 列表。
    */
    @SerializedName("AddressSet")
    @Expose
    private String [] AddressSet;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取申请到的 EIP 的唯一 ID 列表。
     * @return AddressSet 申请到的 EIP 的唯一 ID 列表。
     */
    public String [] getAddressSet() {
        return this.AddressSet;
    }

    /**
     * 设置申请到的 EIP 的唯一 ID 列表。
     * @param AddressSet 申请到的 EIP 的唯一 ID 列表。
     */
    public void setAddressSet(String [] AddressSet) {
        this.AddressSet = AddressSet;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AddressSet.", this.AddressSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

