package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeImageSharePermissionResponse  extends AbstractModel{


    /**
    * 镜像共享信息
    */
    @SerializedName("SharePermissionSet")
    @Expose
    private SharePermission [] SharePermissionSet;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取镜像共享信息
     * @return SharePermissionSet 镜像共享信息
     */
    public SharePermission [] getSharePermissionSet() {
        return this.SharePermissionSet;
    }

    /**
     * 设置镜像共享信息
     * @param SharePermissionSet 镜像共享信息
     */
    public void setSharePermissionSet(SharePermission [] SharePermissionSet) {
        this.SharePermissionSet = SharePermissionSet;
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
        this.setParamArrayObj(map, prefix + "SharePermissionSet.", this.SharePermissionSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

