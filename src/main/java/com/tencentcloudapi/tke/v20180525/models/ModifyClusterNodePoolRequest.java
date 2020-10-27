/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterNodePoolRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 节点池ID
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 最大节点数
    */
    @SerializedName("MaxNodesNum")
    @Expose
    private Long MaxNodesNum;

    /**
    * 最小节点数
    */
    @SerializedName("MinNodesNum")
    @Expose
    private Long MinNodesNum;

    /**
    * 标签
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * 污点
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * 是否开启伸缩
    */
    @SerializedName("EnableAutoscale")
    @Expose
    private Boolean EnableAutoscale;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 节点池ID 
     * @return NodePoolId 节点池ID
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set 节点池ID
     * @param NodePoolId 节点池ID
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 最大节点数 
     * @return MaxNodesNum 最大节点数
     */
    public Long getMaxNodesNum() {
        return this.MaxNodesNum;
    }

    /**
     * Set 最大节点数
     * @param MaxNodesNum 最大节点数
     */
    public void setMaxNodesNum(Long MaxNodesNum) {
        this.MaxNodesNum = MaxNodesNum;
    }

    /**
     * Get 最小节点数 
     * @return MinNodesNum 最小节点数
     */
    public Long getMinNodesNum() {
        return this.MinNodesNum;
    }

    /**
     * Set 最小节点数
     * @param MinNodesNum 最小节点数
     */
    public void setMinNodesNum(Long MinNodesNum) {
        this.MinNodesNum = MinNodesNum;
    }

    /**
     * Get 标签 
     * @return Labels 标签
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 标签
     * @param Labels 标签
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 污点 
     * @return Taints 污点
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set 污点
     * @param Taints 污点
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get 是否开启伸缩 
     * @return EnableAutoscale 是否开启伸缩
     */
    public Boolean getEnableAutoscale() {
        return this.EnableAutoscale;
    }

    /**
     * Set 是否开启伸缩
     * @param EnableAutoscale 是否开启伸缩
     */
    public void setEnableAutoscale(Boolean EnableAutoscale) {
        this.EnableAutoscale = EnableAutoscale;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MaxNodesNum", this.MaxNodesNum);
        this.setParamSimple(map, prefix + "MinNodesNum", this.MinNodesNum);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamSimple(map, prefix + "EnableAutoscale", this.EnableAutoscale);

    }
}

