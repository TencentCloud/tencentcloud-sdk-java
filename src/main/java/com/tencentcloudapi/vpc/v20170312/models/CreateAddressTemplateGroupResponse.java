package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateAddressTemplateGroupResponse  extends AbstractModel{


    /**
    * IP地址模板集合对象。
    */
    @SerializedName("AddressTemplateGroup")
    @Expose
    private AddressTemplateGroup AddressTemplateGroup;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取IP地址模板集合对象。
     * @return AddressTemplateGroup IP地址模板集合对象。
     */
    public AddressTemplateGroup getAddressTemplateGroup() {
        return this.AddressTemplateGroup;
    }

    /**
     * 设置IP地址模板集合对象。
     * @param AddressTemplateGroup IP地址模板集合对象。
     */
    public void setAddressTemplateGroup(AddressTemplateGroup AddressTemplateGroup) {
        this.AddressTemplateGroup = AddressTemplateGroup;
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
        this.setParamObj(map, prefix + "AddressTemplateGroup.", this.AddressTemplateGroup);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

