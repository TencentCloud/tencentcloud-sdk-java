package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeProductConfigResponse  extends AbstractModel{


    /**
    * 售卖规格列表。
    */
    @SerializedName("SpecInfoList")
    @Expose
    private SpecInfo [] SpecInfoList;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取售卖规格列表。
     * @return SpecInfoList 售卖规格列表。
     */
    public SpecInfo [] getSpecInfoList() {
        return this.SpecInfoList;
    }

    /**
     * 设置售卖规格列表。
     * @param SpecInfoList 售卖规格列表。
     */
    public void setSpecInfoList(SpecInfo [] SpecInfoList) {
        this.SpecInfoList = SpecInfoList;
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
        this.setParamArrayObj(map, prefix + "SpecInfoList.", this.SpecInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

