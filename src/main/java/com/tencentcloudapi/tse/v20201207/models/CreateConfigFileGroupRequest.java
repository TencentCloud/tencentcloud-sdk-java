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

public class CreateConfigFileGroupRequest extends AbstractModel {

    /**
    * tse 实例 id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 配置文件组实体
    */
    @SerializedName("ConfigFileGroup")
    @Expose
    private ConfigFileGroup ConfigFileGroup;

    /**
     * Get tse 实例 id 
     * @return InstanceId tse 实例 id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set tse 实例 id
     * @param InstanceId tse 实例 id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 配置文件组实体 
     * @return ConfigFileGroup 配置文件组实体
     */
    public ConfigFileGroup getConfigFileGroup() {
        return this.ConfigFileGroup;
    }

    /**
     * Set 配置文件组实体
     * @param ConfigFileGroup 配置文件组实体
     */
    public void setConfigFileGroup(ConfigFileGroup ConfigFileGroup) {
        this.ConfigFileGroup = ConfigFileGroup;
    }

    public CreateConfigFileGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConfigFileGroupRequest(CreateConfigFileGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConfigFileGroup != null) {
            this.ConfigFileGroup = new ConfigFileGroup(source.ConfigFileGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "ConfigFileGroup.", this.ConfigFileGroup);

    }
}

