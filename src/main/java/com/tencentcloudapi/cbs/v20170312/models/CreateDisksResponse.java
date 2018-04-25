package com.tencentcloudapi.cbs.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateDisksResponse  extends AbstractModel{


    /**
    * 创建的云硬盘ID列表。
    */
    @SerializedName("DiskIdSet")
    @Expose
    private String [] DiskIdSet;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取创建的云硬盘ID列表。
     * @return DiskIdSet 创建的云硬盘ID列表。
     */
    public String [] getDiskIdSet() {
        return this.DiskIdSet;
    }

    /**
     * 设置创建的云硬盘ID列表。
     * @param DiskIdSet 创建的云硬盘ID列表。
     */
    public void setDiskIdSet(String [] DiskIdSet) {
        this.DiskIdSet = DiskIdSet;
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
        this.setParamArraySimple(map, prefix + "DiskIdSet.", this.DiskIdSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

