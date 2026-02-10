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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogConfiguration extends AbstractModel {

    /**
    * 日志推送CLS的配置。
    */
    @SerializedName("CLSConfig")
    @Expose
    private CLSConfig CLSConfig;

    /**
     * Get 日志推送CLS的配置。 
     * @return CLSConfig 日志推送CLS的配置。
     */
    public CLSConfig getCLSConfig() {
        return this.CLSConfig;
    }

    /**
     * Set 日志推送CLS的配置。
     * @param CLSConfig 日志推送CLS的配置。
     */
    public void setCLSConfig(CLSConfig CLSConfig) {
        this.CLSConfig = CLSConfig;
    }

    public LogConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogConfiguration(LogConfiguration source) {
        if (source.CLSConfig != null) {
            this.CLSConfig = new CLSConfig(source.CLSConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CLSConfig.", this.CLSConfig);

    }
}

