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
    * <p>集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>集群容器网络配置信息</p>
    */
    @SerializedName("ClusterCIDRSettings")
    @Expose
    private ClusterCIDRSettings ClusterCIDRSettings;

    /**
    * <p>CVM创建透传参数，json化字符串格式，详见<a href="https://cloud.tencent.com/document/product/213/15730">CVM创建实例</a>接口。总机型(包括地域)数量不超过10个，相同机型(地域)购买多台机器可以通过设置参数中RunInstances中InstanceCount来实现。</p>
    */
    @SerializedName("RunInstancesForNode")
    @Expose
    private RunInstancesForNode [] RunInstancesForNode;

    /**
    * <p>集群的基本配置信息</p>
    */
    @SerializedName("ClusterBasicSettings")
    @Expose
    private ClusterBasicSettings ClusterBasicSettings;

    /**
    * <p>集群高级配置信息</p>
    */
    @SerializedName("ClusterAdvancedSettings")
    @Expose
    private ClusterAdvancedSettings ClusterAdvancedSettings;

    /**
    * <p>节点高级配置信息</p>
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
    * <p>已存在实例的配置信息。所有实例必须在同一个VPC中，最大数量不超过 50，不支持添加竞价实例。</p>
    */
    @SerializedName("ExistedInstancesForNode")
    @Expose
    private ExistedInstancesForNode [] ExistedInstancesForNode;

    /**
    * <p>CVM类型和其对应的数据盘挂载配置信息</p>
    */
    @SerializedName("InstanceDataDiskMountSettings")
    @Expose
    private InstanceDataDiskMountSetting [] InstanceDataDiskMountSettings;

    /**
    * <p>需要安装的扩展组件信息</p>
    */
    @SerializedName("ExtensionAddons")
    @Expose
    private ExtensionAddon [] ExtensionAddons;

    /**
    * <p>本地专用集群Id</p>
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * <p>屏蔽安装指定Addon组件，填写相应的AddonName</p>
    */
    @SerializedName("DisableAddons")
    @Expose
    private String [] DisableAddons;

    /**
     * Get <p>集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。</p> 
     * @return ClusterType <p>集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。</p>
     * @param ClusterType <p>集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>集群容器网络配置信息</p> 
     * @return ClusterCIDRSettings <p>集群容器网络配置信息</p>
     */
    public ClusterCIDRSettings getClusterCIDRSettings() {
        return this.ClusterCIDRSettings;
    }

    /**
     * Set <p>集群容器网络配置信息</p>
     * @param ClusterCIDRSettings <p>集群容器网络配置信息</p>
     */
    public void setClusterCIDRSettings(ClusterCIDRSettings ClusterCIDRSettings) {
        this.ClusterCIDRSettings = ClusterCIDRSettings;
    }

    /**
     * Get <p>CVM创建透传参数，json化字符串格式，详见<a href="https://cloud.tencent.com/document/product/213/15730">CVM创建实例</a>接口。总机型(包括地域)数量不超过10个，相同机型(地域)购买多台机器可以通过设置参数中RunInstances中InstanceCount来实现。</p> 
     * @return RunInstancesForNode <p>CVM创建透传参数，json化字符串格式，详见<a href="https://cloud.tencent.com/document/product/213/15730">CVM创建实例</a>接口。总机型(包括地域)数量不超过10个，相同机型(地域)购买多台机器可以通过设置参数中RunInstances中InstanceCount来实现。</p>
     */
    public RunInstancesForNode [] getRunInstancesForNode() {
        return this.RunInstancesForNode;
    }

    /**
     * Set <p>CVM创建透传参数，json化字符串格式，详见<a href="https://cloud.tencent.com/document/product/213/15730">CVM创建实例</a>接口。总机型(包括地域)数量不超过10个，相同机型(地域)购买多台机器可以通过设置参数中RunInstances中InstanceCount来实现。</p>
     * @param RunInstancesForNode <p>CVM创建透传参数，json化字符串格式，详见<a href="https://cloud.tencent.com/document/product/213/15730">CVM创建实例</a>接口。总机型(包括地域)数量不超过10个，相同机型(地域)购买多台机器可以通过设置参数中RunInstances中InstanceCount来实现。</p>
     */
    public void setRunInstancesForNode(RunInstancesForNode [] RunInstancesForNode) {
        this.RunInstancesForNode = RunInstancesForNode;
    }

    /**
     * Get <p>集群的基本配置信息</p> 
     * @return ClusterBasicSettings <p>集群的基本配置信息</p>
     */
    public ClusterBasicSettings getClusterBasicSettings() {
        return this.ClusterBasicSettings;
    }

    /**
     * Set <p>集群的基本配置信息</p>
     * @param ClusterBasicSettings <p>集群的基本配置信息</p>
     */
    public void setClusterBasicSettings(ClusterBasicSettings ClusterBasicSettings) {
        this.ClusterBasicSettings = ClusterBasicSettings;
    }

    /**
     * Get <p>集群高级配置信息</p> 
     * @return ClusterAdvancedSettings <p>集群高级配置信息</p>
     */
    public ClusterAdvancedSettings getClusterAdvancedSettings() {
        return this.ClusterAdvancedSettings;
    }

    /**
     * Set <p>集群高级配置信息</p>
     * @param ClusterAdvancedSettings <p>集群高级配置信息</p>
     */
    public void setClusterAdvancedSettings(ClusterAdvancedSettings ClusterAdvancedSettings) {
        this.ClusterAdvancedSettings = ClusterAdvancedSettings;
    }

    /**
     * Get <p>节点高级配置信息</p> 
     * @return InstanceAdvancedSettings <p>节点高级配置信息</p>
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set <p>节点高级配置信息</p>
     * @param InstanceAdvancedSettings <p>节点高级配置信息</p>
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * Get <p>已存在实例的配置信息。所有实例必须在同一个VPC中，最大数量不超过 50，不支持添加竞价实例。</p> 
     * @return ExistedInstancesForNode <p>已存在实例的配置信息。所有实例必须在同一个VPC中，最大数量不超过 50，不支持添加竞价实例。</p>
     */
    public ExistedInstancesForNode [] getExistedInstancesForNode() {
        return this.ExistedInstancesForNode;
    }

    /**
     * Set <p>已存在实例的配置信息。所有实例必须在同一个VPC中，最大数量不超过 50，不支持添加竞价实例。</p>
     * @param ExistedInstancesForNode <p>已存在实例的配置信息。所有实例必须在同一个VPC中，最大数量不超过 50，不支持添加竞价实例。</p>
     */
    public void setExistedInstancesForNode(ExistedInstancesForNode [] ExistedInstancesForNode) {
        this.ExistedInstancesForNode = ExistedInstancesForNode;
    }

    /**
     * Get <p>CVM类型和其对应的数据盘挂载配置信息</p> 
     * @return InstanceDataDiskMountSettings <p>CVM类型和其对应的数据盘挂载配置信息</p>
     */
    public InstanceDataDiskMountSetting [] getInstanceDataDiskMountSettings() {
        return this.InstanceDataDiskMountSettings;
    }

    /**
     * Set <p>CVM类型和其对应的数据盘挂载配置信息</p>
     * @param InstanceDataDiskMountSettings <p>CVM类型和其对应的数据盘挂载配置信息</p>
     */
    public void setInstanceDataDiskMountSettings(InstanceDataDiskMountSetting [] InstanceDataDiskMountSettings) {
        this.InstanceDataDiskMountSettings = InstanceDataDiskMountSettings;
    }

    /**
     * Get <p>需要安装的扩展组件信息</p> 
     * @return ExtensionAddons <p>需要安装的扩展组件信息</p>
     */
    public ExtensionAddon [] getExtensionAddons() {
        return this.ExtensionAddons;
    }

    /**
     * Set <p>需要安装的扩展组件信息</p>
     * @param ExtensionAddons <p>需要安装的扩展组件信息</p>
     */
    public void setExtensionAddons(ExtensionAddon [] ExtensionAddons) {
        this.ExtensionAddons = ExtensionAddons;
    }

    /**
     * Get <p>本地专用集群Id</p> 
     * @return CdcId <p>本地专用集群Id</p>
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set <p>本地专用集群Id</p>
     * @param CdcId <p>本地专用集群Id</p>
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get <p>屏蔽安装指定Addon组件，填写相应的AddonName</p> 
     * @return DisableAddons <p>屏蔽安装指定Addon组件，填写相应的AddonName</p>
     */
    public String [] getDisableAddons() {
        return this.DisableAddons;
    }

    /**
     * Set <p>屏蔽安装指定Addon组件，填写相应的AddonName</p>
     * @param DisableAddons <p>屏蔽安装指定Addon组件，填写相应的AddonName</p>
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

