package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeImageQuotaResponse  extends AbstractModel{


    /**
    * 账户的镜像配额
    */
    @SerializedName("ImageNumQuota")
    @Expose
    private Integer ImageNumQuota;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取账户的镜像配额
     * @return ImageNumQuota 账户的镜像配额
     */
    public Integer getImageNumQuota() {
        return this.ImageNumQuota;
    }

    /**
     * 设置账户的镜像配额
     * @param ImageNumQuota 账户的镜像配额
     */
    public void setImageNumQuota(Integer ImageNumQuota) {
        this.ImageNumQuota = ImageNumQuota;
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
        this.setParamSimple(map, prefix + "ImageNumQuota", this.ImageNumQuota);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

