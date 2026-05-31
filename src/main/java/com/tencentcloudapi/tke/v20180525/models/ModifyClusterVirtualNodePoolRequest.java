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

public class ModifyClusterVirtualNodePoolRequest extends AbstractModel {

    /**
    * <p>集群ID，通过DescribeClusters接口获取</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>节点池ID，通过DescribeNodePools接口获取</p>
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * <p>节点池名称，必须修改至少一个参数</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>安全组ID列表，必须修改至少一个参数</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>虚拟节点label，必须修改至少一个参数</p>
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * <p>虚拟节点taint，必须修改至少一个参数</p>
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * <p>删除保护开关，必须修改至少一个参数</p>
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * <p>子网分配策略</p>
    */
    @SerializedName("SubnetAllocationPolicy")
    @Expose
    private SubnetAllocationPolicy SubnetAllocationPolicy;

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
     * Get <p>节点池ID，通过DescribeNodePools接口获取</p> 
     * @return NodePoolId <p>节点池ID，通过DescribeNodePools接口获取</p>
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set <p>节点池ID，通过DescribeNodePools接口获取</p>
     * @param NodePoolId <p>节点池ID，通过DescribeNodePools接口获取</p>
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get <p>节点池名称，必须修改至少一个参数</p> 
     * @return Name <p>节点池名称，必须修改至少一个参数</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>节点池名称，必须修改至少一个参数</p>
     * @param Name <p>节点池名称，必须修改至少一个参数</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>安全组ID列表，必须修改至少一个参数</p> 
     * @return SecurityGroupIds <p>安全组ID列表，必须修改至少一个参数</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>安全组ID列表，必须修改至少一个参数</p>
     * @param SecurityGroupIds <p>安全组ID列表，必须修改至少一个参数</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>虚拟节点label，必须修改至少一个参数</p> 
     * @return Labels <p>虚拟节点label，必须修改至少一个参数</p>
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>虚拟节点label，必须修改至少一个参数</p>
     * @param Labels <p>虚拟节点label，必须修改至少一个参数</p>
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>虚拟节点taint，必须修改至少一个参数</p> 
     * @return Taints <p>虚拟节点taint，必须修改至少一个参数</p>
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set <p>虚拟节点taint，必须修改至少一个参数</p>
     * @param Taints <p>虚拟节点taint，必须修改至少一个参数</p>
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get <p>删除保护开关，必须修改至少一个参数</p> 
     * @return DeletionProtection <p>删除保护开关，必须修改至少一个参数</p>
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set <p>删除保护开关，必须修改至少一个参数</p>
     * @param DeletionProtection <p>删除保护开关，必须修改至少一个参数</p>
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get <p>子网分配策略</p> 
     * @return SubnetAllocationPolicy <p>子网分配策略</p>
     */
    public SubnetAllocationPolicy getSubnetAllocationPolicy() {
        return this.SubnetAllocationPolicy;
    }

    /**
     * Set <p>子网分配策略</p>
     * @param SubnetAllocationPolicy <p>子网分配策略</p>
     */
    public void setSubnetAllocationPolicy(SubnetAllocationPolicy SubnetAllocationPolicy) {
        this.SubnetAllocationPolicy = SubnetAllocationPolicy;
    }

    public ModifyClusterVirtualNodePoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterVirtualNodePoolRequest(ModifyClusterVirtualNodePoolRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
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
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.SubnetAllocationPolicy != null) {
            this.SubnetAllocationPolicy = new SubnetAllocationPolicy(source.SubnetAllocationPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamObj(map, prefix + "SubnetAllocationPolicy.", this.SubnetAllocationPolicy);

    }
}

