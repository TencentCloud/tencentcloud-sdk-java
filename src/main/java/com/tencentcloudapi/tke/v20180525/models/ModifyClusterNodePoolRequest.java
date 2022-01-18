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
    * 操作系统名称
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
    */
    @SerializedName("OsCustomizeType")
    @Expose
    private String OsCustomizeType;

    /**
    * 节点自定义参数
    */
    @SerializedName("ExtraArgs")
    @Expose
    private InstanceExtraArgs ExtraArgs;

    /**
    * 资源标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 设置加入的节点是否参与调度，默认值为0，表示参与调度；非0表示不参与调度, 待节点初始化完成之后, 可执行kubectl uncordon nodename使node加入调度.
    */
    @SerializedName("Unschedulable")
    @Expose
    private Long Unschedulable;

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
     * Get 操作系统名称 
     * @return OsName 操作系统名称
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 操作系统名称
     * @param OsName 操作系统名称
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值) 
     * @return OsCustomizeType 镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
     */
    public String getOsCustomizeType() {
        return this.OsCustomizeType;
    }

    /**
     * Set 镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
     * @param OsCustomizeType 镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
     */
    public void setOsCustomizeType(String OsCustomizeType) {
        this.OsCustomizeType = OsCustomizeType;
    }

    /**
     * Get 节点自定义参数 
     * @return ExtraArgs 节点自定义参数
     */
    public InstanceExtraArgs getExtraArgs() {
        return this.ExtraArgs;
    }

    /**
     * Set 节点自定义参数
     * @param ExtraArgs 节点自定义参数
     */
    public void setExtraArgs(InstanceExtraArgs ExtraArgs) {
        this.ExtraArgs = ExtraArgs;
    }

    /**
     * Get 资源标签 
     * @return Tags 资源标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 资源标签
     * @param Tags 资源标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 设置加入的节点是否参与调度，默认值为0，表示参与调度；非0表示不参与调度, 待节点初始化完成之后, 可执行kubectl uncordon nodename使node加入调度. 
     * @return Unschedulable 设置加入的节点是否参与调度，默认值为0，表示参与调度；非0表示不参与调度, 待节点初始化完成之后, 可执行kubectl uncordon nodename使node加入调度.
     */
    public Long getUnschedulable() {
        return this.Unschedulable;
    }

    /**
     * Set 设置加入的节点是否参与调度，默认值为0，表示参与调度；非0表示不参与调度, 待节点初始化完成之后, 可执行kubectl uncordon nodename使node加入调度.
     * @param Unschedulable 设置加入的节点是否参与调度，默认值为0，表示参与调度；非0表示不参与调度, 待节点初始化完成之后, 可执行kubectl uncordon nodename使node加入调度.
     */
    public void setUnschedulable(Long Unschedulable) {
        this.Unschedulable = Unschedulable;
    }

    public ModifyClusterNodePoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterNodePoolRequest(ModifyClusterNodePoolRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MaxNodesNum != null) {
            this.MaxNodesNum = new Long(source.MaxNodesNum);
        }
        if (source.MinNodesNum != null) {
            this.MinNodesNum = new Long(source.MinNodesNum);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.Taints != null) {
            this.Taints = new Taint[source.Taints.length];
            for (int i = 0; i < source.Taints.length; i++) {
                this.Taints[i] = new Taint(source.Taints[i]);
            }
        }
        if (source.EnableAutoscale != null) {
            this.EnableAutoscale = new Boolean(source.EnableAutoscale);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.OsCustomizeType != null) {
            this.OsCustomizeType = new String(source.OsCustomizeType);
        }
        if (source.ExtraArgs != null) {
            this.ExtraArgs = new InstanceExtraArgs(source.ExtraArgs);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Unschedulable != null) {
            this.Unschedulable = new Long(source.Unschedulable);
        }
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
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "OsCustomizeType", this.OsCustomizeType);
        this.setParamObj(map, prefix + "ExtraArgs.", this.ExtraArgs);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Unschedulable", this.Unschedulable);

    }
}

