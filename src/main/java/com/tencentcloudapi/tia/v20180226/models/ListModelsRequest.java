package com.tencentcloudapi.tia.v20180226.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ListModelsRequest  extends AbstractModel{


    /**
    * 部署模型的集群
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 分页参数，返回数量
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 分页参数，起始位置
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
     * 获取部署模型的集群
     * @return Cluster 部署模型的集群
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * 设置部署模型的集群
     * @param Cluster 部署模型的集群
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * 获取分页参数，返回数量
     * @return Limit 分页参数，返回数量
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置分页参数，返回数量
     * @param Limit 分页参数，返回数量
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取分页参数，起始位置
     * @return Offset 分页参数，起始位置
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置分页参数，起始位置
     * @param Offset 分页参数，起始位置
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

