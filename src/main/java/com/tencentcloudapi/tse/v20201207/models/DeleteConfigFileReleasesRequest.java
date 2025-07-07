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

public class DeleteConfigFileReleasesRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 待删除配置发布详情
    */
    @SerializedName("ConfigFileReleases")
    @Expose
    private ConfigFileReleaseDeletion [] ConfigFileReleases;

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
     * Get 待删除配置发布详情 
     * @return ConfigFileReleases 待删除配置发布详情
     */
    public ConfigFileReleaseDeletion [] getConfigFileReleases() {
        return this.ConfigFileReleases;
    }

    /**
     * Set 待删除配置发布详情
     * @param ConfigFileReleases 待删除配置发布详情
     */
    public void setConfigFileReleases(ConfigFileReleaseDeletion [] ConfigFileReleases) {
        this.ConfigFileReleases = ConfigFileReleases;
    }

    public DeleteConfigFileReleasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteConfigFileReleasesRequest(DeleteConfigFileReleasesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConfigFileReleases != null) {
            this.ConfigFileReleases = new ConfigFileReleaseDeletion[source.ConfigFileReleases.length];
            for (int i = 0; i < source.ConfigFileReleases.length; i++) {
                this.ConfigFileReleases[i] = new ConfigFileReleaseDeletion(source.ConfigFileReleases[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "ConfigFileReleases.", this.ConfigFileReleases);

    }
}

