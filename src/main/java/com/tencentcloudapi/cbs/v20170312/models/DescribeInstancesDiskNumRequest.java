package com.tencentcloudapi.cbs.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeInstancesDiskNumRequest  extends AbstractModel{


    /**
    * 云服务器实例ID，通过[DescribeInstances](/document/api/213/9388)接口查询。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;
    

    /**
     * 获取云服务器实例ID，通过[DescribeInstances](/document/api/213/9388)接口查询。
     * @return InstanceIds 云服务器实例ID，通过[DescribeInstances](/document/api/213/9388)接口查询。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置云服务器实例ID，通过[DescribeInstances](/document/api/213/9388)接口查询。
     * @param InstanceIds 云服务器实例ID，通过[DescribeInstances](/document/api/213/9388)接口查询。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

