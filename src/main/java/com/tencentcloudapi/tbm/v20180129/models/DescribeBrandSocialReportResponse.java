package com.tencentcloudapi.tbm.v20180129.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeBrandSocialReportResponse  extends AbstractModel{


    /**
    * 累计统计数据
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 按天计算的统计数据
    */
    @SerializedName("DateCountSet")
    @Expose
    private DateCount [] DateCountSet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取累计统计数据
     * @return TotalCount 累计统计数据
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置累计统计数据
     * @param TotalCount 累计统计数据
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取按天计算的统计数据
     * @return DateCountSet 按天计算的统计数据
     */
    public DateCount [] getDateCountSet() {
        return this.DateCountSet;
    }

    /**
     * 设置按天计算的统计数据
     * @param DateCountSet 按天计算的统计数据
     */
    public void setDateCountSet(DateCount [] DateCountSet) {
        this.DateCountSet = DateCountSet;
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
        this.setParamArrayObj(map, prefix + "DateCountSet.", this.DateCountSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

