package com.tencentcloudapi.cis.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeContainerInstanceEventsRequest  extends AbstractModel{


    /**
    * 容器实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * 获取容器实例名称
     * @return InstanceName 容器实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置容器实例名称
     * @param InstanceName 容器实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

