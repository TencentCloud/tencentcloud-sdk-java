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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEnvironmentRequest extends AbstractModel{

    /**
    * 环境名称
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * 环境描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 私有网络名称
    */
    @SerializedName("Vpc")
    @Expose
    private String Vpc;

    /**
    * 子网列表
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * K8s version
    */
    @SerializedName("K8sVersion")
    @Expose
    private String K8sVersion;

    /**
    * 来源渠道
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * 是否开启tsw服务
    */
    @SerializedName("EnableTswTraceService")
    @Expose
    private Boolean EnableTswTraceService;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 环境类型：test、pre、prod
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * 创建环境的region
    */
    @SerializedName("CreateRegion")
    @Expose
    private String CreateRegion;

    /**
    * 是否创建私有网络
    */
    @SerializedName("SetupVpc")
    @Expose
    private Boolean SetupVpc;

    /**
    * 是否创建 Prometheus 实例
    */
    @SerializedName("SetupPrometheus")
    @Expose
    private Boolean SetupPrometheus;

    /**
    * prometheus 实例 id
    */
    @SerializedName("PrometheusId")
    @Expose
    private String PrometheusId;

    /**
    * apm id
    */
    @SerializedName("ApmId")
    @Expose
    private String ApmId;

    /**
     * Get 环境名称 
     * @return EnvironmentName 环境名称
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 环境名称
     * @param EnvironmentName 环境名称
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get 环境描述 
     * @return Description 环境描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 环境描述
     * @param Description 环境描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 私有网络名称 
     * @return Vpc 私有网络名称
     */
    public String getVpc() {
        return this.Vpc;
    }

    /**
     * Set 私有网络名称
     * @param Vpc 私有网络名称
     */
    public void setVpc(String Vpc) {
        this.Vpc = Vpc;
    }

    /**
     * Get 子网列表 
     * @return SubnetIds 子网列表
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网列表
     * @param SubnetIds 子网列表
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get K8s version 
     * @return K8sVersion K8s version
     */
    public String getK8sVersion() {
        return this.K8sVersion;
    }

    /**
     * Set K8s version
     * @param K8sVersion K8s version
     */
    public void setK8sVersion(String K8sVersion) {
        this.K8sVersion = K8sVersion;
    }

    /**
     * Get 来源渠道 
     * @return SourceChannel 来源渠道
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set 来源渠道
     * @param SourceChannel 来源渠道
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Get 是否开启tsw服务 
     * @return EnableTswTraceService 是否开启tsw服务
     */
    public Boolean getEnableTswTraceService() {
        return this.EnableTswTraceService;
    }

    /**
     * Set 是否开启tsw服务
     * @param EnableTswTraceService 是否开启tsw服务
     */
    public void setEnableTswTraceService(Boolean EnableTswTraceService) {
        this.EnableTswTraceService = EnableTswTraceService;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 环境类型：test、pre、prod 
     * @return EnvType 环境类型：test、pre、prod
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set 环境类型：test、pre、prod
     * @param EnvType 环境类型：test、pre、prod
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get 创建环境的region 
     * @return CreateRegion 创建环境的region
     */
    public String getCreateRegion() {
        return this.CreateRegion;
    }

    /**
     * Set 创建环境的region
     * @param CreateRegion 创建环境的region
     */
    public void setCreateRegion(String CreateRegion) {
        this.CreateRegion = CreateRegion;
    }

    /**
     * Get 是否创建私有网络 
     * @return SetupVpc 是否创建私有网络
     */
    public Boolean getSetupVpc() {
        return this.SetupVpc;
    }

    /**
     * Set 是否创建私有网络
     * @param SetupVpc 是否创建私有网络
     */
    public void setSetupVpc(Boolean SetupVpc) {
        this.SetupVpc = SetupVpc;
    }

    /**
     * Get 是否创建 Prometheus 实例 
     * @return SetupPrometheus 是否创建 Prometheus 实例
     */
    public Boolean getSetupPrometheus() {
        return this.SetupPrometheus;
    }

    /**
     * Set 是否创建 Prometheus 实例
     * @param SetupPrometheus 是否创建 Prometheus 实例
     */
    public void setSetupPrometheus(Boolean SetupPrometheus) {
        this.SetupPrometheus = SetupPrometheus;
    }

    /**
     * Get prometheus 实例 id 
     * @return PrometheusId prometheus 实例 id
     */
    public String getPrometheusId() {
        return this.PrometheusId;
    }

    /**
     * Set prometheus 实例 id
     * @param PrometheusId prometheus 实例 id
     */
    public void setPrometheusId(String PrometheusId) {
        this.PrometheusId = PrometheusId;
    }

    /**
     * Get apm id 
     * @return ApmId apm id
     */
    public String getApmId() {
        return this.ApmId;
    }

    /**
     * Set apm id
     * @param ApmId apm id
     */
    public void setApmId(String ApmId) {
        this.ApmId = ApmId;
    }

    public CreateEnvironmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEnvironmentRequest(CreateEnvironmentRequest source) {
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Vpc != null) {
            this.Vpc = new String(source.Vpc);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.K8sVersion != null) {
            this.K8sVersion = new String(source.K8sVersion);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.EnableTswTraceService != null) {
            this.EnableTswTraceService = new Boolean(source.EnableTswTraceService);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.EnvType != null) {
            this.EnvType = new String(source.EnvType);
        }
        if (source.CreateRegion != null) {
            this.CreateRegion = new String(source.CreateRegion);
        }
        if (source.SetupVpc != null) {
            this.SetupVpc = new Boolean(source.SetupVpc);
        }
        if (source.SetupPrometheus != null) {
            this.SetupPrometheus = new Boolean(source.SetupPrometheus);
        }
        if (source.PrometheusId != null) {
            this.PrometheusId = new String(source.PrometheusId);
        }
        if (source.ApmId != null) {
            this.ApmId = new String(source.ApmId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Vpc", this.Vpc);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "K8sVersion", this.K8sVersion);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "EnableTswTraceService", this.EnableTswTraceService);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamSimple(map, prefix + "CreateRegion", this.CreateRegion);
        this.setParamSimple(map, prefix + "SetupVpc", this.SetupVpc);
        this.setParamSimple(map, prefix + "SetupPrometheus", this.SetupPrometheus);
        this.setParamSimple(map, prefix + "PrometheusId", this.PrometheusId);
        this.setParamSimple(map, prefix + "ApmId", this.ApmId);

    }
}

