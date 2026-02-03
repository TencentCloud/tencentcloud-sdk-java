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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OtherConfig extends AbstractModel {

    /**
    * es的yml额外配置
    */
    @SerializedName("EsConfig")
    @Expose
    private String EsConfig;

    /**
    * es的jvm heap config
    */
    @SerializedName("JvmHeapConfig")
    @Expose
    private String JvmHeapConfig;

    /**
     * Get es的yml额外配置 
     * @return EsConfig es的yml额外配置
     */
    public String getEsConfig() {
        return this.EsConfig;
    }

    /**
     * Set es的yml额外配置
     * @param EsConfig es的yml额外配置
     */
    public void setEsConfig(String EsConfig) {
        this.EsConfig = EsConfig;
    }

    /**
     * Get es的jvm heap config 
     * @return JvmHeapConfig es的jvm heap config
     */
    public String getJvmHeapConfig() {
        return this.JvmHeapConfig;
    }

    /**
     * Set es的jvm heap config
     * @param JvmHeapConfig es的jvm heap config
     */
    public void setJvmHeapConfig(String JvmHeapConfig) {
        this.JvmHeapConfig = JvmHeapConfig;
    }

    public OtherConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtherConfig(OtherConfig source) {
        if (source.EsConfig != null) {
            this.EsConfig = new String(source.EsConfig);
        }
        if (source.JvmHeapConfig != null) {
            this.JvmHeapConfig = new String(source.JvmHeapConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EsConfig", this.EsConfig);
        this.setParamSimple(map, prefix + "JvmHeapConfig", this.JvmHeapConfig);

    }
}

