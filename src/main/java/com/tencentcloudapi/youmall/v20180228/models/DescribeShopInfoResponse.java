package com.tencentcloudapi.youmall.v20180228.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeShopInfoResponse  extends AbstractModel{


    /**
    * 门店总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 门店列表信息
    */
    @SerializedName("ShopInfoSet")
    @Expose
    private ShopInfo [] ShopInfoSet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取门店总数
     * @return TotalCount 门店总数
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置门店总数
     * @param TotalCount 门店总数
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取门店列表信息
     * @return ShopInfoSet 门店列表信息
     */
    public ShopInfo [] getShopInfoSet() {
        return this.ShopInfoSet;
    }

    /**
     * 设置门店列表信息
     * @param ShopInfoSet 门店列表信息
     */
    public void setShopInfoSet(ShopInfo [] ShopInfoSet) {
        this.ShopInfoSet = ShopInfoSet;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ShopInfoSet.", this.ShopInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

