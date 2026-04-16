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
    * <p>日志推送CLS的配置。</p>
    */
    @SerializedName("CLSConfig")
    @Expose
    private CLSConfig CLSConfig;

    /**
    * <p>日志源配置</p>
    */
    @SerializedName("LogSources")
    @Expose
    private LogSources LogSources;

    /**
     * Get <p>日志推送CLS的配置。</p> 
     * @return CLSConfig <p>日志推送CLS的配置。</p>
     */
    public CLSConfig getCLSConfig() {
        return this.CLSConfig;
    }

    /**
     * Set <p>日志推送CLS的配置。</p>
     * @param CLSConfig <p>日志推送CLS的配置。</p>
     */
    public void setCLSConfig(CLSConfig CLSConfig) {
        this.CLSConfig = CLSConfig;
    }

    /**
     * Get <p>日志源配置</p> 
     * @return LogSources <p>日志源配置</p>
     */
    public LogSources getLogSources() {
        return this.LogSources;
    }

    /**
     * Set <p>日志源配置</p>
     * @param LogSources <p>日志源配置</p>
     */
    public void setLogSources(LogSources LogSources) {
        this.LogSources = LogSources;
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
        if (source.LogSources != null) {
            this.LogSources = new LogSources(source.LogSources);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CLSConfig.", this.CLSConfig);
        this.setParamObj(map, prefix + "LogSources.", this.LogSources);

    }
}

