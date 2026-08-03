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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HeadSpecDTO extends AbstractModel {

    /**
    * <p>head/worker名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Pod CPU核数</p>
    */
    @SerializedName("PodCpu")
    @Expose
    private Long PodCpu;

    /**
    * <p>Pod 内存大小</p>
    */
    @SerializedName("PodMem")
    @Expose
    private Long PodMem;

    /**
    * <p>GPU类型</p>
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * <p>GPU数量</p>
    */
    @SerializedName("GpuNum")
    @Expose
    private Long GpuNum;

    /**
    * <p>环境变量列表</p>
    */
    @SerializedName("Envs")
    @Expose
    private Env [] Envs;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * <p>资源标签列表（用于追加到 headGroupSpec/workerGroupSpec 的 resources map 中，对应 Ray/K8s 的自定义资源声明），Value 必须为字符串形式的整数</p>
    */
    @SerializedName("ResourcesLabels")
    @Expose
    private Label [] ResourcesLabels;

    /**
    * <p>Pod数量</p>
    */
    @SerializedName("PodNum")
    @Expose
    private Long PodNum;

    /**
    * <p>是否支持高级可用</p>
    */
    @SerializedName("HighAvailability")
    @Expose
    private Boolean HighAvailability;

    /**
    * <p>资源类型,CPU,GPU</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>机型</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>规格数量</p>
    */
    @SerializedName("Spec")
    @Expose
    private Long Spec;

    /**
    * <p>资源ID(唯一)</p>
    */
    @SerializedName("BillingItem")
    @Expose
    private String BillingItem;

    /**
     * Get <p>head/worker名称</p> 
     * @return Name <p>head/worker名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>head/worker名称</p>
     * @param Name <p>head/worker名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Pod CPU核数</p> 
     * @return PodCpu <p>Pod CPU核数</p>
     */
    public Long getPodCpu() {
        return this.PodCpu;
    }

    /**
     * Set <p>Pod CPU核数</p>
     * @param PodCpu <p>Pod CPU核数</p>
     */
    public void setPodCpu(Long PodCpu) {
        this.PodCpu = PodCpu;
    }

    /**
     * Get <p>Pod 内存大小</p> 
     * @return PodMem <p>Pod 内存大小</p>
     */
    public Long getPodMem() {
        return this.PodMem;
    }

    /**
     * Set <p>Pod 内存大小</p>
     * @param PodMem <p>Pod 内存大小</p>
     */
    public void setPodMem(Long PodMem) {
        this.PodMem = PodMem;
    }

    /**
     * Get <p>GPU类型</p> 
     * @return GpuType <p>GPU类型</p>
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set <p>GPU类型</p>
     * @param GpuType <p>GPU类型</p>
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get <p>GPU数量</p> 
     * @return GpuNum <p>GPU数量</p>
     */
    public Long getGpuNum() {
        return this.GpuNum;
    }

    /**
     * Set <p>GPU数量</p>
     * @param GpuNum <p>GPU数量</p>
     */
    public void setGpuNum(Long GpuNum) {
        this.GpuNum = GpuNum;
    }

    /**
     * Get <p>环境变量列表</p> 
     * @return Envs <p>环境变量列表</p>
     */
    public Env [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set <p>环境变量列表</p>
     * @param Envs <p>环境变量列表</p>
     */
    public void setEnvs(Env [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Labels <p>标签列表</p>
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>标签列表</p>
     * @param Labels <p>标签列表</p>
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>资源标签列表（用于追加到 headGroupSpec/workerGroupSpec 的 resources map 中，对应 Ray/K8s 的自定义资源声明），Value 必须为字符串形式的整数</p> 
     * @return ResourcesLabels <p>资源标签列表（用于追加到 headGroupSpec/workerGroupSpec 的 resources map 中，对应 Ray/K8s 的自定义资源声明），Value 必须为字符串形式的整数</p>
     */
    public Label [] getResourcesLabels() {
        return this.ResourcesLabels;
    }

    /**
     * Set <p>资源标签列表（用于追加到 headGroupSpec/workerGroupSpec 的 resources map 中，对应 Ray/K8s 的自定义资源声明），Value 必须为字符串形式的整数</p>
     * @param ResourcesLabels <p>资源标签列表（用于追加到 headGroupSpec/workerGroupSpec 的 resources map 中，对应 Ray/K8s 的自定义资源声明），Value 必须为字符串形式的整数</p>
     */
    public void setResourcesLabels(Label [] ResourcesLabels) {
        this.ResourcesLabels = ResourcesLabels;
    }

    /**
     * Get <p>Pod数量</p> 
     * @return PodNum <p>Pod数量</p>
     */
    public Long getPodNum() {
        return this.PodNum;
    }

    /**
     * Set <p>Pod数量</p>
     * @param PodNum <p>Pod数量</p>
     */
    public void setPodNum(Long PodNum) {
        this.PodNum = PodNum;
    }

    /**
     * Get <p>是否支持高级可用</p> 
     * @return HighAvailability <p>是否支持高级可用</p>
     */
    public Boolean getHighAvailability() {
        return this.HighAvailability;
    }

    /**
     * Set <p>是否支持高级可用</p>
     * @param HighAvailability <p>是否支持高级可用</p>
     */
    public void setHighAvailability(Boolean HighAvailability) {
        this.HighAvailability = HighAvailability;
    }

    /**
     * Get <p>资源类型,CPU,GPU</p> 
     * @return ResourceType <p>资源类型,CPU,GPU</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型,CPU,GPU</p>
     * @param ResourceType <p>资源类型,CPU,GPU</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>机型</p> 
     * @return InstanceType <p>机型</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>机型</p>
     * @param InstanceType <p>机型</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>规格数量</p> 
     * @return Spec <p>规格数量</p>
     */
    public Long getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>规格数量</p>
     * @param Spec <p>规格数量</p>
     */
    public void setSpec(Long Spec) {
        this.Spec = Spec;
    }

    /**
     * Get <p>资源ID(唯一)</p> 
     * @return BillingItem <p>资源ID(唯一)</p>
     */
    public String getBillingItem() {
        return this.BillingItem;
    }

    /**
     * Set <p>资源ID(唯一)</p>
     * @param BillingItem <p>资源ID(唯一)</p>
     */
    public void setBillingItem(String BillingItem) {
        this.BillingItem = BillingItem;
    }

    public HeadSpecDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HeadSpecDTO(HeadSpecDTO source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PodCpu != null) {
            this.PodCpu = new Long(source.PodCpu);
        }
        if (source.PodMem != null) {
            this.PodMem = new Long(source.PodMem);
        }
        if (source.GpuType != null) {
            this.GpuType = new String(source.GpuType);
        }
        if (source.GpuNum != null) {
            this.GpuNum = new Long(source.GpuNum);
        }
        if (source.Envs != null) {
            this.Envs = new Env[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new Env(source.Envs[i]);
            }
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.ResourcesLabels != null) {
            this.ResourcesLabels = new Label[source.ResourcesLabels.length];
            for (int i = 0; i < source.ResourcesLabels.length; i++) {
                this.ResourcesLabels[i] = new Label(source.ResourcesLabels[i]);
            }
        }
        if (source.PodNum != null) {
            this.PodNum = new Long(source.PodNum);
        }
        if (source.HighAvailability != null) {
            this.HighAvailability = new Boolean(source.HighAvailability);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Spec != null) {
            this.Spec = new Long(source.Spec);
        }
        if (source.BillingItem != null) {
            this.BillingItem = new String(source.BillingItem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PodCpu", this.PodCpu);
        this.setParamSimple(map, prefix + "PodMem", this.PodMem);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "GpuNum", this.GpuNum);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "ResourcesLabels.", this.ResourcesLabels);
        this.setParamSimple(map, prefix + "PodNum", this.PodNum);
        this.setParamSimple(map, prefix + "HighAvailability", this.HighAvailability);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "BillingItem", this.BillingItem);

    }
}

