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

public class CreateClusterRequest  extends AbstractModel{

    /**
    * 集群容器网络配置信息
    */
    @SerializedName("ClusterCIDRSettings")
    @Expose
    private ClusterCIDRSettings ClusterCIDRSettings;

    /**
    * 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

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
    * 已存在实例的配置信息。所有实例必须在同一个VPC中，最大数量不超过100。
    */
    @SerializedName("ExistedInstancesForNode")
    @Expose
    private ExistedInstancesForNode [] ExistedInstancesForNode;

    /**
     * 获取集群容器网络配置信息
     * @return ClusterCIDRSettings 集群容器网络配置信息
     */
    public ClusterCIDRSettings getClusterCIDRSettings() {
        return this.ClusterCIDRSettings;
    }

    /**
     * 设置集群容器网络配置信息
     * @param ClusterCIDRSettings 集群容器网络配置信息
     */
    public void setClusterCIDRSettings(ClusterCIDRSettings ClusterCIDRSettings) {
        this.ClusterCIDRSettings = ClusterCIDRSettings;
    }

    /**
     * 获取集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。
     * @return ClusterType 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * 设置集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。
     * @param ClusterType 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * 获取CVM创建透传参数，json化字符串格式，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。总机型(包括地域)数量不超过10个，相同机型(地域)购买多台机器可以通过设置参数中RunInstances中InstanceCount来实现。
     * @return RunInstancesForNode CVM创建透传参数，json化字符串格式，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。总机型(包括地域)数量不超过10个，相同机型(地域)购买多台机器可以通过设置参数中RunInstances中InstanceCount来实现。
     */
    public RunInstancesForNode [] getRunInstancesForNode() {
        return this.RunInstancesForNode;
    }

    /**
     * 设置CVM创建透传参数，json化字符串格式，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。总机型(包括地域)数量不超过10个，相同机型(地域)购买多台机器可以通过设置参数中RunInstances中InstanceCount来实现。
     * @param RunInstancesForNode CVM创建透传参数，json化字符串格式，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。总机型(包括地域)数量不超过10个，相同机型(地域)购买多台机器可以通过设置参数中RunInstances中InstanceCount来实现。
     */
    public void setRunInstancesForNode(RunInstancesForNode [] RunInstancesForNode) {
        this.RunInstancesForNode = RunInstancesForNode;
    }

    /**
     * 获取集群的基本配置信息
     * @return ClusterBasicSettings 集群的基本配置信息
     */
    public ClusterBasicSettings getClusterBasicSettings() {
        return this.ClusterBasicSettings;
    }

    /**
     * 设置集群的基本配置信息
     * @param ClusterBasicSettings 集群的基本配置信息
     */
    public void setClusterBasicSettings(ClusterBasicSettings ClusterBasicSettings) {
        this.ClusterBasicSettings = ClusterBasicSettings;
    }

    /**
     * 获取集群高级配置信息
     * @return ClusterAdvancedSettings 集群高级配置信息
     */
    public ClusterAdvancedSettings getClusterAdvancedSettings() {
        return this.ClusterAdvancedSettings;
    }

    /**
     * 设置集群高级配置信息
     * @param ClusterAdvancedSettings 集群高级配置信息
     */
    public void setClusterAdvancedSettings(ClusterAdvancedSettings ClusterAdvancedSettings) {
        this.ClusterAdvancedSettings = ClusterAdvancedSettings;
    }

    /**
     * 获取节点高级配置信息
     * @return InstanceAdvancedSettings 节点高级配置信息
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * 设置节点高级配置信息
     * @param InstanceAdvancedSettings 节点高级配置信息
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * 获取已存在实例的配置信息。所有实例必须在同一个VPC中，最大数量不超过100。
     * @return ExistedInstancesForNode 已存在实例的配置信息。所有实例必须在同一个VPC中，最大数量不超过100。
     */
    public ExistedInstancesForNode [] getExistedInstancesForNode() {
        return this.ExistedInstancesForNode;
    }

    /**
     * 设置已存在实例的配置信息。所有实例必须在同一个VPC中，最大数量不超过100。
     * @param ExistedInstancesForNode 已存在实例的配置信息。所有实例必须在同一个VPC中，最大数量不超过100。
     */
    public void setExistedInstancesForNode(ExistedInstancesForNode [] ExistedInstancesForNode) {
        this.ExistedInstancesForNode = ExistedInstancesForNode;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ClusterCIDRSettings.", this.ClusterCIDRSettings);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamArrayObj(map, prefix + "RunInstancesForNode.", this.RunInstancesForNode);
        this.setParamObj(map, prefix + "ClusterBasicSettings.", this.ClusterBasicSettings);
        this.setParamObj(map, prefix + "ClusterAdvancedSettings.", this.ClusterAdvancedSettings);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);
        this.setParamArrayObj(map, prefix + "ExistedInstancesForNode.", this.ExistedInstancesForNode);

    }
}

