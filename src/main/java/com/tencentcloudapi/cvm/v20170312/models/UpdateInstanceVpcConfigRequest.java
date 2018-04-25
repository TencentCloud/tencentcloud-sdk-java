package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class UpdateInstanceVpcConfigRequest  extends AbstractModel{


    /**
    * 待操作的实例ID。可通过[`DescribeInstances`](document/api/213/9388)接口返回值中的`InstanceId`获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
    * 私有网络相关信息配置。通过该参数指定私有网络的ID，子网ID，私有网络ip等信息。
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;
    

    /**
    * 是否对运行中的实例选择强制关机。默认为TRUE。
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;
    

    /**
     * 获取待操作的实例ID。可通过[`DescribeInstances`](document/api/213/9388)接口返回值中的`InstanceId`获取。
     * @return InstanceId 待操作的实例ID。可通过[`DescribeInstances`](document/api/213/9388)接口返回值中的`InstanceId`获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置待操作的实例ID。可通过[`DescribeInstances`](document/api/213/9388)接口返回值中的`InstanceId`获取。
     * @param InstanceId 待操作的实例ID。可通过[`DescribeInstances`](document/api/213/9388)接口返回值中的`InstanceId`获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取私有网络相关信息配置。通过该参数指定私有网络的ID，子网ID，私有网络ip等信息。
     * @return VirtualPrivateCloud 私有网络相关信息配置。通过该参数指定私有网络的ID，子网ID，私有网络ip等信息。
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * 设置私有网络相关信息配置。通过该参数指定私有网络的ID，子网ID，私有网络ip等信息。
     * @param VirtualPrivateCloud 私有网络相关信息配置。通过该参数指定私有网络的ID，子网ID，私有网络ip等信息。
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * 获取是否对运行中的实例选择强制关机。默认为TRUE。
     * @return ForceStop 是否对运行中的实例选择强制关机。默认为TRUE。
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * 设置是否对运行中的实例选择强制关机。默认为TRUE。
     * @param ForceStop 是否对运行中的实例选择强制关机。默认为TRUE。
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);

    }
}

