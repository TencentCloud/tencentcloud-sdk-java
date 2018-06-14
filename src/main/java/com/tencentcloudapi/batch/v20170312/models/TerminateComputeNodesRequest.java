package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class TerminateComputeNodesRequest  extends AbstractModel{


    /**
    * 计算环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 计算节点ID列表
    */
    @SerializedName("ComputeNodeIds")
    @Expose
    private String [] ComputeNodeIds;

    /**
     * 获取计算环境ID
     * @return EnvId 计算环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * 设置计算环境ID
     * @param EnvId 计算环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * 获取计算节点ID列表
     * @return ComputeNodeIds 计算节点ID列表
     */
    public String [] getComputeNodeIds() {
        return this.ComputeNodeIds;
    }

    /**
     * 设置计算节点ID列表
     * @param ComputeNodeIds 计算节点ID列表
     */
    public void setComputeNodeIds(String [] ComputeNodeIds) {
        this.ComputeNodeIds = ComputeNodeIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamArraySimple(map, prefix + "ComputeNodeIds.", this.ComputeNodeIds);

    }
}

