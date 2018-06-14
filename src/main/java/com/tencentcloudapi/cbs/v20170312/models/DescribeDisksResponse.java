package com.tencentcloudapi.cbs.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDisksResponse  extends AbstractModel{


    /**
    * 符合条件的云硬盘数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 云硬盘的详细信息列表。
    */
    @SerializedName("DiskSet")
    @Expose
    private Disk [] DiskSet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取符合条件的云硬盘数量。
     * @return TotalCount 符合条件的云硬盘数量。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置符合条件的云硬盘数量。
     * @param TotalCount 符合条件的云硬盘数量。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取云硬盘的详细信息列表。
     * @return DiskSet 云硬盘的详细信息列表。
     */
    public Disk [] getDiskSet() {
        return this.DiskSet;
    }

    /**
     * 设置云硬盘的详细信息列表。
     * @param DiskSet 云硬盘的详细信息列表。
     */
    public void setDiskSet(Disk [] DiskSet) {
        this.DiskSet = DiskSet;
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
        this.setParamArrayObj(map, prefix + "DiskSet.", this.DiskSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

