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

public class PublishConfigFilesRequest extends AbstractModel {

    /**
    * TSE实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 配置文件发布
    */
    @SerializedName("ConfigFileReleases")
    @Expose
    private ConfigFileRelease ConfigFileReleases;

    /**
    * 控制开启校验配置版本是否已经存在
    */
    @SerializedName("StrictEnable")
    @Expose
    private Boolean StrictEnable;

    /**
     * Get TSE实例id 
     * @return InstanceId TSE实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TSE实例id
     * @param InstanceId TSE实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 配置文件发布 
     * @return ConfigFileReleases 配置文件发布
     */
    public ConfigFileRelease getConfigFileReleases() {
        return this.ConfigFileReleases;
    }

    /**
     * Set 配置文件发布
     * @param ConfigFileReleases 配置文件发布
     */
    public void setConfigFileReleases(ConfigFileRelease ConfigFileReleases) {
        this.ConfigFileReleases = ConfigFileReleases;
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

    public PublishConfigFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublishConfigFilesRequest(PublishConfigFilesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConfigFileReleases != null) {
            this.ConfigFileReleases = new ConfigFileRelease(source.ConfigFileReleases);
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
        this.setParamObj(map, prefix + "ConfigFileReleases.", this.ConfigFileReleases);
        this.setParamSimple(map, prefix + "StrictEnable", this.StrictEnable);

    }
}

