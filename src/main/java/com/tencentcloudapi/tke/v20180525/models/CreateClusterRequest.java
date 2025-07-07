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

public class CreateClusterRequest extends AbstractModel {

    /**
    * 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 集群容器网络配置信息
    */
    @SerializedName("ClusterCIDRSettings")
    @Expose
    private ClusterCIDRSettings ClusterCIDRSettings;

    /**
    * CVM创建透传参数，json化字符串格式，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。总机型(包括地域)数量不超过10个，相同机型(地域)购买多台机器可以通过设置参数中RunInstances中InstanceCount来实现。
    */
    @SerializedName("RunInstancesForNode")
    @Expose
    private RunInstancesForNode [] RunInstancesForNode;

    /**
    * 集群的基本配置信息
    */
    @SerializedName("ClusterBasicSettings")
    @Expose
    private ClusterBasicSettings ClusterBasicSettings;

    /**
    * 集群高级配置信息
    */
    @SerializedName("ClusterAdvancedSettings")
    @Expose
    private ClusterAdvancedSettings ClusterAdvancedSettings;

    /**
    * 节点高级配置信息
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
    * 已存在实例的配置信息。所有实例必须在同一个VPC中，最大数量不超过100，不支持添加竞价实例。
    */
    @SerializedName("ExistedInstancesForNode")
    @Expose
    private ExistedInstancesForNode [] ExistedInstancesForNode;

    /**
    * CVM类型和其对应的数据盘挂载配置信息
    */
    @SerializedName("InstanceDataDiskMountSettings")
    @Expose
    private InstanceDataDiskMountSetting [] InstanceDataDiskMountSettings;

    /**
    * 需要安装的扩展组件信息
    */
    @SerializedName("ExtensionAddons")
    @Expose
    private ExtensionAddon [] ExtensionAddons;

    /**
    * 本地专用集群Id
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * 屏蔽安装指定Addon组件，填写相应的AddonName
    */
    @SerializedName("DisableAddons")
    @Expose
    private String [] DisableAddons;

    /**
     * Get 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。 
     * @return ClusterType 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。
     * @param ClusterType 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 集群容器网络配置信息 
     * @return ClusterCIDRSettings 集群容器网络配置信息
     */
    public ClusterCIDRSettings getClusterCIDRSettings() {
        return this.ClusterCIDRSettings;
    }

    /**
     * Set 集群容器网络配置信息
     * @param ClusterCIDRSettings 集群容器网络配置信息
     */
    public void setClusterCIDRSettings(ClusterCIDRSettings ClusterCIDRSettings) {
        this.ClusterCIDRSettings = ClusterCIDRSettings;
    }

    /**
     * Get CVM创建透传参数，json化字符串格式，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。总机型(包括地域)数量不超过10个，相同机型(地域)购买多台机器可以通过设置参数中RunInstances中InstanceCount来实现。 
     * @return RunInstancesForNode CVM创建透传参数，json化字符串格式，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。总机型(包括地域)数量不超过10个，相同机型(地域)购买多台机器可以通过设置参数中RunInstances中InstanceCount来实现。
     */
    public RunInstancesForNode [] getRunInstancesForNode() {
        return this.RunInstancesForNode;
    }

    /**
     * Set CVM创建透传参数，json化字符串格式，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。总机型(包括地域)数量不超过10个，相同机型(地域)购买多台机器可以通过设置参数中RunInstances中InstanceCount来实现。
     * @param RunInstancesForNode CVM创建透传参数，json化字符串格式，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。总机型(包括地域)数量不超过10个，相同机型(地域)购买多台机器可以通过设置参数中RunInstances中InstanceCount来实现。
     */
    public void setRunInstancesForNode(RunInstancesForNode [] RunInstancesForNode) {
        this.RunInstancesForNode = RunInstancesForNode;
    }

    /**
     * Get 集群的基本配置信息 
     * @return ClusterBasicSettings 集群的基本配置信息
     */
    public ClusterBasicSettings getClusterBasicSettings() {
        return this.ClusterBasicSettings;
    }

    /**
     * Set 集群的基本配置信息
     * @param ClusterBasicSettings 集群的基本配置信息
     */
    public void setClusterBasicSettings(ClusterBasicSettings ClusterBasicSettings) {
        this.ClusterBasicSettings = ClusterBasicSettings;
    }

    /**
     * Get 集群高级配置信息 
     * @return ClusterAdvancedSettings 集群高级配置信息
     */
    public ClusterAdvancedSettings getClusterAdvancedSettings() {
        return this.ClusterAdvancedSettings;
    }

    /**
     * Set 集群高级配置信息
     * @param ClusterAdvancedSettings 集群高级配置信息
     */
    public void setClusterAdvancedSettings(ClusterAdvancedSettings ClusterAdvancedSettings) {
        this.ClusterAdvancedSettings = ClusterAdvancedSettings;
    }

    /**
     * Get 节点高级配置信息 
     * @return InstanceAdvancedSettings 节点高级配置信息
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set 节点高级配置信息
     * @param InstanceAdvancedSettings 节点高级配置信息
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * Get 已存在实例的配置信息。所有实例必须在同一个VPC中，最大数量不超过100，不支持添加竞价实例。 
     * @return ExistedInstancesForNode 已存在实例的配置信息。所有实例必须在同一个VPC中，最大数量不超过100，不支持添加竞价实例。
     */
    public ExistedInstancesForNode [] getExistedInstancesForNode() {
        return this.ExistedInstancesForNode;
    }

    /**
     * Set 已存在实例的配置信息。所有实例必须在同一个VPC中，最大数量不超过100，不支持添加竞价实例。
     * @param ExistedInstancesForNode 已存在实例的配置信息。所有实例必须在同一个VPC中，最大数量不超过100，不支持添加竞价实例。
     */
    public void setExistedInstancesForNode(ExistedInstancesForNode [] ExistedInstancesForNode) {
        this.ExistedInstancesForNode = ExistedInstancesForNode;
    }

    /**
     * Get CVM类型和其对应的数据盘挂载配置信息 
     * @return InstanceDataDiskMountSettings CVM类型和其对应的数据盘挂载配置信息
     */
    public InstanceDataDiskMountSetting [] getInstanceDataDiskMountSettings() {
        return this.InstanceDataDiskMountSettings;
    }

    /**
     * Set CVM类型和其对应的数据盘挂载配置信息
     * @param InstanceDataDiskMountSettings CVM类型和其对应的数据盘挂载配置信息
     */
    public void setInstanceDataDiskMountSettings(InstanceDataDiskMountSetting [] InstanceDataDiskMountSettings) {
        this.InstanceDataDiskMountSettings = InstanceDataDiskMountSettings;
    }

    /**
     * Get 需要安装的扩展组件信息 
     * @return ExtensionAddons 需要安装的扩展组件信息
     */
    public ExtensionAddon [] getExtensionAddons() {
        return this.ExtensionAddons;
    }

    /**
     * Set 需要安装的扩展组件信息
     * @param ExtensionAddons 需要安装的扩展组件信息
     */
    public void setExtensionAddons(ExtensionAddon [] ExtensionAddons) {
        this.ExtensionAddons = ExtensionAddons;
    }

    /**
     * Get 本地专用集群Id 
     * @return CdcId 本地专用集群Id
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set 本地专用集群Id
     * @param CdcId 本地专用集群Id
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get 屏蔽安装指定Addon组件，填写相应的AddonName 
     * @return DisableAddons 屏蔽安装指定Addon组件，填写相应的AddonName
     */
    public String [] getDisableAddons() {
        return this.DisableAddons;
    }

    /**
     * Set 屏蔽安装指定Addon组件，填写相应的AddonName
     * @param DisableAddons 屏蔽安装指定Addon组件，填写相应的AddonName
     */
    public void setDisableAddons(String [] DisableAddons) {
        this.DisableAddons = DisableAddons;
    }

    public CreateClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterRequest(CreateClusterRequest source) {
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterCIDRSettings != null) {
            this.ClusterCIDRSettings = new ClusterCIDRSettings(source.ClusterCIDRSettings);
        }
        if (source.RunInstancesForNode != null) {
            this.RunInstancesForNode = new RunInstancesForNode[source.RunInstancesForNode.length];
            for (int i = 0; i < source.RunInstancesForNode.length; i++) {
                this.RunInstancesForNode[i] = new RunInstancesForNode(source.RunInstancesForNode[i]);
            }
        }
        if (source.ClusterBasicSettings != null) {
            this.ClusterBasicSettings = new ClusterBasicSettings(source.ClusterBasicSettings);
        }
        if (source.ClusterAdvancedSettings != null) {
            this.ClusterAdvancedSettings = new ClusterAdvancedSettings(source.ClusterAdvancedSettings);
        }
        if (source.InstanceAdvancedSettings != null) {
            this.InstanceAdvancedSettings = new InstanceAdvancedSettings(source.InstanceAdvancedSettings);
        }
        if (source.ExistedInstancesForNode != null) {
            this.ExistedInstancesForNode = new ExistedInstancesForNode[source.ExistedInstancesForNode.length];
            for (int i = 0; i < source.ExistedInstancesForNode.length; i++) {
                this.ExistedInstancesForNode[i] = new ExistedInstancesForNode(source.ExistedInstancesForNode[i]);
            }
        }
        if (source.InstanceDataDiskMountSettings != null) {
            this.InstanceDataDiskMountSettings = new InstanceDataDiskMountSetting[source.InstanceDataDiskMountSettings.length];
            for (int i = 0; i < source.InstanceDataDiskMountSettings.length; i++) {
                this.InstanceDataDiskMountSettings[i] = new InstanceDataDiskMountSetting(source.InstanceDataDiskMountSettings[i]);
            }
        }
        if (source.ExtensionAddons != null) {
            this.ExtensionAddons = new ExtensionAddon[source.ExtensionAddons.length];
            for (int i = 0; i < source.ExtensionAddons.length; i++) {
                this.ExtensionAddons[i] = new ExtensionAddon(source.ExtensionAddons[i]);
            }
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.DisableAddons != null) {
            this.DisableAddons = new String[source.DisableAddons.length];
            for (int i = 0; i < source.DisableAddons.length; i++) {
                this.DisableAddons[i] = new String(source.DisableAddons[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamObj(map, prefix + "ClusterCIDRSettings.", this.ClusterCIDRSettings);
        this.setParamArrayObj(map, prefix + "RunInstancesForNode.", this.RunInstancesForNode);
        this.setParamObj(map, prefix + "ClusterBasicSettings.", this.ClusterBasicSettings);
        this.setParamObj(map, prefix + "ClusterAdvancedSettings.", this.ClusterAdvancedSettings);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);
        this.setParamArrayObj(map, prefix + "ExistedInstancesForNode.", this.ExistedInstancesForNode);
        this.setParamArrayObj(map, prefix + "InstanceDataDiskMountSettings.", this.InstanceDataDiskMountSettings);
        this.setParamArrayObj(map, prefix + "ExtensionAddons.", this.ExtensionAddons);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamArraySimple(map, prefix + "DisableAddons.", this.DisableAddons);

    }
}

