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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetSecLogTopicConfigRequest extends AbstractModel{

    /**
    * 配置类型(ckafka/cls)
    */
    @SerializedName("ConfigType")
    @Expose
    private String ConfigType;

    /**
    * 日志类型
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
     * Get 配置类型(ckafka/cls) 
     * @return ConfigType 配置类型(ckafka/cls)
     */
    public String getConfigType() {
        return this.ConfigType;
    }

    /**
     * Set 配置类型(ckafka/cls)
     * @param ConfigType 配置类型(ckafka/cls)
     */
    public void setConfigType(String ConfigType) {
        this.ConfigType = ConfigType;
    }

    /**
     * Get 日志类型 
     * @return LogType 日志类型
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型
     * @param LogType 日志类型
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    public ResetSecLogTopicConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetSecLogTopicConfigRequest(ResetSecLogTopicConfigRequest source) {
        if (source.ConfigType != null) {
            this.ConfigType = new String(source.ConfigType);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigType", this.ConfigType);
        this.setParamSimple(map, prefix + "LogType", this.LogType);

    }
}

