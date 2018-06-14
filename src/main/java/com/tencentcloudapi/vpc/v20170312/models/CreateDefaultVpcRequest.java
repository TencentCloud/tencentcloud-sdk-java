package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateDefaultVpcRequest  extends AbstractModel{


    /**
    * 子网所在的可用区ID，不指定将随机选择可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 是否强制返回默认VPC
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * 获取子网所在的可用区ID，不指定将随机选择可用区
     * @return Zone 子网所在的可用区ID，不指定将随机选择可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置子网所在的可用区ID，不指定将随机选择可用区
     * @param Zone 子网所在的可用区ID，不指定将随机选择可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取是否强制返回默认VPC
     * @return Force 是否强制返回默认VPC
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * 设置是否强制返回默认VPC
     * @param Force 是否强制返回默认VPC
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

