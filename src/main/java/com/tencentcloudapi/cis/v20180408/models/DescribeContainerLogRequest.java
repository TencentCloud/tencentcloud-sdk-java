package com.tencentcloudapi.cis.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeContainerLogRequest  extends AbstractModel{


    /**
    * 容器实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;
    

    /**
    * 容器名称
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;
    

    /**
    * 日志显示尾部行数
    */
    @SerializedName("Tail")
    @Expose
    private Integer Tail;
    

    /**
    * 日志起始时间
    */
    @SerializedName("SinceTime")
    @Expose
    private String SinceTime;
    

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
     * 获取容器名称
     * @return ContainerName 容器名称
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * 设置容器名称
     * @param ContainerName 容器名称
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * 获取日志显示尾部行数
     * @return Tail 日志显示尾部行数
     */
    public Integer getTail() {
        return this.Tail;
    }

    /**
     * 设置日志显示尾部行数
     * @param Tail 日志显示尾部行数
     */
    public void setTail(Integer Tail) {
        this.Tail = Tail;
    }

    /**
     * 获取日志起始时间
     * @return SinceTime 日志起始时间
     */
    public String getSinceTime() {
        return this.SinceTime;
    }

    /**
     * 设置日志起始时间
     * @param SinceTime 日志起始时间
     */
    public void setSinceTime(String SinceTime) {
        this.SinceTime = SinceTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "Tail", this.Tail);
        this.setParamSimple(map, prefix + "SinceTime", this.SinceTime);

    }
}

