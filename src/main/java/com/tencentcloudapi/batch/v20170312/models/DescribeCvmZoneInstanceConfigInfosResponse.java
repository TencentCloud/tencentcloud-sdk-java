package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeCvmZoneInstanceConfigInfosResponse  extends AbstractModel{


    /**
    * 可用区机型配置列表。
    */
    @SerializedName("InstanceTypeQuotaSet")
    @Expose
    private InstanceTypeQuotaItem [] InstanceTypeQuotaSet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取可用区机型配置列表。
     * @return InstanceTypeQuotaSet 可用区机型配置列表。
     */
    public InstanceTypeQuotaItem [] getInstanceTypeQuotaSet() {
        return this.InstanceTypeQuotaSet;
    }

    /**
     * 设置可用区机型配置列表。
     * @param InstanceTypeQuotaSet 可用区机型配置列表。
     */
    public void setInstanceTypeQuotaSet(InstanceTypeQuotaItem [] InstanceTypeQuotaSet) {
        this.InstanceTypeQuotaSet = InstanceTypeQuotaSet;
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
        this.setParamArrayObj(map, prefix + "InstanceTypeQuotaSet.", this.InstanceTypeQuotaSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

