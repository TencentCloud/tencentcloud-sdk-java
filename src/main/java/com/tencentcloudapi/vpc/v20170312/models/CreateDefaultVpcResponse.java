package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateDefaultVpcResponse  extends AbstractModel{


    /**
    * 默认VPC和子网ID
    */
    @SerializedName("Vpc")
    @Expose
    private DefaultVpcSubnet Vpc;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取默认VPC和子网ID
     * @return Vpc 默认VPC和子网ID
     */
    public DefaultVpcSubnet getVpc() {
        return this.Vpc;
    }

    /**
     * 设置默认VPC和子网ID
     * @param Vpc 默认VPC和子网ID
     */
    public void setVpc(DefaultVpcSubnet Vpc) {
        this.Vpc = Vpc;
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
        this.setParamObj(map, prefix + "Vpc.", this.Vpc);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

