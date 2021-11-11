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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Cluster extends AbstractModel{

    /**
    * 集群Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 集群角色，取值范围：
- MASTER：控制面所在的主集群
- REMOTE：主集群管理的远端集群
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 私有网络Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网Id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 名称，只读
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 状态，只读
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 关联时间，只读
    */
    @SerializedName("LinkedTime")
    @Expose
    private String LinkedTime;

    /**
    * 集群配置
    */
    @SerializedName("Config")
    @Expose
    private ClusterConfig Config;

    /**
    * 详细状态，只读
    */
    @SerializedName("Status")
    @Expose
    private ClusterStatus Status;

    /**
    * 类型，取值范围：
- TKE
- EKS
    */
    @SerializedName("Type")
    @Expose
    private String Type;

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
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 集群角色，取值范围：
- MASTER：控制面所在的主集群
- REMOTE：主集群管理的远端集群 
     * @return Role 集群角色，取值范围：
- MASTER：控制面所在的主集群
- REMOTE：主集群管理的远端集群
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 集群角色，取值范围：
- MASTER：控制面所在的主集群
- REMOTE：主集群管理的远端集群
     * @param Role 集群角色，取值范围：
- MASTER：控制面所在的主集群
- REMOTE：主集群管理的远端集群
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 私有网络Id 
     * @return VpcId 私有网络Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络Id
     * @param VpcId 私有网络Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网Id 
     * @return SubnetId 子网Id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网Id
     * @param SubnetId 子网Id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 名称，只读 
     * @return DisplayName 名称，只读
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 名称，只读
     * @param DisplayName 名称，只读
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 状态，只读 
     * @return State 状态，只读
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态，只读
     * @param State 状态，只读
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 关联时间，只读 
     * @return LinkedTime 关联时间，只读
     */
    public String getLinkedTime() {
        return this.LinkedTime;
    }

    /**
     * Set 关联时间，只读
     * @param LinkedTime 关联时间，只读
     */
    public void setLinkedTime(String LinkedTime) {
        this.LinkedTime = LinkedTime;
    }

    /**
     * Get 集群配置 
     * @return Config 集群配置
     */
    public ClusterConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 集群配置
     * @param Config 集群配置
     */
    public void setConfig(ClusterConfig Config) {
        this.Config = Config;
    }

    /**
     * Get 详细状态，只读 
     * @return Status 详细状态，只读
     */
    public ClusterStatus getStatus() {
        return this.Status;
    }

    /**
     * Set 详细状态，只读
     * @param Status 详细状态，只读
     */
    public void setStatus(ClusterStatus Status) {
        this.Status = Status;
    }

    /**
     * Get 类型，取值范围：
- TKE
- EKS 
     * @return Type 类型，取值范围：
- TKE
- EKS
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，取值范围：
- TKE
- EKS
     * @param Type 类型，取值范围：
- TKE
- EKS
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public Cluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Cluster(Cluster source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.LinkedTime != null) {
            this.LinkedTime = new String(source.LinkedTime);
        }
        if (source.Config != null) {
            this.Config = new ClusterConfig(source.Config);
        }
        if (source.Status != null) {
            this.Status = new ClusterStatus(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "LinkedTime", this.LinkedTime);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamObj(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

