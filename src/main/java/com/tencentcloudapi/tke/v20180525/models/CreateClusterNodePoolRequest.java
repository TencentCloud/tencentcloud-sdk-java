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

public class CreateClusterNodePoolRequest extends AbstractModel{

    /**
    * cluster id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * AutoScalingGroupPara AS组参数
    */
    @SerializedName("AutoScalingGroupPara")
    @Expose
    private String AutoScalingGroupPara;

    /**
    * LaunchConfigurePara 运行参数
    */
    @SerializedName("LaunchConfigurePara")
    @Expose
    private String LaunchConfigurePara;

    /**
    * InstanceAdvancedSettings 示例参数
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
    * 是否启用自动伸缩
    */
    @SerializedName("EnableAutoscale")
    @Expose
    private Boolean EnableAutoscale;

    /**
    * 节点池名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Labels标签
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * Taints互斥
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
     * Get cluster id 
     * @return ClusterId cluster id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set cluster id
     * @param ClusterId cluster id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get AutoScalingGroupPara AS组参数 
     * @return AutoScalingGroupPara AutoScalingGroupPara AS组参数
     */
    public String getAutoScalingGroupPara() {
        return this.AutoScalingGroupPara;
    }

    /**
     * Set AutoScalingGroupPara AS组参数
     * @param AutoScalingGroupPara AutoScalingGroupPara AS组参数
     */
    public void setAutoScalingGroupPara(String AutoScalingGroupPara) {
        this.AutoScalingGroupPara = AutoScalingGroupPara;
    }

    /**
     * Get LaunchConfigurePara 运行参数 
     * @return LaunchConfigurePara LaunchConfigurePara 运行参数
     */
    public String getLaunchConfigurePara() {
        return this.LaunchConfigurePara;
    }

    /**
     * Set LaunchConfigurePara 运行参数
     * @param LaunchConfigurePara LaunchConfigurePara 运行参数
     */
    public void setLaunchConfigurePara(String LaunchConfigurePara) {
        this.LaunchConfigurePara = LaunchConfigurePara;
    }

    /**
     * Get InstanceAdvancedSettings 示例参数 
     * @return InstanceAdvancedSettings InstanceAdvancedSettings 示例参数
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set InstanceAdvancedSettings 示例参数
     * @param InstanceAdvancedSettings InstanceAdvancedSettings 示例参数
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * Get 是否启用自动伸缩 
     * @return EnableAutoscale 是否启用自动伸缩
     */
    public Boolean getEnableAutoscale() {
        return this.EnableAutoscale;
    }

    /**
     * Set 是否启用自动伸缩
     * @param EnableAutoscale 是否启用自动伸缩
     */
    public void setEnableAutoscale(Boolean EnableAutoscale) {
        this.EnableAutoscale = EnableAutoscale;
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
     * Get Labels标签 
     * @return Labels Labels标签
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Labels标签
     * @param Labels Labels标签
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Taints互斥 
     * @return Taints Taints互斥
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set Taints互斥
     * @param Taints Taints互斥
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AutoScalingGroupPara", this.AutoScalingGroupPara);
        this.setParamSimple(map, prefix + "LaunchConfigurePara", this.LaunchConfigurePara);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);
        this.setParamSimple(map, prefix + "EnableAutoscale", this.EnableAutoscale);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);

    }
}

