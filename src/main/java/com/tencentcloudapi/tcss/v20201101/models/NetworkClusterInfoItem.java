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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkClusterInfoItem extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名字
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群版本
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * 集群操作系统
    */
    @SerializedName("ClusterOs")
    @Expose
    private String ClusterOs;

    /**
    * 集群类型
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 集群区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 集群网络插件
    */
    @SerializedName("NetworkPolicyPlugin")
    @Expose
    private String NetworkPolicyPlugin;

    /**
    * 集群状态
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * 总策略数量
    */
    @SerializedName("TotalRuleCount")
    @Expose
    private Long TotalRuleCount;

    /**
    * 已开启策略数量
    */
    @SerializedName("EnableRuleCount")
    @Expose
    private Long EnableRuleCount;

    /**
    * 集群网络插件状态，正常：Running 不正常：Error
    */
    @SerializedName("NetworkPolicyPluginStatus")
    @Expose
    private String NetworkPolicyPluginStatus;

    /**
    * 集群网络插件错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkPolicyPluginError")
    @Expose
    private String NetworkPolicyPluginError;

    /**
    * 容器网络插件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterNetworkSettings")
    @Expose
    private String ClusterNetworkSettings;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名字 
     * @return ClusterName 集群名字
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名字
     * @param ClusterName 集群名字
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群版本 
     * @return ClusterVersion 集群版本
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set 集群版本
     * @param ClusterVersion 集群版本
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get 集群操作系统 
     * @return ClusterOs 集群操作系统
     */
    public String getClusterOs() {
        return this.ClusterOs;
    }

    /**
     * Set 集群操作系统
     * @param ClusterOs 集群操作系统
     */
    public void setClusterOs(String ClusterOs) {
        this.ClusterOs = ClusterOs;
    }

    /**
     * Get 集群类型 
     * @return ClusterType 集群类型
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型
     * @param ClusterType 集群类型
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 集群区域 
     * @return Region 集群区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 集群区域
     * @param Region 集群区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 集群网络插件 
     * @return NetworkPolicyPlugin 集群网络插件
     */
    public String getNetworkPolicyPlugin() {
        return this.NetworkPolicyPlugin;
    }

    /**
     * Set 集群网络插件
     * @param NetworkPolicyPlugin 集群网络插件
     */
    public void setNetworkPolicyPlugin(String NetworkPolicyPlugin) {
        this.NetworkPolicyPlugin = NetworkPolicyPlugin;
    }

    /**
     * Get 集群状态 
     * @return ClusterStatus 集群状态
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 集群状态
     * @param ClusterStatus 集群状态
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get 总策略数量 
     * @return TotalRuleCount 总策略数量
     */
    public Long getTotalRuleCount() {
        return this.TotalRuleCount;
    }

    /**
     * Set 总策略数量
     * @param TotalRuleCount 总策略数量
     */
    public void setTotalRuleCount(Long TotalRuleCount) {
        this.TotalRuleCount = TotalRuleCount;
    }

    /**
     * Get 已开启策略数量 
     * @return EnableRuleCount 已开启策略数量
     */
    public Long getEnableRuleCount() {
        return this.EnableRuleCount;
    }

    /**
     * Set 已开启策略数量
     * @param EnableRuleCount 已开启策略数量
     */
    public void setEnableRuleCount(Long EnableRuleCount) {
        this.EnableRuleCount = EnableRuleCount;
    }

    /**
     * Get 集群网络插件状态，正常：Running 不正常：Error 
     * @return NetworkPolicyPluginStatus 集群网络插件状态，正常：Running 不正常：Error
     */
    public String getNetworkPolicyPluginStatus() {
        return this.NetworkPolicyPluginStatus;
    }

    /**
     * Set 集群网络插件状态，正常：Running 不正常：Error
     * @param NetworkPolicyPluginStatus 集群网络插件状态，正常：Running 不正常：Error
     */
    public void setNetworkPolicyPluginStatus(String NetworkPolicyPluginStatus) {
        this.NetworkPolicyPluginStatus = NetworkPolicyPluginStatus;
    }

    /**
     * Get 集群网络插件错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkPolicyPluginError 集群网络插件错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetworkPolicyPluginError() {
        return this.NetworkPolicyPluginError;
    }

    /**
     * Set 集群网络插件错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkPolicyPluginError 集群网络插件错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkPolicyPluginError(String NetworkPolicyPluginError) {
        this.NetworkPolicyPluginError = NetworkPolicyPluginError;
    }

    /**
     * Get 容器网络插件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterNetworkSettings 容器网络插件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterNetworkSettings() {
        return this.ClusterNetworkSettings;
    }

    /**
     * Set 容器网络插件
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterNetworkSettings 容器网络插件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterNetworkSettings(String ClusterNetworkSettings) {
        this.ClusterNetworkSettings = ClusterNetworkSettings;
    }

    public NetworkClusterInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkClusterInfoItem(NetworkClusterInfoItem source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.ClusterOs != null) {
            this.ClusterOs = new String(source.ClusterOs);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.NetworkPolicyPlugin != null) {
            this.NetworkPolicyPlugin = new String(source.NetworkPolicyPlugin);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.TotalRuleCount != null) {
            this.TotalRuleCount = new Long(source.TotalRuleCount);
        }
        if (source.EnableRuleCount != null) {
            this.EnableRuleCount = new Long(source.EnableRuleCount);
        }
        if (source.NetworkPolicyPluginStatus != null) {
            this.NetworkPolicyPluginStatus = new String(source.NetworkPolicyPluginStatus);
        }
        if (source.NetworkPolicyPluginError != null) {
            this.NetworkPolicyPluginError = new String(source.NetworkPolicyPluginError);
        }
        if (source.ClusterNetworkSettings != null) {
            this.ClusterNetworkSettings = new String(source.ClusterNetworkSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "ClusterOs", this.ClusterOs);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "NetworkPolicyPlugin", this.NetworkPolicyPlugin);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "TotalRuleCount", this.TotalRuleCount);
        this.setParamSimple(map, prefix + "EnableRuleCount", this.EnableRuleCount);
        this.setParamSimple(map, prefix + "NetworkPolicyPluginStatus", this.NetworkPolicyPluginStatus);
        this.setParamSimple(map, prefix + "NetworkPolicyPluginError", this.NetworkPolicyPluginError);
        this.setParamSimple(map, prefix + "ClusterNetworkSettings", this.ClusterNetworkSettings);

    }
}

