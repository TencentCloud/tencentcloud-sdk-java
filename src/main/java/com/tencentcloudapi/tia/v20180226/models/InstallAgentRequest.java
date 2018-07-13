package com.tencentcloudapi.tia.v20180226.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class InstallAgentRequest  extends AbstractModel{


    /**
    * 集群名称
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * Agent版本, 用于私有集群的agent安装，默认为“private-training”
    */
    @SerializedName("TiaVersion")
    @Expose
    private String TiaVersion;

    /**
    * 是否允许更新Agent
    */
    @SerializedName("Update")
    @Expose
    private Boolean Update;

    /**
     * 获取集群名称
     * @return Cluster 集群名称
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * 设置集群名称
     * @param Cluster 集群名称
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * 获取Agent版本, 用于私有集群的agent安装，默认为“private-training”
     * @return TiaVersion Agent版本, 用于私有集群的agent安装，默认为“private-training”
     */
    public String getTiaVersion() {
        return this.TiaVersion;
    }

    /**
     * 设置Agent版本, 用于私有集群的agent安装，默认为“private-training”
     * @param TiaVersion Agent版本, 用于私有集群的agent安装，默认为“private-training”
     */
    public void setTiaVersion(String TiaVersion) {
        this.TiaVersion = TiaVersion;
    }

    /**
     * 获取是否允许更新Agent
     * @return Update 是否允许更新Agent
     */
    public Boolean getUpdate() {
        return this.Update;
    }

    /**
     * 设置是否允许更新Agent
     * @param Update 是否允许更新Agent
     */
    public void setUpdate(Boolean Update) {
        this.Update = Update;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "TiaVersion", this.TiaVersion);
        this.setParamSimple(map, prefix + "Update", this.Update);

    }
}

