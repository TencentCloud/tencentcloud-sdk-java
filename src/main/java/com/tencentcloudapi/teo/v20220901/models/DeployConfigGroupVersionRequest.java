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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployConfigGroupVersionRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 环境 ID。请填写版本需要发布到的环境 ID。
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 需要发布的版本信息。可以同时变更多个不同配置组的版本，每个配置组一次仅支持变更一个版本。
    */
    @SerializedName("ConfigGroupVersionInfos")
    @Expose
    private ConfigGroupVersionInfo [] ConfigGroupVersionInfos;

    /**
    * 变更说明。用于描述此次变更的内容、原因，最大支持 100 个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 环境 ID。请填写版本需要发布到的环境 ID。 
     * @return EnvId 环境 ID。请填写版本需要发布到的环境 ID。
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境 ID。请填写版本需要发布到的环境 ID。
     * @param EnvId 环境 ID。请填写版本需要发布到的环境 ID。
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 需要发布的版本信息。可以同时变更多个不同配置组的版本，每个配置组一次仅支持变更一个版本。 
     * @return ConfigGroupVersionInfos 需要发布的版本信息。可以同时变更多个不同配置组的版本，每个配置组一次仅支持变更一个版本。
     */
    public ConfigGroupVersionInfo [] getConfigGroupVersionInfos() {
        return this.ConfigGroupVersionInfos;
    }

    /**
     * Set 需要发布的版本信息。可以同时变更多个不同配置组的版本，每个配置组一次仅支持变更一个版本。
     * @param ConfigGroupVersionInfos 需要发布的版本信息。可以同时变更多个不同配置组的版本，每个配置组一次仅支持变更一个版本。
     */
    public void setConfigGroupVersionInfos(ConfigGroupVersionInfo [] ConfigGroupVersionInfos) {
        this.ConfigGroupVersionInfos = ConfigGroupVersionInfos;
    }

    /**
     * Get 变更说明。用于描述此次变更的内容、原因，最大支持 100 个字符。 
     * @return Description 变更说明。用于描述此次变更的内容、原因，最大支持 100 个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 变更说明。用于描述此次变更的内容、原因，最大支持 100 个字符。
     * @param Description 变更说明。用于描述此次变更的内容、原因，最大支持 100 个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public DeployConfigGroupVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployConfigGroupVersionRequest(DeployConfigGroupVersionRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ConfigGroupVersionInfos != null) {
            this.ConfigGroupVersionInfos = new ConfigGroupVersionInfo[source.ConfigGroupVersionInfos.length];
            for (int i = 0; i < source.ConfigGroupVersionInfos.length; i++) {
                this.ConfigGroupVersionInfos[i] = new ConfigGroupVersionInfo(source.ConfigGroupVersionInfos[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamArrayObj(map, prefix + "ConfigGroupVersionInfos.", this.ConfigGroupVersionInfos);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

