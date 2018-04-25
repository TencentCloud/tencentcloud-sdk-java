package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class TerminateComputeNodeRequest  extends AbstractModel{


    /**
    * 计算环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;
    

    /**
    * 计算节点ID
    */
    @SerializedName("ComputeNodeId")
    @Expose
    private String ComputeNodeId;
    

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
     * 获取计算节点ID
     * @return ComputeNodeId 计算节点ID
     */
    public String getComputeNodeId() {
        return this.ComputeNodeId;
    }

    /**
     * 设置计算节点ID
     * @param ComputeNodeId 计算节点ID
     */
    public void setComputeNodeId(String ComputeNodeId) {
        this.ComputeNodeId = ComputeNodeId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ComputeNodeId", this.ComputeNodeId);

    }
}

