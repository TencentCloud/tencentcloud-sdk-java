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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogServiceInfo extends AbstractModel {

    /**
    * log名
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * log-id
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * topic名
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * topic-id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * cls日志所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get log名 
     * @return LogsetName log名
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set log名
     * @param LogsetName log名
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get log-id 
     * @return LogsetId log-id
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set log-id
     * @param LogsetId log-id
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get topic名 
     * @return TopicName topic名
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set topic名
     * @param TopicName topic名
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get topic-id 
     * @return TopicId topic-id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set topic-id
     * @param TopicId topic-id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get cls日志所属地域 
     * @return Region cls日志所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set cls日志所属地域
     * @param Region cls日志所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public LogServiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogServiceInfo(LogServiceInfo source) {
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

