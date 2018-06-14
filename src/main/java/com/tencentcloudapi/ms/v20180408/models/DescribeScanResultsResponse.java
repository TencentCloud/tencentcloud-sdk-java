package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeScanResultsResponse  extends AbstractModel{


    /**
    * 批量扫描的app结果集
    */
    @SerializedName("ScanSet")
    @Expose
    private ScanSetInfo [] ScanSet;

    /**
    * 批量扫描结果的个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取批量扫描的app结果集
     * @return ScanSet 批量扫描的app结果集
     */
    public ScanSetInfo [] getScanSet() {
        return this.ScanSet;
    }

    /**
     * 设置批量扫描的app结果集
     * @param ScanSet 批量扫描的app结果集
     */
    public void setScanSet(ScanSetInfo [] ScanSet) {
        this.ScanSet = ScanSet;
    }

    /**
     * 获取批量扫描结果的个数
     * @return TotalCount 批量扫描结果的个数
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置批量扫描结果的个数
     * @param TotalCount 批量扫描结果的个数
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
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
        this.setParamArrayObj(map, prefix + "ScanSet.", this.ScanSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

