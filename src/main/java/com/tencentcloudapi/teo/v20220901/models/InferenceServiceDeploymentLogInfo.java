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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceServiceDeploymentLogInfo extends AbstractModel {

    /**
    * 日志消息内容。
    */
    @SerializedName("LogMessage")
    @Expose
    private String LogMessage;

    /**
    * 日志产生时间。
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
     * Get 日志消息内容。 
     * @return LogMessage 日志消息内容。
     */
    public String getLogMessage() {
        return this.LogMessage;
    }

    /**
     * Set 日志消息内容。
     * @param LogMessage 日志消息内容。
     */
    public void setLogMessage(String LogMessage) {
        this.LogMessage = LogMessage;
    }

    /**
     * Get 日志产生时间。 
     * @return Timestamp 日志产生时间。
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 日志产生时间。
     * @param Timestamp 日志产生时间。
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    public InferenceServiceDeploymentLogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceServiceDeploymentLogInfo(InferenceServiceDeploymentLogInfo source) {
        if (source.LogMessage != null) {
            this.LogMessage = new String(source.LogMessage);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogMessage", this.LogMessage);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);

    }
}

