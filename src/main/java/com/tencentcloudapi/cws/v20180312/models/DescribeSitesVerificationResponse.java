package com.tencentcloudapi.cws.v20180312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeSitesVerificationResponse  extends AbstractModel{


    /**
    * 验证信息数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 验证信息列表。
    */
    @SerializedName("SitesVerification")
    @Expose
    private SitesVerification [] SitesVerification;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取验证信息数量。
     * @return TotalCount 验证信息数量。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置验证信息数量。
     * @param TotalCount 验证信息数量。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取验证信息列表。
     * @return SitesVerification 验证信息列表。
     */
    public SitesVerification [] getSitesVerification() {
        return this.SitesVerification;
    }

    /**
     * 设置验证信息列表。
     * @param SitesVerification 验证信息列表。
     */
    public void setSitesVerification(SitesVerification [] SitesVerification) {
        this.SitesVerification = SitesVerification;
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
        this.setParamArrayObj(map, prefix + "SitesVerification.", this.SitesVerification);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

