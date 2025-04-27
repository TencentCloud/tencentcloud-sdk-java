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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClearLaunchConfigurationAttributesRequest extends AbstractModel {

    /**
    * 启动配置ID。可通过如下方式获取：
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/config) 查询启动配置ID。</li>
<li>通过调用接口 [DescribeLaunchConfigurations](https://cloud.tencent.com/document/api/377/20445) ，取返回信息中的 LaunchConfigurationId 获取启动配置ID。</li>
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * 是否清空数据盘信息，非必填，默认为 false。
填 true 代表清空“数据盘”信息，清空后基于此新创建的云主机将不含有任何数据盘。
    */
    @SerializedName("ClearDataDisks")
    @Expose
    private Boolean ClearDataDisks;

    /**
    * 是否清空云服务器主机名相关设置信息，非必填，默认为 false。
填 true 代表清空主机名设置信息，清空后基于此新创建的云主机将不设置主机名。
    */
    @SerializedName("ClearHostNameSettings")
    @Expose
    private Boolean ClearHostNameSettings;

    /**
    * 是否清空云服务器实例名相关设置信息，非必填，默认为 false。
填 true 代表清空主机名设置信息，清空后基于此新创建的云主机将按照“as-{{ 伸缩组AutoScalingGroupName }}”进行设置。
    */
    @SerializedName("ClearInstanceNameSettings")
    @Expose
    private Boolean ClearInstanceNameSettings;

    /**
    * 是否清空置放群组信息，非必填，默认为 false。
填 true 代表清空置放群组信息，清空后基于此新创建的云主机将不指定任何置放群组。
    */
    @SerializedName("ClearDisasterRecoverGroupIds")
    @Expose
    private Boolean ClearDisasterRecoverGroupIds;

    /**
    * 是否清空实例标签列表，非必填，默认为 false。
填 true 代表清空实例标签列表，清空后基于此新创建的云主机将不会绑定列表中的标签。
    */
    @SerializedName("ClearInstanceTags")
    @Expose
    private Boolean ClearInstanceTags;

    /**
    * 是否清空 MetaData，非必填，默认为 false。填 true 代表清空 MetaData，清空后基于此新创建的云主机将不会关联自定义的 Metadata。
    */
    @SerializedName("ClearMetadata")
    @Expose
    private Boolean ClearMetadata;

    /**
     * Get 启动配置ID。可通过如下方式获取：
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/config) 查询启动配置ID。</li>
<li>通过调用接口 [DescribeLaunchConfigurations](https://cloud.tencent.com/document/api/377/20445) ，取返回信息中的 LaunchConfigurationId 获取启动配置ID。</li> 
     * @return LaunchConfigurationId 启动配置ID。可通过如下方式获取：
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/config) 查询启动配置ID。</li>
<li>通过调用接口 [DescribeLaunchConfigurations](https://cloud.tencent.com/document/api/377/20445) ，取返回信息中的 LaunchConfigurationId 获取启动配置ID。</li>
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set 启动配置ID。可通过如下方式获取：
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/config) 查询启动配置ID。</li>
<li>通过调用接口 [DescribeLaunchConfigurations](https://cloud.tencent.com/document/api/377/20445) ，取返回信息中的 LaunchConfigurationId 获取启动配置ID。</li>
     * @param LaunchConfigurationId 启动配置ID。可通过如下方式获取：
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/config) 查询启动配置ID。</li>
<li>通过调用接口 [DescribeLaunchConfigurations](https://cloud.tencent.com/document/api/377/20445) ，取返回信息中的 LaunchConfigurationId 获取启动配置ID。</li>
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get 是否清空数据盘信息，非必填，默认为 false。
填 true 代表清空“数据盘”信息，清空后基于此新创建的云主机将不含有任何数据盘。 
     * @return ClearDataDisks 是否清空数据盘信息，非必填，默认为 false。
填 true 代表清空“数据盘”信息，清空后基于此新创建的云主机将不含有任何数据盘。
     */
    public Boolean getClearDataDisks() {
        return this.ClearDataDisks;
    }

    /**
     * Set 是否清空数据盘信息，非必填，默认为 false。
填 true 代表清空“数据盘”信息，清空后基于此新创建的云主机将不含有任何数据盘。
     * @param ClearDataDisks 是否清空数据盘信息，非必填，默认为 false。
填 true 代表清空“数据盘”信息，清空后基于此新创建的云主机将不含有任何数据盘。
     */
    public void setClearDataDisks(Boolean ClearDataDisks) {
        this.ClearDataDisks = ClearDataDisks;
    }

    /**
     * Get 是否清空云服务器主机名相关设置信息，非必填，默认为 false。
填 true 代表清空主机名设置信息，清空后基于此新创建的云主机将不设置主机名。 
     * @return ClearHostNameSettings 是否清空云服务器主机名相关设置信息，非必填，默认为 false。
填 true 代表清空主机名设置信息，清空后基于此新创建的云主机将不设置主机名。
     */
    public Boolean getClearHostNameSettings() {
        return this.ClearHostNameSettings;
    }

    /**
     * Set 是否清空云服务器主机名相关设置信息，非必填，默认为 false。
填 true 代表清空主机名设置信息，清空后基于此新创建的云主机将不设置主机名。
     * @param ClearHostNameSettings 是否清空云服务器主机名相关设置信息，非必填，默认为 false。
填 true 代表清空主机名设置信息，清空后基于此新创建的云主机将不设置主机名。
     */
    public void setClearHostNameSettings(Boolean ClearHostNameSettings) {
        this.ClearHostNameSettings = ClearHostNameSettings;
    }

    /**
     * Get 是否清空云服务器实例名相关设置信息，非必填，默认为 false。
填 true 代表清空主机名设置信息，清空后基于此新创建的云主机将按照“as-{{ 伸缩组AutoScalingGroupName }}”进行设置。 
     * @return ClearInstanceNameSettings 是否清空云服务器实例名相关设置信息，非必填，默认为 false。
填 true 代表清空主机名设置信息，清空后基于此新创建的云主机将按照“as-{{ 伸缩组AutoScalingGroupName }}”进行设置。
     */
    public Boolean getClearInstanceNameSettings() {
        return this.ClearInstanceNameSettings;
    }

    /**
     * Set 是否清空云服务器实例名相关设置信息，非必填，默认为 false。
填 true 代表清空主机名设置信息，清空后基于此新创建的云主机将按照“as-{{ 伸缩组AutoScalingGroupName }}”进行设置。
     * @param ClearInstanceNameSettings 是否清空云服务器实例名相关设置信息，非必填，默认为 false。
填 true 代表清空主机名设置信息，清空后基于此新创建的云主机将按照“as-{{ 伸缩组AutoScalingGroupName }}”进行设置。
     */
    public void setClearInstanceNameSettings(Boolean ClearInstanceNameSettings) {
        this.ClearInstanceNameSettings = ClearInstanceNameSettings;
    }

    /**
     * Get 是否清空置放群组信息，非必填，默认为 false。
填 true 代表清空置放群组信息，清空后基于此新创建的云主机将不指定任何置放群组。 
     * @return ClearDisasterRecoverGroupIds 是否清空置放群组信息，非必填，默认为 false。
填 true 代表清空置放群组信息，清空后基于此新创建的云主机将不指定任何置放群组。
     */
    public Boolean getClearDisasterRecoverGroupIds() {
        return this.ClearDisasterRecoverGroupIds;
    }

    /**
     * Set 是否清空置放群组信息，非必填，默认为 false。
填 true 代表清空置放群组信息，清空后基于此新创建的云主机将不指定任何置放群组。
     * @param ClearDisasterRecoverGroupIds 是否清空置放群组信息，非必填，默认为 false。
填 true 代表清空置放群组信息，清空后基于此新创建的云主机将不指定任何置放群组。
     */
    public void setClearDisasterRecoverGroupIds(Boolean ClearDisasterRecoverGroupIds) {
        this.ClearDisasterRecoverGroupIds = ClearDisasterRecoverGroupIds;
    }

    /**
     * Get 是否清空实例标签列表，非必填，默认为 false。
填 true 代表清空实例标签列表，清空后基于此新创建的云主机将不会绑定列表中的标签。 
     * @return ClearInstanceTags 是否清空实例标签列表，非必填，默认为 false。
填 true 代表清空实例标签列表，清空后基于此新创建的云主机将不会绑定列表中的标签。
     */
    public Boolean getClearInstanceTags() {
        return this.ClearInstanceTags;
    }

    /**
     * Set 是否清空实例标签列表，非必填，默认为 false。
填 true 代表清空实例标签列表，清空后基于此新创建的云主机将不会绑定列表中的标签。
     * @param ClearInstanceTags 是否清空实例标签列表，非必填，默认为 false。
填 true 代表清空实例标签列表，清空后基于此新创建的云主机将不会绑定列表中的标签。
     */
    public void setClearInstanceTags(Boolean ClearInstanceTags) {
        this.ClearInstanceTags = ClearInstanceTags;
    }

    /**
     * Get 是否清空 MetaData，非必填，默认为 false。填 true 代表清空 MetaData，清空后基于此新创建的云主机将不会关联自定义的 Metadata。 
     * @return ClearMetadata 是否清空 MetaData，非必填，默认为 false。填 true 代表清空 MetaData，清空后基于此新创建的云主机将不会关联自定义的 Metadata。
     */
    public Boolean getClearMetadata() {
        return this.ClearMetadata;
    }

    /**
     * Set 是否清空 MetaData，非必填，默认为 false。填 true 代表清空 MetaData，清空后基于此新创建的云主机将不会关联自定义的 Metadata。
     * @param ClearMetadata 是否清空 MetaData，非必填，默认为 false。填 true 代表清空 MetaData，清空后基于此新创建的云主机将不会关联自定义的 Metadata。
     */
    public void setClearMetadata(Boolean ClearMetadata) {
        this.ClearMetadata = ClearMetadata;
    }

    public ClearLaunchConfigurationAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClearLaunchConfigurationAttributesRequest(ClearLaunchConfigurationAttributesRequest source) {
        if (source.LaunchConfigurationId != null) {
            this.LaunchConfigurationId = new String(source.LaunchConfigurationId);
        }
        if (source.ClearDataDisks != null) {
            this.ClearDataDisks = new Boolean(source.ClearDataDisks);
        }
        if (source.ClearHostNameSettings != null) {
            this.ClearHostNameSettings = new Boolean(source.ClearHostNameSettings);
        }
        if (source.ClearInstanceNameSettings != null) {
            this.ClearInstanceNameSettings = new Boolean(source.ClearInstanceNameSettings);
        }
        if (source.ClearDisasterRecoverGroupIds != null) {
            this.ClearDisasterRecoverGroupIds = new Boolean(source.ClearDisasterRecoverGroupIds);
        }
        if (source.ClearInstanceTags != null) {
            this.ClearInstanceTags = new Boolean(source.ClearInstanceTags);
        }
        if (source.ClearMetadata != null) {
            this.ClearMetadata = new Boolean(source.ClearMetadata);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "ClearDataDisks", this.ClearDataDisks);
        this.setParamSimple(map, prefix + "ClearHostNameSettings", this.ClearHostNameSettings);
        this.setParamSimple(map, prefix + "ClearInstanceNameSettings", this.ClearInstanceNameSettings);
        this.setParamSimple(map, prefix + "ClearDisasterRecoverGroupIds", this.ClearDisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "ClearInstanceTags", this.ClearInstanceTags);
        this.setParamSimple(map, prefix + "ClearMetadata", this.ClearMetadata);

    }
}

