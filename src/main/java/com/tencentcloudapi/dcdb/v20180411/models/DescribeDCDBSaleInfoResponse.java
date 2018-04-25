package com.tencentcloudapi.dcdb.v20180411.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDCDBSaleInfoResponse  extends AbstractModel{


    /**
    * 可售卖地域信息列表
    */
    @SerializedName("RegionList")
    @Expose
    private RegionInfo [] RegionList;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取可售卖地域信息列表
     * @return RegionList 可售卖地域信息列表
     */
    public RegionInfo [] getRegionList() {
        return this.RegionList;
    }

    /**
     * 设置可售卖地域信息列表
     * @param RegionList 可售卖地域信息列表
     */
    public void setRegionList(RegionInfo [] RegionList) {
        this.RegionList = RegionList;
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
        this.setParamArrayObj(map, prefix + "RegionList.", this.RegionList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

