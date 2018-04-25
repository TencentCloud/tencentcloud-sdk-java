package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeInternetChargeTypeConfigsResponse  extends AbstractModel{


    /**
    * 网络计费类型配置。
    */
    @SerializedName("InternetChargeTypeConfigSet")
    @Expose
    private InternetChargeTypeConfig [] InternetChargeTypeConfigSet;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取网络计费类型配置。
     * @return InternetChargeTypeConfigSet 网络计费类型配置。
     */
    public InternetChargeTypeConfig [] getInternetChargeTypeConfigSet() {
        return this.InternetChargeTypeConfigSet;
    }

    /**
     * 设置网络计费类型配置。
     * @param InternetChargeTypeConfigSet 网络计费类型配置。
     */
    public void setInternetChargeTypeConfigSet(InternetChargeTypeConfig [] InternetChargeTypeConfigSet) {
        this.InternetChargeTypeConfigSet = InternetChargeTypeConfigSet;
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
        this.setParamArrayObj(map, prefix + "InternetChargeTypeConfigSet.", this.InternetChargeTypeConfigSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

