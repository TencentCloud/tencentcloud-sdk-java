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

public class CreateClusterVirtualNodePoolRequest extends AbstractModel{

    /**
    * 集群Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 节点池名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 子网ID列表
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 安全组ID列表
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 虚拟节点label
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * 虚拟节点taint
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * 节点列表
    */
    @SerializedName("VirtualNodes")
    @Expose
    private VirtualNodeSpec [] VirtualNodes;

    /**
    * 删除保护开关
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * 节点池操作系统：
- linux（默认）
- windows
    */
    @SerializedName("OS")
    @Expose
    private String OS;

    /**
     * Get 集群Id 
     * @return ClusterId 集群Id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群Id
     * @param ClusterId 集群Id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 节点池名称 
     * @return Name 节点池名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 节点池名称
     * @param Name 节点池名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 子网ID列表 
     * @return SubnetIds 子网ID列表
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网ID列表
     * @param SubnetIds 子网ID列表
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 安全组ID列表 
     * @return SecurityGroupIds 安全组ID列表
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组ID列表
     * @param SecurityGroupIds 安全组ID列表
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 虚拟节点label 
     * @return Labels 虚拟节点label
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 虚拟节点label
     * @param Labels 虚拟节点label
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 虚拟节点taint 
     * @return Taints 虚拟节点taint
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set 虚拟节点taint
     * @param Taints 虚拟节点taint
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get 节点列表 
     * @return VirtualNodes 节点列表
     */
    public VirtualNodeSpec [] getVirtualNodes() {
        return this.VirtualNodes;
    }

    /**
     * Set 节点列表
     * @param VirtualNodes 节点列表
     */
    public void setVirtualNodes(VirtualNodeSpec [] VirtualNodes) {
        this.VirtualNodes = VirtualNodes;
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
     * Get 节点池操作系统：
- linux（默认）
- windows 
     * @return OS 节点池操作系统：
- linux（默认）
- windows
     */
    public String getOS() {
        return this.OS;
    }

    /**
     * Set 节点池操作系统：
- linux（默认）
- windows
     * @param OS 节点池操作系统：
- linux（默认）
- windows
     */
    public void setOS(String OS) {
        this.OS = OS;
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
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamArrayObj(map, prefix + "VirtualNodes.", this.VirtualNodes);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "OS", this.OS);

    }
}

