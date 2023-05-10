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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEnvironmentRequest extends AbstractModel{

    /**
    * 环境名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 环境配置信息。
    */
    @SerializedName("Config")
    @Expose
    private EnvironmentConfig Config;

    /**
    * 环境描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 环境名称。 
     * @return Name 环境名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 环境名称。
     * @param Name 环境名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 环境配置信息。 
     * @return Config 环境配置信息。
     */
    public EnvironmentConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 环境配置信息。
     * @param Config 环境配置信息。
     */
    public void setConfig(EnvironmentConfig Config) {
        this.Config = Config;
    }

    /**
     * Get 环境描述。 
     * @return Description 环境描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 环境描述。
     * @param Description 环境描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateEnvironmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEnvironmentRequest(CreateEnvironmentRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Config != null) {
            this.Config = new EnvironmentConfig(source.Config);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

