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

public class ModifyConfigFilesRequest extends AbstractModel {

    /**
    * ins-df344df5	
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 配置文件列表
    */
    @SerializedName("ConfigFile")
    @Expose
    private ConfigFile ConfigFile;

    /**
     * Get ins-df344df5	 
     * @return InstanceId ins-df344df5	
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ins-df344df5	
     * @param InstanceId ins-df344df5	
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 配置文件列表 
     * @return ConfigFile 配置文件列表
     */
    public ConfigFile getConfigFile() {
        return this.ConfigFile;
    }

    /**
     * Set 配置文件列表
     * @param ConfigFile 配置文件列表
     */
    public void setConfigFile(ConfigFile ConfigFile) {
        this.ConfigFile = ConfigFile;
    }

    public ModifyConfigFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConfigFilesRequest(ModifyConfigFilesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConfigFile != null) {
            this.ConfigFile = new ConfigFile(source.ConfigFile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "ConfigFile.", this.ConfigFile);

    }
}

