package com.tencentcloudapi.tia.v20180226.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteModelRequest  extends AbstractModel{


    /**
    * 要删除的模型名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 要删除的模型所在的集群名称
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
     * 获取要删除的模型名称
     * @return Name 要删除的模型名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置要删除的模型名称
     * @param Name 要删除的模型名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取要删除的模型所在的集群名称
     * @return Cluster 要删除的模型所在的集群名称
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * 设置要删除的模型所在的集群名称
     * @param Cluster 要删除的模型所在的集群名称
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);

    }
}

