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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigValue extends AbstractModel{

    /**
    * 配置项的名称，支持填写max_user_connections
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 配置值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 配置项的名称，支持填写max_user_connections 
     * @return Config 配置项的名称，支持填写max_user_connections
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 配置项的名称，支持填写max_user_connections
     * @param Config 配置项的名称，支持填写max_user_connections
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 配置值 
     * @return Value 配置值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 配置值
     * @param Value 配置值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public ConfigValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigValue(ConfigValue source) {
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

