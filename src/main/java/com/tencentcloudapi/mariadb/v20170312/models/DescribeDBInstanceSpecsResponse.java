package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBInstanceSpecsResponse  extends AbstractModel{


    /**
    * 按机型分类的可售卖规格列表
    */
    @SerializedName("Specs")
    @Expose
    private InstanceSpec [] Specs;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取按机型分类的可售卖规格列表
     * @return Specs 按机型分类的可售卖规格列表
     */
    public InstanceSpec [] getSpecs() {
        return this.Specs;
    }

    /**
     * 设置按机型分类的可售卖规格列表
     * @param Specs 按机型分类的可售卖规格列表
     */
    public void setSpecs(InstanceSpec [] Specs) {
        this.Specs = Specs;
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
        this.setParamArrayObj(map, prefix + "Specs.", this.Specs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

