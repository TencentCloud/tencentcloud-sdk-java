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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCollectorRequest extends AbstractModel {

    /**
    * 采集器名称（1-50 个英文、汉字、数字、连接线-或下划线_）
    */
    @SerializedName("CollectorName")
    @Expose
    private String CollectorName;

    /**
    * 采集器版本（支持"6.8.15"、"7.10.2"）
    */
    @SerializedName("CollectorVersion")
    @Expose
    private String CollectorVersion;

    /**
    * 采集器类型（支持filebeat、metricbeat、heartbeat、auditbeat、packetbeat）
    */
    @SerializedName("CollectorType")
    @Expose
    private String CollectorType;

    /**
    * 采集器输出的ES实例信息
    */
    @SerializedName("OutputInstance")
    @Expose
    private CollectorOutputInstance OutputInstance;

    /**
    * 采集器配置
    */
    @SerializedName("CollectorConfigs")
    @Expose
    private CollectorConfigInfo [] CollectorConfigs;

    /**
    * 采集器下发的CVM实例ID列表
    */
    @SerializedName("CVMInstanceIds")
    @Expose
    private String [] CVMInstanceIds;

    /**
    * 采集目标类型，CVM或者TKE
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 容器集群ID，采集目标为TKE时必填
    */
    @SerializedName("ContainerClusterId")
    @Expose
    private String ContainerClusterId;

    /**
    * 采集器配置，采集目标为TKE时必填
    */
    @SerializedName("CollectorTargets")
    @Expose
    private CollectorTarget [] CollectorTargets;

    /**
    * 标签信息
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
     * Get 采集器名称（1-50 个英文、汉字、数字、连接线-或下划线_） 
     * @return CollectorName 采集器名称（1-50 个英文、汉字、数字、连接线-或下划线_）
     */
    public String getCollectorName() {
        return this.CollectorName;
    }

    /**
     * Set 采集器名称（1-50 个英文、汉字、数字、连接线-或下划线_）
     * @param CollectorName 采集器名称（1-50 个英文、汉字、数字、连接线-或下划线_）
     */
    public void setCollectorName(String CollectorName) {
        this.CollectorName = CollectorName;
    }

    /**
     * Get 采集器版本（支持"6.8.15"、"7.10.2"） 
     * @return CollectorVersion 采集器版本（支持"6.8.15"、"7.10.2"）
     */
    public String getCollectorVersion() {
        return this.CollectorVersion;
    }

    /**
     * Set 采集器版本（支持"6.8.15"、"7.10.2"）
     * @param CollectorVersion 采集器版本（支持"6.8.15"、"7.10.2"）
     */
    public void setCollectorVersion(String CollectorVersion) {
        this.CollectorVersion = CollectorVersion;
    }

    /**
     * Get 采集器类型（支持filebeat、metricbeat、heartbeat、auditbeat、packetbeat） 
     * @return CollectorType 采集器类型（支持filebeat、metricbeat、heartbeat、auditbeat、packetbeat）
     */
    public String getCollectorType() {
        return this.CollectorType;
    }

    /**
     * Set 采集器类型（支持filebeat、metricbeat、heartbeat、auditbeat、packetbeat）
     * @param CollectorType 采集器类型（支持filebeat、metricbeat、heartbeat、auditbeat、packetbeat）
     */
    public void setCollectorType(String CollectorType) {
        this.CollectorType = CollectorType;
    }

    /**
     * Get 采集器输出的ES实例信息 
     * @return OutputInstance 采集器输出的ES实例信息
     */
    public CollectorOutputInstance getOutputInstance() {
        return this.OutputInstance;
    }

    /**
     * Set 采集器输出的ES实例信息
     * @param OutputInstance 采集器输出的ES实例信息
     */
    public void setOutputInstance(CollectorOutputInstance OutputInstance) {
        this.OutputInstance = OutputInstance;
    }

    /**
     * Get 采集器配置 
     * @return CollectorConfigs 采集器配置
     */
    public CollectorConfigInfo [] getCollectorConfigs() {
        return this.CollectorConfigs;
    }

    /**
     * Set 采集器配置
     * @param CollectorConfigs 采集器配置
     */
    public void setCollectorConfigs(CollectorConfigInfo [] CollectorConfigs) {
        this.CollectorConfigs = CollectorConfigs;
    }

    /**
     * Get 采集器下发的CVM实例ID列表 
     * @return CVMInstanceIds 采集器下发的CVM实例ID列表
     */
    public String [] getCVMInstanceIds() {
        return this.CVMInstanceIds;
    }

    /**
     * Set 采集器下发的CVM实例ID列表
     * @param CVMInstanceIds 采集器下发的CVM实例ID列表
     */
    public void setCVMInstanceIds(String [] CVMInstanceIds) {
        this.CVMInstanceIds = CVMInstanceIds;
    }

    /**
     * Get 采集目标类型，CVM或者TKE 
     * @return TargetType 采集目标类型，CVM或者TKE
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 采集目标类型，CVM或者TKE
     * @param TargetType 采集目标类型，CVM或者TKE
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 容器集群ID，采集目标为TKE时必填 
     * @return ContainerClusterId 容器集群ID，采集目标为TKE时必填
     */
    public String getContainerClusterId() {
        return this.ContainerClusterId;
    }

    /**
     * Set 容器集群ID，采集目标为TKE时必填
     * @param ContainerClusterId 容器集群ID，采集目标为TKE时必填
     */
    public void setContainerClusterId(String ContainerClusterId) {
        this.ContainerClusterId = ContainerClusterId;
    }

    /**
     * Get 采集器配置，采集目标为TKE时必填 
     * @return CollectorTargets 采集器配置，采集目标为TKE时必填
     */
    public CollectorTarget [] getCollectorTargets() {
        return this.CollectorTargets;
    }

    /**
     * Set 采集器配置，采集目标为TKE时必填
     * @param CollectorTargets 采集器配置，采集目标为TKE时必填
     */
    public void setCollectorTargets(CollectorTarget [] CollectorTargets) {
        this.CollectorTargets = CollectorTargets;
    }

    /**
     * Get 标签信息 
     * @return TagList 标签信息
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 标签信息
     * @param TagList 标签信息
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    public CreateCollectorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCollectorRequest(CreateCollectorRequest source) {
        if (source.CollectorName != null) {
            this.CollectorName = new String(source.CollectorName);
        }
        if (source.CollectorVersion != null) {
            this.CollectorVersion = new String(source.CollectorVersion);
        }
        if (source.CollectorType != null) {
            this.CollectorType = new String(source.CollectorType);
        }
        if (source.OutputInstance != null) {
            this.OutputInstance = new CollectorOutputInstance(source.OutputInstance);
        }
        if (source.CollectorConfigs != null) {
            this.CollectorConfigs = new CollectorConfigInfo[source.CollectorConfigs.length];
            for (int i = 0; i < source.CollectorConfigs.length; i++) {
                this.CollectorConfigs[i] = new CollectorConfigInfo(source.CollectorConfigs[i]);
            }
        }
        if (source.CVMInstanceIds != null) {
            this.CVMInstanceIds = new String[source.CVMInstanceIds.length];
            for (int i = 0; i < source.CVMInstanceIds.length; i++) {
                this.CVMInstanceIds[i] = new String(source.CVMInstanceIds[i]);
            }
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.ContainerClusterId != null) {
            this.ContainerClusterId = new String(source.ContainerClusterId);
        }
        if (source.CollectorTargets != null) {
            this.CollectorTargets = new CollectorTarget[source.CollectorTargets.length];
            for (int i = 0; i < source.CollectorTargets.length; i++) {
                this.CollectorTargets[i] = new CollectorTarget(source.CollectorTargets[i]);
            }
        }
        if (source.TagList != null) {
            this.TagList = new TagInfo[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfo(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CollectorName", this.CollectorName);
        this.setParamSimple(map, prefix + "CollectorVersion", this.CollectorVersion);
        this.setParamSimple(map, prefix + "CollectorType", this.CollectorType);
        this.setParamObj(map, prefix + "OutputInstance.", this.OutputInstance);
        this.setParamArrayObj(map, prefix + "CollectorConfigs.", this.CollectorConfigs);
        this.setParamArraySimple(map, prefix + "CVMInstanceIds.", this.CVMInstanceIds);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "ContainerClusterId", this.ContainerClusterId);
        this.setParamArrayObj(map, prefix + "CollectorTargets.", this.CollectorTargets);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

