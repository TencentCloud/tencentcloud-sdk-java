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
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>节点池ID</p>
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * <p>名称，最长63个字符，只能包含小写字母、数字及分隔符“_”，且必须以小写字母开头，数字或小写字母结尾</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>最大节点数</p>
    */
    @SerializedName("MaxNodesNum")
    @Expose
    private Long MaxNodesNum;

    /**
    * <p>最小节点数</p>
    */
    @SerializedName("MinNodesNum")
    @Expose
    private Long MinNodesNum;

    /**
    * <p>标签</p>
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * <p>污点</p>
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * <p>节点 Annotation 列表</p>
    */
    @SerializedName("Annotations")
    @Expose
    private AnnotationValue [] Annotations;

    /**
    * <p>是否开启伸缩</p>
    */
    @SerializedName("EnableAutoscale")
    @Expose
    private Boolean EnableAutoscale;

    /**
    * <p>操作系统名称</p>
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * <p>镜像版本，&quot;DOCKER_CUSTOMIZE&quot;(容器定制版),&quot;GENERAL&quot;(普通版本，默认值)</p>
    */
    @SerializedName("OsCustomizeType")
    @Expose
    private String OsCustomizeType;

    /**
    * <p>GPU驱动版本，CUDA版本，cuDNN版本以及是否启用MIG特性</p>
    */
    @SerializedName("GPUArgs")
    @Expose
    private GPUArgs GPUArgs;

    /**
    * <p>base64编码后的自定义脚本</p>
    */
    @SerializedName("UserScript")
    @Expose
    private String UserScript;

    /**
    * <p>更新label和taint时忽略存量节点</p>
    */
    @SerializedName("IgnoreExistedNode")
    @Expose
    private Boolean IgnoreExistedNode;

    /**
    * <p>节点自定义参数</p>
    */
    @SerializedName("ExtraArgs")
    @Expose
    private InstanceExtraArgs ExtraArgs;

    /**
    * <p>资源标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>设置加入的节点是否参与调度，默认值为0，表示参与调度；非0表示不参与调度, 待节点初始化完成之后, 可执行kubectl uncordon nodename使node加入调度.</p>
    */
    @SerializedName("Unschedulable")
    @Expose
    private Long Unschedulable;

    /**
    * <p>删除保护开关</p>
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * <p>dockerd --graph 指定值, 默认为 /var/lib/docker</p>
    */
    @SerializedName("DockerGraphPath")
    @Expose
    private String DockerGraphPath;

    /**
    * <p>base64编码后的自定义脚本</p>
    */
    @SerializedName("PreStartUserScript")
    @Expose
    private String PreStartUserScript;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>节点池ID</p> 
     * @return NodePoolId <p>节点池ID</p>
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set <p>节点池ID</p>
     * @param NodePoolId <p>节点池ID</p>
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get <p>名称，最长63个字符，只能包含小写字母、数字及分隔符“_”，且必须以小写字母开头，数字或小写字母结尾</p> 
     * @return Name <p>名称，最长63个字符，只能包含小写字母、数字及分隔符“_”，且必须以小写字母开头，数字或小写字母结尾</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称，最长63个字符，只能包含小写字母、数字及分隔符“_”，且必须以小写字母开头，数字或小写字母结尾</p>
     * @param Name <p>名称，最长63个字符，只能包含小写字母、数字及分隔符“_”，且必须以小写字母开头，数字或小写字母结尾</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>最大节点数</p> 
     * @return MaxNodesNum <p>最大节点数</p>
     */
    public Long getMaxNodesNum() {
        return this.MaxNodesNum;
    }

    /**
     * Set <p>最大节点数</p>
     * @param MaxNodesNum <p>最大节点数</p>
     */
    public void setMaxNodesNum(Long MaxNodesNum) {
        this.MaxNodesNum = MaxNodesNum;
    }

    /**
     * Get <p>最小节点数</p> 
     * @return MinNodesNum <p>最小节点数</p>
     */
    public Long getMinNodesNum() {
        return this.MinNodesNum;
    }

    /**
     * Set <p>最小节点数</p>
     * @param MinNodesNum <p>最小节点数</p>
     */
    public void setMinNodesNum(Long MinNodesNum) {
        this.MinNodesNum = MinNodesNum;
    }

    /**
     * Get <p>标签</p> 
     * @return Labels <p>标签</p>
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>标签</p>
     * @param Labels <p>标签</p>
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>污点</p> 
     * @return Taints <p>污点</p>
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set <p>污点</p>
     * @param Taints <p>污点</p>
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get <p>节点 Annotation 列表</p> 
     * @return Annotations <p>节点 Annotation 列表</p>
     */
    public AnnotationValue [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set <p>节点 Annotation 列表</p>
     * @param Annotations <p>节点 Annotation 列表</p>
     */
    public void setAnnotations(AnnotationValue [] Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get <p>是否开启伸缩</p> 
     * @return EnableAutoscale <p>是否开启伸缩</p>
     */
    public Boolean getEnableAutoscale() {
        return this.EnableAutoscale;
    }

    /**
     * Set <p>是否开启伸缩</p>
     * @param EnableAutoscale <p>是否开启伸缩</p>
     */
    public void setEnableAutoscale(Boolean EnableAutoscale) {
        this.EnableAutoscale = EnableAutoscale;
    }

    /**
     * Get <p>操作系统名称</p> 
     * @return OsName <p>操作系统名称</p>
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set <p>操作系统名称</p>
     * @param OsName <p>操作系统名称</p>
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get <p>镜像版本，&quot;DOCKER_CUSTOMIZE&quot;(容器定制版),&quot;GENERAL&quot;(普通版本，默认值)</p> 
     * @return OsCustomizeType <p>镜像版本，&quot;DOCKER_CUSTOMIZE&quot;(容器定制版),&quot;GENERAL&quot;(普通版本，默认值)</p>
     */
    public String getOsCustomizeType() {
        return this.OsCustomizeType;
    }

    /**
     * Set <p>镜像版本，&quot;DOCKER_CUSTOMIZE&quot;(容器定制版),&quot;GENERAL&quot;(普通版本，默认值)</p>
     * @param OsCustomizeType <p>镜像版本，&quot;DOCKER_CUSTOMIZE&quot;(容器定制版),&quot;GENERAL&quot;(普通版本，默认值)</p>
     */
    public void setOsCustomizeType(String OsCustomizeType) {
        this.OsCustomizeType = OsCustomizeType;
    }

    /**
     * Get <p>GPU驱动版本，CUDA版本，cuDNN版本以及是否启用MIG特性</p> 
     * @return GPUArgs <p>GPU驱动版本，CUDA版本，cuDNN版本以及是否启用MIG特性</p>
     */
    public GPUArgs getGPUArgs() {
        return this.GPUArgs;
    }

    /**
     * Set <p>GPU驱动版本，CUDA版本，cuDNN版本以及是否启用MIG特性</p>
     * @param GPUArgs <p>GPU驱动版本，CUDA版本，cuDNN版本以及是否启用MIG特性</p>
     */
    public void setGPUArgs(GPUArgs GPUArgs) {
        this.GPUArgs = GPUArgs;
    }

    /**
     * Get <p>base64编码后的自定义脚本</p> 
     * @return UserScript <p>base64编码后的自定义脚本</p>
     */
    public String getUserScript() {
        return this.UserScript;
    }

    /**
     * Set <p>base64编码后的自定义脚本</p>
     * @param UserScript <p>base64编码后的自定义脚本</p>
     */
    public void setUserScript(String UserScript) {
        this.UserScript = UserScript;
    }

    /**
     * Get <p>更新label和taint时忽略存量节点</p> 
     * @return IgnoreExistedNode <p>更新label和taint时忽略存量节点</p>
     */
    public Boolean getIgnoreExistedNode() {
        return this.IgnoreExistedNode;
    }

    /**
     * Set <p>更新label和taint时忽略存量节点</p>
     * @param IgnoreExistedNode <p>更新label和taint时忽略存量节点</p>
     */
    public void setIgnoreExistedNode(Boolean IgnoreExistedNode) {
        this.IgnoreExistedNode = IgnoreExistedNode;
    }

    /**
     * Get <p>节点自定义参数</p> 
     * @return ExtraArgs <p>节点自定义参数</p>
     */
    public InstanceExtraArgs getExtraArgs() {
        return this.ExtraArgs;
    }

    /**
     * Set <p>节点自定义参数</p>
     * @param ExtraArgs <p>节点自定义参数</p>
     */
    public void setExtraArgs(InstanceExtraArgs ExtraArgs) {
        this.ExtraArgs = ExtraArgs;
    }

    /**
     * Get <p>资源标签</p> 
     * @return Tags <p>资源标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>资源标签</p>
     * @param Tags <p>资源标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>设置加入的节点是否参与调度，默认值为0，表示参与调度；非0表示不参与调度, 待节点初始化完成之后, 可执行kubectl uncordon nodename使node加入调度.</p> 
     * @return Unschedulable <p>设置加入的节点是否参与调度，默认值为0，表示参与调度；非0表示不参与调度, 待节点初始化完成之后, 可执行kubectl uncordon nodename使node加入调度.</p>
     */
    public Long getUnschedulable() {
        return this.Unschedulable;
    }

    /**
     * Set <p>设置加入的节点是否参与调度，默认值为0，表示参与调度；非0表示不参与调度, 待节点初始化完成之后, 可执行kubectl uncordon nodename使node加入调度.</p>
     * @param Unschedulable <p>设置加入的节点是否参与调度，默认值为0，表示参与调度；非0表示不参与调度, 待节点初始化完成之后, 可执行kubectl uncordon nodename使node加入调度.</p>
     */
    public void setUnschedulable(Long Unschedulable) {
        this.Unschedulable = Unschedulable;
    }

    /**
     * Get <p>删除保护开关</p> 
     * @return DeletionProtection <p>删除保护开关</p>
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set <p>删除保护开关</p>
     * @param DeletionProtection <p>删除保护开关</p>
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get <p>dockerd --graph 指定值, 默认为 /var/lib/docker</p> 
     * @return DockerGraphPath <p>dockerd --graph 指定值, 默认为 /var/lib/docker</p>
     */
    public String getDockerGraphPath() {
        return this.DockerGraphPath;
    }

    /**
     * Set <p>dockerd --graph 指定值, 默认为 /var/lib/docker</p>
     * @param DockerGraphPath <p>dockerd --graph 指定值, 默认为 /var/lib/docker</p>
     */
    public void setDockerGraphPath(String DockerGraphPath) {
        this.DockerGraphPath = DockerGraphPath;
    }

    /**
     * Get <p>base64编码后的自定义脚本</p> 
     * @return PreStartUserScript <p>base64编码后的自定义脚本</p>
     */
    public String getPreStartUserScript() {
        return this.PreStartUserScript;
    }

    /**
     * Set <p>base64编码后的自定义脚本</p>
     * @param PreStartUserScript <p>base64编码后的自定义脚本</p>
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

