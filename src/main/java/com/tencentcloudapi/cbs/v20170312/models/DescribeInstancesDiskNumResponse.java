package com.tencentcloudapi.cbs.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeInstancesDiskNumResponse  extends AbstractModel{


    /**
    * 当前云服务器已挂载弹性云盘数量。
    */
    @SerializedName("AttachedDiskCount")
    @Expose
    private Integer AttachedDiskCount;

    /**
    * 当前云服务器最大可挂载弹性云盘数量。
    */
    @SerializedName("MaxAttachCount")
    @Expose
    private Integer MaxAttachCount;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取当前云服务器已挂载弹性云盘数量。
     * @return AttachedDiskCount 当前云服务器已挂载弹性云盘数量。
     */
    public Integer getAttachedDiskCount() {
        return this.AttachedDiskCount;
    }

    /**
     * 设置当前云服务器已挂载弹性云盘数量。
     * @param AttachedDiskCount 当前云服务器已挂载弹性云盘数量。
     */
    public void setAttachedDiskCount(Integer AttachedDiskCount) {
        this.AttachedDiskCount = AttachedDiskCount;
    }

    /**
     * 获取当前云服务器最大可挂载弹性云盘数量。
     * @return MaxAttachCount 当前云服务器最大可挂载弹性云盘数量。
     */
    public Integer getMaxAttachCount() {
        return this.MaxAttachCount;
    }

    /**
     * 设置当前云服务器最大可挂载弹性云盘数量。
     * @param MaxAttachCount 当前云服务器最大可挂载弹性云盘数量。
     */
    public void setMaxAttachCount(Integer MaxAttachCount) {
        this.MaxAttachCount = MaxAttachCount;
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
        this.setParamSimple(map, prefix + "AttachedDiskCount", this.AttachedDiskCount);
        this.setParamSimple(map, prefix + "MaxAttachCount", this.MaxAttachCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

