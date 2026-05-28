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

public class CreateClusterVirtualNodePoolRequest extends AbstractModel {

    /**
    * <p>集群ID，通过DescribeClusters接口获取</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>节点池名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>安全组ID列表</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>子网ID列表</p>
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * <p>虚拟节点label</p>
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * <p>虚拟节点taint</p>
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * <p>节点列表</p>
    */
    @SerializedName("VirtualNodes")
    @Expose
    private VirtualNodeSpec [] VirtualNodes;

    /**
    * <p>删除保护开关，默认关闭</p>
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * <p>节点池操作系统：</p><ul><li>linux（默认）</li><li>windows</li></ul>
    */
    @SerializedName("OS")
    @Expose
    private String OS;

    /**
    * <p>子网资源分配策略，精确控制各子网之间的资源分配比例。</p>
    */
    @SerializedName("SubnetAllocationPolicy")
    @Expose
    private SubnetAllocationPolicy SubnetAllocationPolicy;

    /**
    * <p>AgentPlugin 安装配置。传入即表示需要安装（即使是空对象 {}）</p>
    */
    @SerializedName("AgentPlugin")
    @Expose
    private AgentPluginConfig AgentPlugin;

    /**
     * Get <p>集群ID，通过DescribeClusters接口获取</p> 
     * @return ClusterId <p>集群ID，通过DescribeClusters接口获取</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID，通过DescribeClusters接口获取</p>
     * @param ClusterId <p>集群ID，通过DescribeClusters接口获取</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>节点池名称</p> 
     * @return Name <p>节点池名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>节点池名称</p>
     * @param Name <p>节点池名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>安全组ID列表</p> 
     * @return SecurityGroupIds <p>安全组ID列表</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>安全组ID列表</p>
     * @param SecurityGroupIds <p>安全组ID列表</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>子网ID列表</p> 
     * @return SubnetIds <p>子网ID列表</p>
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set <p>子网ID列表</p>
     * @param SubnetIds <p>子网ID列表</p>
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get <p>虚拟节点label</p> 
     * @return Labels <p>虚拟节点label</p>
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>虚拟节点label</p>
     * @param Labels <p>虚拟节点label</p>
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>虚拟节点taint</p> 
     * @return Taints <p>虚拟节点taint</p>
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set <p>虚拟节点taint</p>
     * @param Taints <p>虚拟节点taint</p>
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get <p>节点列表</p> 
     * @return VirtualNodes <p>节点列表</p>
     */
    public VirtualNodeSpec [] getVirtualNodes() {
        return this.VirtualNodes;
    }

    /**
     * Set <p>节点列表</p>
     * @param VirtualNodes <p>节点列表</p>
     */
    public void setVirtualNodes(VirtualNodeSpec [] VirtualNodes) {
        this.VirtualNodes = VirtualNodes;
    }

    /**
     * Get <p>删除保护开关，默认关闭</p> 
     * @return DeletionProtection <p>删除保护开关，默认关闭</p>
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set <p>删除保护开关，默认关闭</p>
     * @param DeletionProtection <p>删除保护开关，默认关闭</p>
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get <p>节点池操作系统：</p><ul><li>linux（默认）</li><li>windows</li></ul> 
     * @return OS <p>节点池操作系统：</p><ul><li>linux（默认）</li><li>windows</li></ul>
     */
    public String getOS() {
        return this.OS;
    }

    /**
     * Set <p>节点池操作系统：</p><ul><li>linux（默认）</li><li>windows</li></ul>
     * @param OS <p>节点池操作系统：</p><ul><li>linux（默认）</li><li>windows</li></ul>
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Get <p>子网资源分配策略，精确控制各子网之间的资源分配比例。</p> 
     * @return SubnetAllocationPolicy <p>子网资源分配策略，精确控制各子网之间的资源分配比例。</p>
     */
    public SubnetAllocationPolicy getSubnetAllocationPolicy() {
        return this.SubnetAllocationPolicy;
    }

    /**
     * Set <p>子网资源分配策略，精确控制各子网之间的资源分配比例。</p>
     * @param SubnetAllocationPolicy <p>子网资源分配策略，精确控制各子网之间的资源分配比例。</p>
     */
    public void setSubnetAllocationPolicy(SubnetAllocationPolicy SubnetAllocationPolicy) {
        this.SubnetAllocationPolicy = SubnetAllocationPolicy;
    }

    /**
     * Get <p>AgentPlugin 安装配置。传入即表示需要安装（即使是空对象 {}）</p> 
     * @return AgentPlugin <p>AgentPlugin 安装配置。传入即表示需要安装（即使是空对象 {}）</p>
     */
    public AgentPluginConfig getAgentPlugin() {
        return this.AgentPlugin;
    }

    /**
     * Set <p>AgentPlugin 安装配置。传入即表示需要安装（即使是空对象 {}）</p>
     * @param AgentPlugin <p>AgentPlugin 安装配置。传入即表示需要安装（即使是空对象 {}）</p>
     */
    public void setAgentPlugin(AgentPluginConfig AgentPlugin) {
        this.AgentPlugin = AgentPlugin;
    }

    public CreateClusterVirtualNodePoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterVirtualNodePoolRequest(CreateClusterVirtualNodePoolRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
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
        if (source.VirtualNodes != null) {
            this.VirtualNodes = new VirtualNodeSpec[source.VirtualNodes.length];
            for (int i = 0; i < source.VirtualNodes.length; i++) {
                this.VirtualNodes[i] = new VirtualNodeSpec(source.VirtualNodes[i]);
            }
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.OS != null) {
            this.OS = new String(source.OS);
        }
        if (source.SubnetAllocationPolicy != null) {
            this.SubnetAllocationPolicy = new SubnetAllocationPolicy(source.SubnetAllocationPolicy);
        }
        if (source.AgentPlugin != null) {
            this.AgentPlugin = new AgentPluginConfig(source.AgentPlugin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamArrayObj(map, prefix + "VirtualNodes.", this.VirtualNodes);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "OS", this.OS);
        this.setParamObj(map, prefix + "SubnetAllocationPolicy.", this.SubnetAllocationPolicy);
        this.setParamObj(map, prefix + "AgentPlugin.", this.AgentPlugin);

    }
}

