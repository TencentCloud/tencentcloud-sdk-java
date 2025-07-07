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
    * 集群ID，通过DescribeClusters接口获取
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 节点池ID，通过DescribeNodePools接口获取
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * 节点池名称，必须修改至少一个参数
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 安全组ID列表，必须修改至少一个参数
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 虚拟节点label，必须修改至少一个参数
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * 虚拟节点taint，必须修改至少一个参数
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * 删除保护开关，必须修改至少一个参数
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
     * Get 集群ID，通过DescribeClusters接口获取 
     * @return ClusterId 集群ID，通过DescribeClusters接口获取
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID，通过DescribeClusters接口获取
     * @param ClusterId 集群ID，通过DescribeClusters接口获取
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 节点池ID，通过DescribeNodePools接口获取 
     * @return NodePoolId 节点池ID，通过DescribeNodePools接口获取
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set 节点池ID，通过DescribeNodePools接口获取
     * @param NodePoolId 节点池ID，通过DescribeNodePools接口获取
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get 节点池名称，必须修改至少一个参数 
     * @return Name 节点池名称，必须修改至少一个参数
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 节点池名称，必须修改至少一个参数
     * @param Name 节点池名称，必须修改至少一个参数
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 安全组ID列表，必须修改至少一个参数 
     * @return SecurityGroupIds 安全组ID列表，必须修改至少一个参数
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组ID列表，必须修改至少一个参数
     * @param SecurityGroupIds 安全组ID列表，必须修改至少一个参数
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 虚拟节点label，必须修改至少一个参数 
     * @return Labels 虚拟节点label，必须修改至少一个参数
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 虚拟节点label，必须修改至少一个参数
     * @param Labels 虚拟节点label，必须修改至少一个参数
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 虚拟节点taint，必须修改至少一个参数 
     * @return Taints 虚拟节点taint，必须修改至少一个参数
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set 虚拟节点taint，必须修改至少一个参数
     * @param Taints 虚拟节点taint，必须修改至少一个参数
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get 删除保护开关，必须修改至少一个参数 
     * @return DeletionProtection 删除保护开关，必须修改至少一个参数
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set 删除保护开关，必须修改至少一个参数
     * @param DeletionProtection 删除保护开关，必须修改至少一个参数
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
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

    }
}

