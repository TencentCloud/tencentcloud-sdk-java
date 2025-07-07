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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrUpdateConfigFileAndReleaseRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 配置文件列表详情	
    */
    @SerializedName("ConfigFilePublishInfo")
    @Expose
    private ConfigFilePublishInfo ConfigFilePublishInfo;

    /**
    * 控制开启校验配置版本是否已经存在
    */
    @SerializedName("StrictEnable")
    @Expose
    private Boolean StrictEnable;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 配置文件列表详情	 
     * @return ConfigFilePublishInfo 配置文件列表详情	
     */
    public ConfigFilePublishInfo getConfigFilePublishInfo() {
        return this.ConfigFilePublishInfo;
    }

    /**
     * Set 配置文件列表详情	
     * @param ConfigFilePublishInfo 配置文件列表详情	
     */
    public void setConfigFilePublishInfo(ConfigFilePublishInfo ConfigFilePublishInfo) {
        this.ConfigFilePublishInfo = ConfigFilePublishInfo;
    }

    /**
     * Get 控制开启校验配置版本是否已经存在 
     * @return StrictEnable 控制开启校验配置版本是否已经存在
     */
    public Boolean getStrictEnable() {
        return this.StrictEnable;
    }

    /**
     * Set 控制开启校验配置版本是否已经存在
     * @param StrictEnable 控制开启校验配置版本是否已经存在
     */
    public void setStrictEnable(Boolean StrictEnable) {
        this.StrictEnable = StrictEnable;
    }

    public CreateOrUpdateConfigFileAndReleaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrUpdateConfigFileAndReleaseRequest(CreateOrUpdateConfigFileAndReleaseRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConfigFilePublishInfo != null) {
            this.ConfigFilePublishInfo = new ConfigFilePublishInfo(source.ConfigFilePublishInfo);
        }
        if (source.StrictEnable != null) {
            this.StrictEnable = new Boolean(source.StrictEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "ConfigFilePublishInfo.", this.ConfigFilePublishInfo);
        this.setParamSimple(map, prefix + "StrictEnable", this.StrictEnable);

    }
}

