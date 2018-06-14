package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeInstanceInternetBandwidthConfigsResponse  extends AbstractModel{


    /**
    * 带宽配置信息列表。
    */
    @SerializedName("InternetBandwidthConfigSet")
    @Expose
    private InternetBandwidthConfig [] InternetBandwidthConfigSet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取带宽配置信息列表。
     * @return InternetBandwidthConfigSet 带宽配置信息列表。
     */
    public InternetBandwidthConfig [] getInternetBandwidthConfigSet() {
        return this.InternetBandwidthConfigSet;
    }

    /**
     * 设置带宽配置信息列表。
     * @param InternetBandwidthConfigSet 带宽配置信息列表。
     */
    public void setInternetBandwidthConfigSet(InternetBandwidthConfig [] InternetBandwidthConfigSet) {
        this.InternetBandwidthConfigSet = InternetBandwidthConfigSet;
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
        this.setParamArrayObj(map, prefix + "InternetBandwidthConfigSet.", this.InternetBandwidthConfigSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

