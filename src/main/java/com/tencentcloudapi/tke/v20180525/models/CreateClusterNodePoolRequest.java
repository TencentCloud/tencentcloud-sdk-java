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

public class CreateClusterNodePoolRequest extends AbstractModel {

    /**
    * <p>cluster id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>AutoScalingGroupPara AS组参数，参考 https://cloud.tencent.com/document/product/377/20440</p>
    */
    @SerializedName("AutoScalingGroupPara")
    @Expose
    private String AutoScalingGroupPara;

    /**
    * <p>LaunchConfigurePara 运行参数，参考 https://cloud.tencent.com/document/product/377/20447</p>
    */
    @SerializedName("LaunchConfigurePara")
    @Expose
    private String LaunchConfigurePara;

    /**
    * <p>InstanceAdvancedSettings</p>
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
    * <p>是否启用自动伸缩</p>
    */
    @SerializedName("EnableAutoscale")
    @Expose
    private Boolean EnableAutoscale;

    /**
    * <p>节点池名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Labels标签</p>
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * <p>Taints互斥</p>
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * <p>节点Annotation 列表</p>
    */
    @SerializedName("Annotations")
    @Expose
    private AnnotationValue [] Annotations;

    /**
    * <p>节点池纬度运行时类型及版本</p>
    */
    @SerializedName("ContainerRuntime")
    @Expose
    private String ContainerRuntime;

    /**
    * <p>运行时版本</p>
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * <p>节点池os，当为自定义镜像时，传镜像id；否则为公共镜像的osName</p>
    */
    @SerializedName("NodePoolOs")
    @Expose
    private String NodePoolOs;

    /**
    * <p>容器的镜像版本，&quot;DOCKER_CUSTOMIZE&quot;(容器定制版),&quot;GENERAL&quot;(普通版本，默认值)</p>
    */
    @SerializedName("OsCustomizeType")
    @Expose
    private String OsCustomizeType;

    /**
    * <p>资源标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>删除保护开关</p>
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
     * Get <p>cluster id</p> 
     * @return ClusterId <p>cluster id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>cluster id</p>
     * @param ClusterId <p>cluster id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>AutoScalingGroupPara AS组参数，参考 https://cloud.tencent.com/document/product/377/20440</p> 
     * @return AutoScalingGroupPara <p>AutoScalingGroupPara AS组参数，参考 https://cloud.tencent.com/document/product/377/20440</p>
     */
    public String getAutoScalingGroupPara() {
        return this.AutoScalingGroupPara;
    }

    /**
     * Set <p>AutoScalingGroupPara AS组参数，参考 https://cloud.tencent.com/document/product/377/20440</p>
     * @param AutoScalingGroupPara <p>AutoScalingGroupPara AS组参数，参考 https://cloud.tencent.com/document/product/377/20440</p>
     */
    public void setAutoScalingGroupPara(String AutoScalingGroupPara) {
        this.AutoScalingGroupPara = AutoScalingGroupPara;
    }

    /**
     * Get <p>LaunchConfigurePara 运行参数，参考 https://cloud.tencent.com/document/product/377/20447</p> 
     * @return LaunchConfigurePara <p>LaunchConfigurePara 运行参数，参考 https://cloud.tencent.com/document/product/377/20447</p>
     */
    public String getLaunchConfigurePara() {
        return this.LaunchConfigurePara;
    }

    /**
     * Set <p>LaunchConfigurePara 运行参数，参考 https://cloud.tencent.com/document/product/377/20447</p>
     * @param LaunchConfigurePara <p>LaunchConfigurePara 运行参数，参考 https://cloud.tencent.com/document/product/377/20447</p>
     */
    public void setLaunchConfigurePara(String LaunchConfigurePara) {
        this.LaunchConfigurePara = LaunchConfigurePara;
    }

    /**
     * Get <p>InstanceAdvancedSettings</p> 
     * @return InstanceAdvancedSettings <p>InstanceAdvancedSettings</p>
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set <p>InstanceAdvancedSettings</p>
     * @param InstanceAdvancedSettings <p>InstanceAdvancedSettings</p>
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * Get <p>是否启用自动伸缩</p> 
     * @return EnableAutoscale <p>是否启用自动伸缩</p>
     */
    public Boolean getEnableAutoscale() {
        return this.EnableAutoscale;
    }

    /**
     * Set <p>是否启用自动伸缩</p>
     * @param EnableAutoscale <p>是否启用自动伸缩</p>
     */
    public void setEnableAutoscale(Boolean EnableAutoscale) {
        this.EnableAutoscale = EnableAutoscale;
    }

    /**
     * Get <p>节点池名称</p> 
     * @return Name <p>节点池名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>节点池名称</p>
     * @param Name <p>节点池名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Labels标签</p> 
     * @return Labels <p>Labels标签</p>
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>Labels标签</p>
     * @param Labels <p>Labels标签</p>
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>Taints互斥</p> 
     * @return Taints <p>Taints互斥</p>
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set <p>Taints互斥</p>
     * @param Taints <p>Taints互斥</p>
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get <p>节点Annotation 列表</p> 
     * @return Annotations <p>节点Annotation 列表</p>
     */
    public AnnotationValue [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set <p>节点Annotation 列表</p>
     * @param Annotations <p>节点Annotation 列表</p>
     */
    public void setAnnotations(AnnotationValue [] Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get <p>节点池纬度运行时类型及版本</p> 
     * @return ContainerRuntime <p>节点池纬度运行时类型及版本</p>
     */
    public String getContainerRuntime() {
        return this.ContainerRuntime;
    }

    /**
     * Set <p>节点池纬度运行时类型及版本</p>
     * @param ContainerRuntime <p>节点池纬度运行时类型及版本</p>
     */
    public void setContainerRuntime(String ContainerRuntime) {
        this.ContainerRuntime = ContainerRuntime;
    }

    /**
     * Get <p>运行时版本</p> 
     * @return RuntimeVersion <p>运行时版本</p>
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * Set <p>运行时版本</p>
     * @param RuntimeVersion <p>运行时版本</p>
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * Get <p>节点池os，当为自定义镜像时，传镜像id；否则为公共镜像的osName</p> 
     * @return NodePoolOs <p>节点池os，当为自定义镜像时，传镜像id；否则为公共镜像的osName</p>
     */
    public String getNodePoolOs() {
        return this.NodePoolOs;
    }

    /**
     * Set <p>节点池os，当为自定义镜像时，传镜像id；否则为公共镜像的osName</p>
     * @param NodePoolOs <p>节点池os，当为自定义镜像时，传镜像id；否则为公共镜像的osName</p>
     */
    public void setNodePoolOs(String NodePoolOs) {
        this.NodePoolOs = NodePoolOs;
    }

    /**
     * Get <p>容器的镜像版本，&quot;DOCKER_CUSTOMIZE&quot;(容器定制版),&quot;GENERAL&quot;(普通版本，默认值)</p> 
     * @return OsCustomizeType <p>容器的镜像版本，&quot;DOCKER_CUSTOMIZE&quot;(容器定制版),&quot;GENERAL&quot;(普通版本，默认值)</p>
     */
    public String getOsCustomizeType() {
        return this.OsCustomizeType;
    }

    /**
     * Set <p>容器的镜像版本，&quot;DOCKER_CUSTOMIZE&quot;(容器定制版),&quot;GENERAL&quot;(普通版本，默认值)</p>
     * @param OsCustomizeType <p>容器的镜像版本，&quot;DOCKER_CUSTOMIZE&quot;(容器定制版),&quot;GENERAL&quot;(普通版本，默认值)</p>
     */
    public void setOsCustomizeType(String OsCustomizeType) {
        this.OsCustomizeType = OsCustomizeType;
    }

    /**
     * Get <p>资源标签</p> 
     * @return Tags <p>资源标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>资源标签</p>
     * @param Tags <p>资源标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>删除保护开关</p> 
     * @return DeletionProtection <p>删除保护开关</p>
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set <p>删除保护开关</p>
     * @param DeletionProtection <p>删除保护开关</p>
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
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
        if (source.Annotations != null) {
            this.Annotations = new AnnotationValue[source.Annotations.length];
            for (int i = 0; i < source.Annotations.length; i++) {
                this.Annotations[i] = new AnnotationValue(source.Annotations[i]);
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
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
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
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);
        this.setParamSimple(map, prefix + "ContainerRuntime", this.ContainerRuntime);
        this.setParamSimple(map, prefix + "RuntimeVersion", this.RuntimeVersion);
        this.setParamSimple(map, prefix + "NodePoolOs", this.NodePoolOs);
        this.setParamSimple(map, prefix + "OsCustomizeType", this.OsCustomizeType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);

    }
}

