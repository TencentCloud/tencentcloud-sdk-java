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
    * 节点池纬度运行时类型及版本
    */
    @SerializedName("ContainerRuntime")
    @Expose
    private String ContainerRuntime;

    /**
    * 运行时版本
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * 节点池os
    */
    @SerializedName("NodePoolOs")
    @Expose
    private String NodePoolOs;

    /**
    * 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
    */
    @SerializedName("OsCustomizeType")
    @Expose
    private String OsCustomizeType;

    /**
    * 资源标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

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
     * Get 节点池纬度运行时类型及版本 
     * @return ContainerRuntime 节点池纬度运行时类型及版本
     */
    public String getContainerRuntime() {
        return this.ContainerRuntime;
    }

    /**
     * Set 节点池纬度运行时类型及版本
     * @param ContainerRuntime 节点池纬度运行时类型及版本
     */
    public void setContainerRuntime(String ContainerRuntime) {
        this.ContainerRuntime = ContainerRuntime;
    }

    /**
     * Get 运行时版本 
     * @return RuntimeVersion 运行时版本
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * Set 运行时版本
     * @param RuntimeVersion 运行时版本
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * Get 节点池os 
     * @return NodePoolOs 节点池os
     */
    public String getNodePoolOs() {
        return this.NodePoolOs;
    }

    /**
     * Set 节点池os
     * @param NodePoolOs 节点池os
     */
    public void setNodePoolOs(String NodePoolOs) {
        this.NodePoolOs = NodePoolOs;
    }

    /**
     * Get 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值) 
     * @return OsCustomizeType 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
     */
    public String getOsCustomizeType() {
        return this.OsCustomizeType;
    }

    /**
     * Set 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
     * @param OsCustomizeType 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
     */
    public void setOsCustomizeType(String OsCustomizeType) {
        this.OsCustomizeType = OsCustomizeType;
    }

    /**
     * Get 资源标签 
     * @return Tags 资源标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 资源标签
     * @param Tags 资源标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateClusterNodePoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterNodePoolRequest(CreateClusterNodePoolRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AutoScalingGroupPara != null) {
            this.AutoScalingGroupPara = new String(source.AutoScalingGroupPara);
        }
        if (source.LaunchConfigurePara != null) {
            this.LaunchConfigurePara = new String(source.LaunchConfigurePara);
        }
        if (source.InstanceAdvancedSettings != null) {
            this.InstanceAdvancedSettings = new InstanceAdvancedSettings(source.InstanceAdvancedSettings);
        }
        if (source.EnableAutoscale != null) {
            this.EnableAutoscale = new Boolean(source.EnableAutoscale);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.ContainerRuntime != null) {
            this.ContainerRuntime = new String(source.ContainerRuntime);
        }
        if (source.RuntimeVersion != null) {
            this.RuntimeVersion = new String(source.RuntimeVersion);
        }
        if (source.NodePoolOs != null) {
            this.NodePoolOs = new String(source.NodePoolOs);
        }
        if (source.OsCustomizeType != null) {
            this.OsCustomizeType = new String(source.OsCustomizeType);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
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
        this.setParamSimple(map, prefix + "ContainerRuntime", this.ContainerRuntime);
        this.setParamSimple(map, prefix + "RuntimeVersion", this.RuntimeVersion);
        this.setParamSimple(map, prefix + "NodePoolOs", this.NodePoolOs);
        this.setParamSimple(map, prefix + "OsCustomizeType", this.OsCustomizeType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

