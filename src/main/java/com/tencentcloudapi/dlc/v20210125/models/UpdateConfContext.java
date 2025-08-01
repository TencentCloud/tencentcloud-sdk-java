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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateConfContext extends AbstractModel {

    /**
    * 参数类型，可选：StaticConfigType，DynamicConfigType
    */
    @SerializedName("ConfigType")
    @Expose
    private String ConfigType;

    /**
    * 参数的配置数组
    */
    @SerializedName("Params")
    @Expose
    private Param [] Params;

    /**
     * Get 参数类型，可选：StaticConfigType，DynamicConfigType 
     * @return ConfigType 参数类型，可选：StaticConfigType，DynamicConfigType
     */
    public String getConfigType() {
        return this.ConfigType;
    }

    /**
     * Set 参数类型，可选：StaticConfigType，DynamicConfigType
     * @param ConfigType 参数类型，可选：StaticConfigType，DynamicConfigType
     */
    public void setConfigType(String ConfigType) {
        this.ConfigType = ConfigType;
    }

    /**
     * Get 参数的配置数组 
     * @return Params 参数的配置数组
     */
    public Param [] getParams() {
        return this.Params;
    }

    /**
     * Set 参数的配置数组
     * @param Params 参数的配置数组
     */
    public void setParams(Param [] Params) {
        this.Params = Params;
    }

    public UpdateConfContext() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateConfContext(UpdateConfContext source) {
        if (source.ConfigType != null) {
            this.ConfigType = new String(source.ConfigType);
        }
        if (source.Params != null) {
            this.Params = new Param[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new Param(source.Params[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigType", this.ConfigType);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);

    }
}

