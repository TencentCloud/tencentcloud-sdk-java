/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterNodePoolRequest extends AbstractModel {

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
    * 节点 Annotation 列表
    */
    @SerializedName("Annotations")
    @Expose
    private AnnotationValue [] Annotations;

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
    * GPU驱动版本，CUDA版本，cuDNN版本以及是否启用MIG特性
    */
    @SerializedName("GPUArgs")
    @Expose
    private GPUArgs GPUArgs;

    /**
    * base64编码后的自定义脚本
    */
    @SerializedName("UserScript")
    @Expose
    private String UserScript;

    /**
    * 更新label和taint时忽略存量节点
    */
    @SerializedName("IgnoreExistedNode")
    @Expose
    private Boolean IgnoreExistedNode;

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
    * 删除保护开关
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * dockerd --graph 指定值, 默认为 /var/lib/docker
    */
    @SerializedName("DockerGraphPath")
    @Expose
    private String DockerGraphPath;

    /**
    * base64编码后的自定义脚本
    */
    @SerializedName("PreStartUserScript")
    @Expose
    private String PreStartUserScript;

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
     * Get 节点 Annotation 列表 
     * @return Annotations 节点 Annotation 列表
     */
    public AnnotationValue [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set 节点 Annotation 列表
     * @param Annotations 节点 Annotation 列表
     */
    public void setAnnotations(AnnotationValue [] Annotations) {
        this.Annotations = Annotations;
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
     * Get GPU驱动版本，CUDA版本，cuDNN版本以及是否启用MIG特性 
     * @return GPUArgs GPU驱动版本，CUDA版本，cuDNN版本以及是否启用MIG特性
     */
    public GPUArgs getGPUArgs() {
        return this.GPUArgs;
    }

    /**
     * Set GPU驱动版本，CUDA版本，cuDNN版本以及是否启用MIG特性
     * @param GPUArgs GPU驱动版本，CUDA版本，cuDNN版本以及是否启用MIG特性
     */
    public void setGPUArgs(GPUArgs GPUArgs) {
        this.GPUArgs = GPUArgs;
    }

    /**
     * Get base64编码后的自定义脚本 
     * @return UserScript base64编码后的自定义脚本
     */
    public String getUserScript() {
        return this.UserScript;
    }

    /**
     * Set base64编码后的自定义脚本
     * @param UserScript base64编码后的自定义脚本
     */
    public void setUserScript(String UserScript) {
        this.UserScript = UserScript;
    }

    /**
     * Get 更新label和taint时忽略存量节点 
     * @return IgnoreExistedNode 更新label和taint时忽略存量节点
     */
    public Boolean getIgnoreExistedNode() {
        return this.IgnoreExistedNode;
    }

    /**
     * Set 更新label和taint时忽略存量节点
     * @param IgnoreExistedNode 更新label和taint时忽略存量节点
     */
    public void setIgnoreExistedNode(Boolean IgnoreExistedNode) {
        this.IgnoreExistedNode = IgnoreExistedNode;
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

    /**
     * Get 删除保护开关 
     * @return DeletionProtection 删除保护开关
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set 删除保护开关
     * @param DeletionProtection 删除保护开关
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get dockerd --graph 指定值, 默认为 /var/lib/docker 
     * @return DockerGraphPath dockerd --graph 指定值, 默认为 /var/lib/docker
     */
    public String getDockerGraphPath() {
        return this.DockerGraphPath;
    }

    /**
     * Set dockerd --graph 指定值, 默认为 /var/lib/docker
     * @param DockerGraphPath dockerd --graph 指定值, 默认为 /var/lib/docker
     */
    public void setDockerGraphPath(String DockerGraphPath) {
        this.DockerGraphPath = DockerGraphPath;
    }

    /**
     * Get base64编码后的自定义脚本 
     * @return PreStartUserScript base64编码后的自定义脚本
     */
    public String getPreStartUserScript() {
        return this.PreStartUserScript;
    }

    /**
     * Set base64编码后的自定义脚本
     * @param PreStartUserScript base64编码后的自定义脚本
     */
    public void setPreStartUserScript(String PreStartUserScript) {
        this.PreStartUserScript = PreStartUserScript;
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
        if (source.Annotations != null) {
            this.Annotations = new AnnotationValue[source.Annotations.length];
            for (int i = 0; i < source.Annotations.length; i++) {
                this.Annotations[i] = new AnnotationValue(source.Annotations[i]);
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
        if (source.GPUArgs != null) {
            this.GPUArgs = new GPUArgs(source.GPUArgs);
        }
        if (source.UserScript != null) {
            this.UserScript = new String(source.UserScript);
        }
        if (source.IgnoreExistedNode != null) {
            this.IgnoreExistedNode = new Boolean(source.IgnoreExistedNode);
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
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.DockerGraphPath != null) {
            this.DockerGraphPath = new String(source.DockerGraphPath);
        }
        if (source.PreStartUserScript != null) {
            this.PreStartUserScript = new String(source.PreStartUserScript);
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
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);
        this.setParamSimple(map, prefix + "EnableAutoscale", this.EnableAutoscale);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "OsCustomizeType", this.OsCustomizeType);
        this.setParamObj(map, prefix + "GPUArgs.", this.GPUArgs);
        this.setParamSimple(map, prefix + "UserScript", this.UserScript);
        this.setParamSimple(map, prefix + "IgnoreExistedNode", this.IgnoreExistedNode);
        this.setParamObj(map, prefix + "ExtraArgs.", this.ExtraArgs);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Unschedulable", this.Unschedulable);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "DockerGraphPath", this.DockerGraphPath);
        this.setParamSimple(map, prefix + "PreStartUserScript", this.PreStartUserScript);

    }
}

