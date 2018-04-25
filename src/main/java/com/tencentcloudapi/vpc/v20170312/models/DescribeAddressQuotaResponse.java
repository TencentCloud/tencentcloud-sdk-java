package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeAddressQuotaResponse  extends AbstractModel{


    /**
    * 账户 EIP 配额信息。
    */
    @SerializedName("QuotaSet")
    @Expose
    private Quota [] QuotaSet;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取账户 EIP 配额信息。
     * @return QuotaSet 账户 EIP 配额信息。
     */
    public Quota [] getQuotaSet() {
        return this.QuotaSet;
    }

    /**
     * 设置账户 EIP 配额信息。
     * @param QuotaSet 账户 EIP 配额信息。
     */
    public void setQuotaSet(Quota [] QuotaSet) {
        this.QuotaSet = QuotaSet;
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
        this.setParamArrayObj(map, prefix + "QuotaSet.", this.QuotaSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

