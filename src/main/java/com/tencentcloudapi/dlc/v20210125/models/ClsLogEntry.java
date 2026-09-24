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

public class ClsLogEntry extends AbstractModel {

    /**
    * <p>Unix 毫秒时间戳。</p>
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * <p>日志 JSON 字符串。</p>
    */
    @SerializedName("LogJson")
    @Expose
    private String LogJson;

    /**
     * Get <p>Unix 毫秒时间戳。</p> 
     * @return Time <p>Unix 毫秒时间戳。</p>
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set <p>Unix 毫秒时间戳。</p>
     * @param Time <p>Unix 毫秒时间戳。</p>
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get <p>日志 JSON 字符串。</p> 
     * @return LogJson <p>日志 JSON 字符串。</p>
     */
    public String getLogJson() {
        return this.LogJson;
    }

    /**
     * Set <p>日志 JSON 字符串。</p>
     * @param LogJson <p>日志 JSON 字符串。</p>
     */
    public void setLogJson(String LogJson) {
        this.LogJson = LogJson;
    }

    public ClsLogEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClsLogEntry(ClsLogEntry source) {
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.LogJson != null) {
            this.LogJson = new String(source.LogJson);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "LogJson", this.LogJson);

    }
}

