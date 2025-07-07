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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NormalLog extends AbstractModel {

    /**
    * 毫秒时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 日志级别
    */
    @SerializedName("SeverityText")
    @Expose
    private String SeverityText;

    /**
    * 日志输出内容
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
     * Get 毫秒时间戳 
     * @return Timestamp 毫秒时间戳
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 毫秒时间戳
     * @param Timestamp 毫秒时间戳
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 日志级别 
     * @return SeverityText 日志级别
     */
    public String getSeverityText() {
        return this.SeverityText;
    }

    /**
     * Set 日志级别
     * @param SeverityText 日志级别
     */
    public void setSeverityText(String SeverityText) {
        this.SeverityText = SeverityText;
    }

    /**
     * Get 日志输出内容 
     * @return Body 日志输出内容
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set 日志输出内容
     * @param Body 日志输出内容
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    public NormalLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NormalLog(NormalLog source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.SeverityText != null) {
            this.SeverityText = new String(source.SeverityText);
        }
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "SeverityText", this.SeverityText);
        this.setParamSimple(map, prefix + "Body", this.Body);

    }
}

