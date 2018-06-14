package com.tencentcloudapi.cbs.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDiskConfigQuotaResponse  extends AbstractModel{


    /**
    * 云盘配置列表。
    */
    @SerializedName("DiskConfigSet")
    @Expose
    private DiskConfig [] DiskConfigSet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取云盘配置列表。
     * @return DiskConfigSet 云盘配置列表。
     */
    public DiskConfig [] getDiskConfigSet() {
        return this.DiskConfigSet;
    }

    /**
     * 设置云盘配置列表。
     * @param DiskConfigSet 云盘配置列表。
     */
    public void setDiskConfigSet(DiskConfig [] DiskConfigSet) {
        this.DiskConfigSet = DiskConfigSet;
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
        this.setParamArrayObj(map, prefix + "DiskConfigSet.", this.DiskConfigSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

